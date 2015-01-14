package welab.finance.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import welab.finance.web.retriever.UserRetriever;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.welab.finance.core.model.User;

@Controller
@RequestMapping("/user")
public class UserController
{
	@Autowired
	public UserRetriever userRetriever;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String index(Model model)
	{
		List<User> user = userRetriever.getAllUsers();
		model.addAttribute("users", user);
		return "user/list";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(Model model)
	{
		model.addAttribute(new User());
		return "user/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@Valid User user, BindingResult br)
	{
		if (br.hasErrors())
		{
			return "user/add";
		}
		
		userRetriever.addUser(user);

		// 从定向是从当前的路径加上list，因此没有user
		return "redirect:list";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String displayDetailInfo(@PathVariable Integer id, Model model)
	{
		User user = userRetriever.getUserById(id);
		model.addAttribute("user", user);
		model.addAttribute("message", "I'm running!");
		return "user/detailinfo";
	}

	@RequestMapping(value = "{id}/update", method = RequestMethod.GET)
	public String update(@PathVariable Integer id, Model model)
	{
		User user = userRetriever.getUserById(id);
		model.addAttribute("user", user);
		return "user/update";
	}

	@RequestMapping(value = "{id}/update", method = RequestMethod.POST)
	public String update(@Valid User user, BindingResult br)
	{
		if (br.hasErrors())
		{
			return "user/update";
		}
		
		userRetriever.updateUser(user);

		return "redirect:/user/list";
	}

	@RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable Integer id)
	{
		userRetriever.removeUser(id);
		return "redirect:/user/list";
	}

}

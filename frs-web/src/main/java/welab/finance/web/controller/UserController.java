package welab.finance.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import welab.finance.web.domain.DataSource;
import welab.finance.web.domain.UserForm;

@Controller
@RequestMapping("/user")
public class UserController
{

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String index(Model model)
	{
		model.addAttribute("users", DataSource.getUsers());
		return "user/list";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(Model model)
	{
		model.addAttribute(new UserForm());
		return "user/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@Valid UserForm user, BindingResult br)
	{
		if (br.hasErrors())
		{
			return "user/add";
		}
		DataSource.add(user);

		// 从定向是从当前的路径加上list，因此没有user
		return "redirect:list";
	}

	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public String displayDetailInfo(@PathVariable String username, Model model)
	{
		model.addAttribute(DataSource.getUser(username));
		model.addAttribute("message", "I'm running!");
		return "user/detailinfo";
	}

	@RequestMapping(value = "{username}/update", method = RequestMethod.GET)
	public String update(@PathVariable String username, Model model)
	{
		model.addAttribute(DataSource.getUser(username));
		return "user/update";
	}

	@RequestMapping(value = "{username}/update", method = RequestMethod.POST)
	public String update(@Valid UserForm user, BindingResult br)
	{
		if (br.hasErrors())
		{
			return "user/update";
		}
		DataSource.update(user);

		return "redirect:/user/list";
	}

	@RequestMapping(value = "/{username}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable String username)
	{
		DataSource.delete(username);
		return "redirect:/user/list";
	}

}

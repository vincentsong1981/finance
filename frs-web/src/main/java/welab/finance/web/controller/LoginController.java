package welab.finance.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import welab.finance.web.constant.FrsConstant;
import welab.finance.web.exception.WebException;
import welab.finance.web.retriever.UserRetriever;

@Controller
public class LoginController
{
	@Autowired
	public UserRetriever userRetriever;

	@RequestMapping({"/", "/login"})
	public String login(Model model, HttpSession session)
	{
		String name = (String) session.getAttribute(FrsConstant.LOGIN_USER);
		if (name != null && !name.isEmpty())
		{
			return "redirect:index";
		}
		return "login";
	}

	/**
	 * This method is very fast to implement the logic.
	 *
	 * @return
	 * @throws Exception 
	 * @throws WebException 
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam String username, @RequestParam String password, HttpSession session) throws Exception, WebException
	{
		
		if(username.isEmpty() || password.isEmpty())
		{
			throw new WebException("用户名或者密码为空");
		}
		
		session.setAttribute(FrsConstant.LOGIN_USER, username);		
		return "redirect:index";
	}
	
	@RequestMapping(value="/index")
	public String goHomePage()
	{		
		return "index";
	}
	
	@RequestMapping(value="/logout")
	public String logOut(HttpSession session)
	{
		String name = (String) session.getAttribute(FrsConstant.LOGIN_USER);
		if ( name !=null && !name.isEmpty())
		{
			session.removeAttribute(FrsConstant.LOGIN_USER);
		}
		
		return "redirect:login";
	}
	
	
//	@ExceptionHandler({WebException.class})
//	public String handleException(WebException we, HttpServletRequest hsr)
//	{
//		hsr.setAttribute("e", we);
//		return "error";
//	}

}

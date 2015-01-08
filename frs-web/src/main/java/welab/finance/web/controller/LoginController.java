package welab.finance.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import welab.finance.web.domain.DataSource;
import welab.finance.web.exception.WebException;

@Controller
public class LoginController
{

	@RequestMapping({"/"})
	public String login(Model model)
	{
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
		
		session.setAttribute("loginUser", DataSource.getUser(username));		
		return "redirect:index";
	}
	
	@RequestMapping(value="/index")
	public String goHomePage()
	{		
		return "index";
	}
	
	
//	@ExceptionHandler({WebException.class})
//	public String handleException(WebException we, HttpServletRequest hsr)
//	{
//		hsr.setAttribute("e", we);
//		return "error";
//	}

	/**
	 * This method is not that fast to implement, but HttpServlet request and response are very
	 * useful to debug the HTTP request in future.
	 * 
	 * @param request
	 * @param response
	 * @param command
	 * @return
	 */
//	@RequestMapping(value = "/forward")
//	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, UserForm command)
//	{
//		String username = command.getUsername();
//		ModelAndView mv = new ModelAndView("/login", "command", "LOGIN SUCCESS, " + username);
//		return mv;
//	}

}

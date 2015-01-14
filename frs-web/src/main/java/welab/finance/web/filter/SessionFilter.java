package welab.finance.web.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import welab.finance.web.constant.FrsConstant;
import welab.finance.web.constant.UriConstant;

/**
 * Include login filter function.
 * 
 * @author <a href="mailto:vincent@wolaidai.com">vincent</a>
 */
public class SessionFilter extends OncePerRequestFilter
{

	public SessionFilter()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException
	{
		String[] notFilter = new String[]{UriConstant.LOGIN, UriConstant.LOUGOUT};

		String uri = request.getRequestURI();

		if (uri.indexOf(UriConstant.PATH_FRS) != -1)
		{

			boolean doFilter = true;
			for (String s : notFilter)
			{
				if (uri.indexOf(s) != -1)
				{
					doFilter = false;
					break;
				}
			}
			if (doFilter)
			{

				Object obj = request.getSession().getAttribute(FrsConstant.LOGIN_USER);
				if (null == obj)
				{
					// 如果session中不存在登录者实体，则弹出框提示重新登录
					// 设置request和response的字符集，防止乱码
					request.setCharacterEncoding(FrsConstant.ENCODING_UTF_8);
					response.setCharacterEncoding(FrsConstant.ENCODING_UTF_8);
					PrintWriter out = response.getWriter();

					StringBuilder builder = new StringBuilder();
					builder.append("<script type=\"text/javascript\">");
				//	builder.append("alert('网页过期，请重新登录！');");
					builder.append("alert('It\\'s expired, sorry, please login again!!');");
					builder.append("window.top.location.href='");
					builder.append(UriConstant.SLASH_FRS_SLASH_LOGIN);
					builder.append("';");
					builder.append("</script>");
					out.print(builder.toString());
				}
				else
				{
					filterChain.doFilter(request, response);
				}
			}
			else
			{
				filterChain.doFilter(request, response);
			}
		}
		else
		{
			filterChain.doFilter(request, response);
		}

	}

}

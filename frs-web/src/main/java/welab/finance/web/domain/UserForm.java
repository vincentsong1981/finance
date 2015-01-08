package welab.finance.web.domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UserForm
{
	private String username;
	private String password;

	public UserForm()
	{}

	public UserForm(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	@NotEmpty(message = "用户名不能为空")
	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	@Length(min = 1, max = 8, message = "长度必须在1到8之间")
	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}

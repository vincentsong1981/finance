package welab.finance.web.domain;

import java.util.HashMap;
import java.util.Map;

public class DataSource
{
	private static Map<String, UserForm> users = null;
	private DataSource()
	{}
	
	public static Map<String, UserForm> getUsers()
	{
		if(users == null)
		{
			users = new HashMap<String, UserForm>();
			
			UserForm user1 = new UserForm("David", "what?");
			UserForm user2 = new UserForm("Andy", "what?");
			UserForm user3 = new UserForm("Vincent", "what?");
			UserForm user4 = new UserForm("Space", "what?");
			UserForm user5 = new UserForm("Cyber", "what?");
			

			users.put(user1.getUsername(),user1);
			users.put(user2.getUsername(),user2);
			users.put(user3.getUsername(),user3);
			users.put(user4.getUsername(),user4);
			users.put(user5.getUsername(),user5);
			
			return users;
		}
		else
			return users;
	}
	
	public static void add(UserForm user)
	{
		if(users == null)
		{
			getUsers();
			
		}
		users.put(user.getUsername(), user);
	}
	
	public static void delete(String name)
	{
		if(users == null)
		{
			getUsers();
			
		}
		users.remove(name);
	}
	
	public static void update(UserForm user)
	{
		if(users == null)
		{
			getUsers();
			
		}
		if(users.containsKey(user.getUsername()))
		{
			users.replace(user.getUsername(), user);
		}
	}
	
	public static UserForm getUser(String name)
	{
		if(users == null)
		{
			getUsers();
		}
		
		return users.get(name);
	}

}

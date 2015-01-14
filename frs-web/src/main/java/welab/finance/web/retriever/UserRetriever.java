package welab.finance.web.retriever;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.welab.finance.core.model.User;
import com.welab.finance.core.service.UserService;

@Component
public class UserRetriever
{
	@Autowired
	public UserService userService;

	public List<User> getAllUsers()
	{
		List<User> allUsers = userService.getAllUsers();
		return allUsers;
	}

	public User getUserById(Integer id)
	{
		User user = userService.getUserById(id);
		return user;

	}

	public void addUser(User user)
	{
		// TODO: This need to refact when doing the Role management.
		user.setRoleid("1");
		userService.insertUser(user);
	}

	public void updateUser(User user)
	{
		// TODO: This need to refact when doing the Role management.
		user.setRoleid("1");
		userService.updateUserById(user);
	}

	public void removeUser(Integer id)
	{
		userService.removeUserById(id);
	}
}

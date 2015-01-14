/**
 * Copyright 2014 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.welab.finance.core.model.mapper;

import java.util.List;

import com.welab.finance.core.model.User;


/**
 * @author <a href="mailto:vincent@wolaidai.com">spacewen</a>
 */
public interface FinanceUserMapper
{
	
	void insertUser(User user);

	public List<User> getAllUsers();
	
	public User getUserById(Integer id);
	
	public void updateUserById(User user);
	
	public void removeUserById(Integer id);
	
	
}

/**
 * Copyright 2014 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.welab.finance.core.model.mapper;

import java.util.Date;

import com.welab.finance.core.model.Users;

/**
 * @author <a href="mailto:vincent@wolaidai.com">spacewen</a>
 */
public interface FinanceUserMapper
{
//	void insertUser(String name, String roleId, String email, String encryptedPassword, Date createdAt,
//			Date updateDateAt, int signInCount, Date currentSignInAt, String currentSignInIp, boolean locked,
//			int failedAttempts, Date lockedAt);
	
	void insertUser(Users user);


}

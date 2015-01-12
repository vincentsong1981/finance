/**
 * Copyright 2014 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.wolaidai.ws.jrocket2.persistence.mapper;

import java.util.List;

import com.wolaidai.ws.jrocket2.persistence.User;

/**
 * @author <a href="mailto:spacewen@wolaidai.com">spacewen</a>
 */
public interface UserMapper
{
	Integer getUserIdByMobileAndToken(String mobile, String token);

	Integer getUserCntByMobileAndToken(String mobile, String token);

	String getEncryptedSecurityCodeByUser(Integer id);

	User getByIdWithCnid(Integer id);

	List<User> getInviteesByUser(Integer id);

}

/**
 * Copyright 2015 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.wolaidai.ws.jrocket2.persistence.mapper;

import java.util.List;

import com.wolaidai.ws.jrocket2.persistence.CouponsUser;

/**
 * @author <a href="mailto:spacewen@wolaidai.com">spacewen</a>
 */
public interface CouponsUserMapper
{
	List<CouponsUser> getCouponsUserByUser(Integer id);
}

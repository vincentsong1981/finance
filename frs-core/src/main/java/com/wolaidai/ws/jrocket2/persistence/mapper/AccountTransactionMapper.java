/**
 * Copyright 2014 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.wolaidai.ws.jrocket2.persistence.mapper;

import java.util.List;

import com.wolaidai.ws.jrocket2.persistence.AccountTransaction;

/**
 * @author <a href="mailto:spacewen@wolaidai.com">spacewen</a>
 */
public interface AccountTransactionMapper
{
	List<AccountTransaction> getAccountTransactionByUser(Integer id);

}

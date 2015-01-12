/**
 * Copyright 2014 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.wolaidai.ws.jrocket2.persistence.mapper;

import java.math.BigDecimal;

import com.wolaidai.ws.jrocket2.persistence.Account;

/**
 * @author <a href="mailto:spacewen@wolaidai.com">spacewen</a>
 */
public interface AccountMapper
{
	Account getBalanceByUser(Integer id);
	
	Account getAccountByUser(Integer id);
	
	void updateAccountOnWithdraw(Integer id, BigDecimal freezeAmount);

}

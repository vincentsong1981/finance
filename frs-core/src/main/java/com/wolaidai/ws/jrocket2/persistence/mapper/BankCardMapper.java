/**
 * Copyright 2014 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.wolaidai.ws.jrocket2.persistence.mapper;

import java.util.List;

import com.wolaidai.ws.jrocket2.persistence.BankCard;

/**
 * @author <a href="mailto:spacewen@wolaidai.com">spacewen</a>
 */
public interface BankCardMapper
{
	List<BankCard> getBankCardsByUser(Integer id);

	BankCard getBankCardByUserAndId(Integer id, Integer userId);

	int softDeleteById(Integer id, Integer userId);
}

/**
 * Copyright 2014 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.wolaidai.ws.jrocket2.persistence.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author <a href="mailto:spacewen@wolaidai.com">spacewen</a>
 */
public interface LoanApplicationMapper
{
	Integer getLoanApplicationCntByUserWithState(Integer id, String state);

	Integer getLoanApplicationCntByUserWithStateList(@Param("id") Integer id, @Param("state") List<String> state);

	String getLastLoanApplicationStateByUserOrderByCreatedAt(Integer id);
	
	/*********************Internal API Start****************************/
	BigDecimal getApplyingAmountSumByUser(Integer id);
	BigDecimal getUnsettledPrincipalSumByUser(Integer id);
	/*********************Internal API End****************************/
	
}

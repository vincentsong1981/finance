/**
 * Copyright 2014 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.wolaidai.ws.jrocket2.persistence.mapper;


/**
 * @author <a href="mailto:spacewen@wolaidai.com">spacewen</a>
 */
public interface LoanMapper
{
	/*********************Internal API Start****************************/
	Integer getLoanCntByUserWithState(Integer id, String state);
	/*********************Internal API End****************************/
}

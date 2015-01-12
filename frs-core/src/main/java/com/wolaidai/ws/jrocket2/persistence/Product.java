/**
 * Copyright 2014 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.wolaidai.ws.jrocket2.persistence;

/**
 * @author <a href="mailto:spacewen@wolaidai.com">spacewen</a>
 */
public class Product implements java.io.Serializable
{
	private static final long serialVersionUID = -7133325456329742752L;
	private String m_tenor;
	private Float m_installment;
	private Boolean defaults;

	public String getTenor()
	{
		return m_tenor;
	}

	public void setTenor(String tenor)
	{
		m_tenor = tenor;
	}

	public Float getInstallment()
	{
		return m_installment;
	}

	public void setInstallment(Float installment)
	{
		m_installment = installment;
	}

	public Boolean getDefaults()
	{
		return defaults;
	}

	public void setDefaults(Boolean defaults)
	{
		this.defaults = defaults;
	}

}

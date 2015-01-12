package com.wolaidai.ws.jrocket2.persistence;

// Generated Dec 16, 2014 8:09:05 PM by Hibernate Tools 3.4.0.CR1

import java.sql.Timestamp;
import java.util.Date;

/**
 * BankCards generated by hbm2java
 */
public class BankCard implements java.io.Serializable
{
	private static final long serialVersionUID = 1283840905676365592L;

	public enum State
	{
		VERIFIED_STATE_FAIL("fail"), VERIFIED_STATE_PASS("pass"), VERIFIED_STATE_WAIT("wait");

		private String m_value;

		private State(String value)
		{
			m_value = value;
		}

		public String getValue()
		{
			return m_value;
		}
	}

	private Integer id;
	private String account_number;
	private Integer province;
	private Integer city;
	private Integer user_id;
	private String state;
	private Timestamp created_at;
	private Date updated_at;
	private Integer bank_id;
	private Date deletedAt;

	public BankCard()
	{}

	public BankCard(Integer id)
	{
		this.id = id;
	}

	public BankCard(int id, String accountNumber, Integer province, Integer city, Integer userId, String state,
			Timestamp createdAt, Date updatedAt, Integer bankId, Date deletedAt)
	{
		this.id = id;
		this.account_number = accountNumber;
		this.province = province;
		this.city = city;
		this.user_id = userId;
		this.state = state;
		this.created_at = createdAt;
		this.updated_at = updatedAt;
		this.bank_id = bankId;
		this.deletedAt = deletedAt;
	}

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getAccount_number()
	{
		return this.account_number;
	}

	public void setAccount_number(String accountNumber)
	{
		this.account_number = accountNumber;
	}

	public Integer getProvince()
	{
		return this.province;
	}

	public void setProvince(Integer province)
	{
		this.province = province;
	}

	public Integer getCity()
	{
		return this.city;
	}

	public void setCity(Integer city)
	{
		this.city = city;
	}

	public Integer getUser_id()
	{
		return this.user_id;
	}

	public void setUser_id(Integer userId)
	{
		this.user_id = userId;
	}

	public String getState()
	{
		return this.state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public Timestamp getCreated_at()
	{
		return this.created_at;
	}

	public void setCreated_at(Timestamp createdAt)
	{
		this.created_at = createdAt;
	}

	public Date getUpdated_at()
	{
		return this.updated_at;
	}

	public void setUpdated_at(Date updatedAt)
	{
		this.updated_at = updatedAt;
	}

	public Integer getBank_id()
	{
		return this.bank_id;
	}

	public void setBank_id(Integer bankId)
	{
		this.bank_id = bankId;
	}

	public Date getDeletedAt()
	{
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt)
	{
		this.deletedAt = deletedAt;
	}

}

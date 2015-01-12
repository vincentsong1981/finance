package com.wolaidai.ws.jrocket2.persistence;

// Generated Dec 16, 2014 8:09:05 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * OfflineTransactions generated by hbm2java
 */
public class OfflineTransactions implements java.io.Serializable
{

	private int id;
	private String name;
	private String mobile;
	private BigDecimal amount;
	private Integer accountId;
	private String transactionNumber;
	private Date transactionTime;
	private String transactionType;
	private String remark;
	private Integer approvedById;
	private Date approvedAt;
	private Integer creatorId;
	private Date createdAt;
	private Date updatedAt;

	public OfflineTransactions()
	{}

	public OfflineTransactions(int id)
	{
		this.id = id;
	}

	public OfflineTransactions(int id, String name, String mobile, BigDecimal amount, Integer accountId,
			String transactionNumber, Date transactionTime, String transactionType, String remark,
			Integer approvedById, Date approvedAt, Integer creatorId, Date createdAt, Date updatedAt)
	{
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.amount = amount;
		this.accountId = accountId;
		this.transactionNumber = transactionNumber;
		this.transactionTime = transactionTime;
		this.transactionType = transactionType;
		this.remark = remark;
		this.approvedById = approvedById;
		this.approvedAt = approvedAt;
		this.creatorId = creatorId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getMobile()
	{
		return this.mobile;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	public BigDecimal getAmount()
	{
		return this.amount;
	}

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}

	public Integer getAccountId()
	{
		return this.accountId;
	}

	public void setAccountId(Integer accountId)
	{
		this.accountId = accountId;
	}

	public String getTransactionNumber()
	{
		return this.transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber)
	{
		this.transactionNumber = transactionNumber;
	}

	public Date getTransactionTime()
	{
		return this.transactionTime;
	}

	public void setTransactionTime(Date transactionTime)
	{
		this.transactionTime = transactionTime;
	}

	public String getTransactionType()
	{
		return this.transactionType;
	}

	public void setTransactionType(String transactionType)
	{
		this.transactionType = transactionType;
	}

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public Integer getApprovedById()
	{
		return this.approvedById;
	}

	public void setApprovedById(Integer approvedById)
	{
		this.approvedById = approvedById;
	}

	public Date getApprovedAt()
	{
		return this.approvedAt;
	}

	public void setApprovedAt(Date approvedAt)
	{
		this.approvedAt = approvedAt;
	}

	public Integer getCreatorId()
	{
		return this.creatorId;
	}

	public void setCreatorId(Integer creatorId)
	{
		this.creatorId = creatorId;
	}

	public Date getCreatedAt()
	{
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt)
	{
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt()
	{
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt)
	{
		this.updatedAt = updatedAt;
	}

}
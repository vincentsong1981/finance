package com.wolaidai.ws.jrocket2.persistence;

// Generated Dec 16, 2014 8:09:05 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * Loans generated by hbm2java
 */
public class Loans implements java.io.Serializable
{

	private static final long serialVersionUID = 2024397452930519440L;
	private Integer id;
	private Integer loanApplicationId;
	private String state;
	private Date disbursedAt;
	private Date createdAt;
	private Date updatedAt;
	private Integer borrowerId;
	private String applicationId;
	private BigDecimal overduePenalty;
	private BigDecimal overdueManagementFeeRate;
	private BigDecimal overdueInterestRate;
	private Date expectedRepaymentDate;
	private Integer lenderId;
	private Date closedAt;
	private Date lastPaymentRunAt;
	private Date lastPastDueAt;
	private String tenor;
	private BigDecimal amount;
	private Boolean verifiedBankCard;
	private Integer overdueChargeVersion;
	//
	private String m_repayment_method;

	public Loans()
	{}

	public Loans(Integer id, Date createdAt, Date updatedAt)
	{
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Loans(Integer id, Integer loanApplicationId, String state, Date disbursedAt, Date createdAt, Date updatedAt,
			Integer borrowerId, String applicationId, BigDecimal overduePenalty, BigDecimal overdueManagementFeeRate,
			BigDecimal overdueInterestRate, Date expectedRepaymentDate, Integer lenderId, Date closedAt,
			Date lastPaymentRunAt, Date lastPastDueAt, String tenor, BigDecimal amount, Boolean verifiedBankCard,
			Integer overdueChargeVersion)
	{
		this.id = id;
		this.loanApplicationId = loanApplicationId;
		this.state = state;
		this.disbursedAt = disbursedAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.borrowerId = borrowerId;
		this.applicationId = applicationId;
		this.overduePenalty = overduePenalty;
		this.overdueManagementFeeRate = overdueManagementFeeRate;
		this.overdueInterestRate = overdueInterestRate;
		this.expectedRepaymentDate = expectedRepaymentDate;
		this.lenderId = lenderId;
		this.closedAt = closedAt;
		this.lastPaymentRunAt = lastPaymentRunAt;
		this.lastPastDueAt = lastPastDueAt;
		this.tenor = tenor;
		this.amount = amount;
		this.verifiedBankCard = verifiedBankCard;
		this.overdueChargeVersion = overdueChargeVersion;
	}

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getLoanApplicationId()
	{
		return this.loanApplicationId;
	}

	public void setLoanApplicationId(Integer loanApplicationId)
	{
		this.loanApplicationId = loanApplicationId;
	}

	public String getState()
	{
		return this.state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public Date getDisbursedAt()
	{
		return this.disbursedAt;
	}

	public void setDisbursedAt(Date disbursedAt)
	{
		this.disbursedAt = disbursedAt;
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

	public Integer getBorrowerId()
	{
		return this.borrowerId;
	}

	public void setBorrowerId(Integer borrowerId)
	{
		this.borrowerId = borrowerId;
	}

	public String getApplicationId()
	{
		return this.applicationId;
	}

	public void setApplicationId(String applicationId)
	{
		this.applicationId = applicationId;
	}

	public BigDecimal getOverduePenalty()
	{
		return this.overduePenalty;
	}

	public void setOverduePenalty(BigDecimal overduePenalty)
	{
		this.overduePenalty = overduePenalty;
	}

	public BigDecimal getOverdueManagementFeeRate()
	{
		return this.overdueManagementFeeRate;
	}

	public void setOverdueManagementFeeRate(BigDecimal overdueManagementFeeRate)
	{
		this.overdueManagementFeeRate = overdueManagementFeeRate;
	}

	public BigDecimal getOverdueInterestRate()
	{
		return this.overdueInterestRate;
	}

	public void setOverdueInterestRate(BigDecimal overdueInterestRate)
	{
		this.overdueInterestRate = overdueInterestRate;
	}

	public Date getExpectedRepaymentDate()
	{
		return this.expectedRepaymentDate;
	}

	public void setExpectedRepaymentDate(Date expectedRepaymentDate)
	{
		this.expectedRepaymentDate = expectedRepaymentDate;
	}

	public Integer getLenderId()
	{
		return this.lenderId;
	}

	public void setLenderId(Integer lenderId)
	{
		this.lenderId = lenderId;
	}

	public Date getClosedAt()
	{
		return this.closedAt;
	}

	public void setClosedAt(Date closedAt)
	{
		this.closedAt = closedAt;
	}

	public Date getLastPaymentRunAt()
	{
		return this.lastPaymentRunAt;
	}

	public void setLastPaymentRunAt(Date lastPaymentRunAt)
	{
		this.lastPaymentRunAt = lastPaymentRunAt;
	}

	public Date getLastPastDueAt()
	{
		return this.lastPastDueAt;
	}

	public void setLastPastDueAt(Date lastPastDueAt)
	{
		this.lastPastDueAt = lastPastDueAt;
	}

	public String getTenor()
	{
		return this.tenor;
	}

	public void setTenor(String tenor)
	{
		this.tenor = tenor;
	}

	public BigDecimal getAmount()
	{
		return this.amount;
	}

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}

	public Boolean getVerifiedBankCard()
	{
		return this.verifiedBankCard;
	}

	public void setVerifiedBankCard(Boolean verifiedBankCard)
	{
		this.verifiedBankCard = verifiedBankCard;
	}

	public Integer getOverdueChargeVersion()
	{
		return this.overdueChargeVersion;
	}

	public void setOverdueChargeVersion(Integer overdueChargeVersion)
	{
		this.overdueChargeVersion = overdueChargeVersion;
	}

	public String getRepayment_method()
	{
		return m_repayment_method;
	}

	public void setRepayment_method(String repayment_method)
	{
		m_repayment_method = repayment_method;
	}

}

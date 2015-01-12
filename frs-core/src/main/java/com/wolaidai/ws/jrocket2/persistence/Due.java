package com.wolaidai.ws.jrocket2.persistence;

// Generated Dec 16, 2014 8:09:05 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Dues generated by hbm2java
 */
public class Due implements java.io.Serializable
{
	private static final long serialVersionUID = -3349103190781995676L;
	private Integer id;
	private Integer loan_id;
	private Integer index;
	private BigDecimal amount;
	private Date due_date;
	private String due_type;
	private Date created_at;
	private Date updated_at;
	private Loan loan;
	private List<DueSettlement> dueSettlement;

	public enum State
	{
		SETTLED("settled"), OVERDUE("overdue"), OPEN("open");

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

	public enum DueType
	{
		INTEREST("interest"),
		OVERDUE_INTEREST("overdue_interest"),
		MANAGEMENT_FEE("management_fee"),
		WITHDRAWAL_FEE("withdrawal_fee"),
		DEPOSIT_FEE("deposit_fee"),
		OVERDUE_MNGMT_FEE("overdue_management_fee"),
		HANDLING_FEE("handling_fee"),
		PRINCIPAL("principal"),
		OVERDUE_PENALTY("overdue_penalty");

		private String m_value;

		private DueType(String value)
		{
			m_value = value;
		}

		public String getValue()
		{
			return m_value;
		}
	}

	public Due()
	{}

	public Due(Integer id)
	{
		this.id = id;
	}

	public Due(Integer id, Integer loanId, Integer index, BigDecimal amount, Date dueDate, String dueType,
			Date createdAt, Date updatedAt)
	{
		this.id = id;
		this.loan_id = loanId;
		this.index = index;
		this.amount = amount;
		this.due_date = dueDate;
		this.due_type = dueType;
		this.created_at = createdAt;
		this.updated_at = updatedAt;
	}

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getLoan_id()
	{
		return loan_id;
	}

	public void setLoan_id(Integer loan_id)
	{
		this.loan_id = loan_id;
	}

	public Integer getIndex()
	{
		return index;
	}

	public void setIndex(Integer index)
	{
		this.index = index;
	}

	public BigDecimal getAmount()
	{
		return amount;
	}

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}

	public Date getDue_date()
	{
		return due_date;
	}

	public void setDue_date(Date due_date)
	{
		this.due_date = due_date;
	}

	public String getDue_type()
	{
		return due_type;
	}

	public void setDue_type(String due_type)
	{
		this.due_type = due_type;
	}

	public Date getCreated_at()
	{
		return created_at;
	}

	public void setCreated_at(Date created_at)
	{
		this.created_at = created_at;
	}

	public Date getUpdated_at()
	{
		return updated_at;
	}

	public void setUpdated_at(Date updated_at)
	{
		this.updated_at = updated_at;
	}

	public Loan getLoan()
	{
		return loan;
	}

	public void setLoan(Loan loan)
	{
		this.loan = loan;
	}

	public List<DueSettlement> getDueSettlement()
	{
		return dueSettlement;
	}

	public void setDueSettlement(List<DueSettlement> dueSettlement)
	{
		this.dueSettlement = dueSettlement;
	}

}
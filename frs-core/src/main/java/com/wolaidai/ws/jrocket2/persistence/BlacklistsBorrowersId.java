package com.wolaidai.ws.jrocket2.persistence;

// Generated Dec 16, 2014 8:09:05 PM by Hibernate Tools 3.4.0.CR1

/**
 * BlacklistsBorrowersId generated by hbm2java
 */
public class BlacklistsBorrowersId implements java.io.Serializable
{

	private Integer blacklistId;
	private Integer borrowerId;

	public BlacklistsBorrowersId()
	{}

	public BlacklistsBorrowersId(Integer blacklistId, Integer borrowerId)
	{
		this.blacklistId = blacklistId;
		this.borrowerId = borrowerId;
	}

	public Integer getBlacklistId()
	{
		return this.blacklistId;
	}

	public void setBlacklistId(Integer blacklistId)
	{
		this.blacklistId = blacklistId;
	}

	public Integer getBorrowerId()
	{
		return this.borrowerId;
	}

	public void setBorrowerId(Integer borrowerId)
	{
		this.borrowerId = borrowerId;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BlacklistsBorrowersId))
			return false;
		BlacklistsBorrowersId castOther = (BlacklistsBorrowersId) other;

		return ((this.getBlacklistId() == castOther.getBlacklistId()) || (this.getBlacklistId() != null
				&& castOther.getBlacklistId() != null && this.getBlacklistId().equals(castOther.getBlacklistId())))
				&& ((this.getBorrowerId() == castOther.getBorrowerId()) || (this.getBorrowerId() != null
						&& castOther.getBorrowerId() != null && this.getBorrowerId().equals(castOther.getBorrowerId())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + (getBlacklistId() == null ? 0 : this.getBlacklistId().hashCode());
		result = 37 * result + (getBorrowerId() == null ? 0 : this.getBorrowerId().hashCode());
		return result;
	}

}

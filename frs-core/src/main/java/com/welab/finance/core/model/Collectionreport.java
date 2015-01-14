package com.welab.finance.core.model;

// Generated Jan 13, 2015 5:05:42 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * Collectionreport generated by hbm2java
 */
public class Collectionreport implements java.io.Serializable
{

	private Date rptdate;
	private int overduetotalcount;
	private BigDecimal overduetotalamount;
	private int overduecollectfailcount;
	private BigDecimal overduecollectfailamount;
	private int duecollecttotalcount;
	private BigDecimal duecollecttotalamount;
	private int duecollectfailcount;
	private BigDecimal duecollectfailamount;
	private int earlysettletotalcount;
	private BigDecimal earlysettletotalamount;

	public Collectionreport()
	{}

	public Collectionreport(Date rptdate, int overduetotalcount, BigDecimal overduetotalamount,
			int overduecollectfailcount, BigDecimal overduecollectfailamount, int duecollecttotalcount,
			BigDecimal duecollecttotalamount, int duecollectfailcount, BigDecimal duecollectfailamount,
			int earlysettletotalcount, BigDecimal earlysettletotalamount)
	{
		this.rptdate = rptdate;
		this.overduetotalcount = overduetotalcount;
		this.overduetotalamount = overduetotalamount;
		this.overduecollectfailcount = overduecollectfailcount;
		this.overduecollectfailamount = overduecollectfailamount;
		this.duecollecttotalcount = duecollecttotalcount;
		this.duecollecttotalamount = duecollecttotalamount;
		this.duecollectfailcount = duecollectfailcount;
		this.duecollectfailamount = duecollectfailamount;
		this.earlysettletotalcount = earlysettletotalcount;
		this.earlysettletotalamount = earlysettletotalamount;
	}

	public Date getRptdate()
	{
		return this.rptdate;
	}

	public void setRptdate(Date rptdate)
	{
		this.rptdate = rptdate;
	}

	public int getOverduetotalcount()
	{
		return this.overduetotalcount;
	}

	public void setOverduetotalcount(int overduetotalcount)
	{
		this.overduetotalcount = overduetotalcount;
	}

	public BigDecimal getOverduetotalamount()
	{
		return this.overduetotalamount;
	}

	public void setOverduetotalamount(BigDecimal overduetotalamount)
	{
		this.overduetotalamount = overduetotalamount;
	}

	public int getOverduecollectfailcount()
	{
		return this.overduecollectfailcount;
	}

	public void setOverduecollectfailcount(int overduecollectfailcount)
	{
		this.overduecollectfailcount = overduecollectfailcount;
	}

	public BigDecimal getOverduecollectfailamount()
	{
		return this.overduecollectfailamount;
	}

	public void setOverduecollectfailamount(BigDecimal overduecollectfailamount)
	{
		this.overduecollectfailamount = overduecollectfailamount;
	}

	public int getDuecollecttotalcount()
	{
		return this.duecollecttotalcount;
	}

	public void setDuecollecttotalcount(int duecollecttotalcount)
	{
		this.duecollecttotalcount = duecollecttotalcount;
	}

	public BigDecimal getDuecollecttotalamount()
	{
		return this.duecollecttotalamount;
	}

	public void setDuecollecttotalamount(BigDecimal duecollecttotalamount)
	{
		this.duecollecttotalamount = duecollecttotalamount;
	}

	public int getDuecollectfailcount()
	{
		return this.duecollectfailcount;
	}

	public void setDuecollectfailcount(int duecollectfailcount)
	{
		this.duecollectfailcount = duecollectfailcount;
	}

	public BigDecimal getDuecollectfailamount()
	{
		return this.duecollectfailamount;
	}

	public void setDuecollectfailamount(BigDecimal duecollectfailamount)
	{
		this.duecollectfailamount = duecollectfailamount;
	}

	public int getEarlysettletotalcount()
	{
		return this.earlysettletotalcount;
	}

	public void setEarlysettletotalcount(int earlysettletotalcount)
	{
		this.earlysettletotalcount = earlysettletotalcount;
	}

	public BigDecimal getEarlysettletotalamount()
	{
		return this.earlysettletotalamount;
	}

	public void setEarlysettletotalamount(BigDecimal earlysettletotalamount)
	{
		this.earlysettletotalamount = earlysettletotalamount;
	}

}
package com.wolaidai.ws.jrocket2.persistence;

// Generated Dec 16, 2014 8:09:05 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * DeviceInfos generated by hbm2java
 */
public class DeviceInfos implements java.io.Serializable
{

	private static final long serialVersionUID = -5558624102815956081L;
	private int id;
	private String model;
	private String osVersion;
	private String uuid;
	private String gps;
	private Integer contactCount;
	private String ip;
	private String mac;
	private Integer loanApplicationId;
	private Date createdAt;
	private Date updatedAt;
	private Integer sourceId;

	public DeviceInfos()
	{}

	public DeviceInfos(int id)
	{
		this.id = id;
	}

	public DeviceInfos(int id, String model, String osVersion, String uuid, String gps, Integer contactCount,
			String ip, String mac, Integer loanApplicationId, Date createdAt, Date updatedAt, Integer sourceId)
	{
		this.id = id;
		this.model = model;
		this.osVersion = osVersion;
		this.uuid = uuid;
		this.gps = gps;
		this.contactCount = contactCount;
		this.ip = ip;
		this.mac = mac;
		this.loanApplicationId = loanApplicationId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.sourceId = sourceId;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getModel()
	{
		return this.model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getOsVersion()
	{
		return this.osVersion;
	}

	public void setOsVersion(String osVersion)
	{
		this.osVersion = osVersion;
	}

	public String getUuid()
	{
		return this.uuid;
	}

	public void setUuid(String uuid)
	{
		this.uuid = uuid;
	}

	public String getGps()
	{
		return this.gps;
	}

	public void setGps(String gps)
	{
		this.gps = gps;
	}

	public Integer getContactCount()
	{
		return this.contactCount;
	}

	public void setContactCount(Integer contactCount)
	{
		this.contactCount = contactCount;
	}

	public String getIp()
	{
		return this.ip;
	}

	public void setIp(String ip)
	{
		this.ip = ip;
	}

	public String getMac()
	{
		return this.mac;
	}

	public void setMac(String mac)
	{
		this.mac = mac;
	}

	public Integer getLoanApplicationId()
	{
		return this.loanApplicationId;
	}

	public void setLoanApplicationId(Integer loanApplicationId)
	{
		this.loanApplicationId = loanApplicationId;
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

	public Integer getSourceId()
	{
		return this.sourceId;
	}

	public void setSourceId(Integer sourceId)
	{
		this.sourceId = sourceId;
	}

}

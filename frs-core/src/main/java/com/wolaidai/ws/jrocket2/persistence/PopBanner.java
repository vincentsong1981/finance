package com.wolaidai.ws.jrocket2.persistence;

// Generated Jan 3, 2015 2:18:09 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.List;

/**
 * PopBanners generated by hbm2java
 */
public class PopBanner implements java.io.Serializable
{
	private static final long serialVersionUID = -3482279431029585097L;
	private Integer id;
	private String banner_type;
	private String code;
	private String product;
	private Integer refresh_time;
	private Integer last_modify_by_id;
	private Date created_at;
	private Date updated_at;
	private List<PopActivity> pop_activities;

	public PopBanner()
	{}

	public PopBanner(Integer id)
	{
		this.id = id;
	}

	public PopBanner(Integer id, String bannerType, String code, String product, Integer refreshTime,
			Integer lastModifyById, Date createdAt, Date updatedAt)
	{
		this.id = id;
		this.banner_type = bannerType;
		this.code = code;
		this.product = product;
		this.refresh_time = refreshTime;
		this.last_modify_by_id = lastModifyById;
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

	public String getBanner_type()
	{
		return banner_type;
	}

	public void setBanner_type(String banner_type)
	{
		this.banner_type = banner_type;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getProduct()
	{
		return product;
	}

	public void setProduct(String product)
	{
		this.product = product;
	}

	public Integer getRefresh_time()
	{
		return refresh_time;
	}

	public void setRefresh_time(Integer refresh_time)
	{
		this.refresh_time = refresh_time;
	}

	public Integer getLast_modify_by_id()
	{
		return last_modify_by_id;
	}

	public void setLast_modify_by_id(Integer last_modify_by_id)
	{
		this.last_modify_by_id = last_modify_by_id;
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

	public List<PopActivity> getPop_activities()
	{
		return pop_activities;
	}

	public void setPop_activities(List<PopActivity> pop_activities)
	{
		this.pop_activities = pop_activities;
	}

}

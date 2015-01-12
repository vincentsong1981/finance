package com.wolaidai.ws.jrocket2.persistence;

// Generated Dec 16, 2014 8:09:05 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * YilianTransactions generated by hbm2java
 */
public class YilianTransaction implements java.io.Serializable
{
	private static final long serialVersionUID = 422874217042360719L;
	public static final String TRANS_CODE_V2_TOPUP = "Y0";
	public static final String TRANS_CODE_COLLECT = "Y1";
	public static final String TRANS_CODE_DISBURSE = "Y2";
	public static final String TRANS_CODE_SETTLE = "Y3";
	public static final String TRANS_CODE_REPAY = "Y4";
	public static final String TRANS_CODE_DEPOSIT = "Y5";
	public static final String TRANS_CODE_WITHDRAW = "Y6";
	public static final String TRANS_CODE_TXN_FEE = "Y7";
	public static final String TRANS_CODE_INSTALLMENT = "Y8";
	public static final String TRANS_CODE_V2_WITHDRAW = "Y9";
	public static final String TRANS_CODE_AUTHENTICATE = "YA";
	public static final String TRANS_CODE_AMORTIZATION = "YB";
	// MSG_TYPE
	public static final String MSG_TYPE_PAY = "100001";
	public static final String MSG_TYPE_PAY_QUERY = "100002";
	public static final String MSG_TYPE_GATHER = "200001";
	public static final String MSG_TYPE_GATHER_QUERY = "200002";
	public static final String MSG_TYPE_AUTH = "300001";
	private Integer id;
	private String msg_type;
	private String batch_no;
	private String user_name;
	private String trans_state;
	private String pay_state;
	private String bank_id;
	private String acc_no;
	private String acc_name;
	private String acc_province;
	private String acc_city;
	private String id_no;
	private String mobile_no;
	private BigDecimal amount;
	private Date created_at;
	private Date updated_at;
	private Integer loan_id;
	private String code;
	private BigDecimal trans_fee_rate;
	private BigDecimal trans_fee;
	private Integer role_id;
	private String role_type;
	private String remark;
	private String success_date;
	private Integer trade_application_id;
	private Integer bank_card_id;
	private User user;
	private BankCard bank_card;

	public YilianTransaction()
	{}

	public YilianTransaction(Integer id)
	{
		this.id = id;
	}

	public YilianTransaction(Integer id, String msgType, String batchNo, String userName, String transState,
			String payState, String bankId, String accNo, String accName, String accProvince, String accCity,
			String idNo, String mobileNo, BigDecimal amount, Date createdAt, Date updatedAt, Integer loanId,
			String code, BigDecimal transFeeRate, BigDecimal transFee, Integer roleId, String roleType, String remark,
			String successDate, Integer tradeApplicationId, Integer bankCardId)
	{
		this.id = id;
		this.msg_type = msgType;
		this.batch_no = batchNo;
		this.user_name = userName;
		this.trans_state = transState;
		this.pay_state = payState;
		this.bank_id = bankId;
		this.acc_no = accNo;
		this.acc_name = accName;
		this.acc_province = accProvince;
		this.acc_city = accCity;
		this.id_no = idNo;
		this.mobile_no = mobileNo;
		this.amount = amount;
		this.created_at = createdAt;
		this.updated_at = updatedAt;
		this.loan_id = loanId;
		this.code = code;
		this.trans_fee_rate = transFeeRate;
		this.trans_fee = transFee;
		this.role_id = roleId;
		this.role_type = roleType;
		this.remark = remark;
		this.success_date = successDate;
		this.trade_application_id = tradeApplicationId;
		this.bank_card_id = bankCardId;
	}

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getMsg_type()
	{
		return msg_type;
	}

	public void setMsg_type(String msg_type)
	{
		this.msg_type = msg_type;
	}

	public String getBatch_no()
	{
		return batch_no;
	}

	public void setBatch_no(String batch_no)
	{
		this.batch_no = batch_no;
	}

	public String getUser_name()
	{
		return user_name;
	}

	public void setUser_name(String user_name)
	{
		this.user_name = user_name;
	}

	public String getTrans_state()
	{
		return trans_state;
	}

	public void setTrans_state(String trans_state)
	{
		this.trans_state = trans_state;
	}

	public String getPay_state()
	{
		return pay_state;
	}

	public void setPay_state(String pay_state)
	{
		this.pay_state = pay_state;
	}

	public String getBank_id()
	{
		return bank_id;
	}

	public void setBank_id(String bank_id)
	{
		this.bank_id = bank_id;
	}

	public String getAcc_no()
	{
		return acc_no;
	}

	public void setAcc_no(String acc_no)
	{
		this.acc_no = acc_no;
	}

	public String getAcc_name()
	{
		return acc_name;
	}

	public void setAcc_name(String acc_name)
	{
		this.acc_name = acc_name;
	}

	public String getAcc_province()
	{
		return acc_province;
	}

	public void setAcc_province(String acc_province)
	{
		this.acc_province = acc_province;
	}

	public String getAcc_city()
	{
		return acc_city;
	}

	public void setAcc_city(String acc_city)
	{
		this.acc_city = acc_city;
	}

	public String getId_no()
	{
		return id_no;
	}

	public void setId_no(String id_no)
	{
		this.id_no = id_no;
	}

	public String getMobile_no()
	{
		return mobile_no;
	}

	public void setMobile_no(String mobile_no)
	{
		this.mobile_no = mobile_no;
	}

	public BigDecimal getAmount()
	{
		return amount;
	}

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
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

	public Integer getLoan_id()
	{
		return loan_id;
	}

	public void setLoan_id(Integer loan_id)
	{
		this.loan_id = loan_id;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public BigDecimal getTrans_fee_rate()
	{
		return trans_fee_rate;
	}

	public void setTrans_fee_rate(BigDecimal trans_fee_rate)
	{
		this.trans_fee_rate = trans_fee_rate;
	}

	public BigDecimal getTrans_fee()
	{
		return trans_fee;
	}

	public void setTrans_fee(BigDecimal trans_fee)
	{
		this.trans_fee = trans_fee;
	}

	public Integer getRole_id()
	{
		return role_id;
	}

	public void setRole_id(Integer role_id)
	{
		this.role_id = role_id;
	}

	public String getRole_type()
	{
		return role_type;
	}

	public void setRole_type(String role_type)
	{
		this.role_type = role_type;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public String getSuccess_date()
	{
		return success_date;
	}

	public void setSuccess_date(String success_date)
	{
		this.success_date = success_date;
	}

	public Integer getTrade_application_id()
	{
		return trade_application_id;
	}

	public void setTrade_application_id(Integer trade_application_id)
	{
		this.trade_application_id = trade_application_id;
	}

	public Integer getBank_card_id()
	{
		return bank_card_id;
	}

	public void setBank_card_id(Integer bank_card_id)
	{
		this.bank_card_id = bank_card_id;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public BankCard getBank_card()
	{
		return bank_card;
	}

	public void setBank_card(BankCard bank_card)
	{
		this.bank_card = bank_card;
	}

}

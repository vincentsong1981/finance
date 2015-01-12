package com.wolaidai.ws.jrocket2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolaidai.ws.jrocket2.persistence.BankCard;
import com.wolaidai.ws.jrocket2.persistence.mapper.BankCardMapper;

@Service
public class BankService
{
	
	@Autowired
	BankCardMapper bankCardMapper;
	
	
	public String getBankCardNumber()
	{
		List<BankCard> bankCards = (List<BankCard>)bankCardMapper.getBankCardsByUser(new Integer(6));
		
		return bankCards.get(0).getAccount_number();
	}

}

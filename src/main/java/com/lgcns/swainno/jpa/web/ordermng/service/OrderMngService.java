package com.lgcns.swainno.jpa.web.ordermng.service;

import org.springframework.stereotype.Service;

import com.lgcns.swainno.jpa.web.ordermng.dto.OrderDto;
import com.lgcns.swainno.jpa.web.ordermng.repository.OrderMngRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderMngService {
	
	private OrderMngRepository orderMngRepository;	

	public Long createOrder(OrderDto orderDto) {
		// TODO 
		
		return null;
	}



}

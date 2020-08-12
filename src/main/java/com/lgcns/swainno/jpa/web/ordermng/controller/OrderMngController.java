package com.lgcns.swainno.jpa.web.ordermng.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.swainno.jpa.web.ordermng.dto.OrderDto;
import com.lgcns.swainno.jpa.web.ordermng.service.OrderMngService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/ordermng/v1")
@AllArgsConstructor
public class OrderMngController {
	
	private OrderMngService orderMngService;
	
	@PostMapping("/orders")
	public Long createOrder(@RequestBody OrderDto orderDto) {
		
		return orderMngService.createOrder(orderDto);
	}

}

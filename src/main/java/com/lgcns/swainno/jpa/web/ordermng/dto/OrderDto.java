package com.lgcns.swainno.jpa.web.ordermng.dto;

import lombok.Data;

@Data
public class OrderDto {
	
	private Long id;
	
	private String product;
	
	private long price;
	
	private Long memberId;
	
}

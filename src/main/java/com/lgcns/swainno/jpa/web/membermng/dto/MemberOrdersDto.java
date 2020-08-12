package com.lgcns.swainno.jpa.web.membermng.dto;

import java.util.List;

import com.lgcns.swainno.jpa.web.ordermng.dto.OrderDto;

import lombok.Data;

@Data
public class MemberOrdersDto {
	
	private MemberDto member;
	
	private List<OrderDto> orders;

}

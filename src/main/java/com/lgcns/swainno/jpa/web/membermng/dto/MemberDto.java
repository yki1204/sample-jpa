package com.lgcns.swainno.jpa.web.membermng.dto;

import lombok.Data;

@Data
public class MemberDto {
	
	private Long id;
	
	private String name;
	
	private int age;
	
	private Long teamId;
	
	private String teamName;

}

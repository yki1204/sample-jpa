package com.lgcns.swainno.jpa.web.membermng.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.swainno.jpa.web.membermng.dto.MemberSrchDto;
import com.lgcns.swainno.jpa.web.membermng.entity.Member;
import com.lgcns.swainno.jpa.web.membermng.service.MemberMngService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/membermng/v1")
@AllArgsConstructor
public class MemberMngController {
	
	private MemberMngService memberMngService;
	
	@GetMapping("/members")
	public Page<Member> retireveMemberList(MemberSrchDto memberSrchDto, Pageable page) {
		System.out.println("pageSize = "+page.getPageSize());
		
		return memberMngService.retireveMemberList(memberSrchDto, page);
	}

}

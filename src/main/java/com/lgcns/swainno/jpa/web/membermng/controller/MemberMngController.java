package com.lgcns.swainno.jpa.web.membermng.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.swainno.jpa.web.membermng.dto.MemberDto;
import com.lgcns.swainno.jpa.web.membermng.dto.MemberOrdersDto;
import com.lgcns.swainno.jpa.web.membermng.dto.MemberSrchDto;
import com.lgcns.swainno.jpa.web.membermng.service.MemberMngService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/membermng/v1")
@AllArgsConstructor
public class MemberMngController {
	
	private MemberMngService memberMngService;
	
	@GetMapping("/members")
	public Page<MemberDto> retireveMemberList(MemberSrchDto memberSrchDto, Pageable page) {
		
		return memberMngService.retireveMemberList(memberSrchDto, page);
	}
	
	@GetMapping("/members/{id}")
	public MemberDto retireveMember(@PathVariable Long id) {
		
		return memberMngService.retireveMember(id);
	}
	
	@GetMapping("/members/{id}/orders")
	public MemberOrdersDto retireveMemberOrderList(@PathVariable Long id) {
		
		return memberMngService.retireveMemberOrderList(id);
	}
	
	@PostMapping("/members")
	public Long createMember(@RequestBody MemberDto memberDto) {
		
		return memberMngService.createMember(memberDto);
	}
	
	@PutMapping("/members/{id}")
	public void modifyMember(@PathVariable Long id, @RequestBody MemberDto memberDto) {
		
		memberMngService.modifyMember(id, memberDto);
	}
	
	@DeleteMapping("/members/{id}")
	public void deleteMember(@PathVariable Long id) {
		
		memberMngService.deleteMember(id);
	}

}

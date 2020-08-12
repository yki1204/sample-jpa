package com.lgcns.swainno.jpa.web.membermng.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.lgcns.swainno.jpa.web.membermng.dto.MemberDto;
import com.lgcns.swainno.jpa.web.membermng.dto.MemberOrdersDto;
import com.lgcns.swainno.jpa.web.membermng.dto.MemberSrchDto;
import com.lgcns.swainno.jpa.web.membermng.entity.Member;
import com.lgcns.swainno.jpa.web.membermng.repository.MemberMngRepository;
import com.lgcns.swainno.jpa.web.ordermng.dto.OrderDto;
import com.lgcns.swainno.jpa.web.ordermng.entity.Order;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberMngService {
	
	private MemberMngRepository memberMngRepository;
	
	public Page<MemberDto> retireveMemberList(MemberSrchDto memberSrchDto, Pageable page) {
		
		Page<Member> members = null;
		
		// Dynamic Query 구현
		if(!StringUtils.isEmpty(memberSrchDto.getName()) && !StringUtils.isEmpty(memberSrchDto.getTeamName())) {
			members = memberMngRepository.findByNameAndTeam_name(memberSrchDto.getName(), memberSrchDto.getTeamName(), page);
		} else if(!StringUtils.isEmpty(memberSrchDto.getName())) {
			members = memberMngRepository.findByName(memberSrchDto.getName(), page);
		} else if(!StringUtils.isEmpty(memberSrchDto.getTeamName())) {
			members = memberMngRepository.findByTeam_name(memberSrchDto.getTeamName(), page);
		}else {
			members = memberMngRepository.findAll(page);
		}
		
		// Page<Entity> -> Page<Dto>
		return members.map(this::convertToMemberDto);
	}
	
	// Entity -> Dto
	private MemberDto convertToMemberDto(Member member) {
		MemberDto dto = new MemberDto();
		dto.setId(member.getId());
		dto.setName(member.getName());
		dto.setAge(member.getAge());
		dto.setTeamId(member.getTeam().getId());
		dto.setTeamName(member.getTeam().getName());
		
	    return dto;
	}
	
	public MemberDto retireveMember(Long id) {
		// TODO 
		
		return null;
	}
	
	public MemberOrdersDto retireveMemberOrderList(Long id) {
		// TODO 
		
		return null;
	}

	public Long createMember(MemberDto memberDto) {
		// TODO 
		
		return null;
	}

	public void modifyMember(Long id, MemberDto memberDto) {
		// TODO 
		
	}

	public void deleteMember(Long id) {
		// TODO 
		
	}


}

package com.lgcns.swainno.jpa.web.membermng.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.lgcns.swainno.jpa.web.membermng.dto.MemberDto;
import com.lgcns.swainno.jpa.web.membermng.dto.MemberSrchDto;
import com.lgcns.swainno.jpa.web.membermng.entity.Member;
import com.lgcns.swainno.jpa.web.membermng.repository.MemberMngRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberMngService {
	
	private MemberMngRepository memberMngRepository;
	
	public Page<Member> retireveMemberList(MemberSrchDto memberSrchDto, Pageable page) {
		
		Page<Member> members = null;
		
		if(!StringUtils.isEmpty(memberSrchDto.getName()) && !StringUtils.isEmpty(memberSrchDto.getTeamName())) {
			members = memberMngRepository.findByNameAndTeam_name(memberSrchDto.getName(), memberSrchDto.getTeamName(), page);
		} else if(!StringUtils.isEmpty(memberSrchDto.getName())) {
			members = memberMngRepository.findByName(memberSrchDto.getName(), page);
		} else if(!StringUtils.isEmpty(memberSrchDto.getTeamName())) {
			members = memberMngRepository.findByTeam_name(memberSrchDto.getTeamName(), page);
		}else {
			members = memberMngRepository.findAll(page);
		}
		
		return members;
	}

}

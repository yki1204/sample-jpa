package com.lgcns.swainno.jpa.web.membermng.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lgcns.swainno.jpa.web.membermng.entity.Member;

public interface MemberMngRepository extends JpaRepository<Member, Long>{

	public Page<Member> findByNameAndTeam_name(String name ,String teamName, Pageable page);
	
	public Page<Member> findByName(String name, Pageable page);
	
	public Page<Member> findByTeam_name(String teamName, Pageable page);
}

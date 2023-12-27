package com.kh.app.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.vo.MemberVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberDao dao;
	private final SqlSessionTemplate sst;
	
	public int join(MemberVo vo) throws Exception {
		
		String id = vo.getId();
		if(id.length() < 4) {
			throw new Exception("아이디가 너무 짧다");
		}
		
		if(id != null && id.equalsIgnoreCase("admin")) {
			throw new Exception("admin 안돼");
		}
		
		return dao.join(vo, sst);
	}

	public MemberVo login(MemberVo vo) {
		return dao.login(vo, sst);
	}

}

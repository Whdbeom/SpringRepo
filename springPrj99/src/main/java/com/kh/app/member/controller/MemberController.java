package com.kh.app.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberController {

	private final MemberService service;
	
	// 회원가입
	@PostMapping("join")
	public String join(MemberVo vo) throws Exception {		
		int result = service.join(vo);
		if(result != 1) {
			throw new Exception();
		}
		
		return "redirect:/home";
	}
	
	// 로그인
	@PostMapping("login")
	public void login(MemberVo vo) {		
		MemberVo loginVo = service.login(vo);
		System.out.println(loginVo);
	}
	
	// 회원 정보 수정
//	@PostMapping("login")
//	public void login(MemberVo vo) {		
//		int result = service.login(vo);
//	}
//	
//	// 회원 탈퇴
//	@PostMapping("login")
//	public void login(MemberVo vo) {		
//		int result = service.login(vo);
//	}
//	
//	// 회원 목록 조회
//	@PostMapping("login")
//	public void login(MemberVo vo) {		
//		int result = service.login(vo);
//	}
	
}

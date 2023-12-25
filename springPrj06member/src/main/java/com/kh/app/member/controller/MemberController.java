package com.kh.app.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("member")
@RequiredArgsConstructor
@Transactional
public class MemberController {

	private final MemberService ms;
	
	// 회원 가입
	@PostMapping("join")
	public int join(MemberVo vo) {
		int result = ms.join(vo);
		int x = 1/0;
		System.out.println("회원가입 result : " + result);
		return result;
	}
	// 회원 목록 조회
	@GetMapping("list")
	public String list(Model model) {
		List<MemberVo> voList = ms.list();
		for (MemberVo memberVo : voList) {
			System.out.println(memberVo);
		}
		
		// 화면에 데이터(voList) 전달
		model.addAttribute("key01", "values01");
		
		// 화면 포워딩ㄴ
		return "member/list";
		
	}
	// 회원 상세 조회
	@GetMapping("detail")
	public void detail(String no) {
		MemberVo vo = ms.detail(no);
		System.out.println(vo);
	}
	// 회원 삭제
	@GetMapping("delete")
	public void delete(String no) {
		int result = ms.delete(no);
		System.out.println("회원삭제 : " + result);
	}
	
	// 회원 정보 수정
	@PostMapping("edit")
	public void edit(MemberVo vo) {
		int result = ms.edit(vo);
		System.out.println("회원정보 수정: " + result);
	}
	
}

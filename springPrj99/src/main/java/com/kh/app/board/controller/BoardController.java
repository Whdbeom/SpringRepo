package com.kh.app.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {

	private final BoardService service;
	
	// 게시글 작성
	@PostMapping("write")
	public String write(BoardVo vo) throws Exception {
		
		int result = service.write(vo);
		System.out.println("write : " + result);
		
		if(result != 1) {
			throw new Exception();
		}
		
		
		return "redirect:/board/list";
	}
	
	// 게시글 목록 조회 
	@GetMapping("list")
	public String list(Model model) {
		
		List<BoardVo> boardVoList = service.list();
		System.out.println(boardVoList);
		model.addAttribute("boardVoList", boardVoList);
		return "board/list";
	}
	
	// 게시글 상세 조회 (번호)
	@GetMapping("detail")
	public String detail(BoardVo vo , Model model) {
		BoardVo boardVo = service.detail(vo);
		model.addAttribute("boardVo", boardVo);
		return "board/detail";
	}
	
	// 게시글 삭제 (번호)
	@GetMapping("delete")
	public String delete(BoardVo vo) throws Exception {
		int result = service.delete(vo);
		if(result != 1) {
			throw new Exception();
		}
		
		return "redirect:/board/list";
	}
	
	// 게시글 수정 (제목, 내용)
	@PostMapping("edit")
	public String edit(BoardVo vo) throws Exception {
		int result = service.edit(vo);
		if(result != 1) {
			throw new Exception();
		}
		return "redirect:/board/list";
	}
	
}

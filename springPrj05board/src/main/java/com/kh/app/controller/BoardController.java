package com.kh.app.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.app.service.BoardService;
import com.kh.app.vo.BoardVo;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("board")
@RequiredArgsConstructor
public class BoardController {

	private final BoardService service;

	// 게시글 작성하기
	@PostMapping("insert")
	public void insert(BoardVo vo) {		
		// data
		
		// service
	
		int result = service.insertBoard(vo);
		// result
		System.out.println("result : " + result);
//		return result;
	}
	
	// 게시글 목록조회
	@GetMapping("list")
	public void selectlist() {
		
		List<BoardVo> voList = service.getBoardList();
		
		for (BoardVo boardVo : voList) {
			System.out.println(boardVo);
		}
	}
	
	// 게시글 상세조회
	@GetMapping("detail")
	public void selectOne(String no) {
		BoardVo vo = service.getBoardByNo(no);
		System.out.println(vo);
	}
	
	// 게시글 삭제하기
	@GetMapping("delete")
	public void delete(String no) {
		int result = service.deleteBoardByNo(no);
		System.out.println("게시글 삭제 : " + result);
	}
	
	// 게시글 수정하기
	@PostMapping("edit")
	public void edit(BoardVo vo) {
		int result = service.editBoardByNo(vo);
		System.out.println("게시글 수정 : " + result);
	}
	
}

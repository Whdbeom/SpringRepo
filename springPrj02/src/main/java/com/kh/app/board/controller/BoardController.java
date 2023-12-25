package com.kh.app.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

@Controller
public class BoardController {

	@Autowired
	private BoardService bs;
	
	@GetMapping("/board/list")
	public String getBoardList() {
		
		List<BoardVo> voList = bs.getBoardList();
		
		for (BoardVo boardVo : voList) {
			System.out.println(boardVo);
		}
		
		return "board/list";
	}

	@GetMapping("/board/write")
	public String writePost() {
		
		return "board/write";
	}
	
	@PostMapping("/board/write")
	public String insertPost(BoardVo vo) {
		System.out.println(vo);
		
		// data  // 데이터 꺼내기 + 뭉티기
		
		// service // 데이터 가지고 비즈니스 로직 처리 == 디비에 넣기 등...
		int result = 1;
		
		// result // 처리한 결과를 클라이언트에게 알려주기 == 화면 만들어서 보여주기
		if(result == 1) {
			return "redirect:/board/list";
		} else {
			return "error";			
		}
	}
	
	
}

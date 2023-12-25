package com.prac.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prac.app.service.BoardService;
import com.prac.app.vo.BoardVo;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {

	private final BoardService service;
	
	@GetMapping("insert")
	public void insertBoard(BoardVo vo) {	
		int result = service.insertBoard(vo);
		System.out.println(result);
	}
	
	
}

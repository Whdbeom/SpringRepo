package com.kh.app.board.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

//@Controller
//@ResponseBody
@RestController
public class BoardController {
	
	private final BoardService bs;
	
	public BoardController(BoardService bs) {
		this.bs = bs;
	}
	
	@PostMapping("board/write")
	public HashMap<String, String> write(BoardVo vo) {
		System.out.println(vo);
		int result = bs.write(vo);
		System.out.println("게시글 작성 result : " + result);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("msg", "zzzzzzzzzzzzzzzzzzzzzzzzz");
		
		return map;
	}
	
}

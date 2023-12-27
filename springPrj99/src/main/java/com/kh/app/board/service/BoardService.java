package com.kh.app.board.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardDao dao;
	private final SqlSessionTemplate sst;
	
	public int write(BoardVo vo) {
		return dao.write(vo, sst);
	}

	public List<BoardVo> list() {
		return dao.list(sst);
	}
	public BoardVo detail(BoardVo vo) {
		return dao.detail(vo, sst);
	}

	public int delete(BoardVo vo) {
		return dao.delete(vo, sst);
	}

	public int edit(BoardVo vo) {
		return dao.edit(vo,sst);
	}


}

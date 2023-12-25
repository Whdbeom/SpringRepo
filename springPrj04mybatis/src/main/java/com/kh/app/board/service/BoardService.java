package com.kh.app.board.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;

@Service
public class BoardService {

	private final BoardDao dao;
		
	private final SqlSessionTemplate sst;
	
	public BoardService(SqlSessionTemplate sst, BoardDao dao) {
		this.sst = sst;
		this.dao = dao;
	}
	
	public int write(BoardVo vo) {
		
		return dao.write(sst, vo);
	}

}

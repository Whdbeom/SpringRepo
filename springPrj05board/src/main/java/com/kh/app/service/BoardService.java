package com.kh.app.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.kh.app.dao.BoardDao;
import com.kh.app.vo.BoardVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardDao dao;	
	private final SqlSessionTemplate sst;
	
	//게시글 작성
	public int insertBoard(BoardVo vo) {
		
		return dao.insertBoard(vo, sst);
	}

	public List<BoardVo> getBoardList() {
		
		
		return dao.getBoardList(sst);
	}

	public BoardVo getBoardByNo(String no) {
		
		return dao.getBoardByNo(no, sst);
	}

	public int deleteBoardByNo(String no) {
		return dao.deleteBoardByNo(no, sst);
	}

	public int editBoardByNo(BoardVo vo) {
		
		return dao.editBoardByNo(vo, sst);
	}

}

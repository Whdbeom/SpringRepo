package com.kh.app.member.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.app.member.vo.MemberVo;

@Repository
public class MemberDao {

	public int join(MemberVo vo, SqlSessionTemplate sst) {
		return sst.insert("MemberMapper.join", vo);
	}

	public List<MemberVo> list(SqlSessionTemplate sst) {
		return sst.selectList("MemberMapper.list");
	}

	public MemberVo detail(String no, SqlSessionTemplate sst) {
		return sst.selectOne("MemberMapper.detail", no);
	}

	public int delete(String no, SqlSessionTemplate sst) {
		return sst.delete("MemberMapper.delete", no);
	}

	public int edit(MemberVo vo, SqlSessionTemplate sst) {
		return sst.update("MemberMapper.edit", vo);
	}

}

package com.example.demo.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.JapanDAO;
import com.example.demo.vo.JapanVO;

@Repository
public class JapanDAOImpl implements JapanDAO{

	@Autowired
	private SqlSession ss;
	@Override
	public List<JapanVO> selectJapanList() {
		return ss.selectList("com.example.demo.JAPAN.selectJapanList");
	}
	@Override
	public JapanVO selectJapan(int jpnum) {
		return ss.selectOne("com.example.demo.JAPAN.selectJapan",jpnum);
	}
	@Override
	public int insertJapan(JapanVO japan) {
		return ss.insert("com.example.demo.JAPAN.insertJapan",japan);
	}
	@Override
	public int updateJapan(JapanVO japan) {
		return ss.update("com.example.demo.JAPAN.updateJapan",japan);
	}
	@Override
	public int deleteJapan(int jpnum) {
		return ss.delete("com.example.demo.JAPAN.deleteJapan",jpnum);
	}

}

package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import com.example.demo.vo.JapanVO;



public interface JapanDAO {

	public List<JapanVO> selectJapanList();
	public JapanVO selectJapan(int jpnum);
	public int insertJapan(JapanVO japan);
	public int updateJapan(JapanVO japan);
	public int deleteJapan(int jpnum);
}

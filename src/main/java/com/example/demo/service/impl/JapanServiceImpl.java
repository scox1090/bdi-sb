package com.example.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.JapanDAO;
import com.example.demo.service.JapanService;
import com.example.demo.vo.JapanVO;

@Service
public class JapanServiceImpl implements JapanService{

	@Autowired 
	private JapanDAO jdao;

	@Override
	public List<JapanVO> selectJapanList() {
		return jdao.selectJapanList();
	}

	@Override
	public JapanVO selectJapan(int jpnum) {
		return jdao.selectJapan(jpnum);
	}

	@Override
	public int insertJapan(JapanVO japan) {
		return jdao.insertJapan(japan);
	}

	@Override
	public int updateJapan(JapanVO japan) {
		return jdao.updateJapan(japan);
	}

	@Override
	public int deleteJapan(int jpnum) {
		return jdao.deleteJapan(jpnum);
	}
	
	
}

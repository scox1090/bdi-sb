package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.JapanService;
import com.example.demo.vo.JapanVO;

@RestController
public class JapanController {
	
	@Autowired
	private JapanService js;
	
	@GetMapping("/japanList")
	public @ResponseBody List<JapanVO> selectJapanList() {
		return js.selectJapanList();
	}
	
	@GetMapping("/japan/{jpnum}")
	public @ResponseBody JapanVO selectJapan(@PathVariable int jpnum) {
		return js.selectJapan(jpnum);
	}
	
	@PostMapping("/insert")
	public @ResponseBody int insertJapan(@RequestBody JapanVO japan) {
		return js.insertJapan(japan);
	}
	
	@PutMapping("/update/{jpnum}")
	public @ResponseBody int insertJapan(@PathVariable int jpnum ,@RequestBody JapanVO japan) {
		return js.insertJapan(japan);
	}
	
	@DeleteMapping("/delete/{jpnum}")
	public @ResponseBody int insertJapan(@PathVariable int jpnum) {
		return js.deleteJapan(jpnum);
	}
	
	
}

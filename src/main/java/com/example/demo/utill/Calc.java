package com.example.demo.utill;

import org.springframework.stereotype.Service;

@Service
public class Calc {

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	public int divide(int num1, int num2) {
		return num1 / num2;
	}

	public int multi(int num1, int num2) {
		return num1 * num2;
	}
}

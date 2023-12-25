package com.prj.app.test;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("test")
public class TestController {

	private final TestService service;

	@GetMapping("insert")
	public void insert(TestVo vo) {		
		System.out.println("컨트롤러");
		System.out.println(vo);
		int result = service.insert(vo);
		
		System.out.println("result : " + result);
	}
	
	@GetMapping("list")
	public void list() {
		System.out.println("리스트 보여주기");
		
		List<TestVo> voList = service.list();
		
		for (TestVo testVo : voList) {
			System.out.println(testVo);
		}
		
	}
	
}

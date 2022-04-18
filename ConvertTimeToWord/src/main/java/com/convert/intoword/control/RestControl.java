package com.convert.intoword.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.convert.intoword.service.RestService;

@RestController
public class RestControl {
	@Autowired
	private RestService restService;
	@GetMapping("/getWord")
	public String convertTime() {
		String convertTimeToWord = restService.convertTimeToWord();
		return convertTimeToWord;
	}
}

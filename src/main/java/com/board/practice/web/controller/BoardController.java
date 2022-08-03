package com.board.practice.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.practice.domain.Board;

@Controller
@RequestMapping("/api/v1/board")
public class BoardController {
	
	@GetMapping("/form")
	public String boardForm() {
		return "board";
	}
	
	@PostMapping("/formdo")
	public String boardDo(Board board) {
	
		return " ";
	}
}

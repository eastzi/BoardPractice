package com.board.practice.web.dto;

import lombok.Data;

@Data
public class CreateBoardReqDto {
	private int id;
	private String title;
	private String content;
	private String writer;
	private boolean noticeYn; 
}

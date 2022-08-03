package com.board.practice.web.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateBoardRespDto {
	private int id;
	private String title;
	private String content;
	private String writer;
	private int viewCnt;
	private boolean noticeYn;
	private boolean deleteYn;
	private LocalDateTime createdDate;
	private LocalDateTime updateDate;
}

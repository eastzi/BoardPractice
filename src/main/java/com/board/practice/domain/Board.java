package com.board.practice.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Board {
	private int boardid;
	private String boardtitle;
	private String boardcontent;
	private LocalDateTime createdate;
	private LocalDateTime updatdate;
}

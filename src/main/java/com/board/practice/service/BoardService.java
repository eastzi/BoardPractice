package com.board.practice.service;

import java.util.List;

import com.board.practice.web.dto.CreateBoardReqDto;
import com.board.practice.web.dto.CreateBoardRespDto;

public interface BoardService {
	
	public int save(CreateBoardReqDto params) throws Exception;
	public CreateBoardRespDto findBoardById(int id) throws Exception;
	public int updateBoard(CreateBoardReqDto params) throws Exception;
	public int deleteBoard(int id) throws Exception;
	public List<CreateBoardRespDto> findAllBoard() throws Exception;
	
}

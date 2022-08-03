package com.board.practice.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.board.practice.domain.BoardRepository;
import com.board.practice.web.dto.CreateBoardReqDto;
import com.board.practice.web.dto.CreateBoardRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

	private final BoardRepository boardRepository;
	
	@Override
	public int save(CreateBoardReqDto params) throws Exception {
		boardRepository.save(params);
		return params.getId();
	}

	@Override
	public CreateBoardRespDto findBoardById(int id) throws Exception {
		
		return boardRepository.findById(id);
	}

	@Override
	public int updateBoard(CreateBoardReqDto params) throws Exception {
		boardRepository.update(params);
		return params.getId();
	}

	@Override
	public int deleteBoard(int id) throws Exception {
		boardRepository.deleteById(id);
		return id;
	}

	@Override
	public List<CreateBoardRespDto> findAllBoard() throws Exception {
		
		return boardRepository.findAll();
	}


}

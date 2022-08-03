package com.board.practice.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.practice.web.dto.CreateBoardReqDto;
import com.board.practice.web.dto.CreateBoardRespDto;

@Mapper
public interface BoardRepository {

	void save(CreateBoardReqDto params);
	CreateBoardRespDto findById(int id);
	void update(CreateBoardReqDto params);
	void deleteById(int id);
	List<CreateBoardRespDto> findAll();
	int count();
}


package com.project.board.web.board.dto;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("BoardDto")
public class BoardDto {

	private int no;
	private String name;
	private String color;
	
}
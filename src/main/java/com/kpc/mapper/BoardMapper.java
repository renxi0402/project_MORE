package com.kpc.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kpc.board.BoardVO;
import com.kpc.board.MovieVO;
import com.kpc.board.ReviewVO;
import com.kpc.board.ScoreVO;

@Repository(value="dao")
@Mapper
public interface BoardMapper {

	//BoardMapper.xml의 sql id가 메서드명이된다.
	public int boardCount();
	public ArrayList<BoardVO> allList(); //BoardVO가 아니다**
	
	public ArrayList<BoardVO> blist( 
			@Param("startSeq") int startSeq
			,@Param("endSeq")  int endSeq);

	public ArrayList<BoardVO> blistBySearch(
			@Param("searchKey")  String searchKey
			,@Param("searchStr")  String searchStr);

	public BoardVO bview(int bseq);
	public int bupdate(BoardVO vo);
	public int  binsert(BoardVO vo);

	public int bdelete(int bseq);
	public MovieVO movieselect(
			@Param("movieCode") int movieCode);
	
	public ArrayList<ReviewVO> reviewSelectList(
	         @Param("code") int code, @Param("start") int start, @Param("end") int end);

	public ArrayList<MovieVO> movielist();
	public ArrayList<ScoreVO> reviewlist(
			@Param("movieCode") int movieCode
			);
	public ArrayList<ScoreVO> emotionlist_low(
			@Param("movieCode") int movieCode
			);
	public ArrayList<ScoreVO> emotionlist_high(
			@Param("movieCode") int movieCode
			);
	
}


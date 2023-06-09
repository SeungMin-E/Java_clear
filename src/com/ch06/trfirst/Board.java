package com.ch06.trfirst;

import java.util.Date;

public class Board {
	String BoardTitle;
	int BoardviewCount;
	String Boardwriter;
	Date relesed;
	
	Board(){
		
	}
	
	Board(String BoardTitle, int BoardviewCount, String Boardwriter, Date relesed){
		this.BoardTitle = BoardTitle;
		this.BoardviewCount = BoardviewCount;
		this.Boardwriter = Boardwriter;
		this.relesed = relesed;
	}
}

package ex10;
/*
 * 날짜 : 2019/10/25
 * 이름 : 하정욱
 * 내용 : 컬렉션프레임워크 List
 */

import java.util.List;

public class Exercise10 {

	public static void main(String[] args) {
		
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		
		for(Board board : list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}
		
	}
	
	
}

package ex10;
/*
 * ��¥ : 2019/10/25
 * �̸� : ������
 * ���� : �÷��������ӿ�ũ List
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

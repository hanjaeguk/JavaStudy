package collection.set.ex;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}

	}

}

class BoardDao{
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<>();
		list.add(new Board("����1","����1"));
		list.add(new Board("����2","����2"));
		list.add(new Board("����3","����3"));
		
		return list;
	}
}


class Board{
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	public String getTitle() {return title;}
	public String getContent() {return content;} 
}


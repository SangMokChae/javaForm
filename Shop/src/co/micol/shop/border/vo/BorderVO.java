package co.micol.shop.border.vo;

import java.util.Date; // 현업에서는 util.Date를 사용 /or datetime 을 String 형태로 사용 // java11 부터는 java.sql.Date를 사용 / 시간이랑 분 초 관리를 잘해야한다면 util 아니면 sql
 
public class BorderVO { // 이름이 db 이름을 같게해서 만든다. 가능한 _를 사용하지 않는다.
	private int id;
	private String writer;
	private Date wDate;
	private String title;
	private String contents;
	private int hit; // 조회수
	
	public BorderVO() { // 요즘은 default생성자를 안만드는 경향이 있다. // 원칙은 default생성자를 만들어주고 시작하는 것이다.
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getwDate() {
		return wDate;
	}

	public void setwDate(Date wDate) {
		this.wDate = wDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
}

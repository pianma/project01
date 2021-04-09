package project4;

import java.util.ArrayList;
import java.util.List;

public class BookInfo {
	public static List<BookInfo> bookInfoList;
	static {
		bookInfoList = new ArrayList<>();
	}
	private String bookName;
	private String companyName;
	private int price;

	public BookInfo(String bookName, String companyName, int price) {
		this.bookName = bookName;
		this.companyName = companyName;
		this.price = price;
	}
	
	public boolean add() {
		
		boolean same = false;
		 //������ ���� ����
		for(BookInfo bookInfo : BookInfo.bookInfoList) {
			boolean nameSame = bookInfo.getBookName().equals(bookName);
			boolean companySame = bookInfo.getCompanyName().equals(companyName);
			boolean priceSame = bookInfo.getPrice() == price;
			
			same = nameSame && companySame && priceSame;
			if(same) break;
		}
		
		
		
		//true -> ������ ���������� ��������
		//false -> ������ ���������� �������� ������
		return true;
	}
	
	
	
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "bookName=" + bookName ", companyName = " + companyName + ", price = " + price;
	}

}

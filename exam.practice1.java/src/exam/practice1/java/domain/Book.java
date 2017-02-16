/**
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:eykim@nextree.co.kr">Kim, Eunyoung</a>
 * @since 2016. 2. 18
 */
package exam.practice1.java.domain;

/**
 * Book. <br>
 * - 필요한 기능을 추가하셔도 됩니다.
 */
public class Book {
	//
	private String id;
	private Category category;
	private String title;
	private String author;
	private boolean lended;
	private int lendCount;

	private Book() {
		//
		this.lended = false;
		this.lendCount = 0;
	}

	public Book(String id, Category category, String title, String author) {
		//
		this();
		this.id = id;
		this.category = category;
		this.title = title;
		this.author = author;
	}

	public Book(String id, Category category, String title, String author, boolean lended, int lendCount) {
		//
		this(id, category, title, author);
		this.lended = lended;
		this.lendCount = lendCount;
	}

	public String getId() {
		return id;
	}

	public Category getCategory() {
		return category;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isLended() {
		return lended;
	}

	public int getLendCount() {
		return lendCount;
	}

}

/**
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:eykim@nextree.co.kr">Kim, Eunyoung</a>
 * @since 2016. 2. 18
 */
package exam.practice1.java.service;

import java.util.List;

import exam.practice1.java.domain.Book;
import exam.practice1.java.domain.Category;

/**
 * BookServiceLogic
 * : ���� ������ ����� �����ϴ� ����ü�Դϴ�.
 * 
 * @author {�̸��� �����ּ���.}
 * @since 2016. 2. 23
 */
public class BookServiceLogic implements BookService {

	@Override
	public boolean lendBook(String bookId) {
		// TODO ���� �뿩 ����� �ۼ��ϼ���.
		return false;
	}

	@Override
	public boolean returnBook(String nextLine) {
		// TODO ���� ��ȯ ����� �ۼ��ϼ���.
		return false;
	}

	@Override
	public List<Book> searchBookByName(String bookName) {
		// TODO ������ �˻� ����� �ۼ��ϼ���.
		return null;
	}

	@Override
	public List<Book> searchByCategory(Category category) {
		// TODO ī�װ� �˻� ����� �ۼ��ϼ���.
		return null;
	}

	@Override
	public Book findBestPopularBook() {
		// TODO ���� �α��ִ� ���� ��ȸ ����� �ۼ��ϼ���.
		return null;
	}

}

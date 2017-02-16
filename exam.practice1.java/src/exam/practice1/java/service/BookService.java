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
 * BookService
 */
public interface BookService {
	//
	/**
	 * ���� �뿩.
	 * @param bookId �������̵�
	 * @return �뿩����
	 */
	boolean lendBook(String bookId);

	/**
	 * ���� �ݳ�.
	 * @param bookId �������̵�
	 * @return �ݳ�����
	 */
	boolean returnBook(String bookId);

	/**
	 * ���� �˻�(������)
	 * @param bookName ������(�Ϻ�)
	 * @return �������
	 */
	List<Book> searchBookByName(String bookName);

	/**
	 * ���� �˻�(ī�װ�)
	 * @param category ī�װ�
	 * @return �������
	 */
	List<Book> searchByCategory(Category category);

	/**
	 * ���� �α��ִ� ���� ��ȸ
	 * @return ���� �α��ִ� ����
	 */
	Book findBestPopularBook();
}

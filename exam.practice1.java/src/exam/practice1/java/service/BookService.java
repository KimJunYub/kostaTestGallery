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
	 * 도서 대여.
	 * @param bookId 도서아이디
	 * @return 대여여부
	 */
	boolean lendBook(String bookId);

	/**
	 * 도서 반납.
	 * @param bookId 도서아이디
	 * @return 반납여부
	 */
	boolean returnBook(String bookId);

	/**
	 * 도서 검색(도서명)
	 * @param bookName 도서명(일부)
	 * @return 도서목록
	 */
	List<Book> searchBookByName(String bookName);

	/**
	 * 도서 검색(카테고리)
	 * @param category 카테고리
	 * @return 도서목록
	 */
	List<Book> searchByCategory(Category category);

	/**
	 * 가장 인기있는 도서 조회
	 * @return 가장 인기있는 도서
	 */
	Book findBestPopularBook();
}

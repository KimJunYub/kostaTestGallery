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
 * : 도서 서비스의 기능을 수행하는 구현체입니다.
 * 
 * @author {이름을 적어주세요.}
 * @since 2016. 2. 23
 */
public class BookServiceLogic implements BookService {

	@Override
	public boolean lendBook(String bookId) {
		// TODO 도서 대여 기능을 작성하세요.
		return false;
	}

	@Override
	public boolean returnBook(String nextLine) {
		// TODO 도서 반환 기능을 작성하세요.
		return false;
	}

	@Override
	public List<Book> searchBookByName(String bookName) {
		// TODO 도서명 검색 기능을 작성하세요.
		return null;
	}

	@Override
	public List<Book> searchByCategory(Category category) {
		// TODO 카테고리 검색 기능을 작성하세요.
		return null;
	}

	@Override
	public Book findBestPopularBook() {
		// TODO 가장 인기있는 도서 조회 기능을 작성하세요.
		return null;
	}

}

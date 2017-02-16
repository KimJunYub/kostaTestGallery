/**
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:eykim@nextree.co.kr">Kim, Eunyoung</a>
 * @since 2016. 2. 18
 */
package exam.practice1.java.repository;

import java.util.LinkedHashMap;
import java.util.Map;

import exam.practice1.java.domain.Book;
import exam.practice1.java.domain.Category;

/**
 * BookRepository (책 저장소)
 * - 책 저장소는 싱글톤으로 유지됩니다.
 */
public class BookRepository {
	//
	private static BookRepository singletoneRepo = new BookRepository();
	private static Map<String,Book> singletoneMap;

	private BookRepository() {
		//
		initialize();
	}

	public static BookRepository shareInstance() {
		//
		return singletoneRepo;
	}

	public Map<String, Book> getMap() {
		//
		return singletoneMap;
	}
	
	private void initialize() {
		//
		singletoneMap = new LinkedHashMap<>();
		singletoneMap.put("B0001", new Book("B0001", Category.Essay, "미움받을 용기", "기시미 이치로", true, 300));
		singletoneMap.put("B0002", new Book("B0002", Category.Essay, "완벽하지 않은 것들에 대한 사랑", "혜민 스님", false, 120));
		singletoneMap.put("B0003", new Book("B0003", Category.Magazine, "코스모폴리탄(월간)3월호", "허스트중앙편집부", false, 90));
		singletoneMap.put("B0004", new Book("B0004", Category.Magazine, "마리끌레르 (월간) 3월호", "MCK편집부", true, 38));
		singletoneMap.put("B0005", new Book("B0005", Category.Novel, "지금이순간", "귀욤 뮈소", false, 80));
		singletoneMap.put("B0006", new Book("B0006", Category.Novel, "오베라는 남자", "프레드릭 베크만", false, 20));
		singletoneMap.put("B0007", new Book("B0007", Category.Novel, "마션", "앤디위어", false, 100));
		singletoneMap.put("B0008", new Book("B0008", Category.Essay, "부러지지 않는 마음", "사이토 다카시", true, 90));
		singletoneMap.put("B0009", new Book("B0009", Category.Webtoon, "치즈 인더 트랩", "순끼", false, 299));
		singletoneMap.put("B0010", new Book("B0010", Category.Essay, "인성이 실력이다", "조벽", true, 12));
		singletoneMap.put("B0011", new Book("B0011", Category.Webtoon, "미생", "윤태호", false, 150));
	}
}





































// [커피쿠폰] 먼저 찾아서 말씀해주시면, 원하는 커피 한잔! - 시험 잘보세요, 화이팅^^

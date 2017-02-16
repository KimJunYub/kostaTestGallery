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
 * BookRepository (å �����)
 * - å ����Ҵ� �̱������� �����˴ϴ�.
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
		singletoneMap.put("B0001", new Book("B0001", Category.Essay, "�̿���� ���", "��ù� ��ġ��", true, 300));
		singletoneMap.put("B0002", new Book("B0002", Category.Essay, "�Ϻ����� ���� �͵鿡 ���� ���", "���� ����", false, 120));
		singletoneMap.put("B0003", new Book("B0003", Category.Magazine, "�ڽ�������ź(����)3��ȣ", "�㽺Ʈ�߾�������", false, 90));
		singletoneMap.put("B0004", new Book("B0004", Category.Magazine, "���������� (����) 3��ȣ", "MCK������", true, 38));
		singletoneMap.put("B0005", new Book("B0005", Category.Novel, "�����̼���", "�Ϳ� ����", false, 80));
		singletoneMap.put("B0006", new Book("B0006", Category.Novel, "������� ����", "�����帯 ��ũ��", false, 20));
		singletoneMap.put("B0007", new Book("B0007", Category.Novel, "����", "�ص�����", false, 100));
		singletoneMap.put("B0008", new Book("B0008", Category.Essay, "�η����� �ʴ� ����", "������ ��ī��", true, 90));
		singletoneMap.put("B0009", new Book("B0009", Category.Webtoon, "ġ�� �δ� Ʈ��", "����", false, 299));
		singletoneMap.put("B0010", new Book("B0010", Category.Essay, "�μ��� �Ƿ��̴�", "����", true, 12));
		singletoneMap.put("B0011", new Book("B0011", Category.Webtoon, "�̻�", "����ȣ", false, 150));
	}
}





































// [Ŀ������] ���� ã�Ƽ� �������ֽø�, ���ϴ� Ŀ�� ����! - ���� �ߺ�����, ȭ����^^

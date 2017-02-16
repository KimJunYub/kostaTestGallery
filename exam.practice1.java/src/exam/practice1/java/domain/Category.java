/**
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:eykim@nextree.co.kr">Kim, Eunyoung</a>
 * @since 2016. 2. 18
 */
package exam.practice1.java.domain;

/**
 * Category. <br>
 * - �ʿ��� ����� �߰��ϼŵ� �˴ϴ�.
 */
public enum Category {
	//
	Novel("1", "�Ҽ�"),
	Essay("2", "������"),
	Magazine("3", "����"),
	Webtoon("4", "����");
	
	private String code;
	private String name;

	private Category(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
}

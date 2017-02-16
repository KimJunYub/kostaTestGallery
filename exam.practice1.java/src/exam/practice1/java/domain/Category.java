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
 * - 필요한 기능을 추가하셔도 됩니다.
 */
public enum Category {
	//
	Novel("1", "소설"),
	Essay("2", "에세이"),
	Magazine("3", "잡지"),
	Webtoon("4", "웹툰");
	
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

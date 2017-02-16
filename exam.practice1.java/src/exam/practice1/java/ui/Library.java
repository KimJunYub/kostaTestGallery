/**
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.  
 * 
 * @author <a href="mailto:eykim@nextree.co.kr">Kim, Eunyoung</a>
 * @since 2016. 2. 18
 */
package exam.practice1.java.ui;

import java.util.Scanner;

import exam.practice1.java.service.BookService;
import exam.practice1.java.service.BookServiceLogic;

/**
 * Library 
 *
 * @author {이름을 적어주세요.}
 * @since 2016. 2. 23
 */
public class Library {
	//
	private Scanner scanner;
	private BookService service;

	public Library() {
		//
		this.scanner = new Scanner(System.in);
		this.service = new BookServiceLogic();
	}

	public static void main(String[] args) {
		//
		// TODO 주어진 BookService를 연결하여 기능을 완성하세요.
	}
}

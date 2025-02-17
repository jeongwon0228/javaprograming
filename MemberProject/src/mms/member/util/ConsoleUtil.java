package mms.member.util;

import java.util.Scanner;

import mms.member.vo.Member;

public class ConsoleUtil {
	
	static int id = 1;
	
	public Member getNewMember(Scanner sc) {
		
		//회원  입력기능 작성
	
		System.out.println("등록할 회원 정보를 입력하세요");
		
		System.out.println("이름 : ");
		String name = sc.next();
		
		System.out.println("주소 : ");
		String addr = sc.next();
		
		System.out.println("이메일 : ");
		String email = sc.next();
		
		System.out.println("국가 : ");
		String nation = sc.next();
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		return new Member(id++,name,addr,email,nation,age);
		
		
	}
	
}

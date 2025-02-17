package mms.member.action;

import java.util.Scanner;

import mms.member.svc.MemberAddService;
import mms.member.util.ConsoleUtil;
import mms.member.vo.Member;

public class MemberAddAction implements Action{

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil cu = new ConsoleUtil(); 
		Member newMember = cu.getNewMember(sc);
		
		MemberAddService memberService = new MemberAddService();
		
		boolean isAddSuccess = memberService.addMember(newMember);
		
		if(isAddSuccess) {
			System.out.println("데이터 추가 성공");
		}else {
			System.out.println("데이터 추가 실패");
		}
		
		
		
	}
	
	
	
}

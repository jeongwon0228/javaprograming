package mms.member.dao;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import mms.member.vo.Member;

public class MemberDAO {
    
    static List<Member> memberList = new CopyOnWriteArrayList<Member>();

    
    public boolean addMember(Member newMember) {
        boolean isAddSuccess = memberList.add(newMember);
        
        return isAddSuccess;
    }
}
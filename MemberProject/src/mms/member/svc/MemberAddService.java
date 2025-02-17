package mms.member.svc;

import mms.member.dao.MemberDAO;
import mms.member.vo.Member;

public class MemberAddService {
    
    public boolean instertMember(Member newMember) throws Exception {
        
        boolean isinsertSuccess = false;
        
        MemberDAO memberDAO = new MemberDAO();
        
        isinsertSuccess = memberDAO.addMember(newMember);
        
        return isinsertSuccess;
    }
}

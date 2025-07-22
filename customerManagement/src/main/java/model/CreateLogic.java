package model;

import dao.MemberDAO;

public class CreateLogic {
	public boolean execute(Member member){
		MemberDAO dao = new MemberDAO();
	    return dao.create(member);
	}
}

package model;

import java.util.List;

import dao.MemberDAO;

public class GetListLogic {
	public List<Member> execute(){ 
		MemberDAO dao = new MemberDAO();
		List<Member> memberList = dao.findAll();
		return memberList;
	}
}

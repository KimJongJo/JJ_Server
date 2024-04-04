package edu.kh.test.model.service;

import edu.kh.test.model.dto.Member;

public class MemberService {

	public Member login(String id, String pw) {
		
		Member member = new Member(id, pw);
		
		return member;
		
	}

}

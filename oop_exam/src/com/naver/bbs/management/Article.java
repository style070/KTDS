package com.naver.bbs.management;

import com.naver.member.management.Member;

public class Article {
	public static void main(String[] args) {
		Member member = new Member("ID","관리자");
		System.out.println(member);
		System.out.println(member.getId());
		System.out.println(member.getName());
		member.setId("ChangedID");
		member.setName("ChangedName");
		System.out.println(member.getId());
		System.out.println(member.getName());		
	}
}

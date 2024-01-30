package com.naver.member.management;

public class Member {
	
	// 멤버변수에 접근제어지시자가 없는경우 default 접근제어지시자가 사용됨
	private String id;
	private String name;
	
	public Member(String id , String name) {
		this.id = id;
		this.name = name;
			
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

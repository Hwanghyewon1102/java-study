package sec06.homework01.controller;

import sec06.homework01.model.vo.Employee;

public class Run {
	
	public static void main(String[] args) {
		Employee company = new Employee();
		
		company.setName("김철수");
		System.out.println("이름 : " + company.getName());
		company.setName("이영희");
		System.out.println("이름 : " + company.getName());
		company.setTeam("교육운영팀");
		System.out.println("팀 : " + company.getTeam());
		company.setTeam("경영지원팀");
		System.out.println("팀 : " + company.getTeam());
		
	}
}

package contact_list;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class contactMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contact p1 = new Contact();
		ContactFuction cf = new ContactFuction();

		p1.phoneNumber.add("01084133337");
		p1.phoneNumber.add("01012345678");
		p1.phoneNumber.add("01012341234");
		p1.setAlias("JAEHONGKIM");
		p1.setAnniversary("2023/11/24");
		p1.setBirthDay("1996/07/01");
		p1.setIsBlock(false);
		p1.setMemo("test");
		p1.setName("김재홍");
		p1.setRelationShip("본인");

		Contact p2 = new Contact();
		p2.phoneNumber.add("01065411164");
		p2.phoneNumber.add("01012345555");
		p2.setAlias("LEEBECKY");
		p2.setAnniversary("2023/11/24");
		p2.setBirthDay("1996/02/10");
		p2.setIsBlock(false);
		p2.setMemo("test2");
		p2.setName("이백희");
		p2.setRelationShip("와이프");

		Contact p3 = new Contact();
		p3.phoneNumber.add("01011111111");
		p3.phoneNumber.add("01022222222");
		p3.setAlias("BlockTest");
		p3.setAnniversary("2023/11/24");
		p3.setBirthDay("1996/10/31");
		p3.setIsBlock(true);
		p3.setMemo("test2");
		p3.setName("blockTest");
		p3.setRelationShip("BlockTest");

		cf.contactAdd(p1);
		cf.contactAdd(p2);
		cf.contactAdd(p3);

		// System.out.println(cf.getContact().toString());

		System.out.println("연락처 추가 : " + cf.contactList().toString());
//		cf.contactDelete("01084133337");
//		System.out.println("삭제"+cf.contactList().toString());
		cf.contactAdd(p1);
		System.out.println(cf.contactList().toString());
		System.out.println("상세조회 : " + cf.contactDetail("01022222222").toString());
		System.out.println("차단목록 조회 : " + cf.contactGetBlock().toString());
		cf.contactSetBlock("01011111111");
		System.out.println("차단후 해제 및 조회 : " + cf.contactGetBlock().toString());
		cf.contactSetBlock("01012341234");

		System.out.println("차단 및 조회 : " + cf.contactGetBlock().toString());
		System.out.println("기념일 조회 : " + cf.contactAnniverarty("01065411164"));
		System.out.println("전체목록 조회 : "+cf.contactList()); 		
		cf.contactNearAnniversary();
		System.out.println("2주이내 생일자 : "+cf.contactNearAnniversary().toString());
		System.out.println("편집할 전화번호를 입력하세요");
		String phoneNum= sc.nextLine();
		cf.contactEdit(phoneNum);
		
		
		
		
	}
}

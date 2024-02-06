package contact_list;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ContactFuction {

	private List<Contact> contact = new ArrayList<>();

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	/**
	 * 연락처 추가
	 * 
	 * @param con
	 */
	public void contactAdd(Contact con) {

		List<String> c = con.getPhoneNumber();
		if (c == null || c.isEmpty()) {
			System.out.println("전화번호는 필수 입력사항 입니다.");
		} else if (con.getName() == null || con.getName().isEmpty()) {
			System.out.println("이름은 필수 입력사항 입니다.");
		} else {
			int arraySize = this.contact.size();
			for (int i = 0; i < arraySize; i++) {
				boolean hasDuplicate = this.contact.get(i).getPhoneNumber().stream()
						.anyMatch(con.getPhoneNumber()::contains);
				if (hasDuplicate) {
					System.out.println("중복된 전화번호가 이미 등록되어 있습니다.");
					return;
				}
			}
			this.contact.add(con);
		}

	}

	/**
	 * 연락처(Contact) 전체 목록 조회
	 * 
	 * @return
	 */
	public String contactList() {

		return this.contact.toString();

	}

	/**
	 * 연락처 상세 목록 조회 ( 휴대전화 번호 )
	 * 
	 * @param phoneNumber 휴대전화 번호
	 * @return
	 */
	public Contact contactDetail(String phoneNum) {
		int arraySize = this.contact.size();
		for (int i = 0; i < arraySize; i++) {
			int phoneSize = this.contact.get(i).phoneNumber.size();
			for (int j = 0; j < phoneSize; j++) {
				String contactPhoneNum = this.contact.get(i).getPhoneNumber().get(j);
				if (contactPhoneNum.equals(phoneNum)) {
					return this.contact.get(i);
				}
			}
		}
		return null;
	}

	/**
	 * 연락처 상세 목록 조회( 사용자 이름 )
	 * 
	 * @param name 사용자 이름
	 * @return
	 */
//	public Contact contactDetail(String name) {
//
//		return null;
//	}

	/**
	 * 연락처 편집
	 * 
	 * @param phoneNum
	 */
	public void contactEdit(String phoneNum) {
		Scanner sc = new Scanner(System.in);
		int arraySize = this.contact.size();
		int index = 0;
		for(int i=0; i<arraySize;i++) {
			if((this.contact.get(i).getPhoneNumber().contains(phoneNum))){
				System.out.println(this.contact.get(i).toString());
				index = i;
				break;
			}
			else {
				System.out.println("존재하지 않는 연락처 입니다.");
				return;
			}
		}
		
		System.out.println("수정할 인덱스 번호를 입력하세요 휴대폰번호(0)~메모(7)");
		int selectIndex = sc.nextInt();
		if(selectIndex == 0) {
			System.out.println(this.contact.get(index).getPhoneNumber().toString());
			System.out.println("변경할 휴대폰 번호를 선택하세요 Index(0부터)");
			int selectPhone = sc.nextInt();
			System.out.println("변경할 번호를 입력하세요");
			String modifyNum = sc.nextLine();
			this.contact.get(index).getPhoneNumber().set(selectPhone, modifyNum);
			System.out.println("변경이 완료되었습니다.");
			System.out.println(this.contact.get(index).getPhoneNumber().toString());
			
			
		}
		//this.contact.get(index).get(selectIndex)
		
		
		
	}

	/**
	 * 연락처 삭제 ( 전화번호 )
	 * 
	 * @param phoneNumber
	 * @return
	 */
	public void contactDelete(String phoneNum) {
		int arraySize = this.contact.size();
		for (int i = 0; i < arraySize; i++) {
			int phoneSize = this.contact.get(i).phoneNumber.size();
			for (int j = 0; j < phoneSize; j++) {
				String contactPhoneNum = this.contact.get(i).getPhoneNumber().get(j);
				if (contactPhoneNum.equals(phoneNum)) {
					this.contact.remove(i);
					return;
				}
			}
		}
	}

	/**
	 * 연락처 삭제 ( 사용자 이름 )
	 * 
	 * @param name
	 */
//	public void contactDelete(String name) {
//
//	}

	/**
	 * 다가올 생일 (현재날짜 2주이내)
	 * 
	 * @return
	 */
	public List<Contact> contactNearAnniversary() {
		LocalDate nowDate = LocalDate.now();
		// int[] nowDateArr =
		// {nowDate.getYear(),nowDate.getMonthValue(),nowDate.getDayOfMonth()};

		int arraySize = this.contact.size();
		List<Contact> birthDayCon = new ArrayList<>();
		for (int i = 0; i < arraySize; i++) {
			String birthDay = this.contact.get(i).getBirthDay();
			String birthDayReplace = birthDay.replace('/', '-'); // 1996-02-10
			String birthDayYearReplace = birthDayReplace.substring(4);
			String birthReult = "2024" + birthDayYearReplace;
			LocalDate birthDayLD = LocalDate.parse(birthReult);
			Period between = Period.between(nowDate, birthDayLD);
			int birthGap = between.getDays();

			// String[] birthDayArr=this.contact.get(i).getBirthDay().split("/");
			if ((birthGap > 0 && birthGap < 15) && (between.getMonths() == 0)) {
				birthDayCon.add(this.contact.get(i));
			}

		}
		return birthDayCon;

	}

	/**
	 * 차단된 사용자 목록
	 * 
	 * @return
	 */
	public List<Contact> contactGetBlock() {
		List<Contact> blockList = new ArrayList<>();
		int arraySize = this.contact.size();
		for (int i = 0; i < arraySize; i++) {
			if (this.contact.get(i).getIsBlock() == true) {
				blockList.add(this.contact.get(i));
			}
		}
		return blockList;

	}

	public void contactSetBlock(String phoneNum) {
		int arraySize = this.contact.size();
		for (int i = 0; i < arraySize; i++) {
			int phoneSize = this.contact.get(i).phoneNumber.size();
			for (int j = 0; j < phoneSize; j++) {
				String contactPhoneNum = this.contact.get(i).getPhoneNumber().get(j);
				if (contactPhoneNum.equals(phoneNum)) {
					if (this.contact.get(i).getIsBlock() == true) {
						this.contact.get(i).setIsBlock(false);
					} else {
						this.contact.get(i).setIsBlock(true);
					}
					return;
				}
			}

		}
	}

	public String contactAnniverarty(String phoneNum) {
		int arraySize = this.contact.size();
		for (int i = 0; i < arraySize; i++) {
			int phoneSize = this.contact.get(0).phoneNumber.size();
			for (int j = 0; j < phoneSize; j++) {
				String contactPhoneNum = this.contact.get(i).getPhoneNumber().get(j);
				if (contactPhoneNum.equals(phoneNum)) {
					String anniversary = this.contact.get(i).getAnniversary();
					return anniversary;
				}

			}
		}

		return null;
	}

}

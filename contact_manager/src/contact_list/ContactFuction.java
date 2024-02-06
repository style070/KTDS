package contact_list;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		for(int i=0;i<arraySize;i++) {
			int phoneSize = this.contact.get(0).phoneNumber.size();
			for(int j=0;j<phoneSize;j++) {
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
	 * @param con
	 */
	public void contactEdit(Contact con) {

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
		//int[] nowDateArr = {nowDate.getYear(),nowDate.getMonthValue(),nowDate.getDayOfMonth()};
		
			
		
		int arraySize = this.contact.size();
		List<Contact> birthDayCon = new ArrayList<>();
		for(int i=0;i<arraySize;i++) {
			String birthDay = this.contact.get(i).getBirthDay();
			String birthDayReplace = birthDay.replace('/', '-');
			LocalDate birthDayLD = LocalDate.parse(birthDayReplace);
			Period between = Period.between(birthDayLD, nowDate);
			
			//String[] birthDayArr=this.contact.get(i).getBirthDay().split("/");
			if((between.getDays()>0 && between.getDays()<15) && (between.getMonths() == 0)){
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
			if(this.contact.get(i).getIsBlock() == true) {
				blockList.add(this.contact.get(i));
			}
		}
		return blockList;

	}

	public void contactSetBlock(String phoneNum) {
		int arraySize = this.contact.size();
		for(int i=0;i<arraySize;i++) {
			int phoneSize = this.contact.get(i).phoneNumber.size();
			for (int j = 0; j < phoneSize; j++) {
				String contactPhoneNum = this.contact.get(i).getPhoneNumber().get(j);
				if (contactPhoneNum.equals(phoneNum)) {
					if(this.contact.get(i).getIsBlock() == true) {
						this.contact.get(i).setIsBlock(false); 
					}
					else {
						this.contact.get(i).setIsBlock(true);
					}
					return;
				}
			}
			
		}
	}

	public String contactAnniverarty(String phoneNum) {
		int arraySize = this.contact.size();
		for(int i=0;i<arraySize;i++) {
			int phoneSize=this.contact.get(i).phoneNumber.size();
			for(int j=0;j<phoneSize;j++) {
				String contactPhoneNum = this.contact.get(i).getPhoneNumber().get(j);
				if(contactPhoneNum.equals(phoneNum)) {
					String anniversary = this.contact.get(i).getAnniversary();
					return anniversary;
				}
				
			}
		}
		
		return null;
	}

}

package contact_list;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 데이터 클래스 정의
 */
public class Contact {
	// N개의 휴대전화 번호
	List<String> phoneNumber = new ArrayList<>();
	private String name;
	private String alias;
	private String BirthDay;
	private String relationShip;
	private Boolean isBlock;
	private String anniversary;
	private String memo;
	
	
	/**
	 * Getter/Setter
	 * @return
	 */
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getBirthDay() {
		return BirthDay;
	}
	public void setBirthDay(String birthDay) {
		BirthDay = birthDay;
	}
	public String getRelationShip() {
		return relationShip;
	}
	public void setRelationShip(String relationShip) {
		this.relationShip = relationShip;
	}
	public Boolean getIsBlock() {
		return isBlock;
	}
	public void setIsBlock(Boolean isBlock) {
		this.isBlock = isBlock;
	}
	public String getAnniversary() {
		return anniversary;
	}
	public void setAnniversary(String anniversary) {
		this.anniversary = anniversary;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	// toString Override
	@Override
		public String toString() {
			StringBuffer sb = new StringBuffer();
			sb.append("휴대폰번호:"+this.phoneNumber+" ");
			sb.append("이름 :"+this.name+" ");
			sb.append("별칭 :"+this.alias+" ");
			sb.append("생일 : "+this.BirthDay+" ");
			sb.append("관계 : "+this.relationShip+" ");
			sb.append("차단여부 : "+this.isBlock+" ");
			sb.append("기념일"+this.anniversary+" ");
			sb.append("메모"+this.memo+" ");
			sb.append("\n");

			
			
			return sb.toString();
		}
	
	
	
}

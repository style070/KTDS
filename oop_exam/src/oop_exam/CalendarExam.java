package oop_exam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.jcp.xml.dsig.internal.dom.DOMBase64Transform;

public class CalendarExam {
	public static void main(String[] args) {
		
		Calendar nowDateTime = Calendar.getInstance();
		System.out.println(nowDateTime);
		int year=nowDateTime.get(Calendar.YEAR);
		System.out.println(year);
		
		Calendar past = Calendar.getInstance();
		past.set(Calendar.YEAR, 1970);
		past.set(Calendar.MONTH, 0);
		past.set(Calendar.DAY_OF_MONTH, 1);
		past.set(Calendar.HOUR, 0);
		past.set(Calendar.MINUTE, 0);
		past.set(Calendar.SECOND, 0);
		
		past.set(2022, 3-1, 1,1,50,17);
		System.out.println(past);
		System.out.println();
		System.out.println();
		System.out.println("========================Calendar 실습========================");
		
		
		//Calendar 인스턴스 가져오기
		Calendar nowCal = Calendar.getInstance();
		
		//현재 연원일 시분초 조회하기
		System.out.println(nowCal.get(Calendar.YEAR));
		System.out.println(nowCal.get(Calendar.MONTH)+1); // Month 인덱스는 0부터 시작하므로 +1 해줌
		System.out.println(nowCal.get(Calendar.DAY_OF_MONTH));
		System.out.println(nowCal.get(Calendar.HOUR));
		System.out.println(nowCal.get(Calendar.MINUTE));
		System.out.println(nowCal.get(Calendar.SECOND));
		
		//1(일요일) ~ 7(토요일)
		System.out.println(nowCal.get(Calendar.DAY_OF_WEEK)); // 현재 시점기준 금요일 이므로 "일월화수목금"에 해당하는 6번째 인덱스 6출력
		
		//현재 연월일만 문자열로 가져오기
		//현재 날짜/시간
		Date now = Calendar.getInstance().getTime();
		System.out.println(now);
		
			
		//날짜를 포멧에 맞춰 변경
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //24시기준
		SimpleDateFormat format2= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  //12시기준
		String formateDate1 = format1.format(now);
		String formateDate2 = format2.format(now);
		
		//출력
		System.out.println(formateDate1);
		System.out.println(formateDate2);
		
		//Calendar 인스턴스 가져오기
		nowCal = Calendar.getInstance();
		//날짜를 지정. (2022년 2월 1일)
		nowCal.set(2022, 01,01);		// Month는 0인덱스부터 시작하므로 2월은 01로 줘야함 2022/03/23
		//날짜에 10일 더하기
		//nowCal.add(Calendar.DAY_OF_MONTH, 10);
		//날짜에 20일 더하기
		nowCal.add(Calendar.DAY_OF_MONTH,50);
		System.out.println(nowCal);
		System.out.println(nowCal.get(Calendar.YEAR));
		System.out.println(nowCal.get(Calendar.MONTH)+1); 
		System.out.println(nowCal.get(Calendar.DAY_OF_MONTH));
		
		
		
		
		
	}
}

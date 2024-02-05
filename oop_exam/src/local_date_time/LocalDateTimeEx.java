package local_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		
		LocalDate nowDate = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String strNowDate = dateFormatter.format(nowDate);
		System.out.println("======== 날짜 조회 (LocalDate) =========");
		System.out.println(nowDate);
		System.out.println(strNowDate);
		
		
		System.out.println("========== 시간조회 (LocalTime)==========");
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String strNowTime = timeFormatter.format(nowTime);
		System.out.println(nowTime);
		System.out.println(strNowDate);
		System.out.println();
		
		
		System.out.println("========== 날짜와 시간조회(LocalDateTime) ==========");
		LocalDateTime nowDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String strNowDateTime = dateTimeFormatter.format(nowDateTime);
		System.out.println(nowDateTime);
		System.out.println(strNowDateTime);
		
				
		
		
			
		
		
		
	}
	
	
}

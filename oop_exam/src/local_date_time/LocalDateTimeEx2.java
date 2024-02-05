package local_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx2 {

	
	public static void main(String[] args) {
		System.out.println("LocalDateTime를 이용해 날짜를 변경해 해봅니다. ( 1 / 3 )");
		LocalDate nowDate = LocalDate.of(2022, 1, 1);
		nowDate = nowDate.plusDays(10);
		nowDate = nowDate.plusMonths(2);
		nowDate = nowDate.plusYears(3);
		
		System.out.println("LocalDateTime를 이용해 날짜를 변경해 해봅니다. ( 2 / 3 )");
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String strNowDate = dateFormatter.format(nowDate);
		System.out.println(nowDate);
		System.out.println(strNowDate);
		
		System.out.println("LocalDateTime를 이용해 날짜를 변경해 해봅니다. ( 3 / 3 )");
		LocalTime nowTime = LocalTime.of(00, 00,01);
		nowTime.plusHours(10);
		nowTime.plusMinutes(5);
		nowTime.plusSeconds(55);
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String strNowTime = timeFormatter.format(nowTime);
		System.out.println(nowTime);
		System.out.println(strNowTime);
		
		LocalDateTime nowDateTime = LocalDateTime.of(2022, 2,1,11,39,11	);
		nowDateTime = nowDateTime.plusDays(10);
		nowDateTime = nowDateTime.plusMonths(2);
		nowDateTime = nowDateTime.plusYears(3);
		nowDateTime = nowDateTime.plusHours(10);
		nowDateTime = nowDateTime.plusMinutes(5);
		nowDateTime = nowDateTime.plusSeconds(55);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String strNowDateTime = dateTimeFormatter.format(nowDateTime);
		System.out.println(strNowDateTime);
		
		

		LocalDate startDate = LocalDate.of(2022, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 5, 20);
		Period between = Period.between(startDate, endDate);
		System.out.println(between.getYears()+","+between.getMonths()+","+between.getDays());
		
		
	}
}

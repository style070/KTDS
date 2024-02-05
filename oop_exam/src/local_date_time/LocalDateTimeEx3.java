package local_date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;

public class LocalDateTimeEx3 {

	/**
	 * 전달받은 날짜의 첫 번째 날짜부터 마지막 날짜까지를 출력 ( 요일 포함 )
	 *
	 * * @param date 기준이 되는 날짜
	 */
	public static void printCalendar(LocalDate date) {
		//date 인스턴스를 YearMonth로 변경.
		YearMonth yearMonth = YearMonth.from(date);

		// 첫번째 날짜를 구한다. 
		LocalDate firstDay = yearMonth.atDay(1);
		System.out.println(firstDay);
		
		// date인스턴스의 월의 총길이를 구한다.
		int days = date.lengthOfMonth();
		System.out.println(days);
		
		// 반복하며 날짜와 요일을 출력한다.
		for(int i=0;i<days-1;i++) {
			firstDay = firstDay.plusDays(1);
			System.out.println(firstDay);
			System.out.println(firstDay.getDayOfWeek().name());
			System.out.println("===========================");
		}
	}
	
	/**
	 * 금일제외 가장 가까운 다음 영업일 구한다.
	 * @param localDate 오늘
	 * @return
	 */
	public static Map<String, Object> getClosestWorkingDay(LocalDate localDate) {
		
		// 1. localDate에 하루를 더해본다
		localDate=localDate.plusDays(1);
		
		// 2. 오늘의 요일을 구한다.
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		//System.out.println(dayOfWeek);	
		
		int dayCount = 1;
		
		// 3. 하루를 더한 날짜가 휴일인지 검사한다.
		while(dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
			
			// 4. 만약 휴일이라면 하루를 또 더한다.
			localDate = localDate.plusDays(1);
			dayOfWeek = localDate.getDayOfWeek();
			dayCount ++;
			
		}
		
		Map<String,Object> result = new HashMap<>();
		result.put("workingDay", localDate);
		result.put("dayCount", dayCount);
		// 5. 만약 휴일이 아니라면 더한 결과를 반환한다.
		return result;
		
	}
	
	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		//LocalDate now = LocalDate.of(2022,1,15);
		System.out.println("현재 날짜 : "+now);
				
		Map<String,Object> closestWorkingDay = getClosestWorkingDay(now);
		System.out.println("예상 도착 날짜 : "+(closestWorkingDay.get("workingDay")));
		System.out.println("예상 도착 영업일 : "+(closestWorkingDay.get("dayCount")));
		
		closestWorkingDay = getClosestWorkingDay(LocalDate.of(2024, 2, 9)); // 금요일
		System.out.println("예상 도착 날짜 : "+(closestWorkingDay.get("workingDay")));
		System.out.println("예상 도착 영업일 : "+(closestWorkingDay.get("dayCount")));
		
		System.out.println("=========================");
		
		//printCalendar(now);
		
		
		// 현재 요일
		System.out.println(now.getDayOfWeek().name()); // LocalDate,LocalDateTime 사용
		
		YearMonth yearMonth = YearMonth.from(now);
		//이번달의 첫번째 날 구하기
		LocalDate firstDay = yearMonth.atDay(1);
		System.out.println(firstDay);
		System.out.println(firstDay.getDayOfWeek().name());
		
		//이번달의 마지막날 구하기
		LocalDate lastDay = yearMonth.atEndOfMonth(); // LocalDate,LocalDateTime사용
		System.out.println(lastDay);
		System.out.println(lastDay.getDayOfWeek().name());
		
		//이번달은 총 며칠인지 구하기
		int lengthOfDays = now.lengthOfMonth();
		System.out.println(lengthOfDays);
		
		//이번해는 총 며칠인지 구하기
		int lengthOfYears = now.lengthOfYear();
		System.out.println(lengthOfYears);

		LocalDate startDate = LocalDate.of(2022, 5, 1);
		LocalDate endDate = LocalDate.of(2023, 1, 20);
		Period between = Period.between(startDate,endDate);
		System.out.println(between.getYears()+","+between.getMonths()+","+between.getDays());
		
	}
	

}

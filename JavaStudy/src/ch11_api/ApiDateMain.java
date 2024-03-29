package ch11_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ApiDateMain {

	public static void main(String[] args) throws ParseException {
		// 현재 시간 출력
		// 1. Date 클래스 사용
		Date dateToday = new Date();
		
		// Date 객체가 new Date()로 생성되는 순간
		// 해당 Date 객체 내부에 그 때의 시간이 세팅된다.
		System.out.println(dateToday);
		
		
		// 날짜 포맷 설정
		// 2023년 04월 18일 10시 39분 30초
		// SimpleDateFormat 생성자 안에 날짜 포맷 문자열 넣기
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		System.out.println(sdf.format(dateToday));
		
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(dateToday));
		
		// 2. Calendar 클래스 사용
		// Calendar는 .getInstance() 이지만 싱클톤 패턴이 적용되어있지는 않음.
		// new Date()와 마찬가지로 .getInstance()가 실행된 시점으로 세팅된 Calendar 객체가 생성된다.
		Calendar calToday = Calendar.getInstance();
		System.out.println(calToday);
		
		// Calendar 객체의 .getTime()을 실행하면
		// 해당 Calendar 객에체 세팅된 날짜를 가지는 
		// Date 객체를 리턴
		System.out.println(sdf.format(calToday.getTime()));
		
		System.out.println("=========================================================");
		
		long longToday = System.currentTimeMillis();
	
		// 날짜 포맷 적용
		// sdf.format() 은 파라미터로 Date객체 또는 Long 타입을 받는다. 
		String strToday = sdf.format(longToday);
		System.out.println(strToday);
		
		System.out.println(" ================================================= ");
		
		// 다양한 날짜 포맷 만들기
		// 1. 23/04/18 11:16:33
		// 2. 2023-04-18 오전 11:16:33
		// 3. 화 오전 11:16:33
		// 4. 화요일 11:16
		// @. 2023.04.18 AM 11:16:33
		
		Date dateNow = new Date();
		
		sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(dateNow));
		
		sdf = new SimpleDateFormat("yyyy-M-dd a HH:mm:ss");
		System.out.println(sdf.format(dateNow));
		
		sdf = new SimpleDateFormat("E a HH:mm:ss");
		System.out.println(sdf.format(dateNow));
		
		sdf = new SimpleDateFormat("E요일 HH:mm");
		System.out.println(sdf.format(dateNow));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss", Locale.ENGLISH);
		System.out.println(sdf.format(dateNow));
		
		
		TimeZone time = TimeZone.getTimeZone("America/Los_Angeles");
		
		sdf.setTimeZone(time);
		System.out.println(sdf.format(dateNow));
		
		System.out.println(" ==================================================== ");
		
		// 문자열(String) -> Date타입 객체 변환
		// "12314" -> int 타입으로 변환
		// 예시 ) "2023/04/18", "2023/05/16" 두 날짜 차이 계산
		
		String strTomorrow = "2023/04/19 12:01:10";
		
		// strTommorrow 문자열의 날짜 포맷에 대한 sdf 생성
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date dateTomorrow = sdf.parse(strTomorrow);
		
		System.out.println(dateTomorrow);
		System.out.println(sdf.format(dateTomorrow));
		
		String strYesterDay = "23.04.17 09:12:11";
		sdf = new SimpleDateFormat("yy.MM.dd HH:mm:ss");
		Date dateYesterDay = sdf.parse(strYesterDay);
		System.out.println(dateYesterDay);
		
		
		System.out.println(" ===================================================== ");
		
		// 특정 날짜에 대한 객체 얻기
		// Date를 얻는다면 "23/05/01" -> sdf.parse 이용
		// Calendar로 얻기 
		Calendar cal = Calendar.getInstance();
		
		// .set(년, 월, 일) 또는
		// .set(년, 월, 일, 시, 분, 초)
		// Month의 경우 1월이 0, 2월이 1...... 12월은 11
		cal.set(2023, 4, 1);
		
		// Calendar 객체를 Date 객체로 변환
		System.out.println(cal.getTime());
		
		// Date 객체를 Calendar 객체로 변환
		Date temp = new Date();
		Calendar calTemp = Calendar.getInstance();
		calTemp.setTime(temp);
		
		// Date 타입에서 long 날짜 얻기
		
		System.out.println(temp.getTime());
		
		System.out.println(" ============================================ ");
		
		// 날짜 꺼내기 
		// -> Calendar 객체가 편하다.
		
		Calendar anyCal = Calendar.getInstance();
		
		// 년도
		System.out.println(anyCal.get(Calendar.YEAR));
		System.out.println(anyCal.get(Calendar.MONTH)+1);
		System.out.println(anyCal.get(Calendar.DATE));
		System.out.println(anyCal.get(Calendar.HOUR_OF_DAY)); // 0~24 시
		System.out.println(anyCal.get(Calendar.HOUR)); // 0~12 시
		System.out.println(anyCal.get(Calendar.MINUTE)); // 분
		System.out.println(anyCal.get(Calendar.SECOND)); // 초
		
		System.out.println(" ===============================================");
		
		// 날짜 연산
		String oneDay = "2023.04.06 12:22:44";
		String twoDay = "2023.06.22 14:31:13";
		
		// Date 타입으로 바꿔주기
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Date oneDate = sdf.parse(oneDay);
		Date twoDate = sdf.parse(twoDay);
		
		// 밀리초 값이 더 클수록 최신/미래를 의미
		System.out.println(oneDate.getTime());
		System.out.println(twoDate.getTime());
		
		long diffMillSec = twoDate.getTime()-oneDate.getTime();
		System.out.println(diffMillSec + " 밀리초 차이");
		
		// diffMillSec 를 초 단위로 바꾸기
		long diffSec = diffMillSec / 1000;
		System.out.println(diffSec + " 초 차이");
		
		long diffMin = diffSec / 60;
		System.out.println(diffMin + " 분 차이");
		
		long diffHour = diffMin / 60;
		System.out.println(diffHour + " 시간 차이");
		
		long diffDay = diffHour / 24;
		System.out.println(diffDay + " 일 차이");
		
		// 한 줄로
		long diff = diffMillSec / 1000 / 60 /60 / 24 ;
		diff = diffMillSec / (1000 * 60 * 60 * 24) ;
		System.out.println(diff + " 일 차이");
		
		
		System.out.println(" =================================================== ");
		
		// 디데이 계산기 
		String dday = "2023.05.01";
		
		// 실행 결과 
		// 근로자의 날까지 d-day = -13
		
		dday = "2023.03.20";
		
		// 실행 결과
		// 여러분의 교육 기간 = +29;
		
		
		// 달력 만들기
		
		int year = 2023;
		int month = 4;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1);
		System.out.println(sdf.format(calendar.getTime()));
		
		// 해당 달의 마지막 일자 얻기
		int lastday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastday);
		
		// 해당 달의 시작 요일 얻기
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int current = 1;
		
		for(int i =0 ; i < 42; i ++) {
			
			if (i < startDay - 1) {
				System.out.print("\t");
			}else {
				System.out.printf("%2d\t", current);
				current++;
				
				if(current > lastday) {
					break;
				}
			}
			
			
			if(i % 7 == 6) {
				System.out.println();
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

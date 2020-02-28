package Practice11;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class applp5 {
	public static void main(String[] args) {
		LocalDateTime a = LocalDateTime.of(2020, 2, 27, 15, 39);
		LocalDateTime t = a.with(TemporalAdjusters.firstDayOfMonth());
		LocalDateTime t1 = a.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY));
		System.out.println(t);
		System.out.println(t1);
		
	}
}

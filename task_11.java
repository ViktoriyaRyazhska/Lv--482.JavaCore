import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class task_11 {

	public static void main(String[] args) {
		Random random = new Random();
		random.ints(1, 30).limit(10).forEach(System.out::println);
		List<Integer> list = random.ints(1, 30).limit(10).boxed().collect(Collectors.toList());
		System.out.println("");
		random.ints(1, 30).limit(10).sorted().forEach(System.out::println);
		IntSummaryStatistics stats = list.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		
		DayOfWeek currentDay = LocalDateTime.now().getDayOfWeek();
		System.out.println(currentDay);
		
		LocalDateTime firstMonday = LocalDateTime.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(firstMonday);

		List<String> names = Arrays.asList("ukraine", "poland", "bulgaria");
		List<String> sorted = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);

		
	}

}

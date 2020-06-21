package lsn1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String[] stringArray = reader.readLine().split("\\s");
			Arrays.stream(stringArray).mapToInt(Integer::parseInt).sorted().distinct()
					.forEach(e -> System.out.print(e + " "));

			IntSummaryStatistics statistics = Arrays.stream(stringArray).mapToInt(Integer::parseInt).distinct()
					.summaryStatistics();

			System.out.printf("%ncount: %d%n", stringArray.length);
			System.out.printf("distinct: %d%n", statistics.getCount());
			System.out.printf("min: %d%n", statistics.getMin());
			System.out.printf("max: %d%n", statistics.getMax());

		} catch (IOException e) {
			System.err.print("I/O error");
			System.exit(0);
		} catch (NumberFormatException e) {
			System.err.print("Input format error");
			System.exit(0);
		}
	}
}

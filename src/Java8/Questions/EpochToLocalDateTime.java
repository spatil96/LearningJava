package Java8.Questions;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class EpochToLocalDateTime {
    public static void main(String[] args) {
        // Step 1: Define epoch time in milliseconds (Example: 1625812800000L is 2021-07-09 00:00:00 UTC)
        long epochMilli = 1625812800000L;

        // Step 2: Convert epoch milliseconds to LocalDateTime
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(epochMilli), ZoneId.systemDefault());

        // Step 3: Display the LocalDateTime
        System.out.println("LocalDateTime: " + dateTime);
    }
}
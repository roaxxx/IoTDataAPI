package co.edu.jdc.IoTDataAPI.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static String getCurrentFormattedDateTime() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime adjustedDateTime = now.minusHours(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, h:mm a");
        return adjustedDateTime.format(formatter);
    }

    public static String getCurrentFormattedDate() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime adjustedDateTime = now.minusHours(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d");
        return adjustedDateTime.format(formatter);
    }

    public static String getCurrentFormattedTime() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime adjustedDateTime = now.minusHours(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm:ss a");
        return adjustedDateTime.format(formatter);
    }
}


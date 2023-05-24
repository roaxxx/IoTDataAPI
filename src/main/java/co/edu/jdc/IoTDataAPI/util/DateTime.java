package co.edu.jdc.IoTDataAPI.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static String getCurrentFormattedDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, h:mm a");
        return now.format(formatter);
    }

    public static String getCurrentFormattedDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d");
        return now.format(formatter);
    }

    public static String getCurrentFormattedTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm:ss a");
        return now.format(formatter);
    }
}

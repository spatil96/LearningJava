package Basics.Enum;///usr/bin/env jbang "$0" "$@" ; exit $?

// To be able to execute the code in this example, dependencies are needed.
// Therefore, you can't run it with `java EnumExtended.java`.
// But it can be executed with https://www.jbang.dev with `jbang EnumExtended.java`.

//DEPS com.fasterxml.jackson.core:jackson-annotations:2.14.1
//DEPS com.fasterxml.jackson.core:jackson-core:2.14.1
//DEPS com.fasterxml.jackson.core:jackson-databind:2.14.1
//DEPS com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.2



import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;

public class EnumExtended {

    public static void main (String[] args) {
        System.out.println("--------------------------------------");
        System.out.println("Output of all the defined values in the Level enum:\n");
        for (Level level : Level.values()) {
            System.out.println("Level " + level.name()
                    + "\n\tSeverity: " + level.getSeverity()
                    + "\n\tLabel: " + level.getLabel()
                    + "\n\tColor: " + level.getColor());
        }

        var json = """
                [
                    { 
                        "level": 0,
                        "timestamp": 1675867184342,
                        "message": "Program started"
                    },
                    {
                        "level": 5,
                        "timestamp": 1675867185921,
                        "message": "File X not found"
                    },
                    {
                        "level": 9,
                        "timestamp": 1675867186357,
                        "message": "Error at line Y"
                    }
                ]
                """;

        try {
            System.out.println("--------------------------------------");
            System.out.println("Data loaded from JSON:\n");

//            ObjectMapper objectMapper = new ObjectMapper();
//            LogMessage[] logMessages = objectMapper.readValue(json, LogMessage[].class);
//            for (LogMessage logMessage : logMessages) {
//                System.out.println("Log message at " + logMessage.getZonedDateTime()
//                        + "\n\tSeverity: " + logMessage.level().getLabel()
//                        + "\n\tMessage: " + logMessage.message());
//            }

            System.out.println("--------------------------------------");
            System.out.println("JSON generated from Java array:\n");
            // Uncomment the following line if you want to export ZonedDateTime to JSON
            // objectMapper.registerModule(new JavaTimeModule());
//            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(logMessages));
        } catch (Exception ex) {
            System.err.println("Json processing exception: " + ex.getMessage());
        }
    }

    record LogMessage(Level level, Long timestamp, String message) {
        // If you want to export ZonedDateTime to JSON,
        // you need to comment '@JsonIgnore', and uncomment '@JsonFormat'.
//        @JsonIgnore
        //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
        public ZonedDateTime getZonedDateTime() {
            return ZonedDateTime.ofInstant(Instant.ofEpochMilli(timestamp()), ZoneId.of("UTC"));
        }
    }

    enum Level {
        INFO(0, "Informative message", 0x00aa00),
        WARNING(5, "Warning message", 0xFFA500),
        ERROR(9, "Error message", 0xA30000);

//        @JsonValue
        private final int severity;
        private final String label;
        private final int color;

        private Level(int severity, String label, int color) {
            this.severity = severity;
            this.label = label;
            this.color = color;
        }

        public int getSeverity() {
            return severity;
        }

        public String getLabel() {
            return label;
        }

        public int getColor() {
            return color;
        }

//        @JsonCreator
        public static Level fromValue(Integer severity) throws IllegalArgumentException {
            return Arrays.stream(Level.values()).sequential()
                    .filter(v -> v.getSeverity() == severity)
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("The given severity does not exist:" + severity));
        }
    }
}
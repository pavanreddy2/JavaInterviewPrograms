package com.allProgrammes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExperienceCalculate {

        public static void main(String[] args) {
            // Assuming today's date
            LocalDate currentDate = LocalDate.now();

            // Your experience in years and fractional years (e.g., 4.2 years)
            double totalExperienceYears = 4.5;

            // Calculate the start date by subtracting the experience in years from the current date
            LocalDate startDate = currentDate.minusYears((long) totalExperienceYears);

            // Calculate the end date (today)
            LocalDate endDate = currentDate;

            // Format the dates for display
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            System.out.println("Starting Date: " + startDate.format(dateFormatter));
            System.out.println("End Date: " + endDate.format(dateFormatter));
        }
    }


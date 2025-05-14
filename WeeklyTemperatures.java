import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        String day;
        double temperature;

        while (true) {
            System.out.print("Enter a day of the week (or type 'week' to display the results): ");
            day = scnr.nextLine();

            if (day.equalsIgnoreCase("week")) {
                break;
            }

            daysOfWeek.add(day);

            System.out.print("Enter the average temperature for " + day + ": ");
            temperature = scnr.nextDouble();
            temperatures.add(temperature);
            scnr.nextLine(); // Clear buffer
        }

        System.out.println("\nWeekly Summary:");
        double sum = 0;

        for (int i = 0; i < daysOfWeek.size(); i++) {
            System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i) + "°");
            sum += temperatures.get(i);
        }

        if (!temperatures.isEmpty()) {
            double average = sum / temperatures.size();
            System.out.printf("Weekly average temperature: %.2f°\n", average);
        } else {
            System.out.println("No data entered.");
        }

        scnr.close();
    }
}

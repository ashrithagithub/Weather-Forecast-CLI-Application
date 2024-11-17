import java.util.Random;
import java.util.Scanner;

public class WeatherForecastCLI {
    public static void main(String[] args) {
    
        String[] weatherConditions = {"Sunny", "Rainy", "Cloudy", "Stormy", "Windy"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("--- Weather Forecast Simulator ---");
        System.out.print("Enter the city name: ");
        String city = scanner.nextLine();

        String forecast = weatherConditions[random.nextInt(weatherConditions.length)];

        System.out.println("The weather in " + city + " is " + forecast + " today.");

        scanner.close();
    }
}

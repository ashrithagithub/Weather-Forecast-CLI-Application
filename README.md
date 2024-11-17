# Weather-Forecast-CLI-Application
Simulate a weather forecast system that allows users to input a city and get a random weather forecast.


### Description and Working Procedur

The "Weather Forecast CLI Application" is a console-based Java program designed to simulate a basic weather forecast system. The application allows users to input the name of a city, and it provides a random weather forecast (e.g., sunny, rainy, cloudy, etc.) for that city. Here's a detailed explanation of how the program works and its components:

---

### 1. Purpose of the Program
The program's primary goal is to demonstrate a simple implementation of user interaction and randomness in Java. It provides a fun and interactive way to generate weather forecasts for any city input by the user. Although the forecasts are not real (since they're generated randomly), the program mimics the behavior of a weather forecasting system in a straightforward manner.

---

### 2. Key Components of the Code
1. Weather Conditions Array:  
   The program uses a `String[]` array to store predefined weather conditions:
   ```java
   String[] weatherConditions = {"Sunny", "Rainy", "Cloudy", "Stormy", "Windy"};
   ```
   This array acts as a pool of potential weather forecasts. It includes diverse weather types to simulate variability.

2. **User Input**:  
   The program uses the `Scanner` class to prompt the user for the name of a city:
   ```java
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter the city name: ");
   String city = scanner.nextLine();
   ```
   This allows the user to provide any city name, making the program flexible and interactive.

3. **Random Weather Selection**:  
   The `Random` class is employed to select a random weather condition from the array:
   ```java
   Random random = new Random();
   String forecast = weatherConditions[random.nextInt(weatherConditions.length)];
   ```
   - `random.nextInt(weatherConditions.length)` generates a random number between `0` and the length of the array minus one.  
   - This ensures that the program picks a valid index from the `weatherConditions` array.

4. **Output Generation**:  
   The program combines the city name provided by the user with the randomly chosen weather condition to create a meaningful output:
   ```java
   System.out.println("The weather in " + city + " is " + forecast + " today.");
   ```
   This provides the user with a simulated forecast in a friendly and easy-to-understand format.

5. **Resource Management**:  
   The `scanner.close()` call ensures that the `Scanner` object is closed after use to prevent resource leaks:
   ```java
   scanner.close();
   ```

---

### **3. Working Procedure**
1. **Program Initialization**:
   - The program starts by defining the array of weather conditions and creating a `Scanner` for user input and a `Random` object for random selection.

2. **User Input**:
   - The user is prompted to input a city name. The `Scanner` reads the input, storing it in a variable.

3. **Random Weather Selection**:
   - The program uses the `Random` object to select a random index from the `weatherConditions` array. This index corresponds to one of the predefined weather types.

4. **Output Display**:
   - The selected weather condition is combined with the city name and displayed to the user in a sentence format.

5. **Program Termination**:
   - After displaying the result, the `Scanner` is closed, and the program ends.

---

### **4. Example Workflow**
#### User Interaction Example:
1. The user runs the program.
2. The program displays:
   ```
   --- Weather Forecast Simulator ---
   Enter the city name:
   ```
3. The user enters:
   ```
   Paris
   ```
4. The program randomly selects a weather condition, e.g., "Cloudy," and outputs:
   ```
   The weather in Paris is Cloudy today.
   ```

---

### 5. Key Features and Benefits

1. User-Friendly:
   
   - The program is simple and interactive, making it accessible to users with minimal technical knowledge.
     
3. Dynamic Output:

   - The use of randomness ensures that the forecast varies for each run, adding an element of surprise and engagement.
5. **Compact Code**:
   - The program achieves its goal with a minimal amount of code, showcasing the power of Java's built-in libraries.

---

### 6. Practical Applications
Although the program is a simulation and does not fetch real weather data, it can be extended for practical use:
- Integrating APIs like OpenWeatherMap to fetch real-time weather data.
- Enhancing the user interface for better interaction.

---


This program is a straightforward example of combining user input, randomness, and basic Java functionalities to create an interactive application. It serves as an excellent starting point for beginners learning Java programming and can be further expanded for more complex features.

package Chapter6;

import java.util.ArrayList;

public class StartupBust {
    // Helper handles grid placement and user input
    private GameHelper helper = new GameHelper();

    // List to hold all active Startups
    private ArrayList<Startup> startups = new ArrayList<Startup>();

    // Tracks how many guesses the player has made
    private int numOfGuesses = 0;

    // Sets up the game: creates Startups, assigns names, and places them on the grid
    private void setUpGame() {
        Startup one = new Startup();
        one.setName("poniez");

        Startup two = new Startup();
        two.setName("hacqi");

        Startup three = new Startup();
        three.setName("cabista");

        // Add Startups to the game list
        startups.add(one);
        startups.add(two);
        startups.add(three);

        // Intro message for the player
        System.out.println("Your goal is to sink three Startups.");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");

        // Assign each Startup a location on the grid
        for (Startup startup : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3); // 3-cell Startup
            startup.setLocationCells(newLocation);
        }
    }

    // Main game loop: keeps asking for guesses until all Startups are sunk
    private void startPlaying() {
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame(); // All Startups are sunk — end the game
    }

    // Checks the player's guess against all Startups
    private void checkUserGuess(String userGuess) {
        numOfGuesses++; // Count each guess
        String result = "miss"; // Default result

        for (Startup startupToTest : startups) {
            result = startupToTest.checkYourself(userGuess); // Check guess
            if (result.equals("hit")) {
                break; // Stop checking if it's a hit
            }
            if (result.equals("kill")) {
                startups.remove(startupToTest); // Remove sunk Startup
                break;
            }
        }
        System.out.println(result); // Show result to player
    }

    // Wraps up the game with a final message based on performance
    private void finishGame() {
        System.out.println("All Startups are dead! Your stock is now worthless");

        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }

    // Entry point: sets up and starts the game
    public static void main(String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
    }
}
//This chapter introduces the **Java API** as a powerful toolkit of prebuilt classes that developers can use to build applications efficiently, without reinventing the wheel — encouraging you to focus on writing only the custom parts of your code while leveraging existing, ready-to-use components from the core Java library.



//Here’s how to play your **StartupBust** game, step by step:
//
//        ---
//
//        ### 🎮 How to Play StartupBust
//
//1. **Run the game**
//Compile and run `StartupBust.java` in your IDE or terminal:
//        ```bash
//javac StartupBust.java
//java Chap06.SinkTheStartup.StartupBust
//   ```
//
//           2. **Read the intro**
//The game will tell you your goal: sink three Startups named `poniez`, `hacqi`, and `cabista`.
//
//        3. **Start guessing**
//When prompted with `Enter a guess:`, type a grid coordinate like `a3`, `b5`, etc.
//These match the 7×7 grid (columns `a` to `g`, rows `0` to `6`).
//
//        4. **Get feedback**
//After each guess, the game will respond with:
//        - `"miss"` – you didn’t hit any Startup
//   - `"hit"` – you hit part of a Startup
//   - `"kill"` – you sank an entire Startup
//
//5. **Keep guessing**
//The game continues until all three Startups are sunk.
//
//6. **See your score**
//At the end, it tells you how many guesses you took and gives a cheeky message based on your performance.



package Chapter5;

public class SimpleStartupGame {
    public static void main(String[] args) {
        // Track how many guesses the player makes
        int numOfGuesses = 0;

        // Create a helper object to handle user input
        GameHelper helper = new GameHelper();

        // Create a SimpleStartup object to represent the target
        SimpleStartup theStartup = new SimpleStartup();

        // Generate a random starting point for the startup's location (0 to 4)
        int randomNum = (int) (Math.random() * 5);

        // Create an array with three consecutive locations for the startup
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        // Set the startup's location using the array
        theStartup.setLocationCells(locations);

        // Flag to track whether the startup is still alive
        boolean isAlive = true;

        // Game loop: keep asking for guesses until the startup is sunk
        while (isAlive) {
            // Ask the user for a guess and store the result
            int guess = helper.getUserInput("enter a number");

            // Check the guess against the startup's location
            String result = theStartup.checkYourself(guess);

            // Increment the guess counter
            numOfGuesses++;

            // If the startup is killed, end the game and show results
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
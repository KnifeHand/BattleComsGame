public class BattleComTest {

    public static void main(String[] args) {
        // Instantiate the object
        BattleCom com = new BattleCom();

        // Make an int array for the location of the Coms
        int[] locations = {2,3,4};

        // Invoke the setter method on the Com
        com.setLocationCells(locations);

        // Make a fake user guess
        String userGuess = "2";

        // Invoke the checkYourself() method on the Com object, and pass it the fake guess
        String result = com.checkYourself(userGuess);

        String testResult = "failed";

        if(result.equals("hit")){
            // If the fake guess (2) gives back a "hit", it's working
            testResult = "passed";
        }
        // Print out the test result
        System.out.println(testResult);
    }
}

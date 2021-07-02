///////////////////////////////////////////////////////////////////////////
/*
Method: String checkYourself(String userGuess)
    GET the user guess as a String parameter
    CONVERT the user guess to an int
    REPEAT with each of the location cells in the int array
        COMPARE the user guess to the location cell
        IF the user guess matches
            INCREMENT the number of hits
            FIND OUT if it ws the last location cell:
            IF number of hits is 3, RETURN "kill" as the result
            ELSE it was not a kill, so RETURN "hit"
            END IF
        ELSE the user guess did not match, so RETURN "miss"
        END IF
    END REPEAT
END METHOD

Method: void setLocationCells(int[] cellLocations)
    GET the cell locations as an int array parameter
    ASSIGN the cell locations parameter to the cell locations instance variable
END METHOD
*/
///////////////////////////////////////////////////////////////////////////////
public class BattleCom {
    // Declare an int array to hold the location cells. Call it locationCells.

    // Declare an in to hold the number of hits. Call it numOfHits and SET it to 0.
    // Declare a checkYourself() method that takes a String for the user's guess ("1","2", etc.).
    public String checkYourself(String userGuess) {
    }

    // Checks it, and returns a result representing a "hit", "miss", or "kill".
    //Declare a setLocationCells() setter method that takes an int array.
    public void setLocationCells(int[] locations) {
    }
}

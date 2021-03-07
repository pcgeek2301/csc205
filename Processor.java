/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Minilab: <Minilab #4>
Author: <Katy Hochstetler> <36473082>
Description: <In this mini lab I have created a worker abstract class and 3 subclasses. The processor class uses a super in its 
parameterized constructor to get the user input for name, rating, and id. It also asks for bonusTarget. For the calculateBonus 
method it uses the bonusTarget and multiplier to give the bonus. The compareTo method is inherited. The toString method is 
updated using the original first half of the string from the worker class and then adds the bonusTarget for info to print out.
*/

public class Processor extends Worker {
    protected double bonusTarget;

    // parameterized constructor
    public Processor(String userName, int userRating, int userID, double userBonusTarget) {
        super(userName, userRating, userID);
        this.bonusTarget = userBonusTarget;
    }
    
    // calculates the bonus the processor earns
    public double calculateBonus(double multiplier) {
        double bonus = bonusTarget * multiplier;
        
        return bonus; 
    }

    // displays the important information for the processor. 
    public String toString() {
        return super.toString() + ", target:" + bonusTarget;
    }
}

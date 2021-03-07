package Minilab_4;
/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Minilab: <Minilab #4>
Author: <Katy Hochstetler> <36473082>
Description: <In this mini lab I have created a worker abstract class and 3 subclasses. The specialist class uses a super in its 
parameterized constructor to get the user input for name, rating, and id. It also asks for bonusTarget and profitSharing. For the 
calculateBonus method it uses the bonusTarget, profitSharing, and multiplier to give the bonus. The compareTo method is inherited. 
The toString method is updated using the original first half of the string from the worker class and then adds the bonusTarget and 
profit sharing for info to print out.
*/

public class Specialist extends Worker {
    protected double bonusTarget;
    protected double profitSharing;

    // parameterized constructor  
    public Specialist(String userName, int userRating, int userID, double userBonusTarget, double userProfitSharing) {
        super(userName, userRating, userID);
        this.bonusTarget = userBonusTarget;
        this.profitSharing = userProfitSharing;
    }

    // calculates the bonus for the specialist 
    public double calculateBonus(double multiplier) {
        double bonus = (bonusTarget + profitSharing) * multiplier;
        
        return bonus;
    }

    // displays the important info for the specialist
    public String toString() {
        return super.toString() + ", target:" + bonusTarget + ", profit:" + profitSharing;
    }
}

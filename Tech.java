
/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Minilab: <Minilab #4>
Author: <Katy Hochstetler> <36473082>
Description: <In this mini lab I have created a worker abstract class and 3 subclasses. The tech class uses a super in its parameterized 
constructor to get the user input for name, rating, and id. Tech's do not get a bonus so it just returns 0 in the calculateBonus method.
The compareTo method is inherited. The toString method is also inherited
*/

public class Tech extends Worker {

    public Tech(String theName, int theRating, int theID) {
        super(theName, theRating, theID);
    }

    public double calculateBonus(double mulitplier) {
        return 0;
    }

}

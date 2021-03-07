package Minilab_4;
/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Minilab: <Minilab #4>
Author: <Katy Hochstetler> <36473082>
Description: <In this mini lab I have created a worker abstract class and 3 subclasses. The worker class includes a parameterized 
constructor that gets the name, rating, and id from the user. A compareTo method that compares 
the workers ratings. A abstract calculateBonus method. And finally a toString method that prints out all the info 
about the worker. 
*/

public abstract class Worker implements Comparable<Worker>{
    protected String name;
    protected int rating; 
    protected int id;
   
    public Worker(String userName, int userRating, int userID) {
        this.name = userName;
        this.id = userID;

        if (userRating < 1 || userRating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        } else {
            this.rating = userRating;
        }
    }

    // ----  This method compares two workers
    // negative number means the workers rating is < another's rating 
    // postive number means the workers rating is > anothers rating 
    // 0 means they are equal
    public int compareTo(Worker another) {
        int comparison = 0;

        if (rating < another.rating) {
            comparison = -1;
        } else if (rating > another.rating) {
            comparison = 1;
        } else if (rating == another.rating){
            if (id < another.id) {
                comparison = -1;
            } else if (id > another.id){
                comparison = 1;
            } else {
                comparison = 0;
            }
        }

        return comparison;
    }

    public abstract double calculateBonus(double multiplier);

    public String toString() {
        return this.getClass().getName() + ":" + name + ", rating:" + rating + ", ID:" + id;
    }
}

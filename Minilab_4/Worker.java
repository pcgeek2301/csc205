package Minilab_4;

public abstract class Worker {
    protected String name;
    protected int rating; 
    protected int id;
   
    public Worker(String theName, int theRating, int theID) {
        this.name = theName;
        this.id = theID;

        if (theRating >= 1 && theRating <= 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        } else {
            this.rating = theRating;
        }
    }
    
}

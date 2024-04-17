package is.hi.hbv202g.softconsproj;

public abstract class User {
    String name; 

    /**
     * Constructs a user with the specified name.
     * @param name the name of the user
     */
    public User(String name){
        this.name = name;
    }

    /**
     * Returns the name of the user.
     * @return the user's name
     */
    public String getName(){
        return name;
    }

    /**
     * Sets the name of the user.
     * @param name the new name of the user
     */
    public void setName(String name){
        this.name = name;
    }
}
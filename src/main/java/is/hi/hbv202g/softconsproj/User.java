package is.hi.hbv202g.softconsproj;

public abstract class User {
    //Tilviksbreyta
    String name;

    //Smiður sem tekur inn name
    public User(String name){
        this.name = name;
    }

    /**
     * Getter fyrir name
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * Setter fyrir name
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

}

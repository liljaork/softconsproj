package is.hi.hbv202g.softconsproj;

public abstract class User {
    //Tilviksbreyta
    String name;


    public User(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }


    public void setName(String name){
        this.name = name;
    }

}

package is.hi.hbv202g.softconsproj;

public class Student extends User {
    //Tilviksbreyta
    private boolean feePaid;

   
    public Student(String name, boolean feePaid) {
        super(name);
        this.feePaid = feePaid;        
    }

   
    public boolean isFeePaid() {
        return feePaid;
    }

 
    public void setFeePaid(boolean feePaid) {
        this.feePaid = feePaid;
    }
}

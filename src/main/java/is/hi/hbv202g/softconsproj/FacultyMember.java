package is.hi.hbv202g.softconsproj;

public class FacultyMember extends User {
    //Tilviksbreyta
    private String department;
    
    /**
     * Smiður sem tekur inn name og department
     * @param name
     * @param department
     */
    public FacultyMember(String name, String department) {
        super(name);
        this.department = department;
    }

    /**
     * Getter fyrir department
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Setter fyrir department
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    
}

package is.hi.hbv202g.softconsproj;

public class FacultyMember extends User {
    //Instance variables
    private String department;
    
    /**
     * Constructs a new FacultyMember with the specified name and department.
     * Initializes a new User.
     * @param name the name of the faculty member
     * @param department the department to which the faculty member is affiliated
     */
    public FacultyMember(String name, String department) {
        super(name);
        this.department = department;
    }

    /**
     * Returns the department of this faculty member.
     * @return the department to which this faculty member belongs
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of this faculty member.
     * @param department the new department to which this faculty member will belong
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}
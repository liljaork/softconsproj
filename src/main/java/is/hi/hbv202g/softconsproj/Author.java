package is.hi.hbv202g.softconsproj;

public class Author {
    //Tilviksbreyta
    private String name;

    /**
     * Smiður sem setur nafnið
     * @param name Nafn
     */
    public Author(String name) {
        this.name = name;
    }

    /**
     * Getter fyrir name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter fyrir name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
}


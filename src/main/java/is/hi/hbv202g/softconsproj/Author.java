package is.hi.hbv202g.softconsproj;

public class Author {

    //Tilviksbreyta
    private String name;

    /**
     * Constructs an Author with the given name.
     *
     * @param name The name of the author.
     */
    public Author(String name) {
        this.name = name;
    }

    /**
     * Retrieves the name of the author.
     *
     * @return The name of the author.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the author.
     *
     * @param name The name to set for the author.
     */
    public void setName(String name) {
        this.name = name;
    }
}


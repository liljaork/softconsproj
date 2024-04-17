package is.hi.hbv202g.softconsproj;


public class Main {
    /**
     * Shows some examples usage of the composite design pattern
     * @param args Command line parameters that are ignored
     */
    public static void main( String[] args ) {
        Book harryPotter1 = new Book();
        Book harryPotter2 = new Book();
        Book harryPotter3 = new Book();
        Book harryPotter4 = new Book();
        Book harryPotter5 = new Book();
        Book harryPotter6 = new Book();
        Book harryPotter7 = new Book();
        Book lordOfTheRings1 = new Book();
        Book lordOfTheRings2 = new Book();
        Book lordOfTheRings3 = new Book();
        Book lordOfTheRings4 = new Book();
        Book lordOfTheRings5 = new Book();
        Book lordOfTheRings6 = new Book();
        Book twilight1 = new Book();
        Book twilight2 = new Book();
        Book twilight3 = new Book();
        Book twilight4 = new Book();
        Book twilight5 = new Book();
       
        Omnibus harryPotterCollection = new Omnibus();
        Omnibus lordOfTheRingsCollection = new Omnibus();
        Omnibus twilightCollection = new Omnibus();

        harryPotterCollection.add(harryPotter1);
        harryPotterCollection.add(harryPotter2);
        harryPotterCollection.add(harryPotter3);
        harryPotterCollection.add(harryPotter4);
        harryPotterCollection.add(harryPotter5);
        harryPotterCollection.add(harryPotter6);
        harryPotterCollection.add(harryPotter7);
        harryPotterCollection.clean();

        lordOfTheRingsCollection.add(lordOfTheRings1);
        lordOfTheRingsCollection.add(lordOfTheRings2);
        lordOfTheRingsCollection.add(lordOfTheRings3);
        lordOfTheRingsCollection.add(lordOfTheRings4);
        lordOfTheRingsCollection.add(lordOfTheRings5);
        lordOfTheRingsCollection.add(lordOfTheRings6);
        lordOfTheRingsCollection.clean();

        twilightCollection.add(twilight1);
        twilightCollection.add(twilight2);
        twilightCollection.add(twilight3);
        twilightCollection.add(twilight4);
        twilightCollection.add(twilight5);
        twilightCollection.clean();
    }
}

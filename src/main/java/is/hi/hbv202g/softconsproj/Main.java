package is.hi.hbv202g.softconsproj;


public class Main
{
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
        
        Omnibus harryPotterCollection = new Omnibus();
        Omnibus lordOfTheRingsCollection = new Omnibus();

        harryPotterCollection.add(harryPotter1);
        harryPotterCollection.add(harryPotter2);
        harryPotterCollection.add(harryPotter3);
        harryPotterCollection.add(harryPotter4);
        harryPotterCollection.add(harryPotter5);
        harryPotterCollection.add(harryPotter6);
        harryPotterCollection.add(harryPotter7);
        lordOfTheRingsCollection.add(lordOfTheRings1);
        lordOfTheRingsCollection.add(lordOfTheRings2);
        lordOfTheRingsCollection.add(lordOfTheRings3);
        lordOfTheRingsCollection.add(lordOfTheRings4);
        lordOfTheRingsCollection.add(lordOfTheRings5);
        lordOfTheRingsCollection.add(lordOfTheRings6);
        harryPotterCollection.clean();
        lordOfTheRingsCollection.clean();
        
    }
}

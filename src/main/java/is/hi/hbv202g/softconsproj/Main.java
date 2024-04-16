package is.hi.hbv202g.softconsproj;

/**
 * Hello world!
 *
 */
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
        
        Omnibus omnibus = new Omnibus();

        omnibus.add(harryPotter1);
        omnibus.add(harryPotter2);
        omnibus.add(harryPotter3);
        omnibus.add(harryPotter4);
        omnibus.add(harryPotter5);
        omnibus.add(harryPotter6);
        omnibus.add(harryPotter7);
        omnibus.add(lordOfTheRings1);
        omnibus.add(lordOfTheRings2);
        omnibus.add(lordOfTheRings3);
        omnibus.add(lordOfTheRings4);
        omnibus.add(lordOfTheRings5);
        omnibus.add(lordOfTheRings6);
        omnibus.clean();
        
    }
}

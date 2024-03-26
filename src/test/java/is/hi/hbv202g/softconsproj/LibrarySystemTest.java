package is.hi.hbv202g.softconsproj;

import java.time.LocalDate;
import java.util.List;

public class LibrarySystemTest {
    private List<Book> books;
    private List<User> users;
    private List<Lending> lendings;

    addBookWithTitleAndNameOfSingleAuthor(String title, String authorName);
    addBookWithTitleAndAuthorList(String title, List<Author> authors);
    addStudentUser(String name, boolean feePaid);
    addFacultyMemberUser(String name, String department);
    findBookByTitle(String title);
    findUserByName(String name);
    borrowBook(User user, Book book);
    extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate);
    returnBook(User user, Book book);
    findLending(User user, Book book);
}

# SoftConsProj
A project developed from project 8, followed by instructions of the "Software Construction Project" in the course hbv202g. 

## Project structure
This project is a maven-based project so it uses the standard Maven project structure that your IDE should be able to understand when you clone it from git. The provided Maven POM includes the dependency.

Both the implementation and the tests are in the package `is.hi.hbv202g.softconsproj` but in the usual separate `src`` directories:

- `src/main/java`:
    - `is.hi.hbv202g.softconsproj.Author`: The `Author` class represents an author of a book. This class is primarily used in conjunction with the `Book` class to represent authorship. 
    - `is.hi.hbv202g.softconsproj.Book`: The `Book` class represents a book within the library system, encapsulating details such as the book's title and its authors. It also tracks whether the book is currently undergoing a cleaning process. It is a part of the composite design pattern.
    - `is.hi.hbv202g.softconsproj.BookAlreadyExistsException`: The `BookAlreadyExistsException` is a custom exception used within the library management system to handle specific error conditions when operations involve adding books that already exist within the system's catalog.
    - `is.hi.hbv202g.softconsproj.EmptyAuthorListException`: The `EmptyAuthorListException` is a custom exception designed to manage specific error conditions in the library system, particularly when book operations involve invalid or missing author information.
    - `is.hi.hbv202g.softconsproj.FacultyMember`: The `FacultyMember` class is an extension of the `User` class. This class captures additional information specific to faculty members, such as their department affiliation.
    - `is.hi.hbv202g.softconsproj.Lending`: The `Lending` class encapsulates all details related to the loan of a book within the library management system. It links a `Book` and a `User`, recording the due date for the return of the borrowed book.
    - `is.hi.hbv202g.softconsproj.LibraryItem`: The `LibraryItem` interface defines a common protocol for items that can be managed within the library system. It is a part of the composite design pattern.
    - `is.hi.hbv202g.softconsproj.LibrarySystem`: The `LibrarySystem` class acts as the central hub for managing all transactions and entities in the library, such as books, users, and lendings. It integrates several functionalities to ensure efficient operation and tracking of library resources.
    - `is.hi.hbv202g.softconsproj.Main`: The `Main` class in the project serves as the entry point to the application, showcasing how books can be managed as collections within the system. This example specifically demonstrates creating individual `Book` objects, organizing them into collections using the `Omnibus` class, and applying operations to these collections.
    - `is.hi.hbv202g.softconsproj.Omnibus`: The `Omnibus` class implements the `LibraryItem` interface, showcasing a composite design pattern. This class allows for the management of collections of library items (such as books), treating individual items or collections of items uniformly.
    - `is.hi.hbv202g.softconsproj.Student`: The `Student` class, an extension of the `User` class, specifically caters to the needs of student users in the library management system. It incorporates fee payment status, a crucial aspect of library services that can affect borrowing privileges.
    - `is.hi.hbv202g.softconsproj.User`: The `User` class serves as the foundational class for representing users in the library management system. It provides basic attributes and functionality that are common to all types of users, such as students, faculty members, and staff. 
    - `is.hi.hbv202g.softconsproj.UserAlreadyExistsException`: The `UserAlreadyExistsException` class is a custom exception that is used within the library management system to handle scenarios where an attempt is made to add a user that already exists in the system's database. 
    - `is.hi.hbv202g.softconsproj.UserOrBookDoesNotExistException`: The `UserOrBookDoesNotExistException` class is a custom exception used within the library management system to handle error conditions when a requested user or book cannot be found in the system. 
- `src/test/java`:
    - `is.hi.hbv202g.softconsproj.BookTest`: The `BookTest` class provides comprehensive unit tests for the `Book` class in the library management system. It ensures that the `Book` class functions correctly across various scenarios, from creating books to managing authors. 
    - `is.hi.hbv202g.softconsproj.LibrarySystemTest`: The `LibrarySystemTest` class tests the functionality of the LibrarySystem class, ensuring that all aspects of the library management system operate as expected. 
    - `is.hi.hbv202g.softconsproj.MainTest`: The `MainTest` class tests the foundational aspects of the library management system, primarily focusing on the ability to instantiate key components of the system.
    - `is.hi.hbv202g.softconsproj.StudentTest`: The `StudentTest` class is dedicated to verifying the functionality related to the Student class within the library management system.

## Design inforfmation
This project uses the composite design pattern. The interface is called `LibraryItem` and then we have to classes that implement the interface and those classes are called `Book` and `Omnibus`.

## Supported Maven goals
- `mvn compile` compiles all the implementation classes.
- `mvn test` runs all the test cases.
- `mvn exec:java` executes the main method of the implementation.

## License

[MIT license info](LICENSE)



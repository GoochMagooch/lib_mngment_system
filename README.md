# Project: Library Management System
Description: Design and implement a Java-based library management system. This project will require you to integrate 
multiple components of Java and programming fundamentals into a cohesive whole.
The goal is to create a basic console application that allows users to:

Add books to the library
Borrow and return books
Manage member accounts
Track which books are currently borrowed and available
Key Requirements:

Book Class:

Implement a Book class with attributes like title, author, isbn, and isBorrowed (a boolean to track the book’s status).
Add methods to check whether a book is available and change its status when borrowed/returned.
Library Class:

The Library class should maintain a collection of books. You will need methods for:
Adding new books to the collection
Displaying available books
Borrowing and returning books (updating their status in the system)
Member Class:

A Member class to track individual users of the library. Each member should have:
A unique ID
A list of borrowed books
Methods to borrow and return books (update both the member’s and library’s status)
Exception Handling:

Implement exception handling for cases like:
Borrowing a book that is not available
Returning a book that was not borrowed
Adding duplicate books with the same ISBN
Input and Output:

Allow the user to interact with the program through a menu system in the console (e.g., "Press 1 to borrow a book", 
"Press 2 to return a book").
Use basic file I/O to save and load the state of the library (e.g., books, borrowed status) between program runs.
Advanced (Optional Challenge):

Implement a simple login system for members, using basic user authentication (username and password).
Integrate a more complex data structure for faster book lookup, such as a HashMap to store books by ISBN.
Skills Involved:

OOP Principles: This project will push your understanding of class design, inheritance (if you extend the system to have
different types of users or books), and encapsulation.
File I/O: You’ll get hands-on experience with reading from and writing to files, an essential skill for larger 
applications.
Exception Handling: By building a robust system, you’ll develop your skills in catching and handling errors in a clean, 
user-friendly manner.
Design Thinking: You’ll need to think about how the different parts of the system interact, a critical skill for larger, 
more complex applications.

ONE RULE:
Only the official Java documentation is allowed for reference!
It will be uncomfortable, it will be challenging. The learning will also be invaluable...
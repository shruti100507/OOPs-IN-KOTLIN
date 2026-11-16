/*Create a simple Library System:
• Class Book (title, author)
• Class Library (list of books)
• Functions: addBook(), removeBook(), showBooks()
Use encapsulation and proper OOP structure.*/
class Book(
    val title: String,
    val author: String
)
class Library {
    private val books = mutableListOf<Book>()
    fun addBook(book: Book) {
        books.add(book)
        println("'${book.title}' added successfully.")
    }
    fun removeBook(title: String) {
        val book = books.find {
            it.title.equals(title, ignoreCase = true)
        }
        if (book != null) {
            books.remove(book)
            println("'${book.title}' removed successfully.")
        } else {
            println("Book not found!")
        }
    }
    fun showBooks() {
        if (books.isEmpty()) {
            println("Library is empty.")
        } else {
            println("\nBooks Available in Library:")

            for (book in books) {
                println("Title: ${book.title}")
                println("Author: ${book.author}")
                println("----------------------")
            }
        }
    }
}
fun main() {
    val library = Library()
    val book1 = Book("Harry Potter", "J.K. Rowling")
    val book2 = Book("The Alchemist", "Paulo Coelho")
    val book3 = Book("The Silent Patient", "Alex Michaelides")
    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)
    library.showBooks()
    library.removeBook("The Alchemist")
    library.showBooks()
}
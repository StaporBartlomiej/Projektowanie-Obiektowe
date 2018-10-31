package dao;

import dto.BookDto;

public interface BookDAO extends Dao<BookDto> {

    boolean rentBook(int bookId);

    boolean returnBook(int bookId);

}

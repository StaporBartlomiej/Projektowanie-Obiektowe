package app;

import dao.BookDAO;
import dao.Dao;
import dto.UserDto;
import service.BookService;
import service.UserService;

import java.math.BigDecimal;

public class main {

    public static void main(String[] args) {
        BookDAO book = BookService.getINSTANCE();
        Dao<UserDto> user = UserService.getINSTANCE();
        System.out.println(user.list());
        user.add(new UserDto(1, "name", "surname", "1990-02-02", new BigDecimal("4")), true);
        System.out.println(user.list());
//        book.add(new BookDto(1,"tytul", "autor", 3),true);
//        book.remove(3);
//        System.out.println(book.list());
//        book.modify(1,new BookDto(10,"XDDDD","authoexD",6));
//        System.out.println(book.list());
    }
}

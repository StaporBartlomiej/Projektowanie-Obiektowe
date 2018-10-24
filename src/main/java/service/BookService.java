package service;

import dao.BookDAO;
import dto.BookDto;
import lombok.Getter;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class BookService implements BookDAO {

    // Put path to csv file below
    private static final String fileName = "/Users/bartekprywatne/Documents/Exercise2/src/main/resources/books.csv";

    @Getter
    private static final BookService INSTANCE = new BookService();

    private BookService() {
    }

    public boolean rentBook(int bookId) {
        return false;
    }

    public boolean returnBook(int bookId) {
        return false;
    }

    public void add(BookDto bookDto, boolean append) {
        try {
            String delimiter = ":";
            Writer fileWriter = new FileWriter(fileName, append);
            fileWriter.append(String.valueOf(bookDto.getId()));
            fileWriter.append(delimiter);
            fileWriter.append(bookDto.getTitle());
            fileWriter.append(delimiter);
            fileWriter.append(bookDto.getAuthor());
            fileWriter.append(delimiter);
            fileWriter.append(String.valueOf(bookDto.getUserId()));
            fileWriter.append("\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void remove(int id) {
        List<BookDto> dtos = list();
        List<BookDto> dtosToRemove = new ArrayList<>();

        for (BookDto dto : dtos) {
            if (id == dto.getId()) {
                dtosToRemove.add(dto);
            }
        }
        dtos.removeAll(dtosToRemove);
        for (BookDto dto : dtos) {
            add(dto, false);
        }

    }

    public void modify(int id, BookDto newData) {
        remove(id);
        add(newData, true);
    }

    public List<BookDto> list() {
        List<BookDto> dtos;
        try {
            BufferedReader br = FileOperations.getBufferedReader(fileName);
            dtos = br.lines().map(line -> {
                String[] p = line.split(":");// a CSV has comma separated lines
                //more initialization goes here
                return BookDto.builder()
                        .id(Integer.parseInt(p[0]))
                        .title(p[1])
                        .author(p[2])
                        .userId(Integer.parseInt(p[3]))
                        .build();
            }).collect(Collectors.toList());
            br.close();

        } catch (Exception e) {
            return Collections.emptyList();
        }
        return dtos;
    }

}

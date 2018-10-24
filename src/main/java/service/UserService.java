package service;

import dao.Dao;
import dto.UserDto;
import lombok.Getter;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UserService implements Dao<UserDto> {

    @Getter
    private static final UserService INSTANCE = new UserService();
    // Put path to csv file below
    private static final String fileName = "/Users/bartekprywatne/Documents/Exercise2/src/main/resources/users.csv";

    private UserService() {
    }

    public void add(UserDto userDto, boolean append) {
        try {
            String delimiter = ":";
            Writer fileWriter = new FileWriter(fileName, append);
            fileWriter.append(String.valueOf(userDto.getId()));
            fileWriter.append(delimiter);
            fileWriter.append(userDto.getName());
            fileWriter.append(delimiter);
            fileWriter.append(userDto.getSurname());
            fileWriter.append(delimiter);
            fileWriter.append(userDto.getBirthDate());
            fileWriter.append(delimiter);
            fileWriter.append(userDto.getFee().toString());
            fileWriter.append("\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void remove(int id) {
        List<UserDto> dtos = list();
        List<UserDto> dtosToRemove = new ArrayList<>();

        for (UserDto dto : dtos) {
            if (id == dto.getId()) {
                dtosToRemove.add(dto);
            }
        }
        dtos.removeAll(dtosToRemove);
        for (UserDto dto : dtos) {
            add(dto, false);
        }
    }

    public void modify(int id, UserDto newData) {
        remove(id);
        add(newData, true);
    }

    public List<UserDto> list() {
        List<UserDto> dtos;
        try {
            BufferedReader br = FileOperations.getBufferedReader(fileName);
            dtos = br.lines()
                    .map(line -> {
                        String[] p = line.split(":");
                        return UserDto.builder()
                                .id(Integer.parseInt(p[0]))
                                .name(p[1])
                                .surname(p[2])
                                .birthDate(p[3])
                                .fee(new BigDecimal(p[4]))
                                .build();
                    }).collect(Collectors.toList());
            br.close();

        } catch (Exception e) {
            return Collections.emptyList();
        }
        return dtos;

    }

}
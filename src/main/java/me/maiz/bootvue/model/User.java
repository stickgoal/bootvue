package me.maiz.bootvue.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int userId;

    private String username;

    private String password;

    private Date date;


}

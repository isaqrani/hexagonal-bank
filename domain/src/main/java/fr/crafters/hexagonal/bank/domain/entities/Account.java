package fr.crafters.hexagonal.bank.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Account {

    private Long id;
    private String name;
    private Date birthday;

    public Account(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Double getBalance() {
        return 0d;
    }
}

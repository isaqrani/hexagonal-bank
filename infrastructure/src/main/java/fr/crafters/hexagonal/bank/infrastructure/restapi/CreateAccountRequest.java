package fr.crafters.hexagonal.bank.infrastructure.restapi;

import fr.crafters.hexagonal.bank.domain.CreateAccountCommand;
import lombok.Data;

import java.util.Date;

@Data
public class CreateAccountRequest {
    private String name;
    private Date birthday;

    public CreateAccountCommand toCommand() {
        return new CreateAccountCommand(name, birthday);
    }
}

package fr.crafters.hexagonal.bank.domain;

import fr.crafters.hexagonal.bank.domain.entities.Account;

public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long create(CreateAccountCommand command) {
        Account created = accountRepository.save(
                new Account(command.getName(), command.getBirthday())
        );

        return created.getId();
    }
}

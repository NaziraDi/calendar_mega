package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.mapper.AccountMapper;
import kg.megacom.calendar.model.dto.AccountDto;
import kg.megacom.calendar.model.entity.Account;
import kg.megacom.calendar.model.request.CreateAccountRequest;
import kg.megacom.calendar.repository.AccountRepository;
import kg.megacom.calendar.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public AccountDto create(CreateAccountRequest request) {
        return null;
    }


    @Override
    public AccountDto findById(Long id) {

        Account account = accountRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Account with id" + id + "is not found"));
        return AccountMapper.INSTANCE.toDto(account);
    }

    @Override
    public AccountDto save(AccountDto account) {

        AccountDto accountDto = AccountMapper.INSTANCE.toDto(accountRepository.save(
                AccountMapper.INSTANCE.toEntity(account)
        ));

        return accountDto;
    }

}

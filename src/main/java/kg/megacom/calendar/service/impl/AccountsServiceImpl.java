package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.model.dto.AccountsDto;
import kg.megacom.calendar.model.entity.Accounts;
import kg.megacom.calendar.model.request.CreateAccountsRequest;
import kg.megacom.calendar.service.AccountsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountsServiceImpl implements AccountsService {
    @Override
    public AccountsDto create(CreateAccountsRequest request) {
        return null;
    }

    @Override
    public AccountsDto update(AccountsDto accountsDto) {
        return null;
    }

    @Override
    public AccountsDto findById(Long id) {
        return null;
    }

    @Override
    public AccountsDto delete(Long id) {
        return null;
    }

    @Override
    public void save(Accounts accounts) {

    }
}

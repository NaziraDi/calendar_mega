package kg.megacom.calendar.service;

import kg.megacom.calendar.model.dto.AccountsDto;
import kg.megacom.calendar.model.entity.Accounts;
import kg.megacom.calendar.model.request.CreateAccountsRequest;
import org.springframework.stereotype.Service;

@Service
public interface AccountsService {
    AccountsDto create(CreateAccountsRequest request);
    AccountsDto update(AccountsDto accountsDto);
    AccountsDto findById(Long id);
    AccountsDto delete(Long id);
    void save(Accounts accounts);
}

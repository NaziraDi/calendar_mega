package kg.megacom.calendar.service;

import kg.megacom.calendar.model.dto.AccountDto;
import kg.megacom.calendar.model.request.CreateAccountRequest;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    AccountDto create(CreateAccountRequest request);
    AccountDto findById(Long id);
    AccountDto save(AccountDto account);
}

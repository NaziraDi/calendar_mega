package kg.megacom.calendar.mapper;

import kg.megacom.calendar.model.dto.AccountDto;
import kg.megacom.calendar.model.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper extends BaseMapper<Account, AccountDto> {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);
}

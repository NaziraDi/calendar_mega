package kg.megacom.calendar.mapper;

import kg.megacom.calendar.model.dto.AccountsDto;
import kg.megacom.calendar.model.entity.Accounts;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountsMapper extends BaseMapper<Accounts, AccountsDto> {

    AccountsMapper INSTANCE = Mappers.getMapper(AccountsMapper.class);
}

package kg.megacom.calendar.mappertest;

import kg.megacom.calendar.mapper.AccountMapper;
import kg.megacom.calendar.model.dto.AccountDto;
import kg.megacom.calendar.model.entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class AccountMapperTest {

    @Test
    public void testAccountMapper(){
        AccountDto accountDto = new AccountDto();
        accountDto.setId(1L);
        accountDto.setLogin("Dastan");
        accountDto.setPassword("123");
        accountDto.setLoginCount(3);

        Account account = AccountMapper.INSTANCE.toEntity(accountDto);
        AccountDto result = AccountMapper.INSTANCE.toDto(account);

        assertEquals(account.getId(), result.getId());
        assertEquals(account.getLogin(), result.getLogin());
        assertEquals(account.getPassword(), result.getPassword());
        assertEquals(account.getLoginCount(), result.getLoginCount());


    }


}

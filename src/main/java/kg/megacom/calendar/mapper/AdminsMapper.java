package kg.megacom.calendar.mapper;

import kg.megacom.calendar.model.dto.AdminsDto;
import kg.megacom.calendar.model.entity.Admins;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AdminsMapper extends BaseMapper<Admins, AdminsDto> {

    AdminsMapper INSTANCE = Mappers.getMapper(AdminsMapper.class);
}

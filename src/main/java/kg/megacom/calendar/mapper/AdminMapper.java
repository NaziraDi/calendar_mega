package kg.megacom.calendar.mapper;

import kg.megacom.calendar.model.dto.AdminDto;
import kg.megacom.calendar.model.entity.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AdminMapper extends BaseMapper<Admin, AdminDto> {

    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);
}

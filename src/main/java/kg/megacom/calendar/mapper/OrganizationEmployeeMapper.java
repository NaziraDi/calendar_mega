package kg.megacom.calendar.mapper;

import kg.megacom.calendar.model.dto.OrganizationEmployeeDto;
import kg.megacom.calendar.model.entity.OrganizationEmployee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrganizationEmployeeMapper extends BaseMapper<OrganizationEmployee, OrganizationEmployeeDto>{

    OrganizationEmployeeMapper INSTANCE = Mappers.getMapper(OrganizationEmployeeMapper.class);
}

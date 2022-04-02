package kg.megacom.calendar.mapper;

import kg.megacom.calendar.model.dto.OrganizationDto;
import kg.megacom.calendar.model.entity.Organization;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrganizationMapper extends BaseMapper<Organization, OrganizationDto>{

    OrganizationMapper INSTANCE = Mappers.getMapper(OrganizationMapper.class);
}

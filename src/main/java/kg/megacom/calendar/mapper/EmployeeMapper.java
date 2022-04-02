package kg.megacom.calendar.mapper;

import kg.megacom.calendar.model.dto.EmployeeDto;
import kg.megacom.calendar.model.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee, EmployeeDto> {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
}

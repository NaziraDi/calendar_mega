package kg.megacom.calendar.service;

import kg.megacom.calendar.model.dto.EmployeeDto;
import kg.megacom.calendar.model.entity.Employee;
import kg.megacom.calendar.model.request.CreateEmployeeRequest;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    EmployeeDto create(CreateEmployeeRequest request);
    EmployeeDto update(EmployeeDto employeeDto);
    EmployeeDto findById(Long id);
    EmployeeDto delete(Long id);
    EmployeeDto save(EmployeeDto employeeDto);
}

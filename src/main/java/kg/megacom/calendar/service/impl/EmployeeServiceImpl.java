package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.mapper.EmployeeMapper;
import kg.megacom.calendar.model.dto.EmployeeDto;
import kg.megacom.calendar.model.entity.Account;
import kg.megacom.calendar.model.entity.Employee;
import kg.megacom.calendar.model.request.CreateEmployeeRequest;
import kg.megacom.calendar.repository.EmployeeRepository;
import kg.megacom.calendar.service.AccountService;
import kg.megacom.calendar.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final AccountService accountsService;

    @Override
    public EmployeeDto create(CreateEmployeeRequest request) {

        Employee employee = Employee
                .builder()
                .lastName(request.getLastName())
                .firstName(request.getFirstName())
                .email(request.getEmail())
                .msisdn(request.getMsisdn())
                .isActive(true)
                .build();
        Account accounts = Account
                .builder()
                
                .build();
        return null;
    }

    @Override
    public EmployeeDto update(EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public EmployeeDto findById(Long id) {

        Employee employee = employeeRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Employee with id" + id + "is not found"));
        return EmployeeMapper.INSTANCE.toDto(employee);
    }

    @Override
    public EmployeeDto delete(Long id) {

        return EmployeeMapper.INSTANCE.toDto(employeeRepository.findById(id).map(employee -> {
            employee.setIsActive(false);
            return employeeRepository.save(employee);
        }).orElseThrow(() -> new RuntimeException("Employee is not found or already deleted")));
    }

    @Override
    public EmployeeDto save(EmployeeDto employeeDto) {

        EmployeeDto employeeDto1 = EmployeeMapper.INSTANCE.toDto(employeeRepository.save(
                EmployeeMapper.INSTANCE.toEntity(employeeDto)
        ));

        return employeeDto1;
    }
}

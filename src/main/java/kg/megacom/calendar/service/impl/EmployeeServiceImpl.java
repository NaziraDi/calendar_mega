package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.model.dto.EmployeeDto;
import kg.megacom.calendar.model.entity.Accounts;
import kg.megacom.calendar.model.entity.Employee;
import kg.megacom.calendar.model.request.CreateEmployeeRequest;
import kg.megacom.calendar.repository.EmployeeRepository;
import kg.megacom.calendar.service.AccountsService;
import kg.megacom.calendar.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final AccountsService accountsService;

    @Override
    public EmployeeDto create(CreateEmployeeRequest request) {

        Employee employee = Employee
                .builder()
                .lastName(request.getLastName())
                .firstName(request.getFirstName())
                .email(request.getEmail())
                .msisdn(request.getMsisdn())
                .status(request.getStatus())
                .isActive(true)
                .build();
        Accounts accounts = Accounts
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
        return null;
    }

    @Override
    public EmployeeDto delete(Long id) {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }
}

package kg.megacom.calendar.service;

import kg.megacom.calendar.model.dto.OrganizationEmployeeDto;
import kg.megacom.calendar.model.entity.OrganizationEmployee;
import kg.megacom.calendar.model.request.CreateOrganizationEmployeeRequest;
import org.springframework.stereotype.Service;

@Service
public interface OrganizationEmployeeService {

    OrganizationEmployeeDto create(CreateOrganizationEmployeeRequest request);
    OrganizationEmployeeDto findById(Long id);
    void save(OrganizationEmployee organizationEmployee);
}

package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.model.dto.OrganizationEmployeeDto;
import kg.megacom.calendar.model.entity.OrganizationEmployee;
import kg.megacom.calendar.model.request.CreateOrganizationEmployeeRequest;
import kg.megacom.calendar.service.OrganizationEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationEmployeeServiceImpl implements OrganizationEmployeeService {
    @Override
    public OrganizationEmployeeDto create(CreateOrganizationEmployeeRequest request) {
        return null;
    }

    @Override
    public OrganizationEmployeeDto findById(Long id) {
        return null;
    }

    @Override
    public void save(OrganizationEmployee organizationEmployee) {

    }
}

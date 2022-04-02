package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.model.dto.OrganizationDto;
import kg.megacom.calendar.model.entity.Organization;
import kg.megacom.calendar.model.request.CreateOrganizationRequest;
import kg.megacom.calendar.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    @Override
    public OrganizationDto create(CreateOrganizationRequest request) {
        return null;
    }

    @Override
    public OrganizationDto update(OrganizationDto organizationDto) {
        return null;
    }

    @Override
    public OrganizationDto findById(Long id) {
        return null;
    }

    @Override
    public OrganizationDto delete(Long id) {
        return null;
    }

    @Override
    public void save(Organization organization) {

    }
}

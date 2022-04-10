package kg.megacom.calendar.service;

import kg.megacom.calendar.model.dto.OrganizationDto;
import kg.megacom.calendar.model.entity.Organization;
import kg.megacom.calendar.model.request.CreateOrganizationRequest;
import org.springframework.stereotype.Service;

@Service
public interface OrganizationService {
    OrganizationDto create(CreateOrganizationRequest request);
    OrganizationDto update(OrganizationDto organizationDto);
    OrganizationDto findById(Long id);
    OrganizationDto save(OrganizationDto organizationDto);
}

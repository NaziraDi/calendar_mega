package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.mapper.EmployeeMapper;
import kg.megacom.calendar.mapper.OrganizationMapper;
import kg.megacom.calendar.model.dto.EmployeeDto;
import kg.megacom.calendar.model.dto.OrganizationDto;
import kg.megacom.calendar.model.entity.Employee;
import kg.megacom.calendar.model.entity.Organization;
import kg.megacom.calendar.model.request.CreateOrganizationRequest;
import kg.megacom.calendar.repository.OrganizationRepository;
import kg.megacom.calendar.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository organizationRepository;

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

        Organization organization = organizationRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Organization with id" + id + "is not found"));
        return OrganizationMapper.INSTANCE.toDto(organization);
    }

    @Override
    public OrganizationDto save(OrganizationDto organizationDto) {

        OrganizationDto organizationDto1 = OrganizationMapper.INSTANCE.toDto(organizationRepository.save(
                OrganizationMapper.INSTANCE.toEntity(organizationDto)
        ));

        return organizationDto1;
    }


}

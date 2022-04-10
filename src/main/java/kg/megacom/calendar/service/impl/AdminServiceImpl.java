package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.mapper.AdminMapper;
import kg.megacom.calendar.model.dto.AdminDto;
import kg.megacom.calendar.model.entity.Admin;
import kg.megacom.calendar.model.request.CreateAdminRequest;
import kg.megacom.calendar.repository.AdminRepository;
import kg.megacom.calendar.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    @Override
    public AdminDto create(CreateAdminRequest request) {
        return null;
    }

    @Override
    public AdminDto findById(Long id) {
        Admin admin = adminRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Admin with id" + id + "is not found"));
        return AdminMapper.INSTANCE.toDto(admin);
    }

    @Override
    public AdminDto save(AdminDto adminDto) {
        AdminDto adminDto1 = AdminMapper.INSTANCE.toDto(adminRepository.save(
                AdminMapper.INSTANCE.toEntity(adminDto)
        ));
        return adminDto1;
    }
}

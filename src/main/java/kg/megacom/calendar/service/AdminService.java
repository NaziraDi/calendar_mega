package kg.megacom.calendar.service;

import kg.megacom.calendar.model.dto.AdminDto;
import kg.megacom.calendar.model.entity.Admin;
import kg.megacom.calendar.model.request.CreateAdminRequest;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    AdminDto create(CreateAdminRequest request);
    AdminDto findById(Long id);
    AdminDto save(AdminDto adminDto);
}

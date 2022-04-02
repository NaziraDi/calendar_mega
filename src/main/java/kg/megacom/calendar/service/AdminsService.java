package kg.megacom.calendar.service;

import kg.megacom.calendar.model.dto.AdminsDto;
import kg.megacom.calendar.model.entity.Admins;
import kg.megacom.calendar.model.request.CreateAdminsRequest;
import org.springframework.stereotype.Service;

@Service
public interface AdminsService {

    AdminsDto create(CreateAdminsRequest request);
    AdminsDto findById(Long id);
    AdminsDto delete(Long id);
    void save(Admins admins);
}

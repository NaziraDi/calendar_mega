package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.model.dto.AdminsDto;
import kg.megacom.calendar.model.entity.Admins;
import kg.megacom.calendar.model.request.CreateAdminsRequest;
import kg.megacom.calendar.service.AdminsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminsServiceImpl implements AdminsService {
    @Override
    public AdminsDto create(CreateAdminsRequest request) {
        return null;
    }

    @Override
    public AdminsDto findById(Long id) {
        return null;
    }

    @Override
    public AdminsDto delete(Long id) {
        return null;
    }

    @Override
    public void save(Admins admins) {

    }
}

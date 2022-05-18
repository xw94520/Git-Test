package com.wxw.springbootormjpa.service.serviceImp;

import com.wxw.springbootormjpa.domain.Guest;
import com.wxw.springbootormjpa.repository.GuestRepository;
import com.wxw.springbootormjpa.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImp implements GuestService {
    @Autowired
    private GuestRepository guestRepository;
    @Override
    public List<Guest> getGuests() {
        return guestRepository.findAll();
    }
}

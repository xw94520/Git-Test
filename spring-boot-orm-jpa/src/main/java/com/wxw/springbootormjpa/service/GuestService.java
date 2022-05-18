package com.wxw.springbootormjpa.service;

import com.wxw.springbootormjpa.domain.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> getGuests();
}

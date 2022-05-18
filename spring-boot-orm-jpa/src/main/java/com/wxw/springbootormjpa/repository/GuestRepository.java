package com.wxw.springbootormjpa.repository;

import com.wxw.springbootormjpa.domain.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  GuestRepository extends JpaRepository<Guest,Long> {

}

package com.lgcns.swainno.jpa.web.ordermng.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgcns.swainno.jpa.web.ordermng.entity.Order;

public interface OrderMngRepository extends JpaRepository<Order, Long>{

}

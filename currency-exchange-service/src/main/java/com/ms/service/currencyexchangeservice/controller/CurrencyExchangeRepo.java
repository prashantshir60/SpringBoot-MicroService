package com.ms.service.currencyexchangeservice.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CurrencyExchangeRepo extends JpaRepository<CurrencyExchange,Long> {
    public CurrencyExchange findByFromAndTo(String from, String to);
}

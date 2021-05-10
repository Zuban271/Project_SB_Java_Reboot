// Сервис-слой приложения (протокол проверки)
package com.myproject.cybersec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProtocolService implements IProtocolService
{
    @Autowired
    private ProtocolRepository repository;

    @Override
    public List<Protocol> findAll() {

        return (List<Protocol>) repository.findAll();
    }
    @Override
    public Protocol findProtocolById(Integer id){
        return repository.findProtocolById(id);
    }
}

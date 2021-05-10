// Сервис-слой приложения (ТМ-идентификаторов)
package com.myproject.cybersec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TM_identifireService implements ITM_identifireService {
    @Autowired
    private TM_identifireRepository repository;

    @Override
    public List<TM_identifire> findAll() {

        return (List<TM_identifire>) repository.findAll();
    }
    @Override
    public TM_identifire findTM_identifireById(Integer id){
        return repository.findTM_identifireById(id);
    }

}

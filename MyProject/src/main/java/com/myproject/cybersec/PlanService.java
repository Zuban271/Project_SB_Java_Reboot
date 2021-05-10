// Сервис-слой приложения (план проверки)
package com.myproject.cybersec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService implements IPlanService{
    @Autowired
    private PlanRepository repository;

    @Override
    public List<Plan> findAll() {

        return (List<Plan>) repository.findAll();
    }
    @Override
    public Plan findPlantById(Integer Id){
        return repository.findPlanById(Id);
    }
}

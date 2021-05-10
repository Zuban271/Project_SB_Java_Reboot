// Репозитарий для объекта план
package com.myproject.cybersec;

import org.springframework.data.repository.CrudRepository;

public interface PlanRepository extends CrudRepository<Plan, Integer> {

    Plan findPlanById(Integer id);
}

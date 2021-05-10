// Репозитарий для объекта  ТМ-идентификаторов
package com.myproject.cybersec;

import org.springframework.data.repository.CrudRepository;


public interface TM_identifireRepository extends CrudRepository<TM_identifire, Integer> {

    TM_identifire findTM_identifireById(Integer id);
}


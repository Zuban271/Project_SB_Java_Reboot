// Репозитарий для объекта акт
package com.myproject.cybersec;

import org.springframework.data.repository.CrudRepository;

public interface ActRepository extends CrudRepository<Act, Integer> {

    Act findActById(Integer id);

}

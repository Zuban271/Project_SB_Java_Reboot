// Репозитарий для Приложения без нарушений к актам проверок
package com.myproject.cybersec;

import org.springframework.data.repository.CrudRepository;

public interface AppendixwithoutviolationRepository extends CrudRepository<AppendixWithoutViolation, Integer> {
    AppendixWithoutViolation findAppendixwithoutviolationById(Integer id);
}

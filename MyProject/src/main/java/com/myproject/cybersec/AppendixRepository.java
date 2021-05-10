// Репозитарий для Приложения с нарушениями к актам проверок
package com.myproject.cybersec;

import org.springframework.data.repository.CrudRepository;

public interface AppendixRepository extends CrudRepository<Appendix, Integer> {
    Appendix findAppendixById(Integer id);
}

// Репозитарий для объекта протокол
package com.myproject.cybersec;

import org.springframework.data.repository.CrudRepository;

public interface ProtocolRepository extends CrudRepository<Protocol, Integer> {

    Protocol findProtocolById(Integer id);
}

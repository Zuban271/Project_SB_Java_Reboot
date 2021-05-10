// Интерфейс для сервисных методов приложения (протокола)
package com.myproject.cybersec;

import java.util.List;

public interface IProtocolService {
    List<Protocol> findAll();

    Protocol findProtocolById(Integer id);
}

// Интерфейс для сервисных методов приложения (ТМ-идентификаторов)
package com.myproject.cybersec;

import java.util.List;

public interface ITM_identifireService {
        List<TM_identifire> findAll();
        TM_identifire findTM_identifireById(Integer id);

}


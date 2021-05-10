// Интерфейс для сервисных методов приложения (плана проверок)
package com.myproject.cybersec;

import java.util.List;

public interface IPlanService {
    List<Plan> findAll();
    Plan findPlantById(Integer Id);
}

// Интерфейс для сервисных методов приложения (акты, приложения к ним)
package com.myproject.cybersec;

import java.util.List;

public interface IActService {
    List<Act> findAll();
    Act findActById(Integer Id);
    List<Appendix> findAllAppendix();
    Appendix findAppendixById(Integer Id);
    List<AppendixWithoutViolation> findAllAppendixwithout();
    AppendixWithoutViolation findAppendixwithoutById(Integer Id);
}

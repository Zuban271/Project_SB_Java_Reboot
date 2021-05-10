// Сервис-слой приложения (акт и приложения к нему)
package com.myproject.cybersec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActService implements IActService
{
    @Autowired
    private ActRepository repository;

    @Autowired
    private AppendixRepository repositoryAppendix;

    @Autowired
    private AppendixwithoutviolationRepository appendixwithoutviolationRepository;

    @Override
    public List<Act> findAll() {

        return (List<Act>) repository.findAll();
    }

    @Override
    public List<Appendix> findAllAppendix() {

        return (List<Appendix>) repositoryAppendix.findAll();
    }

    @Override
    public Act findActById(Integer Id){
        return repository.findActById(Id);
    }

    @Override
    public Appendix findAppendixById(Integer Id){
        return repositoryAppendix.findAppendixById(Id);
    }

    @Override
    public List<AppendixWithoutViolation> findAllAppendixwithout() {

        return (List<AppendixWithoutViolation>) appendixwithoutviolationRepository.findAll();
    }

    @Override
    public AppendixWithoutViolation findAppendixwithoutById(Integer Id){
        return appendixwithoutviolationRepository.findAppendixwithoutviolationById(Id);
    }
}
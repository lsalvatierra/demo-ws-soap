package com.la.demo_ws_soap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.la.demo_ws_soap.model.Domicilio;
import com.la.demo_ws_soap.repository.DomicilioRepository;
import java.util.List;

@Service
public class DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public List<Domicilio> obtenerDomicilios(){
        return domicilioRepository.findAll();
    }

    public Domicilio obtenerDomicilioXId(Integer id){
        return domicilioRepository.findById(id).orElse(null);
    }


    public Domicilio guardarDomicilio(Domicilio domicilio){
        return domicilioRepository.save(domicilio);
    }



}

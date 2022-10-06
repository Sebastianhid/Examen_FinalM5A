
 
package com.m5a.SebastianHid.service;

import com.m5a.SebastianHid.model.Profesor;
import com.m5a.SebastianHid.repository.ProfesorRepository;
import com.m5a.SebastianHid.repository.deptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor, Long> implements ProfesorService {

    @Autowired
    ProfesorRepository profesorRepository;

    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return profesorRepository;
    }
    
}

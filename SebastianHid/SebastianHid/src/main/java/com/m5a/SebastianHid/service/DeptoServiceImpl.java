
 
package com.m5a.SebastianHid.service;


import com.m5a.SebastianHid.model.Depto;
import com.m5a.SebastianHid.repository.deptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class DeptoServiceImpl extends GenericServiceImpl<Depto, Long> implements DeptoService {

    @Autowired
    deptoRepository deptoRepository;

    @Override
    public CrudRepository<Depto, Long> getDao() {
        return deptoRepository;
    }
    
}

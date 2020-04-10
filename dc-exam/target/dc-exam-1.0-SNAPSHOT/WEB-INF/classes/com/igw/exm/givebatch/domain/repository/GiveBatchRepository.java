package com.igw.exm.givebatch.domain.repository;


import com.igw.exm.givebatch.infrastructure.dao.GiveBatchDAO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class GiveBatchRepository {

    @Resource
    private GiveBatchDAO giveBatchDAO;


    public int save(){
        return giveBatchDAO.get();
    }


}

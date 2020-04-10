package com.igw.exm.givebatch.application;


import com.igw.exm.givebatch.domain.repository.GiveBatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;



/**
 * 交收批次 application
 *
 * @date: 2019-12-07 21:00
 */
@Service
public class GiveBatchApplication {


    @Resource
    private GiveBatchRepository giveBatchRepository;

    public int get(){return giveBatchRepository.save();}


}

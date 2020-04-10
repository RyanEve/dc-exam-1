package com.igw.exm.givebatch.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface GiveBatchDAO {
    int get();
}

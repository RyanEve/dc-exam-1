package com.igw.exm.givebatch.controller;

import com.igw.exm.givebatch.application.GiveBatchApplication;
import com.igw.exm.givebatch.domain.repository.GiveBatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/admin/givebatch")
public class TestController {
    @Autowired
    private GiveBatchRepository gi;
    @Autowired
    private GiveBatchApplication giveBatchApplication;

    @GetMapping(value = "/test.do")
    public int saveGiveBatch(){
        return giveBatchApplication.get();
    }

}

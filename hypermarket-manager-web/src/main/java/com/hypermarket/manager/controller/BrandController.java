package com.hypermarket.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hypermarket.pojo.TbBrand;
import com.hypermarket.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }
}

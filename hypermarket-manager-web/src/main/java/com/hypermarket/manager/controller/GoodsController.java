package com.hypermarket.manager.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.hypermarket.entity.PageResult;
import com.hypermarket.entity.Result;
import com.hypermarket.pojo.TbGoods;
import com.hypermarket.sellergoods.service.GoodsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Reference
    private GoodsService goodsService;

    @RequestMapping("/findAll")
    public List<TbGoods> findAll(){
        return goodsService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int page,int rows){
        return goodsService.findPage(page,rows);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody TbGoods goods){
        try {
            goodsService.add(goods);
            return new Result(true,"增加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    @RequestMapping("/findOne")
    public TbGoods findOne(Long id){
        return goodsService.findOne(id);
    }

    @RequestMapping("/update")
    public Result update(@RequestBody TbGoods goods){
        try {
            goodsService.update(goods);
            return new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @RequestMapping("/delete")
    public Result delete(@RequestBody List<Long> ids){
        try {
            goodsService.delete(ids);
            return new Result(true,"品牌删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"品牌删除失败");
        }
    }

    @RequestMapping("/search")
    public PageResult search(@RequestBody TbGoods goods,int page,int size){
        return goodsService.getAllPage(goods, page, size);
    }

}

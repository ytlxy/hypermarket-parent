package com.hypermarket.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hypermarket.entity.PageResult;
import com.hypermarket.entity.Result;
import com.hypermarket.pojo.TbItemCat;
import com.hypermarket.sellergoods.service.ItemCatService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/itemCat")
public class ItemCatController {

    @Reference
    private ItemCatService itemCatService;

    @RequestMapping("/findAll")
    public List<TbItemCat> findAll(){
        return itemCatService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int page,int size){
        return itemCatService.findPage(page,size);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody TbItemCat itemCat){
        try{
            itemCatService.add(itemCat);
            return new Result(true,"增加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    @RequestMapping("/update")
    public Result update(@RequestBody TbItemCat itemCat){
        try{
            itemCatService.update(itemCat);
            return new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @RequestMapping("/findOne")
    public TbItemCat findOne(Long id){
        return itemCatService.findOne(id);
    }

    @RequestMapping("/delete")
    public Result delete(List<Long> ids){
        try{
            itemCatService.delete(ids);
            return new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @RequestMapping("/search")
    public PageResult search(TbItemCat itemCat,int page,int rows){
        return itemCatService.findPage(itemCat,page,rows);
    }
}
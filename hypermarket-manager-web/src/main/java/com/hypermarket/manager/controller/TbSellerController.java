package com.hypermarket.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hypermarket.entity.PageResult;
import com.hypermarket.entity.Result;
import com.hypermarket.pojo.TbSeller;
import com.hypermarket.sellergoods.service.TbSellerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Seller")
public class TbSellerController {
    @Reference
    private TbSellerService tbSellerService;

    @RequestMapping("/findAll")
    public List<TbSeller> findAll(){
        return tbSellerService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int page,int rows){
        return tbSellerService.findPage(page,rows);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody TbSeller tbSeller){
        try {
            tbSellerService.add(tbSeller);
            return new Result(true,"增加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    @RequestMapping("/update")
    public Result update(@RequestBody TbSeller tbSeller){
        try{
            tbSellerService.update(tbSeller);
            return new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @RequestMapping("/findOne")
    public TbSeller findOne(String id){
        return tbSellerService.findOne(id);
    }

    @RequestMapping("/delete")
    public Result delete(List<String> ids){
        try {
            tbSellerService.delete(ids);
            return new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @RequestMapping("/search")
    public PageResult search(@RequestBody TbSeller tbSeller, int page, int size){
        return tbSellerService.findPage(tbSeller,page,size);
    }
}

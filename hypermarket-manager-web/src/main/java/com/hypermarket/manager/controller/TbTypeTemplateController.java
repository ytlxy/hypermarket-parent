package com.hypermarket.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hypermarket.entity.PageResult;
import com.hypermarket.entity.Result;
import com.hypermarket.pojo.TbTypeTemplate;
import com.hypermarket.sellergoods.service.TbTypeTemplateService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/typeTemplate")
public class TbTypeTemplateController {

    @Reference
    private TbTypeTemplateService typeTemplateService;

    //返回全部列表
    @RequestMapping("/findAll")
    public List<TbTypeTemplate> findAll(){
        return typeTemplateService.findAll();
    }

    //分页
    @RequestMapping("/findPage")
    public PageResult findPage(int page,int rows){
        return typeTemplateService.findPage(page, rows);
    }

    //增加
    @RequestMapping("/add")
    public Result add(@RequestBody TbTypeTemplate typeTemplate){
        try {
            typeTemplateService.add(typeTemplate);
            return new Result(true,"增加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    //修改
    public Result update(@RequestBody TbTypeTemplate typeTemplate){
        try{
            typeTemplateService.update(typeTemplate);
            return new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    //获取实体
    @RequestMapping("/findOne")
    public TbTypeTemplate findOne(Long id){
        return typeTemplateService.findOne(id);
    }

    //删除
    @RequestMapping("/detele")
    public Result detele(@RequestBody List<Long> ids){
        try{
            typeTemplateService.delete(ids);
            return new Result(true,"删除失败");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    //查询+分页
    @RequestMapping("/search")
    public PageResult search(TbTypeTemplate typeTemplate,int page,int rows){
        return typeTemplateService.findPage(typeTemplate, page, rows);
    }
}

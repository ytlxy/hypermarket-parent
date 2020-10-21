package com.hypermarket.sellergoods.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hypermarket.entity.PageResult;
import com.hypermarket.mapper.TbSellerMapper;
import com.hypermarket.pojo.TbSeller;
import com.hypermarket.pojo.TbSellerExample;
import com.hypermarket.sellergoods.service.TbSellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TbSellerServiceImpl implements TbSellerService {

    @Autowired
    private TbSellerMapper tbSellerMapper;

    @Override
    public List<TbSeller> findAll() {
        return tbSellerMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<TbSeller> page=(Page<TbSeller>) tbSellerMapper.selectByExample(null);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void add(TbSeller tbSeller) {
        tbSellerMapper.insert(tbSeller);
    }

    @Override
    public void update(TbSeller tbSeller) {
        tbSellerMapper.updateByPrimaryKey(tbSeller);
    }

    @Override
    public TbSeller findOne(String  id) {
        return tbSellerMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(List<String> ids) {
        for (String id:ids){
            tbSellerMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbSeller seller, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        TbSellerExample example=new TbSellerExample();
        TbSellerExample.Criteria criteria=example.createCriteria();
        if (seller != null){
            if (seller.getSellerId()!=null && seller.getSellerId().length()>0){
                criteria.andSellerIdLike("%"+seller.getSellerId()+"%");
            }
            if (seller.getName()!=null && seller.getName().length()>0){
                criteria.andNameLike("%"+seller.getName()+"%");
            }
            if (seller.getNickName()!=null && seller.getNickName().length()>0){
                criteria.andNickNameLike("%"+seller.getNickName()+"%");
            }
            if (seller.getPassword()!=null && seller.getPassword().length()>0){
                criteria.andPasswordLike("%"+seller.getPassword()+"%");
            }
            if (seller.getEmail()!=null && seller.getEmail().length()>0){
                criteria.andEmailLike("%"+seller.getEmail()+"%");
            }
            if (seller.getMobile()!=null && seller.getMobile().length()>0){
                criteria.andMobileLike("%"+seller.getMobile()+"%");
            }
            if (seller.getTelephone()!=null && seller.getTelephone().length()>0){
                criteria.andTelephoneLike("%"+seller.getTelephone()+"%");
            }
            if (seller.getStatus()!=null && seller.getStatus().length()>0){
                criteria.andStatusLike("%"+seller.getStatus()+"%");
            }
            if (seller.getAddressDetail()!=null && seller.getAddressDetail().length()>0){
                criteria.andAddressDetailLike("%"+seller.getAddressDetail()+"%");
            }
            if (seller.getLinkmanName()!=null && seller.getLinkmanName().length()>0){
                criteria.andLinkmanNameLike("%"+seller.getLinkmanName()+"%");
            }
            if (seller.getLinkmanQq()!=null && seller.getLinkmanQq().length()>0){
                criteria.andLinkmanQqLike("%"+seller.getLinkmanQq()+"%");
            }
            if (seller.getLinkmanMobile()!=null && seller.getLinkmanMobile().length()>0){
                criteria.andLinkmanMobileLike("%"+seller.getLinkmanMobile()+"%");
            }
            if (seller.getLinkmanEmail()!=null && seller.getLinkmanEmail().length()>0){
                criteria.andLinkmanEmailLike("%"+seller.getLinkmanEmail()+"%");
            }
            if (seller.getLicenseNumber()!=null && seller.getLicenseNumber().length()>0){
                criteria.andLicenseNumberLike("%"+seller.getLicenseNumber()+"%");
            }
            if (seller.getLogoPic()!=null && seller.getLogoPic().length()>0){
                criteria.andLogoPicLike("%"+seller.getLogoPic()+"%");
            }
            if (seller.getBrief()!=null && seller.getBrief().length()>0){
                criteria.andBriefLike("%"+seller.getBrief()+"%");
            }
            if (seller.getLegalPerson()!=null && seller.getLegalPerson().length()>0){
                criteria.andLegalPersonLike("%"+seller.getLegalPerson()+"%");
            }
            if (seller.getLegalPersonCardId()!=null && seller.getLegalPersonCardId().length()>0){
                criteria.andLegalPersonCardIdLike("%"+seller.getLegalPersonCardId()+"%");
            }
            if (seller.getBankUser()!=null && seller.getBankUser().length()>0){
                criteria.andBankUserLike("%"+seller.getBankUser()+"%");
            }
            if (seller.getBankName()!=null && seller.getBankName().length()>0){
                criteria.andBankNameLike("%"+seller.getBankName()+"%");
            }
        }
        Page<TbSeller> page=(Page<TbSeller>) tbSellerMapper.selectByExample(example);
        return new PageResult(page.getTotal(),page.getResult());
    }
}

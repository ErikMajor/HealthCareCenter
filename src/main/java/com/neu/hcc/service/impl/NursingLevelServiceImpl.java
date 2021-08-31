package com.neu.hcc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hcc.controller.NursingLevelController;
import com.neu.hcc.mapper.NursingContentMapper;
import com.neu.hcc.mapper.NursingLevelMapper;
import com.neu.hcc.model.NursingLevel;
import com.neu.hcc.service.NursingLevelService;
import com.neu.hcc.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: amazarashi
 * @Description:
 * @Date: 2021/8/29 12:32
 */
@Service
public class NursingLevelServiceImpl implements NursingLevelService {

    @Autowired
    private NursingLevelMapper nursingLevelMapper;
    
    @Override
    public NursingLevel selById(Integer id) {
        return nursingLevelMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<NursingLevel> selAll() {
        return nursingLevelMapper.selectAll();
    }

    /**
    * @Author: amazarashi
    * @Description: 分页查询
    * @Params: [currPage]
    * @Return com.github.pagehelper.PageInfo<com.neu.hcc.model.NursingLevel>
    */
    @Override
    public PageInfo<NursingLevel> queryAll(NursingLevel nursingLevel,Integer currPage) {
        if (currPage == null)
            currPage = 1;
        PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);
        PageInfo<NursingLevel> pageInfo = new PageInfo<>(nursingLevelMapper.selectAllByCondition(nursingLevel));
        return pageInfo;
    }

    @Override
    public void del(Integer id) {
        nursingLevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(NursingLevel nursingLevel) {
        nursingLevel.setCreateBy("1");
        nursingLevel.setCreateDate(new Date());
        nursingLevel.setUpdateBy("1");
        nursingLevel.setUpdateDate(new Date());
        nursingLevelMapper.insert(nursingLevel);
    }

    @Override
    public void update(NursingLevel nursingLevel) {
        nursingLevel.setUpdateDate(new Date());
        nursingLevelMapper.updateByPrimaryKey(nursingLevel);
    }

}

package com.neu.hcc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hcc.mapper.NursingContentMapper;
import com.neu.hcc.model.NursingContent;
import com.neu.hcc.model.NursingLevel;
import com.neu.hcc.service.NursingContentService;
import com.neu.hcc.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: amazarashi
 * @Description:
 * @Date: 2021/8/31 10:10
 */
@Service
public class NursingContentServiceImpl implements NursingContentService {

    @Autowired
    private NursingContentMapper nursingContentMapper;

    @Override
    public NursingContent selById(Integer id) {
        return nursingContentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<NursingContent> selAll() {
        return nursingContentMapper.selectAll();
    }

    @Override
    public PageInfo<NursingContent> queryAll(NursingContent nursingContent, Integer currPage) {
        if (currPage == null)
            currPage = 1;
        PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);
        PageInfo<NursingContent> pageInfo = new PageInfo<>(nursingContentMapper.selectAllByCondition(nursingContent));
        return pageInfo;
    }

    @Override
    public void del(Integer id) {
        nursingContentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(NursingContent nursingContent) {
        nursingContent.setCreateBy("1");
        nursingContent.setCreateDate(new Date());
        nursingContent.setUpdateBy("1");
        nursingContent.setUpdateDate(new Date());
        nursingContentMapper.insert(nursingContent);
    }

    @Override
    public void update(NursingContent nursingContent) {
        nursingContent.setUpdateDate(new Date());
        nursingContentMapper.updateByPrimaryKey(nursingContent);
    }
}

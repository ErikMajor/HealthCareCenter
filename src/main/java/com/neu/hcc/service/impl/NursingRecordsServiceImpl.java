package com.neu.hcc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hcc.mapper.NursingRecordsMapper;
import com.neu.hcc.model.NursingRecords;
import com.neu.hcc.service.NursingRecordsService;
import com.neu.hcc.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: amazarashi
 * @Description:
 * @Date: 2021/9/2 9:09
 */
@Service
public class NursingRecordsServiceImpl implements NursingRecordsService {

    @Autowired
    private NursingRecordsMapper nursingRecordsMapper;

    @Override
    public NursingRecords selById(Integer id) {
        return nursingRecordsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<NursingRecords> selAll() {
        return nursingRecordsMapper.selectAll();
    }

    /**
     * @Author: amazarashi
     * @Description: 分页查询
     * @Params: [currPage]
     * @Return com.github.pagehelper.PageInfo<com.neu.hcc.model.NursingRecords>
     */
    @Override
    public PageInfo<NursingRecords> queryAll(NursingRecords nursingRecords, Integer currPage) {
        if (currPage == null)
            currPage = 1;
        PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);
        PageInfo<NursingRecords> pageInfo = new PageInfo<>(nursingRecordsMapper.selectAllByCondition(nursingRecords));
        return pageInfo;
    }

    @Override
    public void del(Integer id) {
        nursingRecordsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(NursingRecords nursingRecords) {
        nursingRecords.setCreateBy("1");
        nursingRecords.setCreateDate(new Date());
        nursingRecords.setUpdateBy("1");
        nursingRecords.setUpdateDate(new Date());
        nursingRecordsMapper.insert(nursingRecords);
    }

    @Override
    public void update(NursingRecords nursingRecords) {
        nursingRecords.setUpdateDate(new Date());
        nursingRecordsMapper.updateByPrimaryKey(nursingRecords);
    }
}

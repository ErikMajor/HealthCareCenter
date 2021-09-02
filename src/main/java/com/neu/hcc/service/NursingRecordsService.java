package com.neu.hcc.service;

import com.github.pagehelper.PageInfo;
import com.neu.hcc.model.NursingRecords;

import java.util.List;

/**
 * @Author: amazarashi
 * @Description:
 * @Date: 2021/9/2 9:08
 */
public interface NursingRecordsService {

    NursingRecords selById(Integer id);

    List<NursingRecords> selAll();

    PageInfo<NursingRecords> queryAll(NursingRecords nursingRecords, Integer currPage);

    void del(Integer id);

    void add(NursingRecords nursingRecords);

    void update(NursingRecords nursingRecords);
}

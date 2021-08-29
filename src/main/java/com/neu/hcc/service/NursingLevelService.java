package com.neu.hcc.service;

import com.github.pagehelper.PageInfo;
import com.neu.hcc.model.NursingLevel;

import java.util.List;
import java.util.logging.Level;

/**
 * @Author: amazarashi
 * @Description: 护理等级
 * @Date: 2021/8/29 12:31
 */
public interface NursingLevelService {

    NursingLevel selById(Integer id);

    List<NursingLevel> selAll();

    PageInfo<NursingLevel> queryAll(NursingLevel nursingLevel,Integer currPage);

    void del(Integer id);

    void add(NursingLevel nursingLevel);

    void update(NursingLevel nursingLevel);
}

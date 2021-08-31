package com.neu.hcc.service;

import com.github.pagehelper.PageInfo;
import com.neu.hcc.model.NursingContent;
import com.neu.hcc.model.NursingLevel;

import java.util.List;

/**
 * @Author: amazarashi
 * @Description:
 * @Date: 2021/8/31 10:10
 */
public interface NursingContentService {

    NursingContent selById(Integer id);

    List<NursingContent> selAll();

    PageInfo<NursingContent> queryAll(NursingContent nursingContent, Integer currPage);

    void del(Integer id);

    void add(NursingContent nursingContent);

    void update(NursingContent nursingContent);
}

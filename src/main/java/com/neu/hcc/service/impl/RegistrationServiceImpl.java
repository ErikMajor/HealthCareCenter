package com.neu.hcc.service.impl;

import com.neu.hcc.mapper.OutRegistrationMapper;
import com.neu.hcc.model.OutRegistration;
import com.neu.hcc.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: YuCong
 * @date: 2021.8.29
 * @description: 登记service实现类
 */
@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private OutRegistrationMapper mapper;

    @Override
    public OutRegistration selByIdRecent(Integer id) {
        return mapper.selectByPrimaryKeyRecent(id);
    }

    @Override
    public int update(OutRegistration outRegistration) {
        return mapper.updateByPrimaryKey(outRegistration);
    }

    @Override
    public int delete(Integer id) {
        return mapper.updateDel_flag(id);
    }
}

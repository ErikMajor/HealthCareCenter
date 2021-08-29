package com.neu.hcc.service.impl;

import com.neu.hcc.mapper.CheckinMapper;
import com.neu.hcc.model.Checkin;
import com.neu.hcc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImpl implements CustomerService {

    @Autowired
    private CheckinMapper checkinMapper;

    @Override
    public List<Checkin> selectAll() {
        return checkinMapper.selectAll();
    }
}

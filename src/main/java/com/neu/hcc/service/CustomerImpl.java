package com.neu.hcc.service;

import com.neu.hcc.mapper.CheckinMapper;
import com.neu.hcc.mapper.MealCalendarMapper;
import com.neu.hcc.model.Checkin;
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

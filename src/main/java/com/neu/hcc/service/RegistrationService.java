package com.neu.hcc.service;

import com.neu.hcc.model.OutRegistration;
import org.springframework.stereotype.Service;

/**
 * @author: YuCong
 * @date: 2021.8.29
 * @description: 登记service接口
 */
@Service
public interface RegistrationService {

    /**
     * 查找客户最近的外出记录（未归）
     *
     * @param id 客户
     * @return 返回外出记录信息
     */
    OutRegistration selByIdRecent(Integer id);

    /**
     * 登记外出/返回
     *
     * @param outRegistration
     * @return
     */
    int update(OutRegistration outRegistration);

    /**
     * 逻辑删除外出记录
     *
     * @param id
     * @return
     */
    int delete(Integer id);

}

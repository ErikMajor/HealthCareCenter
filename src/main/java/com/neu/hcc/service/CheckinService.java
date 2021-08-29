package com.neu.hcc.service;

import com.neu.hcc.model.Checkin;

import java.util.List;

/**
 * @author: YuCong
 * @date: 2021.8.29
 * @description: 入住service接口
 */

public interface CheckinService {
    /**
     * 根据name模糊查找入住客户信息
     * @param name 模糊查找参数
     * @return 返回入住客户类
     */
    List<Checkin> selByName(String name);
}

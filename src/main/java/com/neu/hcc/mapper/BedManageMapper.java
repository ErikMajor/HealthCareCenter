package com.neu.hcc.mapper;

import com.neu.hcc.model.BedManage;
import java.util.List;

public interface BedManageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BedManage record);

    BedManage selectByPrimaryKey(Integer id);

    List<BedManage> selectAll();

    int updateByPrimaryKey(BedManage record);
}
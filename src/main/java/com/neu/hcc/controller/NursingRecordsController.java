package com.neu.hcc.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hcc.model.NursingRecords;
import com.neu.hcc.service.NursingRecordsService;
import com.neu.hcc.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: amazarashi
 * @Description:
 * @Date: 2021/9/2 9:58
 */
@RestController
@RequestMapping("/nursingRecords")
public class NursingRecordsController {

    @Resource
    private NursingRecordsService nursingRecordsService;

    /**
     * @Author: amazarashi
     * @Description: 根据Id查询一个护理等级
     * @Params: [id]
     * @Return com.neu.hcc.model.NursingRecords
     */
    @RequestMapping("selById/{id}")
    private NursingRecords selById(@PathVariable Integer id){
        return nursingRecordsService.selById(id);
    }

    /**
     * @Author: amazarashi
     * @Description: 查询所有护理等级
     * @Params:
     * @Return
     */
    @RequestMapping("selAll")
    public List<NursingRecords> selAll(){
        return nursingRecordsService.selAll();
    }

    @RequestMapping("queryAll/{currPage}")
    public PageInfo<NursingRecords> queryAll(@RequestBody NursingRecords nursingRecords, @PathVariable Integer currPage){
        return nursingRecordsService.queryAll(nursingRecords,currPage);
    }

    @RequestMapping("update")
    public ResultVO<NursingRecords> update(@RequestBody NursingRecords nursingRecords){
        nursingRecordsService.update(nursingRecords);
        return new ResultVO<>(200,"修改成功");
    }

    @RequestMapping("add")
    public ResultVO<NursingRecords> add(@RequestBody NursingRecords nursingRecords){
        nursingRecordsService.add(nursingRecords);
        return new ResultVO<>(200,"添加成功");
    }

    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        nursingRecordsService.del(id);
        return new ResultVO(200,"删除成功");
    }

}

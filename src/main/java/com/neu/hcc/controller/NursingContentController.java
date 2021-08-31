package com.neu.hcc.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hcc.model.NursingContent;
import com.neu.hcc.service.NursingContentService;
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
 * @Date: 2021/8/31 10:10
 */
@RestController
@RequestMapping("/nursingContent")
public class NursingContentController {

    @Resource
    private NursingContentService nursingContentService;

    /**
     * @Author: amazarashi
     * @Description: 根据Id查询一个护理等级
     * @Params: [id]
     * @Return com.neu.hcc.model.NursingContent
     */
    @RequestMapping("selById/{id}")
    private NursingContent selById(@PathVariable Integer id){
        return nursingContentService.selById(id);
    }

    /**
     * @Author: amazarashi
     * @Description: 查询所有护理等级
     * @Params:
     * @Return
     */
    @RequestMapping("selAll")
    public List<NursingContent> selAll(){
        return nursingContentService.selAll();
    }

    @RequestMapping("queryAll/{currPage}")
    public PageInfo<NursingContent> queryAll(@RequestBody NursingContent nursingContent, @PathVariable Integer currPage){
        return nursingContentService.queryAll(nursingContent,currPage);
    }

    @RequestMapping("update")
    public ResultVO<NursingContent> update(@RequestBody NursingContent nursingContent){
        nursingContentService.update(nursingContent);
        return new ResultVO<>(200,"修改成功");
    }

    @RequestMapping("add")
    public ResultVO<NursingContent> add(@RequestBody NursingContent nursingContent){
        nursingContentService.add(nursingContent);
        return new ResultVO<>(200,"添加成功");
    }

    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        nursingContentService.del(id);
        return new ResultVO(200,"删除成功");
    }

}
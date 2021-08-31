package com.neu.hcc.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hcc.model.NursingLevel;
import com.neu.hcc.service.NursingLevelService;
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
 * @Date: 2021/8/29 12:29
 */
@RestController
@RequestMapping("/nursingLevel")
public class NursingLevelController {

    @Resource
    private NursingLevelService nursingLevelService;

    /**
    * @Author: amazarashi
    * @Description: 根据Id查询一个护理等级
    * @Params: [id]
    * @Return com.neu.hcc.model.NursingLevel
    */
    @RequestMapping("selById/{id}")
    private NursingLevel selById( @PathVariable Integer id){
        return nursingLevelService.selById(id);
    }

    /**
    * @Author: amazarashi
    * @Description: 查询所有护理等级
    * @Params:
    * @Return
    */
    @RequestMapping("selAll")
    public List<NursingLevel> selAll(){
        return nursingLevelService.selAll();
    }

    @RequestMapping("queryAll/{currPage}")
    public PageInfo<NursingLevel> queryAll(@RequestBody NursingLevel nursingLevel, @PathVariable Integer currPage){
        return nursingLevelService.queryAll(nursingLevel,currPage);
    }

    @RequestMapping("update")
    public ResultVO<NursingLevel> update(@RequestBody NursingLevel nursingLevel){
        nursingLevelService.update(nursingLevel);
        return new ResultVO<>(200,"修改成功");
    }

    @RequestMapping("add")
    public ResultVO<NursingLevel> add(@RequestBody NursingLevel nursingLevel){
        nursingLevelService.add(nursingLevel);
        return new ResultVO<>(200,"添加成功");
    }

    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        nursingLevelService.del(id);
        return new ResultVO(200,"删除成功");
    }

}

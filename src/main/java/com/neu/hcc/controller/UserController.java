package com.neu.hcc.controller;

import com.neu.hcc.model.NursingLevel;
import com.neu.hcc.model.ServiceConcern;
import com.neu.hcc.model.UserManage;
import com.neu.hcc.service.UserService;
import com.neu.hcc.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/userManage")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("register")
    public String register(@RequestBody UserManage userManage){
        return userService.register(userManage);
    }

    @RequestMapping("login")
    public String login(@RequestBody UserManage userManage){
        return userService.login(userManage);
    }

    @RequestMapping("selectAllByCondition")
    public List<ServiceConcern> selectAllByCondition(@RequestBody ServiceConcern serviceConcern){
        return userService.selectAllByCondition(serviceConcern);
    }

    @RequestMapping("selectAll")
    public List<UserManage> selAll(){
        return userService.selectAll();
    }

    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        userService.del(id);
        return new ResultVO(200,"删除成功");
    }

    @RequestMapping("update")
    public ResultVO<NursingLevel> update(@RequestBody UserManage userManage){
        userService.update(userManage);
        return new ResultVO<>(200,"修改成功");
    }
}

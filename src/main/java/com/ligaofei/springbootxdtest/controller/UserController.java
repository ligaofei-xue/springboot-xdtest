package com.ligaofei.springbootxdtest.controller;


import com.ligaofei.springbootxdtest.model.entity.User;
import com.ligaofei.springbootxdtest.model.request.LoginRequest;
import com.ligaofei.springbootxdtest.service.UserService;
import com.ligaofei.springbootxdtest.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("api/v1/pri/user")
public class UserController {



    @Autowired
    private UserService userService;

    /**
     * 注册接口
     * @param userInfo
     * @return
     */
    @PostMapping("register")
    public JsonData register(@RequestBody Map<String,String> userInfo ){

        int rows = userService.save(userInfo);

        return rows == 1 ? JsonData.buildSuccess(): JsonData.buildError("注册失败，请重试");

    }

    /**
     * 登录接口
     * @param loginRequest 也可以使用register接口中的Map包装，想用哪个用哪个
     * @return
     */
    @PostMapping("login")
    public JsonData login(@RequestBody LoginRequest loginRequest){

        String token = userService.findByPhoneAndPwd(loginRequest.getPhone(), loginRequest.getPwd());

        return token == null ?JsonData.buildError("登录失败，账号密码错误"): JsonData.buildSuccess(token);

    }
    /**
     * 根据用户id查询用户信息
     * @param request
     * @return
     */
    @GetMapping("find_by_token")
    public JsonData findUserInfoByToken(HttpServletRequest request){

        Integer userId = (Integer) request.getAttribute("user_id");//拦截器中设置的user_id

        if(userId == null){
            return JsonData.buildError("查询失败");
        }

        User user =  userService.findByUserId(userId);

        return JsonData.buildSuccess(user);

    }

}

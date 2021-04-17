package com.ligaofei.springbootxdtest.service;

import com.ligaofei.springbootxdtest.model.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserService {

    /**
     * 新增用户
     * @param userInfo
     * @return
     */
    int save(Map<String, String> userInfo);

    String findByPhoneAndPwd(String phone, String pwd);

    User findByUserId(Integer userId);

}

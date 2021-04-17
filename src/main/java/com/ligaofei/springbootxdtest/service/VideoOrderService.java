package com.ligaofei.springbootxdtest.service;

import com.ligaofei.springbootxdtest.model.entity.VideoOrder;

import java.util.List;

public interface VideoOrderService {


    int save(int userId, int videoId);

    List<VideoOrder> listOrderByUserId(Integer userId);
}

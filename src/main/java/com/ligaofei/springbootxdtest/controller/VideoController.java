package com.ligaofei.springbootxdtest.controller;

import com.ligaofei.springbootxdtest.model.entity.Video;
import com.ligaofei.springbootxdtest.model.entity.VideoBanner;
import com.ligaofei.springbootxdtest.service.VideoService;
import com.ligaofei.springbootxdtest.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/pub/video")
public class VideoController {


    @Autowired
    private VideoService videoService;

    /**
     * 轮播图列表
     * @return
     */
    @GetMapping("list_banner")
    public JsonData indexBanner(){
        List<VideoBanner> bannerList =  videoService.listBanner();
        return JsonData.buildSuccess(bannerList);
    }
    /**
     * 视频列表
     * @return
     */
    @RequestMapping("list")
    public JsonData listVideo(){

//        int i=1/0;//模拟自定义异常
        List<Video> videoList = videoService.listVideo();
        return JsonData.buildSuccess(videoList);
    }

    /**
     * 查询视频详情，包含章，集信息
     * @param videoId
     * @return
     */
    @GetMapping("find_detail_by_id")
    public JsonData findDetailById(@RequestParam(value = "video_id",required = true)int videoId){

        Video video = videoService.findDetailById(videoId);
        return JsonData.buildSuccess(video);

    }
}

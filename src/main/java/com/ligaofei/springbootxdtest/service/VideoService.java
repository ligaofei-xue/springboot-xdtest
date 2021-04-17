package com.ligaofei.springbootxdtest.service;


import com.ligaofei.springbootxdtest.model.entity.Video;
import com.ligaofei.springbootxdtest.model.entity.VideoBanner;

import java.util.List;

public interface VideoService {

    List<Video> listVideo();

    List<VideoBanner> listBanner();

    Video findDetailById(int videoId);
}

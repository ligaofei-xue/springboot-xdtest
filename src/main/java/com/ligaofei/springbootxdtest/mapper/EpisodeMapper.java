package com.ligaofei.springbootxdtest.mapper;

import com.ligaofei.springbootxdtest.model.entity.Episode;
import org.apache.ibatis.annotations.Param;

public interface EpisodeMapper {


    Episode findFirstEpisodeByVideoId(@Param("video_id") int videoId);

}

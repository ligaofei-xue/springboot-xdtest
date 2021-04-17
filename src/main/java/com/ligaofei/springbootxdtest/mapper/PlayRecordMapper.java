package com.ligaofei.springbootxdtest.mapper;


import com.ligaofei.springbootxdtest.model.entity.PlayRecord;
import org.apache.ibatis.annotations.Param;

public interface PlayRecordMapper {


    int saveRecord(PlayRecord playRecord);

}

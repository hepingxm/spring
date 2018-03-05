package com.xmtcyx.miniapi.mapper;

import com.xmtcyx.miniapi.model.Usr;

public interface UsrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Usr record);

    int insertSelective(Usr record);

    Usr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Usr record);

    int updateByPrimaryKey(Usr record);
}
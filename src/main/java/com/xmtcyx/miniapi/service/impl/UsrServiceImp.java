package com.xmtcyx.miniapi.service.impl;

import com.xmtcyx.miniapi.mapper.UsrMapper;
import com.xmtcyx.miniapi.model.Usr;
import com.xmtcyx.miniapi.service.UsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 添加用户服务
 * ____   ___.        ________       ___            ___      ._______
 * |   |  |   |     /    ____  ）    /    \        /    \    |  .__    \
 * |   |__|   |     |   | _/  /      |     \      /     |    |  |  \    \
 * |    __    |     |   |___/        |   |\ \    / /|   |    |  |   )    )
 * |   |  |   |     |   |            |   | \ \__/ / |   |    |  |__/    /
 * |___|  |___|     |___|            |___|  \____/  |___|    |._______/
 *
 * @author hp
 * @create 2018-03-05 16:05
 **/
@Service("usrService")
public class UsrServiceImp implements UsrService {

    @Autowired
    UsrMapper usrMapper;

    @Override
    public int addUser(Usr usr) {
        return usrMapper.insert(usr);
    }
}

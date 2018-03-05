package com.xmtcyx.miniapi.controller;

import com.xmtcyx.miniapi.model.Usr;
import com.xmtcyx.miniapi.service.UsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户控制器
 *  ____   ___.        ________       ___            ___      ._______
 * |   |  |   |     /    ____  ）    /    \        /    \    |  .__    \
 * |   |__|   |     |   | _/  /      |     \      /     |    |  |  \    \
 * |    __    |     |   |___/        |   |\ \    / /|   |    |  |   )    )
 * |   |  |   |     |   |            |   | \ \__/ / |   |    |  |__/    /
 * |___|  |___|     |___|            |___|  \____/  |___|    |._______/
 *
 * @author hp
 * @create 2018-03-05 15:14
 **/
@RestController
@RequestMapping("/")
public class UsrController {

    @Autowired
    UsrService usrService;

    @GetMapping("/usr")
    public Usr addUsr(){
        Usr usr=new Usr();
        usr.setId(121213232325l);
        usr.setAccount("333");
        usr.setPwd("2222");
        usr.setStatus(1);

        usrService.addUser(usr);

        return usr;
    }
}

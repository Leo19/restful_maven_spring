package com.pajinke.controllers;

import com.pajinke.bo.UserBo;
import com.pajinke.service.TestService;
import com.pajinke.vo.ResponseVo;
import com.pajinke.vo.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liushun on 16/3/31.
 */
@Controller
public class TestController {
    private static final Logger logger = Logger.getLogger(TestController.class);
    private final String text = "text/plain;charset=UTF-8";
    private final String json = "application/json;charset=UTF-8";

    @RequestMapping(value = "/hi", produces = text)
    public @ResponseBody
    String sayHi() {
        return "hi Leo";
    }

    @RequestMapping(value = "/hi/{msg}", produces = json)
    public @ResponseBody
    String leoSay(@PathVariable(value = "msg") String msg) {
        return "{name: leo, msg:"+ msg + "}";
    }

    @RequestMapping(value = "/user/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseVo> getUser(@PathVariable("name") String name) {
        ResponseVo result = new ResponseVo();
        result.setPageIndex(1);
        result.setPageRecord(1000);


        result.setCount(100000);
        List<User> list = new ArrayList<User>();
        User user = null;
        System.out.printf("[%s]\t\n",System.currentTimeMillis());
        for(int i = 0 ; i < 10 ; ++i) {
            // System.out.printf("[%s]\t%s\n",i,name);
            user = new User(i,name);
            user.setAge(18);
            user.setUserPhone("15911070144");
            user.setAddress("北京市昌平区小辛庄村");
            list.add(user);
        }
        result.setEntities(list);
        System.out.printf("[%s]\t\n", System.currentTimeMillis());
        return new ResponseEntity<ResponseVo>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserBo>> getUsers() {
        List<UserBo> datas = TestService.getTestDatas();
        System.out.printf("[%s]\t\n", System.currentTimeMillis());
        return new ResponseEntity<List<UserBo>>(datas, HttpStatus.OK);
    }
}

package com.pajinke.controllers;

import java.util.ArrayList;
import java.util.List;

//import com.pajinke.vo.json.*;
//import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pajinke.bo.UserBo;
import com.pajinke.vo.ResponseVo;
import com.pajinke.vo.User;

/**
 * Created by liushun on 16/3/31.
 */
@Controller
public class TestController {
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
//        System.out.printf("[%s]\t\n", System.currentTimeMillis());
//        return new ResponseEntity<List<UserBo>>(datas, HttpStatus.OK);
    	return null;
    }

//    public static void main(String args[]) {
//        // 标签宽表生成json
//        LabelData data = new LabelData();
//
//        // 1==是 0==否
//        Property property0 = new Property("是","1");
//        Property property1 = new Property("否","0");
//        Property[] indication = {property0,property1};
//
//        Property cons0 = new Property("白羊座","白羊座");
//        Property cons1 = new Property("金牛座","金牛座");
//        Property cons2 = new Property("双子座","双子座");
//        Property cons3 = new Property("巨蟹座","巨蟹座");
//        Property cons4 = new Property("狮子座","狮子座");
//        Property cons5 = new Property("处女座","处女座");
//        Property cons6 = new Property("天秤座","天秤座");
//        Property cons7 = new Property("天蝎座","天蝎座");
//        Property cons8 = new Property("射手座","射手座");
//        Property cons9 = new Property("摩羯座","摩羯座");
//        Property cons10 = new Property("水瓶座","水瓶座");
//        Property cons11 = new Property("双鱼座","双鱼座");
//        Property[] constellation = {cons0,cons1,cons2,cons3,cons4,cons5,cons6,cons7,cons8,cons9,cons10,cons11};
//
//        /** 客户活跃程度标签 */
//        CuActivenessJson cuActiveness = new CuActivenessJson();
//        data.setCuActiveness(cuActiveness);
//        cuActiveness.setActivity_channel(DefChar.DEF_STRING.name());
//        cuActiveness.setActivity_logins_cnt(DEF_INT);
//
//        // 活跃程度
//        Property act_rg1 = new Property("15日内登陆5次以上","高频活跃");
//        Property act_rg2 = new Property("15日内登陆2-5次","一般活跃");
//        Property act_rg3 = new Property("15日内登陆一次","登陆一次");
//        Property act_rg4 = new Property("15日内未登录30日内登陆","轻度睡眠");
//        Property act_rg5 = new Property("30日内未登录60日内登陆","中度睡眠");
//        Property[] activity_range = {act_rg1,act_rg2,act_rg3,act_rg4,act_rg5};
//        cuActiveness.setActivity_range(activity_range);
//
//        // 注册时间代码
//        Property reg_time0 = new Property("注册时间距离当天1-5天","A");
//        Property reg_time1 = new Property("注册时间距离当天6-15天","B");
//        Property reg_time2 = new Property("注册时间距离当天15-30天","C");
//        Property reg_time3 = new Property("注册时间距离当天31-60天","D");
//        Property[] reg_time_range_cd = {reg_time0,reg_time1,reg_time2,reg_time3};
//        cuActiveness.setReg_time_range_cd(reg_time_range_cd);
//
//        /** 用户App的活跃属性 */
//        CuActivenessJsonApp cuActivenessApp = new CuActivenessJsonApp();
//        data.setCuActivenessApp(cuActivenessApp);
//
//        cuActivenessApp.setApp_activity_channel(DefChar.DEF_STRING.name());
//        cuActivenessApp.setApp_activity_logins_cnt(DEF_INT);
//        cuActivenessApp.setApp_activity_range(activity_range);
//        cuActivenessApp.setApp_first_logon_dt(null);
//        cuActivenessApp.setApp_latest_logon_dt(null);
//
//        /** 用户属性 */
//        CuAttrJson cuAttr = new CuAttrJson();
//        data.setCuAttr(cuAttr);
//        cuAttr.setAge(DEF_INT);
//
//        // 年龄范围
//        Property ageRange0 = new Property("(0,25]","(0,25]");
//        Property ageRange1 = new Property("(25,35]","(25,35]");
//        Property ageRange2 = new Property("(35,45]","35,45]");
//        Property ageRange3 = new Property("(45,55]","(45,55]");
//        Property ageRange4 = new Property("(55,65]","(55,65]");
//        Property[] age_range = {ageRange0,ageRange1,ageRange2,ageRange3,ageRange4};
//        cuAttr.setAge_range(age_range);
//
//        cuAttr.setBirth_city(DefChar.DEF_STRING.name());
//        cuAttr.setBirth_province(DefChar.DEF_STRING.name());
//        cuAttr.setBlacklist_ind(indication);
//
//        // 城市等级
//        Property cityLevel0 = new Property("一级城市","01");
//        Property cityLevel1 = new Property("二级城市","02");
//        Property cityLevel2 = new Property("三级城市","03");
//        Property cityLevel3 = new Property("四级城市","04");
//        Property[] cityLevel = {cityLevel0,cityLevel1,cityLevel2,cityLevel3};
//        cuAttr.setCity_level_cd(cityLevel);
//
//
//        cuAttr.setBlacklist_ind(indication);
//        cuAttr.setConstellation(constellation);
//
//        // 用户等级代码
//        Property clc1 = new Property("01(专业版用户)","01");
//        Property clc2 = new Property("02(大众版1级用户)","02");
//        Property clc3 = new Property("03(大众版2级用户)","03");
//        Property clc4 = new Property("04(大众版3级用户)","04");
//        Property[] cus_level_cd = {clc1,clc2,clc3,clc4};
//        cuAttr.setCustomer_level_cd(cus_level_cd);
//
//        cuAttr.setFamily_income(DEF_INT);
//
//        // 性别
//        Property gender0 = new Property("M(男)","M");
//        Property gender1 = new Property("F(女)","M");
//        Property[] gender = {gender0,gender1};
//        cuAttr.setGender(gender);
//
//        cuAttr.setIphone(DefChar.DEF_STRING.name());
//        cuAttr.setIsrobot_ind(indication);
//        cuAttr.setLive_city(DefChar.DEF_STRING.name());
//        cuAttr.setLive_province(DefChar.DEF_STRING.name());
//
//        // 婚姻状况
//        Property marital1 = new Property("01(未婚)","01");
//        Property marital2 = new Property("02(已婚)","02");
//        Property marital3 = new Property("03(丧偶)","03");
//        Property marital4 = new Property("04(分居)","04");
//        Property marital5 = new Property("05(同居)","05");
//        Property marital6 = new Property("06(离婚)","06");
//        Property marital7 = new Property("07(再婚)","07");
//        Property[] marital_status_cd = {marital1,marital2,marital3,marital4,marital5,marital6,marital7};
//        cuAttr.setMarital_status_cd(marital_status_cd);
//
//        cuAttr.setReg_andriod_ind(indication);
//
//        // 注册渠道代码
//        Property reg0 = new Property("01(网上注册)","01");
//        Property reg1 = new Property("02(柜面注册)","02");
//        Property reg2 = new Property("03(电话注册)","03");
//        Property reg3 = new Property("04(密码封注册)","04");
//        Property reg4 = new Property("05(系统注册)","05");
//        Property reg5 = new Property("06(WAP注册","06)");
//        Property[] reg_channel_cd = {reg0,reg1,reg2,reg3,reg4,reg5};
//        cuAttr.setReg_channel_cd(reg_channel_cd);
//
//        cuAttr.setReg_dt(null);
//        cuAttr.setReg_ios_ind(indication);
//        cuAttr.setReg_web_app_ind(indication);
//        cuAttr.setUpgraded_date(null);
//        cuAttr.setUpgraded_ind(indication);
//        cuAttr.setUpgraded_reg_source(reg_channel_cd);
//
//        // 属相
//        Property zodiac0 = new Property("鼠","鼠");
//        Property zodiac1 = new Property("牛","牛");
//        Property zodiac2 = new Property("虎","虎");
//        Property zodiac3 = new Property("兔","兔");
//        Property zodiac4 = new Property("龙","龙");
//        Property zodiac5 = new Property("蛇","蛇");
//        Property zodiac6 = new Property("马","马");
//        Property zodiac7 = new Property("羊","羊");
//        Property zodiac8 = new Property("猴","猴");
//        Property zodiac9 = new Property("鸡","鸡");
//        Property zodiac10 = new Property("狗","狗");
//        Property zodiac11 = new Property("猪","猪");
//        Property[] zodiac = {zodiac0,zodiac1,zodiac2,zodiac3,zodiac4,zodiac5,zodiac6,zodiac7,zodiac8,zodiac9,zodiac10,zodiac11};
//        cuAttr.setZodiac(zodiac);
//
//        // 客户绑定属性
//        CuBindJson cuBind = new CuBindJson();
//        data.setCuBind(null);
//
//
//        // 客户模型标签
//        MoModelJson moModel = new MoModelJson();
//        data.setMoModel(null);
//
//        // 客户倾向性模型标签(一堆倾向分的那个)
//        MoPropensityJson moPropensity = new MoPropensityJson();
//        data.setMoPropensity(null);
//
//
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            // 获取路径
//            String json = mapper.writeValueAsString(data);
//            String filePath = TestController.class.getResource("/labelData.js").getPath();
//            System.out.println(filePath);
//
//            // 以NIO的方式写文件
//            FileOutputStream fos = new FileOutputStream(filePath);
//            FileChannel channel = fos.getChannel();
//            byte[] fileBytes = json.getBytes();
//            ByteBuffer buffer = ByteBuffer.allocate(2 * fileBytes.length);
//            buffer.put(fileBytes);
//            System.out.println(fileBytes.length);
//
//            // 确定写入缓冲区的position和limit
//            buffer.flip();
//
//            // 缓冲区数据写入到文件
//            channel.write(buffer);
//            channel.close();
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}

enum DefChar {
    DEF_STRING("_");
    private String context;
    private String getContext(String context) {
        return this.context;
    }

    DefChar(String context) {
        this.context = context;
    }
}


















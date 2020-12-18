package com.msw12.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.msw12.util.GetDataUtil;
import org.springframework.stereotype.Service;

@Service
public class TianqiService {

    // 查询天气
    public JSONObject queryTianqi(String cityName){
        String result = GetDataUtil.sendGet("http://www.tianqiapi.com/api", "version=v9&appid=23035354&appsecret=8YvlPNrz&city="+cityName);
        // 将数据转化为json对象
        JSONObject jsonObject = JSON.parseObject(result);
        return jsonObject;
    }
}

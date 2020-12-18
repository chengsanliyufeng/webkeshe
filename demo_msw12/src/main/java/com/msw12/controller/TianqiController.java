package com.msw12.controller;

import com.alibaba.fastjson.JSONObject;
import com.msw12.service.TianqiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TianqiController {

    @Autowired
    private TianqiService tianqiService;

    // 查询天气
    @RequestMapping("/queryTianqi")
    @ResponseBody
    public JSONObject queryTianqi(String cityName){
        JSONObject jsonObject = tianqiService.queryTianqi(cityName);
        return jsonObject;
    }


}

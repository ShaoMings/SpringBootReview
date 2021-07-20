package com.study.springboot.controller;

import com.study.springboot.entity.Data;
import com.study.springboot.entity.Items;
import com.study.springboot.entity.ResponseData;
import com.study.springboot.utils.SpringBootUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Description API接口结果统一封装
 * 项目中我们会将响应封装成 json 返回，一般我们会将所有接口的数据格式统一， 使前端对数据的操作更一致、轻松。
 * 因此，我们定义统一结果
 * {
 *   "success": 布尔, //响应是否成功
 *   "code": 数字, //响应码
 *   "message": 字符串, //返回消息
 *   "data": HashMap //返回数据，放在键值对中
 * }
 *
 * @author shaoming
 * @date 2021/7/20 13:13
 * @since 1.0
 **/
@RestController
public class ApiResultEncapsulation {

    public static final Integer ITEMS_NUM = 10;

    @GetMapping("/json")
    public ResponseData getJson(@RequestParam(value = "count",required = false,defaultValue = "1") String count){
        Boolean isNum = SpringBootUtils.isAllNumber(count);
        int len = 1;
        if (isNum){
            len = Integer.parseInt(count);
        }else {
            len = ITEMS_NUM;
        }
        ResponseData responseData = new ResponseData();
        responseData.setSuccess(true);
        responseData.setCode("200");
        responseData.setMessage("成功");
        ArrayList<Items> items = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            items.add(new Items(String.valueOf(i), SpringBootUtils.generateRandomName(4),
                    SpringBootUtils.generateRandomName(10)));
        }
        responseData.setData(new Data(items));
        return responseData;
    }


}

package com.jw.jwvisit.controller;

import com.alibaba.fastjson.JSONObject;
import com.jw.jwvisit.model.visitinfo;
import com.jw.jwvisit.service.UploadService;
import com.jw.jwvisit.service.VisitService;
import com.jw.jwvisit.util.BASE64DecodedMultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class UploadController {
    /**
     * 有file文件时
     * @param movieDto 封装了需要传递过来的参数
     */
    @Autowired
    UploadService uploadService;
    @Autowired
    VisitService visitService;

    @RequestMapping("/uploadinfo")
    @ResponseBody
    public String uploadInfo(@RequestParam("visitinfo")String visitinfo) {
        JSONObject jsonObj = JSONObject.parseObject(visitinfo);
        MultipartFile file = BASE64DecodedMultipartFile.base64ToMultipart(jsonObj.get("file").toString());
        JSONObject result = uploadService.uploadInfo(visitinfo,file,"/Users/macpro/Desktop/imgs");
        if (result.get("messageCode").equals("1")){
            visitinfo visit= new visitinfo();
            visit.setVisitedname(jsonObj.getString("visitedname"));
            visit.setVisitedpnum(jsonObj.getString("visitedpnum"));
            visit.setVisitedevent(jsonObj.getString("visitedevent"));
            visit.setVisittime(jsonObj.getDate("visittime"));
            visit.setLefttime(jsonObj.getDate("lefttime"));
            visit.setVisitorname(jsonObj.getString("visitorname"));
            visit.setIdentitynum(jsonObj.getString("identitynum"));
            visit.setPlatenum(jsonObj.getString("platenum"));
            visit.setVisitorpnum(jsonObj.getString("visitorpnum"));
            visit.setImgurl(result.getString("imgUrl"));
        }
        return JSONObject.toJSONString(result);
    }

    @RequestMapping("/")
    public String index() {
        return "upload";
    }
}

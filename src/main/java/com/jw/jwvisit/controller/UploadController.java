package com.jw.jwvisit.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jw.jwvisit.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class UploadController {
    /**
     * 有file文件时
     * @param movieDto 封装了需要传递过来的参数
     * @param file 图片file
     */
    @Autowired
    UploadService uploadService;
    @RequestMapping("/uploadinfo")
    @ResponseBody
    public String uploadInfo(@RequestParam("visitinfo")String visitinfo, @RequestParam("file")MultipartFile file) {
        int result = uploadService.uploadInfo(visitinfo,file,"/Users/macpro/Desktop/imgs");
        if (result > -1) {
            return "true";
        } else {
            return "false";
        }
    }

    @RequestMapping("/")
    public String index() {
        return "upload";
    }
}

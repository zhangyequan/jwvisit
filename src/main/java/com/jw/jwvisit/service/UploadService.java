package com.jw.jwvisit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;
@Service
public class UploadService {

    public int uploadInfo(String visitinfo, MultipartFile file, String uploadDir) {
        try {
            //图片路径
            String imgUrl = null;
            //上传
            String filename = upload(file, uploadDir, file.getOriginalFilename());
            if (filename.equals("") || filename==null) {
                imgUrl = new File(uploadDir).getName() + "/" + filename;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    private String upload(MultipartFile file, String path, String fileName) throws Exception {
        // 生成新的文件名
        String realPath = path + "/" + UUID.randomUUID().toString().replace("-", "")+fileName.substring(fileName.lastIndexOf("."));
        File dest = new File(realPath);
        // 判断文件父目录是否存在
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }
        // 保存文件
        file.transferTo(dest);
        return dest.getName();
    }
}

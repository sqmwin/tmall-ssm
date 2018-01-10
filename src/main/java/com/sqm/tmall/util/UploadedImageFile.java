package com.sqm.tmall.util;


import org.springframework.web.multipart.MultipartFile;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public class UploadedImageFile {
    MultipartFile image;
 
    public MultipartFile getImage() {
        return image;
    }
 
    public void setImage(MultipartFile image) {
        this.image = image;
    }
 
}
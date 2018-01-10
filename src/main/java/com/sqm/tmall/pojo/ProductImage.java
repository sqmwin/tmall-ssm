
package com.sqm.tmall.pojo;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public class ProductImage {
    private Integer id;

    private Integer pid;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}
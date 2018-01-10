
package com.sqm.tmall.service;

import com.sqm.tmall.pojo.Product;
import com.sqm.tmall.pojo.PropertyValue;

import java.util.List;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}
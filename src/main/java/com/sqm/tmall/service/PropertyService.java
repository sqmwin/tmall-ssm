
package com.sqm.tmall.service;
 
import com.sqm.tmall.pojo.Property;

import java.util.List;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public interface PropertyService {
    void add(Property c);
    void delete(int id);
    void update(Property c);
    Property get(int id);
    List list(int cid);
}

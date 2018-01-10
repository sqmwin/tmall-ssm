
package com.sqm.tmall.service;
 
import java.util.List;

import com.sqm.tmall.pojo.User;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public interface UserService {
    void add(User c);
    void delete(int id);
    void update(User c);
    User get(int id);
    List list();
    boolean isExist(String name);

    User get(String name, String password);
}
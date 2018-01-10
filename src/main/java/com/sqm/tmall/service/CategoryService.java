
package com.sqm.tmall.service;

import com.sqm.tmall.pojo.Category;
import java.util.List;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public interface CategoryService{
    List<Category> list();

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);
}
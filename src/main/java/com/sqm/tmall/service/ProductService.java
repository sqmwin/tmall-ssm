
package com.sqm.tmall.service;

import java.util.List;

import com.sqm.tmall.pojo.Category;
import com.sqm.tmall.pojo.Product;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public interface ProductService {
    void add(Product p);
    void delete(int id);
    void update(Product p);
    Product get(int id);
    List list(int cid);
    void setFirstProductImage(Product p);

    void fill(List<Category> cs);

    void fill(Category c);

    void fillByRow(List<Category> cs);

    void setSaleAndReviewNumber(Product p);

    void setSaleAndReviewNumber(List<Product> ps);

    List<Product> search(String keyword);
}

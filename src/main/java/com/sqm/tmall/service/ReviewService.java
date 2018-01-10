
package com.sqm.tmall.service;
 
import java.util.List;

import com.sqm.tmall.pojo.Review;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public interface ReviewService {
     

    void add(Review c);

    void delete(int id);
    void update(Review c);
    Review get(int id);
    List list(int pid);

    int getCount(int pid);
}
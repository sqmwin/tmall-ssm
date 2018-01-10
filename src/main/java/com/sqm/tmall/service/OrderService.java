
package com.sqm.tmall.service;

import java.util.List;

import com.sqm.tmall.pojo.Order;
import com.sqm.tmall.pojo.OrderItem;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public interface OrderService {

    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order c);
    float add(Order c,List<OrderItem> ois);
    void delete(int id);
    void update(Order c);
    Order get(int id);
    List list();
    List list(int uid, String excludedStatus);
}
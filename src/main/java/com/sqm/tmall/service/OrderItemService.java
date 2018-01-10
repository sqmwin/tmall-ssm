
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
public interface OrderItemService {


    void add(OrderItem c);

    void delete(int id);
    void update(OrderItem c);
    OrderItem get(int id);
    List list();

    void fill(List<Order> os);

    void fill(Order o);

    int getSaleCount(int  pid);

    List<OrderItem> listByUser(int uid);
}
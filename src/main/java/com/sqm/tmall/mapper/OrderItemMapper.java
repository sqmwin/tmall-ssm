
package com.sqm.tmall.mapper;

import com.sqm.tmall.pojo.OrderItem;
import com.sqm.tmall.pojo.OrderItemExample;
import java.util.List;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    List<OrderItem> selectByExample(OrderItemExample example);

    OrderItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}
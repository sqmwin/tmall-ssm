
package com.sqm.tmall.mapper;

import com.sqm.tmall.pojo.Order;
import com.sqm.tmall.pojo.OrderExample;
import java.util.List;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}
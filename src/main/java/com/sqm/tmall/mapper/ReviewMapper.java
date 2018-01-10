
package com.sqm.tmall.mapper;

import com.sqm.tmall.pojo.Review;
import com.sqm.tmall.pojo.ReviewExample;
import java.util.List;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public interface ReviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Review record);

    int insertSelective(Review record);

    List<Review> selectByExample(ReviewExample example);

    Review selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);
}
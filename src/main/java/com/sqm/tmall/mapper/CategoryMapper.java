
package com.sqm.tmall.mapper;

import com.sqm.tmall.pojo.Category;
import com.sqm.tmall.pojo.CategoryExample;
import java.util.List;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}
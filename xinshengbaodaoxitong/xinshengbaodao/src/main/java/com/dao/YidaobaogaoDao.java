package com.dao;

import com.entity.YidaobaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YidaobaogaoView;

/**
 * 已到报告 Dao 接口
 *
 * @author 
 */
public interface YidaobaogaoDao extends BaseMapper<YidaobaogaoEntity> {

   List<YidaobaogaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

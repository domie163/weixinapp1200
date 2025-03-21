package com.dao;

import com.entity.JiaowuchuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaowuchuView;

/**
 * 教务处 Dao 接口
 *
 * @author 
 */
public interface JiaowuchuDao extends BaseMapper<JiaowuchuEntity> {

   List<JiaowuchuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

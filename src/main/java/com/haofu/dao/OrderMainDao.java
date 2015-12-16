package com.haofu.dao;

import com.haofu.entity.OrderMain;
import com.haofu.entity.OrderMainExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMainDao {
    int countByExample(OrderMainExample example);

    int deleteByExample(OrderMainExample example);

    int deleteByPrimaryKey(Long dbid);

    int insert(OrderMain record);

    int insertSelective(OrderMain record);

    List<OrderMain> selectByExample(OrderMainExample example);

    OrderMain selectByPrimaryKey(Long dbid);

    int updateByExampleSelective(@Param("record") OrderMain record, @Param("example") OrderMainExample example);

    int updateByExample(@Param("record") OrderMain record, @Param("example") OrderMainExample example);

    int updateByPrimaryKeySelective(OrderMain record);

    int updateByPrimaryKey(OrderMain record);
}
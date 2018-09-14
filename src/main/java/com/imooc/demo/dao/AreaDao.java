package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:DingZhaoxiang
 * @Description:
 * @Date 14:01  2018/9/11
 **/
public interface AreaDao {

   List<Area> queryArea();

   Area queryAreaById(int areaId);

   int insertArea(Area area);

   int updateArea(Area area);

   int deleteArea(int areaId);
}

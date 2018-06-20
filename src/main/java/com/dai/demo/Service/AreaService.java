package com.dai.demo.Service;

import com.dai.demo.entity.Area;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AreaService {
    /**
     * 获取区域列表
     */
    List<Area> getAreaList();

    /**
     * 通过区域id获取区域信息
     */
    Area getAreaById(int areaId);

    /**
     * 增加区域信息
     */
    boolean addArea(Area area);

    /**
     * 修改区域信息
     */
    boolean modifyArea(Area area);

    /**
     * 删除区域信息
     */
    boolean deleteArea(int areaId);
}

package com.dai.demo.dao;

import com.dai.demo.entity.Area;
import org.apache.ibatis.annotations.Insert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    @Ignore
    public void queryArea() {
        List<Area> areas = areaDao.queryArea();

        assertEquals(3,areas.size());
    }

    @Test
    @Ignore
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(2);
        assertNotNull(area);
    }

    @Test
    @Ignore
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("延安");
        area.setPriority(1);
        area.setCreateTime(new Date());
        area.setLastEditTime(new Date());
        int effectNum = areaDao.insertArea(area);
        assertEquals(1,effectNum);
    }

    @Test
    @Ignore
    public void updateArea() {
        Area area = new Area();
        area.setAreaId(1);
        area.setAreaName("长安");
        area.setPriority(5);
        area.setLastEditTime(new Date());
        int effectedNum = areaDao.updateArea(area);
        assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void deleteArea() {
        int effectedNum = areaDao.deleteArea(5);
        assertEquals(1,effectedNum);

    }
}
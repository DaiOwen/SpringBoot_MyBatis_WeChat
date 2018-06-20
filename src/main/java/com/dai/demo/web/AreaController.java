package com.dai.demo.web;

import com.dai.demo.Service.AreaService;
import com.dai.demo.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController = @Controller+@ResponseBady
@RestController
@RequestMapping("/superadmin")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    public Map<String, Object> listArea(){
        Map<String, Object> modelMap = new HashMap<>();
        List<Area> list = areaService.getAreaList();
        modelMap.put("areaList", list);
        return modelMap;
    }

    @RequestMapping(value = "/getarea",method = RequestMethod.GET)
    public Map<String, Object> getAreaByAreaId(Integer areaId){
        Map<String, Object> modelMap = new HashMap<>();
        Area area = areaService.getAreaById(areaId);

        modelMap.put("area", area);

        return modelMap;
    }

    @RequestMapping(value = "/addarea",method = RequestMethod.POST)
    public Map<String, Object> addArea(@RequestBody Area area){
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", areaService.addArea(area));

        return modelMap;
    }

    @RequestMapping(value = "/modifyarea",method = RequestMethod.POST)
    public Map<String, Object> modifyArea(@RequestBody Area area){
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("success", areaService.modifyArea(area));

        return modelMap;
    }

    @RequestMapping(value = "/remove",method = RequestMethod.GET)
    public Map<String, Object> deleteArea(Integer areaId){
        System.out.println(areaId);
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("success", areaService.deleteArea(areaId));

        return modelMap;
    }

}
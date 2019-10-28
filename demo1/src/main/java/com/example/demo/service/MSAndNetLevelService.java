package com.example.demo.service;

import com.example.demo.PO.MSAndNetLevel;

import java.util.List;

public interface MSAndNetLevelService {

    /**
     * 保存MSDataI
     * @param msAndNetLevel
     */
    public void addMSAndNetLevel(MSAndNetLevel msAndNetLevel);
    

    /**
     * 根据起始时间和结束时间查询微震数据
     * @param startData 起始时间格式"2017-08-23"
     * @param endData 结束时间，格式同上
     * @return
     */
    public List<MSAndNetLevel> getLatestMSAndNetLevelByData(String startData,String endData);
}

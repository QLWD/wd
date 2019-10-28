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
     * 获取最新 amount 条[微震生,i]数据记录，
     * @Param amount为0表示查询所有数据，大于0就查询出来相应的数据
     * @return 最新 amount 条[微震生,i]数据记录
     */
    public List<MSAndNetLevel> getLatestMSAndNetLevelByAmount(int amount);

    /**
     * 根据起始时间和结束时间查询微震数据
     * @param startData 起始时间格式"2017-08-23"
     * @param endData 结束时间，格式同上
     * @return
     */
    public List<MSAndNetLevel> getLatestMSAndNetLevelByData(String startData,String endData);
}

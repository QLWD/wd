package com.example.demo.service;

import com.example.demo.domain.PO.MSAndNetLevel;
import com.example.demo.domain.VO.MSAndNetLevelVO;

import java.util.List;

public interface MSAndNetLevelService {

    /**
     * 保存MSDataI
     * @param msAndNetLevel
     */
    public void addMSAndNetLevel(MSAndNetLevel msAndNetLevel);


    /**
     * 根据起始时间和结束时间查询微震数据:ms_net_level表与MSData通过id关联起来，查询成MSAndNetLevelVO类型的数据
     * @param startData 起始时间格式"2017-08-23"
     * @param endData 结束时间，格式同上
     * @return
     */
    public List<MSAndNetLevelVO> getLatestMSAndNetLevelByData(String startData, String endData);
}

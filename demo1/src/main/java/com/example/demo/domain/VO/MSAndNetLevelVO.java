package com.example.demo.domain.VO;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class MSAndNetLevelVO {
    @Id
    private String eventId;
    private double x;
    private double y;
    private double z;
    private Date eventdate;
    private double energy;
    private double netDataZ;//电法数据的z值
    private int level; // 预警等级(0、1、2、3，0表示安全)
}

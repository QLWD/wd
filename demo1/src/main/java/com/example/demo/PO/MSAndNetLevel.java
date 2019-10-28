package com.example.demo.PO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ms_net_level")
public class MSAndNetLevel {
    // 微震数据
    @Id
    private String eventId;//微震数据的id
    private double netDataZ;//电法数据的z值
    private int level; // 预警等级(0、1、2、3，0表示安全)
}

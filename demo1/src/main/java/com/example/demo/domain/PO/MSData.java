package com.example.demo.domain.PO;

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
@Table(name = "ms_data")
public class MSData {
    @Id
    private String eventId;
    private double x;
    private double y;
    private double z;
    private Date eventdate;
    private double energy;
}

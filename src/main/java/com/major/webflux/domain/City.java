package com.major.webflux.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class City {
    @Id
    private Long id;
    private Long provinceId;
    private String cityName;
    private String description;
}

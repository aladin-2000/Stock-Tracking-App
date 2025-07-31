package com.example.stockdemo.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProviderFilterDTO {
    private String name;
    private String eamil;
    private String city;

}

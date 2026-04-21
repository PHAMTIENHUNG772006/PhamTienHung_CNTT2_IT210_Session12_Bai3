package com.re.session12_bai1;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HositalComponent {

    @Value("${hospital.name}")
    private String hospitalName;

    @Value("${hospital.hotline}")
    private String hospitalHotline;

    @PostConstruct
    public void printHospitalInfo() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Hospital Hotline: " + hospitalHotline);

    }
}
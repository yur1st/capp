package com.capp.tech.model.dto;

public class AttributeLimitRangeDto {

    private String attributeName;
    private float attributeLimitRangeMin;
    private float attributeLimitRangeMax;

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public float getAttributeLimitRangeMin() {
        return attributeLimitRangeMin;
    }

    public void setAttributeLimitRangeMin(float attributeLimitRangeMin) {
        this.attributeLimitRangeMin = attributeLimitRangeMin;
    }

    public float getAttributeLimitRangeMax() {
        return attributeLimitRangeMax;
    }

    public void setAttributeLimitRangeMax(float attributeLimitRangeMax) {
        this.attributeLimitRangeMax = attributeLimitRangeMax;
    }
}

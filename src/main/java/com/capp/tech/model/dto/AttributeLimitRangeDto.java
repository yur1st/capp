package com.capp.tech.model.dto;

public class AttributeLimitRangeDto {

    private long attributeLimitRangeId;
    private float attributeLimitRangeMin;
    private float attributeLimitRangeMax;

    public AttributeLimitRangeDto() {
    }

    public long getAttributeLimitRangeId() {
        return attributeLimitRangeId;
    }

    public void setAttributeLimitRangeId(long attributeLimitRangeId) {
        this.attributeLimitRangeId = attributeLimitRangeId;
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

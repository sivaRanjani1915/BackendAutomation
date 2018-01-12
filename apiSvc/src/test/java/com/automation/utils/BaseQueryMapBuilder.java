package com.automation.utils;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseQueryMapBuilder {

    private Map<String, String> queryMap;

    BaseQueryMapBuilder() {
        queryMap = new HashMap<>();
    }

    void putInt(String key, int value) {
        put(key, value);
    }

    void putString(String key, Object value) {
        put(key, value);
    }

    void putBoolean(String key, boolean value) {
        put(key, value);
    }

    protected void putLong(String key, long value) {
        put(key, value);
    }

    protected void putDouble(String key, double value) {
        put(key, value);
    }

    protected void putFloat(String key, float value) {
        put(key, value);
    }

    public Map<String, String> build() {
        return queryMap;
    }

    private void put(String key, Object value) {
        queryMap.put(key, String.valueOf(value));
    }
}

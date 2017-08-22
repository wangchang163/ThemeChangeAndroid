package com.example.themechangeandroid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

/**
 * 配置缓存
 */
public class PrefsUtils {

    public PrefsUtils() {
    }

    /**
     * 写入配置文件
     *
     * @param context
     * @param key
     * @param value
     */
    public static boolean write(Context context, String key, String value) {
        if (context == null || key == null || value == null) {
            return false;
        }
        SharedPreferences spf = PreferenceManager.getDefaultSharedPreferences(context);
        Editor edit = spf.edit();
        edit.putString(key, value);
        return edit.commit();
    }

    public static boolean write(Context context, String key, boolean value) {
        if (context == null || key == null) {
            return false;
        }
        SharedPreferences spf = PreferenceManager.getDefaultSharedPreferences(context);
        Editor edit = spf.edit();
        edit.putBoolean(key, value);
        return edit.commit();
    }

    public static boolean write(Context context, String key, float value) {
        if (context == null || key == null) {
            return false;
        }
        SharedPreferences spf = PreferenceManager.getDefaultSharedPreferences(context);
        Editor edit = spf.edit();
        edit.putFloat(key, value);
        return edit.commit();
    }

    public static boolean write(Context context, String key, int value) {
        if (context == null || key == null) {
            return false;
        }
        SharedPreferences spf = PreferenceManager.getDefaultSharedPreferences(context);
        Editor edit = spf.edit();
        edit.putInt(key, value);
        return edit.commit();
    }

    public static boolean write(Context context, String key, long value) {
        if (context == null || key == null) {
            return false;
        }
        SharedPreferences spf = PreferenceManager.getDefaultSharedPreferences(context);
        Editor edit = spf.edit();
        edit.putLong(key, value);
        return edit.commit();
    }

    /**
     * 读取配置文件
     *
     * @param context
     * @param key
     * @param defaultValue 读取失败后返回的值
     * @return value
     */
    public static String read(Context context, String key, String defaultValue) {
        SharedPreferences spf1 = PreferenceManager.getDefaultSharedPreferences(context);
        return spf1.getString(key, defaultValue);
    }

    public static boolean read(Context context, String key, boolean defaultValue) {
        SharedPreferences spf1 = PreferenceManager.getDefaultSharedPreferences(context);
        return spf1.getBoolean(key, defaultValue);
    }

    public static float read(Context context, String key, float defaultValue) {
        SharedPreferences spf1 = PreferenceManager.getDefaultSharedPreferences(context);
        return spf1.getFloat(key, defaultValue);
    }

    public static int read(Context context, String key, int defaultValue) {
        SharedPreferences spf1 = PreferenceManager.getDefaultSharedPreferences(context);
        return spf1.getInt(key, defaultValue);
    }

    public static long read(Context context, String key, long defaultValue) {
        SharedPreferences spf1 = PreferenceManager.getDefaultSharedPreferences(context);
        return spf1.getLong(key, defaultValue);
    }
}
package com.example.themechangeandroid;

import android.app.Activity;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;

/**
 * Created by Administrator on 2017/8/22.
 */

public class ThemeUtil {
    public ThemeUtil() {
    }

    public static void setTheme(@NonNull Activity activity) {
        boolean isLight = PrefsUtils.read(activity, Config.THEME_CONFIG, true);
        activity.setTheme(isLight ? R.style.ThemeLight : R.style.ThemeDark);
    }

    public static void reCreate(@NonNull final Activity activity) {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                activity.recreate();
            }
        });

    }
}

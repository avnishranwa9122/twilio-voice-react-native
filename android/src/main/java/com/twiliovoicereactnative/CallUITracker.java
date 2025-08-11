package com.twiliovoicereactnative;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public class CallUITracker implements Application.ActivityLifecycleCallbacks {

    private static Class<?> currentActivityClass = null;

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        currentActivityClass = activity.getClass();
    }

    @Override
    public void onActivityStarted(Activity activity) {
        currentActivityClass = activity.getClass();
    }

    @Override
    public void onActivityResumed(Activity activity) {
        currentActivityClass = activity.getClass();
    }

    @Override public void onActivityPaused(Activity activity) {}
    @Override public void onActivityStopped(Activity activity) {
        currentActivityClass = null;
    }
    @Override public void onActivitySaveInstanceState(Activity activity, Bundle outState) {}
    @Override public void onActivityDestroyed(Activity activity) {
        currentActivityClass = null;
    }

    public static Class<?> getCurrentActivity() {
        return currentActivityClass;
    }
}

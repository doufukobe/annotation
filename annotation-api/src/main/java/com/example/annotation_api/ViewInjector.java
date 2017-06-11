package com.example.annotation_api;

import android.app.Activity;
import android.view.View;

/**
 * Created by fupeidong on 2017/6/11.
 */

public class ViewInjector {
    private static final String SUFFIX = "$$ViewInject";
    public static void inJectView(Activity activity)
    {
        ViewInject proxyActivity = findProxyActivity(activity);
        proxyActivity.inject(activity, activity);
    }

    public static void inJectView(Object object, View view)
    {
        ViewInject proxyActivity = findProxyActivity(object);
        proxyActivity.inject(object, view);
    }

    private static ViewInject findProxyActivity(Object activity) {
        try {
            Class clazz = activity.getClass();
            Class injectorClazz = Class.forName(clazz.getName() + SUFFIX);
            return (ViewInject) injectorClazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("can not find " + activity.getClass().getSimpleName());
    }
}

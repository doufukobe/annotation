package com.example.annotation_api;

/**
 * Created by fupeidong on 2017/6/11.
 */

public interface ViewInject<T> {
    void inject(T t, Object source);
}

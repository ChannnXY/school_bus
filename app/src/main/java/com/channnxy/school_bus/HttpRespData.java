package com.channnxy.school_bus;

import android.graphics.Bitmap;

public class HttpRespData {
    public String content;
    public Bitmap bitmap;
    public String cookie;
    public String err_msg;

    public HttpRespData() {
        content = "";
        bitmap = null;
        cookie = "";
        err_msg = "";
    }
}


package com.example.llp.decoratenotify;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class BigNotify extends BuildDecorate {

    public BigNotify(Context context, Notify notify) {
        super(context, notify);
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    public void build() {
        super.build();
        mNotification.bigContentView = new RemoteViews(mContext.getPackageName(), R.layout.notify_big);
    }
}

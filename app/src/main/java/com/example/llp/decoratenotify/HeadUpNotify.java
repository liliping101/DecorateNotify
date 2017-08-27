package com.example.llp.decoratenotify;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;

/**
 * Created by Administrator on 2017/8/26 0026.
 */

public class HeadUpNotify extends BuildDecorate {

    public HeadUpNotify(Context context, Notify notify) {
        super(context, notify);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void build() {
        super.build();
        mNotification.headsUpContentView = new RemoteViews(mContext.getPackageName(), R.layout.notify_normal);
    }

}

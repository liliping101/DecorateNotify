package com.example.llp.decoratenotify;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;
import android.widget.RemoteViews;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class NormalNotify extends Notify {

    public NormalNotify(Context context) {
        super(context);
        build();
    }

    @Override
    public void send() {
        mManager.notify(0, mNotification);
    }

    @Override
    public void cancel() {
        mManager.cancel(0);
    }

    @Override
    public void build() {
        mNotification.contentView = new RemoteViews(mContext.getPackageName(), R.layout.notify_normal);
    }
}

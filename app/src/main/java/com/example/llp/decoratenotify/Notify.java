package com.example.llp.decoratenotify;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public abstract class Notify {

    protected Context mContext;
    protected NotificationManager mManager;
    protected NotificationCompat.Builder mBuilder;
    protected Notification mNotification;

    public Notify(Context context) {
        mContext = context;
        mManager = (NotificationManager) mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        mBuilder = new NotificationCompat.Builder(mContext);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher)
                .setContentIntent(PendingIntent.getActivity(mContext, 0, new Intent(), PendingIntent.FLAG_UPDATE_CURRENT))
                .setFullScreenIntent(PendingIntent.getActivity(mContext, 0, new Intent(), PendingIntent.FLAG_UPDATE_CURRENT), false)
                .setContentTitle("提醒").setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS);
        mNotification = mBuilder.build();
    }

    /**
     * 发生一条通知
     */
    public abstract void send();

    /**
     * 取消一条通知
     */
    public abstract void cancel();

    /**
     * 建立通知栏显示内容
     */
    public abstract void build();
}

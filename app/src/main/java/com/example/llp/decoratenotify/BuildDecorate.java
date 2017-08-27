package com.example.llp.decoratenotify;

import android.content.Context;

/**
 * Created by Administrator on 2017/8/26 0026.
 */

public abstract class BuildDecorate extends Notify {
    protected Notify mNotify;

    public BuildDecorate(Context context, Notify notify) {
        super(context);
        mNotify = notify;
    }

    @Override
    public void send() {
        mNotify.send();
    }

    @Override
    public void cancel() {
        mNotify.cancel();
    }

    @Override
    public void build() {
        mNotify.build();
    }

}

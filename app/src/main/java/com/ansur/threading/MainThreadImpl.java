package com.ansur.threading;

import android.os.Handler;
import android.os.Looper;

import com.ansur.domain.executor.MainThread;

public class MainThreadImpl implements MainThread {

    private static MainThread mainThread;

    private Handler handler;

    private MainThreadImpl() {
        handler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void post(Runnable runnable) {
        handler.post(runnable);
    }

    public static MainThread getInstance() {
        if (mainThread == null) {
            mainThread = new MainThreadImpl();
        }

        return mainThread;
    }
}

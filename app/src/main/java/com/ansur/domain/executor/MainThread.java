package com.ansur.domain.executor;

public interface MainThread {

    void post(final Runnable runnable);
}

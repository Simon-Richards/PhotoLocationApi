package com.ansur.presentation.presenters.base;

import com.ansur.domain.executor.Executor;
import com.ansur.domain.executor.MainThread;

public class AbstractPresenter {
    protected Executor   executor;
    protected MainThread mainThread;

    public AbstractPresenter(Executor executor, MainThread mainThread) {
        this.executor = executor;
        this.mainThread = mainThread;
    }
}

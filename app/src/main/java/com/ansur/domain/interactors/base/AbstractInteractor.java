package com.ansur.domain.interactors.base;

import com.ansur.domain.executor.Executor;
import com.ansur.domain.executor.MainThread;

public abstract class AbstractInteractor implements Interactor {

    protected Executor   threadExecutor;
    protected MainThread mainThread;

    protected volatile boolean isCanceled;
    protected volatile boolean isRunning;

    public AbstractInteractor(Executor threadExecutor, MainThread mainThread) {
        this.threadExecutor = threadExecutor;
        this.mainThread = mainThread;
    }

    // Don't call this method directly. Use execute() method instead
    public abstract void run();

    public void cancel() {
        isCanceled = true;
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void onFinished() {
        isRunning = false;
        isCanceled = false;
    }

    public void execute() {

        this.isRunning = true;

        // start running this interactor in a background thread
        threadExecutor.execute(this);
    }

}
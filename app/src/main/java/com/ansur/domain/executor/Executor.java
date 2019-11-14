package com.ansur.domain.executor;

import com.ansur.domain.interactors.base.AbstractInteractor;

public interface Executor {

    void execute(final AbstractInteractor interactor);
}

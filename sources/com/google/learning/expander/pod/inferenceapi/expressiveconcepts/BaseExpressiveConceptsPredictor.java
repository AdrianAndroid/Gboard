package com.google.learning.expander.pod.inferenceapi.expressiveconcepts;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class BaseExpressiveConceptsPredictor extends ndf {
    /* JADX INFO: Access modifiers changed from: protected */
    public BaseExpressiveConceptsPredictor(long j) {
        super(j);
    }

    @Override // defpackage.ndf
    protected native void deinitJni(long j);

    public native List predictJni(long j, String str);
}

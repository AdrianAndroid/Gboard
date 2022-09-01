package com.google.learning.expander.pod.inferenceapi.core;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PredictionResult implements Comparable {
    public final Object a;
    public final float b;

    public PredictionResult(Object obj, float f) {
        this.a = obj;
        this.b = f;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.compare(((PredictionResult) obj).b, this.b);
    }
}

package androidx.lifecycle;

import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements aft {
    private final Object a;
    private final ajr b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = afl.a.c(obj.getClass());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.aft
    public final void hS(afv afvVar, afo afoVar) {
        ajr ajrVar = this.b;
        Object obj = this.a;
        ajr.a((List) ajrVar.b.get(afoVar), afvVar, afoVar, obj);
        ajr.a((List) ajrVar.b.get(afo.ON_ANY), afvVar, afoVar, obj);
    }
}

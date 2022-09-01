package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: omk  reason: default package */
/* loaded from: classes2.dex */
public abstract class omk {
    public abstract Object a(Object obj, ojv ojvVar);

    public abstract Object b(Iterator it, ojv ojvVar);

    public final Object c(omi omiVar, ojv ojvVar) {
        Object b = b(omiVar.a(), ojvVar);
        return b == ojx.COROUTINE_SUSPENDED ? b : oji.a;
    }
}

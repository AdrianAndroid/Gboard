package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: fgo  reason: default package */
/* loaded from: classes.dex */
public final class fgo {
    public static final lug a = hin.a;
    public static volatile fgo b;
    public final Object c;
    public final Method d;

    public fgo(Object obj, Method method) {
        this.c = obj;
        this.d = method;
    }

    public final boolean a() {
        return (this.c == null || this.d == null) ? false : true;
    }
}

package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: gno  reason: default package */
/* loaded from: classes.dex */
public final class gno {
    private static final ThreadLocal a = new ThreadLocal();

    static {
        int i = gnj.a;
        new ConcurrentHashMap();
    }

    public static Class a(Class cls) {
        ThreadLocal threadLocal = a;
        Class cls2 = (Class) threadLocal.get();
        threadLocal.set(cls);
        return cls2;
    }
}

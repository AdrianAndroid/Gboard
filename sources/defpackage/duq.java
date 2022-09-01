package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: duq  reason: default package */
/* loaded from: classes.dex */
public final class duq {
    private static final AtomicReference a = new AtomicReference();

    public static dun a() {
        return (dun) a.get();
    }

    public static void b(dun dunVar) {
        a.set(dunVar);
    }
}

package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: rc  reason: default package */
/* loaded from: classes2.dex */
final class rc {
    static final rc a = new rc(null, null);
    final Runnable b;
    final Executor c;
    rc next;

    public rc(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}

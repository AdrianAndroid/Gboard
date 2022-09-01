package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mhz  reason: default package */
/* loaded from: classes.dex */
final class mhz {
    static final mhz a = new mhz();
    final Runnable b;
    final Executor c;
    mhz next;

    public mhz() {
        this.b = null;
        this.c = null;
    }

    public mhz(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}

package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: oqr  reason: default package */
/* loaded from: classes2.dex */
final class oqr implements ThreadFactory {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    public oqr(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.a);
        thread.setDaemon(this.b);
        return thread;
    }
}

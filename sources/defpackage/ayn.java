package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: ayn  reason: default package */
/* loaded from: classes.dex */
public final class ayn implements ThreadFactory {
    private final /* synthetic */ int a;

    public ayn(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.a != 0 ? new Thread(new att(runnable, 3), "glide-active-resources") : new aym(runnable);
    }
}

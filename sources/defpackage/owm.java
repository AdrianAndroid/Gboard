package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: owm  reason: default package */
/* loaded from: classes2.dex */
public final class owm implements ThreadFactory {
    public final /* synthetic */ int a;

    public owm(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(new nzm(this, runnable, 19));
    }
}

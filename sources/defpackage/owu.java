package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: owu  reason: default package */
/* loaded from: classes2.dex */
public final class owu implements Executor {
    final /* synthetic */ Executor a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public owu(Executor executor, int i, boolean z, int i2) {
        this.a = executor;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new nzm(this, runnable, 20));
    }
}

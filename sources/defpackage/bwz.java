package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bwz  reason: default package */
/* loaded from: classes.dex */
public final class bwz implements AutoCloseable {
    public final bxb a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public volatile hpy c = hpy.a;

    public bwz(Executor executor) {
        this.a = new bxb(executor);
    }

    public final String a() {
        hpy hpyVar = this.c;
        return (!hpyVar.h() || hpyVar.g()) ? "" : hpyVar.c.toString();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(false)) {
            bxb bxbVar = this.a;
            if (((opu) bxbVar.c.getAndSet(null)) != null) {
                bxbVar.a.h();
            }
        }
        this.c = hpy.a;
    }
}

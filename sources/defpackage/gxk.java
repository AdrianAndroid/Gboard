package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gxk  reason: default package */
/* loaded from: classes.dex */
public final class gxk implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ mld b;
    final /* synthetic */ gxl c;
    final /* synthetic */ long d;
    final /* synthetic */ TimeUnit e;
    final /* synthetic */ gxm f;

    public gxk(gxm gxmVar, Runnable runnable, mld mldVar, gxl gxlVar, long j, TimeUnit timeUnit) {
        this.f = gxmVar;
        this.a = runnable;
        this.b = mldVar;
        this.c = gxlVar;
        this.d = j;
        this.e = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gxm gxmVar = this.f;
        final Runnable runnable = this.a;
        final mld mldVar = this.b;
        final gxl gxlVar = this.c;
        final long j = this.d;
        final TimeUnit timeUnit = this.e;
        gxmVar.execute(new Runnable() { // from class: gxj
            @Override // java.lang.Runnable
            public final void run() {
                gxk gxkVar = gxk.this;
                Runnable runnable2 = runnable;
                mld mldVar2 = mldVar;
                gxl gxlVar2 = gxlVar;
                long j2 = j;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (mldVar2.isDone()) {
                        return;
                    }
                    mkq a = gxkVar.f.a.a(gxkVar, j2, timeUnit2);
                    gxlVar2.a = a;
                    if (!gxlVar2.isDone()) {
                        return;
                    }
                    a.cancel(false);
                } catch (Throwable th) {
                    mldVar2.n(th);
                }
            }
        });
    }
}

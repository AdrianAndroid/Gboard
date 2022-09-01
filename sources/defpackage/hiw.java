package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: hiw  reason: default package */
/* loaded from: classes.dex */
public final class hiw {
    public final Runnable a;
    private final mks b;
    private mko c;
    private hix d;

    public hiw(Runnable runnable) {
        this(runnable, gxo.c(1));
    }

    public hiw(Runnable runnable, mks mksVar) {
        this.a = runnable;
        this.b = mksVar;
    }

    public final void a() {
        hix hixVar = this.d;
        if (hixVar != null) {
            hixVar.close();
            this.d = null;
        }
        hji.h(this.c);
        this.c = null;
    }

    public final void b(long j) {
        c(null, j);
    }

    public final void c(afv afvVar, long j) {
        a();
        if (j <= 0) {
            return;
        }
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new ehz(this, 12));
        hix a = hjg.a(gyc.b, afvVar, afpVar, z, e, e2, e3);
        this.d = a;
        mkq b = this.b.b(hji.b, j, TimeUnit.MILLISECONDS);
        this.c = b;
        a.c(b);
    }
}

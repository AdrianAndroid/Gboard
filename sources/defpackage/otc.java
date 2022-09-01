package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: otc  reason: default package */
/* loaded from: classes2.dex */
public final class otc implements ovn {
    boolean a;
    boolean b;
    final /* synthetic */ otf c;
    private final our d = new our();

    public otc(otf otfVar) {
        this.c = otfVar;
    }

    private final void c(boolean z) {
        otf otfVar;
        long min;
        synchronized (this.c) {
            this.c.j.e();
            while (true) {
                otfVar = this.c;
                if (otfVar.b > 0 || this.b || this.a || otfVar.k != 0) {
                    break;
                }
                otfVar.g();
            }
            otfVar.j.b();
            this.c.e();
            min = Math.min(this.c.b, this.d.b);
            this.c.b -= min;
        }
        this.c.j.e();
        try {
            otf otfVar2 = this.c;
            otfVar2.d.h(otfVar2.c, z && min == this.d.b, this.d, min);
        } finally {
            this.c.j.b();
        }
    }

    @Override // defpackage.ovn
    public final ovr a() {
        return this.c.j;
    }

    @Override // defpackage.ovn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            if (this.a) {
                return;
            }
            otf otfVar = this.c;
            if (!otfVar.h.b) {
                if (this.d.b > 0) {
                    while (this.d.b > 0) {
                        c(true);
                    }
                } else {
                    otfVar.d.h(otfVar.c, true, null, 0L);
                }
            }
            synchronized (this.c) {
                this.a = true;
            }
            this.c.d.e();
            this.c.d();
        }
    }

    @Override // defpackage.ovn, java.io.Flushable
    public final void flush() {
        synchronized (this.c) {
            this.c.e();
        }
        while (this.d.b > 0) {
            c(false);
            this.c.d.e();
        }
    }

    @Override // defpackage.ovn
    public final void ik(our ourVar, long j) {
        this.d.ik(ourVar, j);
        while (this.d.b >= 16384) {
            c(false);
        }
    }
}

package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: geu  reason: default package */
/* loaded from: classes.dex */
public final class geu implements get {
    private final Object a = new Object();
    private final int b;
    private final ger c;
    private int d;
    private int e;
    private int f;
    private Exception g;
    private boolean h;

    public geu(int i, ger gerVar) {
        this.b = i;
        this.c = gerVar;
    }

    private final void b() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g == null) {
                if (this.h) {
                    this.c.p();
                    return;
                } else {
                    this.c.o(null);
                    return;
                }
            }
            ger gerVar = this.c;
            int i = this.e;
            int i2 = this.b;
            gerVar.n(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.g));
        }
    }

    @Override // defpackage.geh
    public final void c() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            b();
        }
    }

    @Override // defpackage.gek
    public final void d(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            b();
        }
    }

    @Override // defpackage.gel
    public final void e(Object obj) {
        synchronized (this.a) {
            this.d++;
            b();
        }
    }
}

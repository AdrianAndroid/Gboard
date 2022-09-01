package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
@Deprecated
/* renamed from: cti  reason: default package */
/* loaded from: classes.dex */
public final class cti implements AutoCloseable, idi {
    public final AtomicBoolean a;
    private final idi b;
    private final ino c;
    private final inm d;

    public cti(idi idiVar, ino inoVar) {
        this.b = idiVar;
        this.c = inoVar;
        this.a = new AtomicBoolean(inoVar.aj(ieh.d));
        btf btfVar = new btf(this, 7);
        this.d = btfVar;
        inoVar.X(btfVar, ieh.d);
    }

    @Override // defpackage.idi
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.idi
    public final void b(String str, boolean z) {
        if (!this.a.get()) {
            return;
        }
        this.b.b(str, z);
    }

    @Override // defpackage.idi
    public final void c(String str) {
        if (!this.a.get()) {
            return;
        }
        this.b.c(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.c.ad(this.d);
    }

    @Override // defpackage.idi
    public final void d(String str, int i) {
        if (!this.a.get()) {
            return;
        }
        this.b.d(str, i);
    }

    @Override // defpackage.idi
    public final void e(String str, long j) {
        if (!this.a.get()) {
            return;
        }
        this.b.e(str, j);
    }

    @Override // defpackage.idi
    public final void f(mbh mbhVar, int i, long j, long j2) {
        if (!this.a.get()) {
            return;
        }
        this.b.f(mbhVar, i, j, j2);
    }

    @Override // defpackage.idi
    public final void g(byte[] bArr) {
        this.b.g(bArr);
    }
}

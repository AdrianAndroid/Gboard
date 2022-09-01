package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gkv  reason: default package */
/* loaded from: classes.dex */
final class gkv extends bly {
    final /* synthetic */ gkw a;
    private final blw b;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final leq d = new gku(this, 0);

    public gkv(gkw gkwVar, blw blwVar) {
        this.a = gkwVar;
        this.b = blwVar;
    }

    @Override // defpackage.blw
    public final int a() {
        return -1;
    }

    @Override // defpackage.blw
    public final mko b() {
        return mio.g(this.b.b(), this.d, mjl.a);
    }

    @Override // defpackage.blw
    public final void c() {
        if (!this.c.getAndSet(true)) {
            this.a.a();
            this.b.c();
        }
    }
}

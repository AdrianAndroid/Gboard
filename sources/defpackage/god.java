package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: god  reason: default package */
/* loaded from: classes.dex */
public final class god implements gnx {
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final gnx b;

    public god(gnx gnxVar) {
        this.b = gnxVar;
    }

    @Override // defpackage.gnx
    public final void b(bna bnaVar) {
        if (this.a.getAndSet(true)) {
            return;
        }
        bmt.a(9);
        this.b.b(bnaVar);
    }

    @Override // defpackage.gnx
    public final void c(bna bnaVar) {
        if (this.a.get()) {
            return;
        }
        this.b.c(bnaVar);
    }

    @Override // defpackage.gnx
    public final void d(nkt nktVar) {
        if (this.a.get()) {
            return;
        }
        int ab = ndb.ab(nktVar.a);
        bmz bmzVar = null;
        if (ab != 0 && ab == 3) {
            bmzVar = new bmz(nktVar.b);
        }
        if (bmzVar != null) {
            b(bmzVar);
        } else {
            this.b.d(nktVar);
        }
    }
}

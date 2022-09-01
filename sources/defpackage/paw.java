package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: paw  reason: default package */
/* loaded from: classes2.dex */
public final class paw extends AtomicBoolean {
    private static final long serialVersionUID = -3353584923995471404L;
    final ozt a;
    final Object b;

    public paw(ozt oztVar, Object obj) {
        this.a = oztVar;
        this.b = obj;
    }

    public final void a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j == 0 || !compareAndSet(false, true)) {
            return;
        }
        ozt oztVar = this.a;
        if (oztVar.e()) {
            return;
        }
        Object obj = this.b;
        try {
            oztVar.c(obj);
            if (oztVar.e()) {
                return;
            }
            oztVar.b();
        } catch (Throwable th) {
            ols.p(th);
            pal.a(th, obj);
            oztVar.a(th);
        }
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: pbg  reason: default package */
/* loaded from: classes2.dex */
final class pbg extends AtomicBoolean implements ozu {
    private static final long serialVersionUID = 247232374289553518L;
    final pbh a;
    final pbx b;

    public pbg(pbh pbhVar, pbx pbxVar) {
        this.a = pbhVar;
        this.b = pbxVar;
    }

    @Override // defpackage.ozu
    public final void d() {
        if (compareAndSet(false, true)) {
            this.b.b(this.a);
        }
    }

    @Override // defpackage.ozu
    public final boolean e() {
        return this.a.e();
    }
}

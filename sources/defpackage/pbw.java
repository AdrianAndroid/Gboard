package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: pbw  reason: default package */
/* loaded from: classes2.dex */
public final class pbw implements ozu {
    static final pam a = new pbv();
    final AtomicReference b = new AtomicReference();

    @Override // defpackage.ozu
    public final void d() {
        pam pamVar;
        pam pamVar2 = (pam) this.b.get();
        pam pamVar3 = a;
        if (pamVar2 == pamVar3 || (pamVar = (pam) this.b.getAndSet(pamVar3)) == null || pamVar == pamVar3) {
            return;
        }
        pamVar.a();
    }

    @Override // defpackage.ozu
    public final boolean e() {
        return this.b.get() == a;
    }
}

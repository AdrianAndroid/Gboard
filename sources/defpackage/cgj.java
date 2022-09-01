package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cgj  reason: default package */
/* loaded from: classes.dex */
final class cgj extends dsy {
    final /* synthetic */ cgl a;

    public cgj(cgl cglVar) {
        this.a = cglVar;
    }

    @Override // defpackage.dsy
    public final void a(dsx dsxVar, dsx dsxVar2) {
        AtomicBoolean atomicBoolean = this.a.h;
        boolean z = false;
        if (dsxVar2.d && dsxVar2.f) {
            z = true;
        }
        atomicBoolean.set(z);
    }
}

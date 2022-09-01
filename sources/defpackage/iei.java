package defpackage;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iei  reason: default package */
/* loaded from: classes.dex */
public final class iei implements idn {
    private final ieh a;
    private final ids b;
    private final long c = SystemClock.uptimeMillis();

    public iei(ids idsVar, ieh iehVar) {
        this.b = idsVar;
        this.a = iehVar;
    }

    @Override // defpackage.idn
    public final void a() {
        b(this.b);
    }

    @Override // defpackage.idn
    public final void b(ids idsVar) {
        ieh iehVar = this.a;
        long uptimeMillis = SystemClock.uptimeMillis() - this.c;
        if (ieh.w(uptimeMillis)) {
            iehVar.p(idsVar, uptimeMillis);
        }
    }
}

package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: ihy  reason: default package */
/* loaded from: classes.dex */
final class ihy extends ntb {
    private final ihw a;
    private final long b = SystemClock.elapsedRealtime();

    public ihy(nuq nuqVar, nsa nsaVar, nsb nsbVar) {
        super(nsbVar.a(nuqVar, nsaVar));
        this.a = (ihw) nsaVar.e(iib.a);
    }

    @Override // defpackage.ntc, defpackage.nsd
    public final void a(nxp nxpVar, num numVar) {
        super.a(new nvd(nxpVar, this.a, this.b, null, null, null), numVar);
    }
}

package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: hlo  reason: default package */
/* loaded from: classes.dex */
public class hlo implements ijh {
    public final boolean a;
    public final boolean b;

    public hlo(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static void b(boolean z) {
        hlo hloVar = (hlo) ijl.b().a(hlo.class);
        if (hloVar == null) {
            ijl.b().g(new hlo(z, false));
        } else if (z == hloVar.a) {
        } else {
            ijl.b().g(new hlo(z, hloVar.b));
        }
    }

    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean z2 = this.a;
        printer.println("hasAutoCorrection = " + z2);
        boolean z3 = this.b;
        printer.println("hasSmartCompose = " + z3);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "CandidateStateNotification";
    }
}

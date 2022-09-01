package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: exb  reason: default package */
/* loaded from: classes.dex */
public final class exb implements ijh {
    public final boolean a;
    private final boolean b;
    private final boolean c;

    public exb(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.a = z2;
        this.c = z3;
    }

    public static boolean b(boolean z, boolean z2, boolean z3) {
        exb exbVar = (exb) ijl.b().a(exb.class);
        if (exbVar != null && exbVar.b == z && exbVar.a == z2 && exbVar.c == z3) {
            return false;
        }
        ijl.b().g(new exb(z, z2, z3));
        return true;
    }

    public static boolean c() {
        exb exbVar = (exb) ijl.b().a(exb.class);
        return exbVar != null && exbVar.b;
    }

    @Override // defpackage.ijg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean z2 = this.b;
        printer.println("shouldEnableFederatedLearning = " + z2);
        boolean z3 = this.a;
        printer.println("shouldEnableDifferentialPrivacy = " + z3);
        boolean z4 = this.c;
        printer.println("shouldEnableVoiceCaching = " + z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            exb exbVar = (exb) obj;
            if (this.b == exbVar.b && this.a == exbVar.a && this.c == exbVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "FederatedLearningStatusNotification";
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    public final int hashCode() {
        boolean z = this.b;
        ?? r1 = this.a;
        return (z ? 1 : 0) | ((r1 == true ? 1 : 0) + r1) | ((this.c ? 1 : 0) << 2);
    }
}

package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: irv  reason: default package */
/* loaded from: classes.dex */
public class irv implements ijh {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/statusmonitors/NetworkInfoNotification");
    public final iru b;
    public final boolean c;

    public irv(iru iruVar, boolean z) {
        this.b = iruVar;
        this.c = z;
    }

    public static boolean b() {
        irv irvVar = (irv) ijl.b().a(irv.class);
        return irvVar != null && c(irvVar);
    }

    public static boolean c(irv irvVar) {
        if (irvVar.b == iru.NON_METERED) {
            return true;
        }
        if (irvVar.c) {
            return false;
        }
        iru iruVar = irvVar.b;
        return iruVar == iru.METERED || iruVar == iru.CONNECTION_UNKNOWN;
    }

    @Override // defpackage.ijg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("networkState = ".concat(String.valueOf(String.valueOf(this.b))));
        boolean z2 = this.c;
        printer.println("isAirplaneModeOn = " + z2);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "NetworkInfoNotification";
    }
}

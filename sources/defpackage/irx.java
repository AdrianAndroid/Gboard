package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: irx  reason: default package */
/* loaded from: classes.dex */
public class irx implements ijh {
    public final boolean a;

    public irx(boolean z) {
        this.a = z;
    }

    public static boolean b() {
        irx irxVar = (irx) ijl.b().a(irx.class);
        return irxVar != null && irxVar.a;
    }

    @Override // defpackage.ijg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean z2 = this.a;
        printer.println("screenOn = " + z2);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ScreenStatusNotification";
    }
}

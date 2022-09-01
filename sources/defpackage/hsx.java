package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: hsx  reason: default package */
/* loaded from: classes.dex */
public final class hsx implements ijh {
    public static final hsx a = new hsx(0, null);
    public final int b;
    public final hsk c;

    public hsx(int i, hsk hskVar) {
        this.b = i;
        this.c = hskVar;
    }

    public static hsk b() {
        hsx hsxVar = (hsx) ijl.b().a(hsx.class);
        if (hsxVar != null) {
            return hsxVar.c;
        }
        return null;
    }

    public static hww c() {
        hsk hskVar;
        hsx hsxVar = (hsx) ijl.b().a(hsx.class);
        if (hsxVar != null && (hskVar = hsxVar.c) != null) {
            return hskVar.V();
        }
        return hww.a;
    }

    public static boolean d() {
        hsx hsxVar = (hsx) ijl.b().a(hsx.class);
        return hsxVar != null && hsxVar.b == 1;
    }

    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("currentState = ".concat(1 != this.b ? "DESTROYED" : "CREATED"));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ServiceLifeCycleNotification";
    }
}

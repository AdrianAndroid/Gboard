package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: hqj  reason: default package */
/* loaded from: classes.dex */
public class hqj implements ijh {
    public final hpy a;
    public final hpy b;

    public hqj(hpy hpyVar, hpy hpyVar2) {
        this.a = hpyVar;
        this.b = hpyVar2;
    }

    public static hpy b() {
        hqj hqjVar = (hqj) ijl.b().a(hqj.class);
        if (hqjVar != null) {
            return hqjVar.a;
        }
        return null;
    }

    public static hpy c() {
        hqj hqjVar = (hqj) ijl.b().a(hqj.class);
        if (hqjVar != null) {
            return hqjVar.b;
        }
        return null;
    }

    @Override // defpackage.ijg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("appInputContext = ".concat(String.valueOf(String.valueOf(this.a))));
        printer.println("imeInputContext = ".concat(String.valueOf(String.valueOf(this.b))));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "InputContextNotification";
    }
}

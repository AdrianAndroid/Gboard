package defpackage;

import android.util.Printer;
import java.util.List;

/* compiled from: PG */
/* renamed from: hqr  reason: default package */
/* loaded from: classes.dex */
public class hqr implements ijh {
    public final llp a;

    public hqr(List list) {
        this.a = llp.o(list);
    }

    public static llp b() {
        hqr hqrVar = (hqr) ijl.b().a(hqr.class);
        return hqrVar != null ? hqrVar.a : llp.q();
    }

    @Override // defpackage.ijg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        int size = this.a.size();
        printer.println("size = " + size);
        gzw gzwVar = new gzw(printer);
        llp llpVar = this.a;
        int size2 = llpVar.size();
        for (int i = 0; i < size2; i++) {
            gzu.b(printer, gzwVar, (hqt) llpVar.get(i), z);
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "EnabledInputMethodEntriesNotification";
    }

    public final String toString() {
        int size = this.a.size();
        lfa S = jdg.S(this);
        S.f("size", size);
        S.b("enabledInputMethodEntries", this.a.toString());
        return S.toString();
    }
}

package defpackage;

import android.util.Printer;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: hqp  reason: default package */
/* loaded from: classes.dex */
public class hqp implements ijh {
    public final hqt a;

    public hqp(hqt hqtVar) {
        this.a = hqtVar;
    }

    public static hqt b() {
        hqp hqpVar = (hqp) ijl.b().a(hqp.class);
        if (hqpVar != null) {
            return hqpVar.a;
        }
        return null;
    }

    public static jav c() {
        hqt b = b();
        if (b != null) {
            return b.i();
        }
        return null;
    }

    public static Locale d() {
        return f(b());
    }

    public static Locale e() {
        Locale f = f(b());
        return f == null ? Locale.getDefault() : f;
    }

    private static Locale f(hqt hqtVar) {
        if (hqtVar == null || hqtVar.i() == null) {
            return null;
        }
        return hqtVar.i().q();
    }

    @Override // defpackage.ijg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        this.a.dump(printer, z);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "CurrentInputMethodEntryNotification";
    }
}

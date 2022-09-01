package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: irp  reason: default package */
/* loaded from: classes.dex */
public class irp implements ijh {
    public final String a;
    public final String b;

    public irp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static irp b() {
        return (irp) ijl.b().a(irp.class);
    }

    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("simCountryIso = ".concat(String.valueOf(this.a)));
        printer.println("networkCountryIso = ".concat(String.valueOf(this.b)));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "CountryInfoNotification";
    }
}

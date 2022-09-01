package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* renamed from: jei  reason: default package */
/* loaded from: classes.dex */
public final class jei implements jej {
    private final /* synthetic */ int a;
    private final Object b;

    public jei(int i) {
        this.a = i;
        this.b = "Cross-profile calls are not supported on this version of Android";
    }

    public jei(fjv fjvVar, int i) {
        this.a = i;
        fjvVar.getClass();
        this.b = fjvVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [fjv, java.lang.Object] */
    @Override // defpackage.jej
    public final mko a() {
        if (this.a == 0) {
            jeh jehVar = jeh.a;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            fjo c = fjo.c(jeh.b, fke.a("java.lang.Boolean"));
            this.b.a().r(2496128067178147232L, 0, bundle, c, c.c);
            return c.c;
        }
        fjo c2 = fjo.c(new jef(), fke.a("java.lang.Boolean"));
        c2.b(new fka((String) this.b));
        return c2.c;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [fjv, java.lang.Object] */
    @Override // defpackage.jej
    public final mko d() {
        if (this.a == 0) {
            jeh jehVar = jeh.a;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            fjo c = fjo.c(jeh.b, fke.a("java.lang.Void"));
            this.b.a().r(2496128067178147232L, 3, bundle, c, c.c);
            return c.c;
        }
        fjo c2 = fjo.c(new jef(), fke.a("java.lang.Void"));
        c2.b(new fka((String) this.b));
        return c2.c;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fjv, java.lang.Object] */
    @Override // defpackage.jej
    public final mko b(String str) {
        if (this.a == 0) {
            jeh jehVar = jeh.a;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            jeh.b.c(bundle, "path", str, fke.a("java.lang.String"));
            fjo c = fjo.c(jeh.b, fke.a("java.lang.Void"));
            this.b.a().r(2496128067178147232L, 1, bundle, c, c.c);
            return c.c;
        }
        fjo c2 = fjo.c(new jef(), fke.a("java.lang.Void"));
        c2.b(new fka((String) this.b));
        return c2.c;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [fjv, java.lang.Object] */
    @Override // defpackage.jej
    public final mko c(String str, boolean z) {
        if (this.a == 0) {
            jeh jehVar = jeh.a;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            jeh.b.c(bundle, "path", str, fke.a("java.lang.String"));
            fke.a("boolean");
            bundle.putBoolean("deleteFile", z);
            fjo c = fjo.c(jeh.b, fke.a("com.google.android.libraries.inputmethod.workprofile.FileContent"));
            this.b.a().r(2496128067178147232L, 2, bundle, c, c.c);
            return c.c;
        }
        fjo c2 = fjo.c(new jef(), fke.a("com.google.android.libraries.inputmethod.workprofile.FileContent"));
        c2.b(new fka((String) this.b));
        return c2.c;
    }
}

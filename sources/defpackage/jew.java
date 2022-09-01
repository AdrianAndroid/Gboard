package defpackage;

import android.os.Bundle;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jew  reason: default package */
/* loaded from: classes.dex */
public final class jew implements jex {
    private final /* synthetic */ int a;
    private final Object b;

    public jew(int i) {
        this.a = i;
        this.b = "Cross-profile calls are not supported on this version of Android";
    }

    public jew(fjv fjvVar, int i) {
        this.a = i;
        fjvVar.getClass();
        this.b = fjvVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fjv, java.lang.Object] */
    @Override // defpackage.jex
    public final mko g(String str) {
        if (this.a == 0) {
            jev jevVar = jev.a;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            jev.b.c(bundle, "key", str, fke.a("java.lang.String"));
            fjo c = fjo.c(jev.b, fke.a("java.lang.Void"));
            this.b.a().r(-3501682228218438129L, 7, bundle, c, c.c);
            return c.c;
        }
        fjo c2 = fjo.c(new jet(), fke.a("java.lang.Void"));
        c2.b(new fka((String) this.b));
        return c2.c;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fjv, java.lang.Object] */
    @Override // defpackage.jex
    public final mko h(jed jedVar) {
        if (this.a == 0) {
            jev jevVar = jev.a;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            jev.b.c(bundle, "allowedSharedPreferences", jedVar, fke.a("com.google.android.libraries.inputmethod.workprofile.AllowedSharedPreferences"));
            fjo c = fjo.c(jev.b, fke.a("java.lang.Void"));
            this.b.a().r(-3501682228218438129L, 8, bundle, c, c.c);
            return c.c;
        }
        fjo c2 = fjo.c(new jet(), fke.a("java.lang.Void"));
        c2.b(new fka((String) this.b));
        return c2.c;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [fjv, java.lang.Object] */
    @Override // defpackage.jex
    public final mko e(String str, String str2) {
        if (this.a == 0) {
            jev jevVar = jev.a;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            jev.b.c(bundle, "key", str, fke.a("java.lang.String"));
            jev.b.c(bundle, "value", str2, fke.a("java.lang.String"));
            fjo c = fjo.c(jev.b, fke.a("java.lang.Void"));
            this.b.a().r(-3501682228218438129L, 5, bundle, c, c.c);
            return c.c;
        }
        fjo c2 = fjo.c(new jet(), fke.a("java.lang.Void"));
        c2.b(new fka((String) this.b));
        return c2.c;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [fjv, java.lang.Object] */
    @Override // defpackage.jex
    public final mko f(String str, Set set) {
        if (this.a == 0) {
            jev jevVar = jev.a;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            jev.b.c(bundle, "key", str, fke.a("java.lang.String"));
            jev.b.c(bundle, "values", set, fke.b(fke.a("java.lang.String")));
            fjo c = fjo.c(jev.b, fke.a("java.lang.Void"));
            this.b.a().r(-3501682228218438129L, 6, bundle, c, c.c);
            return c.c;
        }
        fjo c2 = fjo.c(new jet(), fke.a("java.lang.Void"));
        c2.b(new fka((String) this.b));
        return c2.c;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [fjv, java.lang.Object] */
    @Override // defpackage.jex
    public final mko a(String str, boolean z) {
        if (this.a == 0) {
            jev jevVar = jev.a;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            jev.b.c(bundle, "key", str, fke.a("java.lang.String"));
            fke.a("boolean");
            bundle.putBoolean("value", z);
            fjo c = fjo.c(jev.b, fke.a("java.lang.Void"));
            this.b.a().r(-3501682228218438129L, 1, bundle, c, c.c);
            return c.c;
        }
        fjo c2 = fjo.c(new jet(), fke.a("java.lang.Void"));
        c2.b(new fka((String) this.b));
        return c2.c;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [fjv, java.lang.Object] */
    @Override // defpackage.jex
    public final mko b(String str, float f) {
        if (this.a == 0) {
            jev jevVar = jev.a;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            jev.b.c(bundle, "key", str, fke.a("java.lang.String"));
            fke.a("float");
            bundle.putFloat("value", f);
            fjo c = fjo.c(jev.b, fke.a("java.lang.Void"));
            this.b.a().r(-3501682228218438129L, 2, bundle, c, c.c);
            return c.c;
        }
        fjo c2 = fjo.c(new jet(), fke.a("java.lang.Void"));
        c2.b(new fka((String) this.b));
        return c2.c;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [fjv, java.lang.Object] */
    @Override // defpackage.jex
    public final mko c(String str, int i) {
        if (this.a == 0) {
            jev jevVar = jev.a;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            jev.b.c(bundle, "key", str, fke.a("java.lang.String"));
            fke.a("int");
            bundle.putInt("value", i);
            fjo c = fjo.c(jev.b, fke.a("java.lang.Void"));
            this.b.a().r(-3501682228218438129L, 3, bundle, c, c.c);
            return c.c;
        }
        fjo c2 = fjo.c(new jet(), fke.a("java.lang.Void"));
        c2.b(new fka((String) this.b));
        return c2.c;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [fjv, java.lang.Object] */
    @Override // defpackage.jex
    public final mko d(String str, long j) {
        if (this.a == 0) {
            jev jevVar = jev.a;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            jev.b.c(bundle, "key", str, fke.a("java.lang.String"));
            fke.a("long");
            bundle.putLong("value", j);
            fjo c = fjo.c(jev.b, fke.a("java.lang.Void"));
            this.b.a().r(-3501682228218438129L, 4, bundle, c, c.c);
            return c.c;
        }
        fjo c2 = fjo.c(new jet(), fke.a("java.lang.Void"));
        c2.b(new fka((String) this.b));
        return c2.c;
    }
}

package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ifz  reason: default package */
/* loaded from: classes.dex */
public final class ifz {
    public final boolean a;
    public final Object b;
    public final Object c;

    public ifz(Context context, ino inoVar, boolean z) {
        this.b = context;
        this.c = inoVar;
        this.a = z;
    }

    public ifz(iga igaVar) {
        this.a = igaVar.e;
        this.c = igaVar.d;
        lmx g = lmz.g();
        for (String str : igaVar.c) {
            g.d(jav.f(str));
        }
        hhl hhlVar = igaVar.b;
        if (hhlVar != null) {
            for (String str2 : igb.b.i((String) hhlVar.c())) {
                try {
                    g.d(jav.f(str2));
                } catch (IllegalArgumentException e) {
                    ((ltd) ((ltd) ((ltd) igb.a.c()).i(e)).k("com/google/android/libraries/inputmethod/module/InitializationDependencyDef$KeyboardRule", "<init>", (char) 479, "InitializationDependencyDef.java")).t("Invalid language tag");
                }
            }
        }
        this.b = g.g();
    }

    public ifz(String str, boolean z, String str2) {
        this.b = str;
        this.a = z;
        this.c = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Collection, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.hqt r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            lmz r0 = (defpackage.lmz) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1b
            jav r0 = r5.i()
            java.lang.Object r3 = r4.b
            jav r0 = r0.h(r3)
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            java.lang.Object r3 = r4.c
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L37
            java.lang.Object r3 = r4.c
            java.lang.String r5 = r5.p()
            java.lang.String r3 = (java.lang.String) r3
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L35
            goto L37
        L35:
            r5 = 0
            goto L38
        L37:
            r5 = 1
        L38:
            if (r0 == 0) goto L3e
            if (r5 == 0) goto L3e
            r5 = 1
            goto L3f
        L3e:
            r5 = 0
        L3f:
            boolean r0 = r4.a
            if (r0 == r5) goto L44
            return r2
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ifz.a(hqt):boolean");
    }

    public final hiz b() {
        llk e = llp.e();
        if ((!this.a || !((ino) this.c).aj(R.string.f162590_resource_name_obfuscated_res_0x7f140724)) && !jam.H((Context) this.b)) {
            e.h(cvd.a);
        }
        return hiz.n(e.g());
    }
}

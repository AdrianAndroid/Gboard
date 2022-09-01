package com.google.android.apps.inputmethod.latin.preference;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.google.android.apps.inputmethod.latin.spelling.LatinSpellCheckerSettingsActivity;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SettingsSearchIndexablesProvider extends lca {
    private final llp c = llp.s(new SettingsActivity(), new LatinSpellCheckerSettingsActivity());
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/latin/preference/SettingsSearchIndexablesProvider");
    static final hhl a = hhq.a("enable_settings_search", false);

    public static boolean a(Preference preference) {
        Bundle bundle;
        if (!preference.W() || ((bundle = preference.w) != null && bundle.containsKey("NON_INDEXABLE"))) {
            return false;
        }
        CharSequence charSequence = preference.q;
        return !TextUtils.isEmpty(charSequence) && !charSequence.toString().contains("%s");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    @Override // defpackage.lca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.Cursor b() {
        /*
            r16 = this;
            android.content.Context r0 = r16.getContext()
            android.database.MatrixCursor r7 = new android.database.MatrixCursor
            java.lang.String[] r1 = defpackage.lbz.c
            r7.<init>(r1)
            gwt r1 = defpackage.gwu.b
            boolean r1 = defpackage.ijf.i(r1)
            r8 = 0
            r9 = 0
            r2 = 1
            if (r1 != 0) goto L46
            java.lang.System.currentTimeMillis()
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch
            r1.<init>(r2)
            j$.util.Objects.requireNonNull(r1)
            bqj r3 = new bqj
            r4 = 4
            r3.<init>(r1, r4)
            gwt r4 = defpackage.gwu.b
            ija r3 = defpackage.ijf.c(r3, r8, r4)
            mjl r4 = defpackage.mjl.a
            r3.e(r4)
            r1.await()     // Catch: java.lang.Throwable -> L3c java.lang.InterruptedException -> L42
            r3.f()
            java.lang.System.currentTimeMillis()
            goto L46
        L3c:
            r0 = move-exception
            r1 = r0
            r3.f()
            throw r1
        L42:
            r3.f()
            goto L56
        L46:
            hhl r1 = com.google.android.apps.inputmethod.latin.preference.SettingsSearchIndexablesProvider.a
            java.lang.Object r1 = r1.c()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L56
            r10 = 1
            goto L57
        L56:
            r10 = 0
        L57:
            r11 = r16
            llp r12 = r11.c
            r1 = r12
            lrl r1 = (defpackage.lrl) r1
            int r13 = r1.c
            r14 = 0
        L61:
            if (r14 >= r13) goto Lbb
            java.lang.Object r1 = r12.get(r14)
            r15 = r1
            dxz r15 = (defpackage.dxz) r15
            if (r10 == 0) goto L96
            android.content.Context r1 = r16.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            inw r2 = new inw
            r2.<init>(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r15.p(r3)
            int r4 = r3.size()
            r5 = 0
        L86:
            if (r5 >= r4) goto L94
            java.lang.Object r6 = r3.get(r5)
            inj r6 = (defpackage.inj) r6
            r6.a(r1, r2)
            int r5 = r5 + 1
            goto L86
        L94:
            r5 = r2
            goto L97
        L96:
            r5 = r8
        L97:
            imy r1 = new imy
            r1.<init>()
            if (r5 == 0) goto La1
            r1.a(r0, r5)
        La1:
            brl r6 = new brl
            imu r3 = new imu
            r3.<init>(r0)
            r1 = r6
            r2 = r0
            r4 = r7
            r8 = r6
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            int r1 = r15.l()
            r8.i(r1)
            int r14 = r14 + 1
            r8 = 0
            goto L61
        Lbb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.latin.preference.SettingsSearchIndexablesProvider.b():android.database.Cursor");
    }

    @Override // defpackage.lca
    public final Cursor c() {
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/latin/preference/SettingsSearchIndexablesProvider", "queryRawData", 86, "SettingsSearchIndexablesProvider.java")).t("queryRawData");
        Context context = getContext();
        MatrixCursor matrixCursor = new MatrixCursor(lbz.b);
        StringBuilder sb = new StringBuilder();
        if (jam.x()) {
            sb.append("\u200f");
        }
        sb.append(context.getString(R.string.ime_name));
        qv qvVar = new qv();
        inv invVar = new inv(context);
        llp llpVar = this.c;
        int i = 0;
        for (int i2 = ((lrl) llpVar).c; i < i2; i2 = i2) {
            dxz dxzVar = (dxz) llpVar.get(i);
            new brk(this, context, invVar, qvVar, matrixCursor, dxzVar, sb, invVar).i(dxzVar.l());
            i++;
            context = context;
        }
        return matrixCursor;
    }

    @Override // defpackage.lca
    public final Cursor d() {
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/latin/preference/SettingsSearchIndexablesProvider", "queryXmlResources", 79, "SettingsSearchIndexablesProvider.java")).t("queryXmlResources");
        return new MatrixCursor(lbz.a);
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        jai.b.a(getContext());
        return true;
    }
}

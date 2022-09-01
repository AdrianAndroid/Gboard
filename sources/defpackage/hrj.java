package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: hrj  reason: default package */
/* loaded from: classes.dex */
public final class hrj {
    public static final lug a = lug.i("EntryStoreHelper");
    public final ino b;
    private final hri c;

    public hrj(Context context, hri hriVar) {
        this.b = ino.M(context);
        this.c = hriVar;
    }

    public static String c(Map map, String str) {
        Object[] split = TextUtils.split(str, ":");
        if (split.length != 3) {
            ((luc) ((luc) a.d()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryDataStore", "convertSubtypePrefStrToEntryPrefStr", 168, "InputMethodEntryDataStore.java")).w("The stored subtype(%s) is invalid.", str);
            return null;
        }
        String str2 = (String) map.get(split[0]);
        if (TextUtils.isEmpty(str2)) {
            str2 = jay.d(split[0]);
        }
        return j(str2, split[1]);
    }

    public static String d(hqt hqtVar) {
        return j(hqtVar.i().n, hqtVar.p());
    }

    public static String e(jav javVar, String str) {
        return "multilingual:".concat(j(javVar.n, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r5 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.hsc i(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = ":"
            java.lang.String[] r10 = android.text.TextUtils.split(r10, r0)
            int r0 = r10.length
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == r4) goto L16
            if (r0 != r1) goto L10
            goto L16
        L10:
            hri r10 = r9.c
            r10.v(r2)
            return r3
        L16:
            r5 = r10[r2]     // Catch: java.lang.IllegalArgumentException -> L7f
            jav r2 = defpackage.jav.f(r5)     // Catch: java.lang.IllegalArgumentException -> L7f
            hri r5 = r9.c
            hrx r5 = (defpackage.hrx) r5
            kdr r6 = r5.P
            if (r6 != 0) goto L25
            goto L3d
        L25:
            mop r6 = r5.S
            if (r6 != 0) goto L35
            kdr r6 = r5.P
            android.content.Context r7 = r5.i
            boe r8 = r5.N
            mop r6 = r6.r(r7, r8)
            r5.S = r6
        L35:
            mop r5 = r5.S
            jav r5 = r2.K(r5)
            if (r5 != 0) goto L3e
        L3d:
            r5 = r2
        L3e:
            jav r6 = defpackage.jav.d
            boolean r6 = j$.util.Objects.equals(r5, r6)
            if (r6 == 0) goto L4c
            hri r10 = r9.c
            r10.v(r1)
            return r3
        L4c:
            if (r0 <= r4) goto L59
            r0 = r10[r4]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L59
            r10 = r10[r4]
            goto L5a
        L59:
            r10 = r3
        L5a:
            boolean r0 = r5.equals(r2)
            if (r0 != 0) goto L7a
            java.lang.String r0 = e(r2, r10)
            java.lang.String r1 = e(r5, r10)
            ino r2 = r9.b
            java.util.Set r2 = r2.e(r0, r3)
            if (r2 == 0) goto L75
            ino r3 = r9.b
            r3.k(r1, r2)
        L75:
            ino r1 = r9.b
            r1.w(r0)
        L7a:
            hsc r10 = defpackage.hsc.b(r5, r10)
            return r10
        L7f:
            r0 = move-exception
            hri r1 = r9.c
            r1.v(r4)
            lug r1 = defpackage.hrj.a
            ltv r1 = r1.d()
            luc r1 = (defpackage.luc) r1
            ltv r0 = r1.i(r0)
            luc r0 = (defpackage.luc) r0
            r1 = 238(0xee, float:3.34E-43)
            java.lang.String r4 = "InputMethodEntryDataStore.java"
            java.lang.String r5 = "com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryDataStore"
            java.lang.String r6 = "createEntrySettingFromPreferenceString"
            ltv r0 = r0.k(r5, r6, r1, r4)
            luc r0 = (defpackage.luc) r0
            java.lang.String r1 = "Invalid language tag: %s"
            r10 = r10[r2]
            r0.w(r1, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrj.i(java.lang.String):hsc");
    }

    private static String j(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : String.format("%s:%s", str, str2);
    }

    public final hsc a() {
        String y = this.b.y(R.string.f160620_resource_name_obfuscated_res_0x7f14065e);
        if (TextUtils.isEmpty(y)) {
            return null;
        }
        return i(y);
    }

    public final lmz b() {
        String y = this.b.y(R.string.f161120_resource_name_obfuscated_res_0x7f140690);
        if (TextUtils.isEmpty(y)) {
            return lrr.a;
        }
        lmx g = lmz.g();
        for (String str : lfy.g(";").i(y)) {
            hsc i = i(str);
            if (i != null) {
                g.d(i);
            }
        }
        return g.g();
    }

    public final void f(Context context) {
        if (this.b.ah(R.string.f161120_resource_name_obfuscated_res_0x7f140690) || this.b.ah(R.string.f160620_resource_name_obfuscated_res_0x7f14065e)) {
            this.b.v(R.string.f161130_resource_name_obfuscated_res_0x7f140691);
            this.b.v(R.string.f160630_resource_name_obfuscated_res_0x7f14065f);
            return;
        }
        String y = this.b.y(R.string.f161130_resource_name_obfuscated_res_0x7f140691);
        String y2 = this.b.y(R.string.f160630_resource_name_obfuscated_res_0x7f14065f);
        if (TextUtils.isEmpty(y) && TextUtils.isEmpty(y2)) {
            return;
        }
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(R.array.f2040_resource_name_obfuscated_res_0x7f03006d);
        try {
            int length = obtainTypedArray.length();
            qo qoVar = new qo();
            for (int i = 0; i < length; i += 2) {
                qoVar.put(obtainTypedArray.getString(i), obtainTypedArray.getString(i + 1));
            }
            obtainTypedArray.recycle();
            if (!TextUtils.isEmpty(y)) {
                String M = jbt.M(y.split(";"), new hdp((Map) qoVar, 13));
                if (!TextUtils.isEmpty(M)) {
                    this.b.u(R.string.f161120_resource_name_obfuscated_res_0x7f140690, M);
                }
                this.b.v(R.string.f161130_resource_name_obfuscated_res_0x7f140691);
            }
            if (TextUtils.isEmpty(y2)) {
                return;
            }
            String c = c(qoVar, y2);
            if (!TextUtils.isEmpty(c)) {
                this.b.u(R.string.f160620_resource_name_obfuscated_res_0x7f14065e, c);
            }
            this.b.v(R.string.f160630_resource_name_obfuscated_res_0x7f14065f);
        } catch (Throwable th) {
            obtainTypedArray.recycle();
            throw th;
        }
    }

    public final void g(Collection collection) {
        this.b.u(R.string.f161120_resource_name_obfuscated_res_0x7f140690, collection.isEmpty() ? "" : jbt.L(";", collection, hht.n));
    }

    public final void h(hqt hqtVar, Collection collection) {
        lmz g;
        String e = e(hqtVar.i(), hqtVar.p());
        if (collection == null) {
            this.b.w(e);
            return;
        }
        ino inoVar = this.b;
        if (collection.isEmpty()) {
            g = lrr.a;
        } else {
            lmx g2 = lmz.g();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                g2.d(((jav) it.next()).n);
            }
            g = g2.g();
        }
        inoVar.k(e, g);
    }
}

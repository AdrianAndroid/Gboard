package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;

/* compiled from: PG */
/* renamed from: vu  reason: default package */
/* loaded from: classes2.dex */
public final class vu {
    public static final qu a;
    private static final wc b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            b = new vz();
        } else if (Build.VERSION.SDK_INT >= 28) {
            b = new vy();
        } else if (Build.VERSION.SDK_INT >= 26) {
            b = new vx();
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                if (vw.a == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (vw.a != null) {
                    b = new vw();
                }
            }
            b = new vv();
        }
        a = new qu(16);
    }

    public static Typeface b(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface d = b.d(context, resources, i, str, i3);
        if (d != null) {
            a.c(c(resources, i, str, i2, i3), d);
        }
        return d;
    }

    public static String c(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r3.equals(r5) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface d(android.content.Context r17, defpackage.vb r18, android.content.res.Resources r19, int r20, java.lang.String r21, int r22, int r23, defpackage.vj r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu.d(android.content.Context, vb, android.content.res.Resources, int, java.lang.String, int, int, vj, boolean):android.graphics.Typeface");
    }

    public static Typeface e(Context context, gjk[] gjkVarArr, int i) {
        return b.b(context, gjkVarArr, i);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        return Typeface.create(typeface, i);
    }
}

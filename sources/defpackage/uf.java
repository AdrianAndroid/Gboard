package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* renamed from: uf  reason: default package */
/* loaded from: classes2.dex */
public final class uf {
    final Bundle a;
    public final boolean b;
    boolean c;
    @Deprecated
    public int d;
    public final CharSequence e;
    public final PendingIntent f;
    private IconCompat g;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public uf(int r11, java.lang.CharSequence r12, android.app.PendingIntent r13) {
        /*
            r10 = this;
            java.lang.String r0 = "IconCompat"
            java.lang.String r1 = "Unable to get icon type "
            androidx.core.graphics.drawable.IconCompat r11 = androidx.core.graphics.drawable.IconCompat.d(r11)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r10.<init>()
            r3 = 1
            r10.c = r3
            r10.g = r11
            int r4 = r11.b
            r5 = -1
            if (r4 != r5) goto L80
            java.lang.Object r4 = r11.c
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 28
            if (r6 < r7) goto L27
            int r4 = defpackage.wj.b(r4)
            goto L80
        L27:
            java.lang.Class r6 = r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L6b
            java.lang.String r7 = "getType"
            r8 = 0
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L6b
            java.lang.reflect.Method r6 = r6.getMethod(r7, r9)     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L6b
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L6b
            java.lang.Object r6 = r6.invoke(r4, r7)     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L6b
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L6b
            int r4 = r6.intValue()     // Catch: java.lang.NoSuchMethodException -> L41 java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L6b
            goto L80
        L41:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            r7.append(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = r1.concat(r4)
            android.util.Log.e(r0, r1, r6)
            goto L7f
        L56:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            r7.append(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = r1.concat(r4)
            android.util.Log.e(r0, r1, r6)
            goto L7f
        L6b:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            r7.append(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = r1.concat(r4)
            android.util.Log.e(r0, r1, r6)
        L7f:
            r4 = -1
        L80:
            r0 = 2
            if (r4 != r0) goto L89
            int r11 = r11.a()
            r10.d = r11
        L89:
            java.lang.CharSequence r11 = defpackage.uh.c(r12)
            r10.e = r11
            r10.f = r13
            r10.a = r2
            r10.b = r3
            r10.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf.<init>(int, java.lang.CharSequence, android.app.PendingIntent):void");
    }

    public final IconCompat a() {
        int i;
        if (this.g == null && (i = this.d) != 0) {
            this.g = IconCompat.d(i);
        }
        return this.g;
    }
}

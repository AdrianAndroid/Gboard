package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: kc  reason: default package */
/* loaded from: classes.dex */
final class kc {
    private static final boolean a;
    private static final Method b;
    private static final Field c;
    private static final Field d;
    private static final Field e;
    private static final Field f;

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    static {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.String r3 = "android.graphics.Insets"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.ClassNotFoundException -> L4d java.lang.NoSuchMethodException -> L52
            java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
            java.lang.String r5 = "getOpticalInsets"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.ClassNotFoundException -> L4d java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L48 java.lang.ClassNotFoundException -> L4d java.lang.NoSuchMethodException -> L52
            java.lang.String r5 = "left"
            java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L45
            java.lang.String r6 = "top"
            java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L36 java.lang.ClassNotFoundException -> L39 java.lang.NoSuchMethodException -> L3c
            java.lang.String r7 = "right"
            java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.NoSuchMethodException -> L33
            java.lang.String r8 = "bottom"
            java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L2d
            r8 = 1
            goto L59
        L2d:
            goto L57
        L2f:
            goto L34
        L31:
            goto L34
        L33:
        L34:
            r7 = r2
            goto L57
        L36:
            r6 = r2
            goto L56
        L39:
            r6 = r2
            goto L56
        L3c:
            r6 = r2
            goto L56
        L3f:
            r5 = r2
            goto L4b
        L42:
            r5 = r2
            goto L50
        L45:
            r5 = r2
            goto L55
        L48:
            r4 = r2
            r5 = r4
        L4b:
            r6 = r5
            goto L56
        L4d:
            r4 = r2
            r5 = r4
        L50:
            r6 = r5
            goto L56
        L52:
            r4 = r2
            r5 = r4
        L55:
            r6 = r5
        L56:
            r7 = r6
        L57:
            r3 = r2
            r8 = 0
        L59:
            if (r8 == 0) goto L68
            defpackage.kc.b = r4
            defpackage.kc.c = r5
            defpackage.kc.d = r6
            defpackage.kc.e = r7
            defpackage.kc.f = r3
            defpackage.kc.a = r0
            return
        L68:
            defpackage.kc.b = r2
            defpackage.kc.c = r2
            defpackage.kc.d = r2
            defpackage.kc.e = r2
            defpackage.kc.f = r2
            defpackage.kc.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc.<clinit>():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Rect a(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29 && a) {
            try {
                Object invoke = b.invoke(drawable, new Object[0]);
                if (invoke != null) {
                    return new Rect(c.getInt(invoke), d.getInt(invoke), e.getInt(invoke), f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return ke.a;
    }
}

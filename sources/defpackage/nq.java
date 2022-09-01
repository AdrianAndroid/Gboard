package defpackage;

import android.animation.ObjectAnimator;

/* compiled from: PG */
/* renamed from: nq  reason: default package */
/* loaded from: classes2.dex */
public final class nq {
    public static void a(ObjectAnimator objectAnimator, boolean z) {
        objectAnimator.setAutoCancel(z);
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void c(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void d(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void e(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void f(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void g(Object obj) {
        obj.getClass();
    }

    public static void h(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException((String) obj2);
    }
}

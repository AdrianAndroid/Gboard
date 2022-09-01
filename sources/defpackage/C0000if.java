package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: if  reason: invalid class name and default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0000if {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static C0000if b;
    private mv c;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter b2;
        synchronized (C0000if.class) {
            b2 = mv.b(i, mode);
        }
        return b2;
    }

    public static synchronized C0000if d() {
        C0000if c0000if;
        synchronized (C0000if.class) {
            if (b == null) {
                f();
            }
            c0000if = b;
        }
        return c0000if;
    }

    public static synchronized void f() {
        synchronized (C0000if.class) {
            if (b == null) {
                C0000if c0000if = new C0000if();
                b = c0000if;
                c0000if.c = mv.e();
                b.c.g(new ie());
            }
        }
    }

    public final synchronized ColorStateList a(Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized Drawable c(Context context, int i) {
        return this.c.c(context, i);
    }

    public final synchronized void e(Context context) {
        this.c.f(context);
    }

    public final synchronized Drawable g(Context context, int i) {
        return this.c.d(context, i, true);
    }
}

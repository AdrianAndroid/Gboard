package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* renamed from: zj  reason: default package */
/* loaded from: classes2.dex */
public abstract class zj {
    private final int a;
    private final Class b;
    private final int c;
    private final int d;

    public zj(int i, Class cls) {
        this(i, cls, 0, 28);
    }

    public zj(int i, Class cls, int i2, int i3) {
        this.a = i;
        this.b = cls;
        this.d = i2;
        this.c = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean f(Boolean bool, Boolean bool2) {
        return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
    }

    private final boolean g() {
        return Build.VERSION.SDK_INT >= this.c;
    }

    public abstract Object a(View view);

    public abstract void b(View view, Object obj);

    public boolean c(Object obj, Object obj2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object d(View view) {
        if (!g()) {
            Object tag = view.getTag(this.a);
            if (!this.b.isInstance(tag)) {
                return null;
            }
            return tag;
        }
        return a(view);
    }

    public final void e(View view, Object obj) {
        if (g()) {
            b(view, obj);
        } else if (!c(d(view), obj)) {
        } else {
            aad.C(view);
            view.setTag(this.a, obj);
            aad.D(view, this.d);
        }
    }
}

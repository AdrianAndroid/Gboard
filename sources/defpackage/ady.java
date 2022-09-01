package defpackage;

import android.text.Editable;

/* compiled from: PG */
/* renamed from: ady  reason: default package */
/* loaded from: classes.dex */
public final class ady extends Editable.Factory {
    private static final Object a = new Object();
    private static volatile Editable.Factory b;
    private static Class c;

    private ady() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new ady();
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new aee(cls, charSequence) : super.newEditable(charSequence);
    }
}

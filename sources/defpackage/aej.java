package defpackage;

import android.text.Editable;

/* compiled from: PG */
/* renamed from: aej  reason: default package */
/* loaded from: classes.dex */
public final class aej extends Editable.Factory {
    private static final Object a = new Object();
    private static volatile Editable.Factory b;
    private static Class c;

    private aej() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new aej();
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new aei(cls, charSequence) : super.newEditable(charSequence);
    }
}

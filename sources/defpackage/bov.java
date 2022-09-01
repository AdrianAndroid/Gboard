package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: bov  reason: default package */
/* loaded from: classes.dex */
public final class bov {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/latin/core/LatinAdditionalImeDefsProvider");
    public final Context a;

    public bov(Context context) {
        this.a = context;
    }

    public static void a(jav javVar) {
        if (Thread.interrupted()) {
            ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/latin/core/LatinAdditionalImeDefsProvider", "checkThreadInterrupted", 115, "LatinAdditionalImeDefsProvider.java")).w("The additional provider is interrupted for %s", javVar);
        }
    }
}

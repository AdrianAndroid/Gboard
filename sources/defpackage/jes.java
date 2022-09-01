package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: jes  reason: default package */
/* loaded from: classes.dex */
public final class jes {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/workprofile/SharedPreferencesSynchronizer");
    public final Context b;
    public final SharedPreferences c;
    public final boc d;

    public jes(Context context, SharedPreferences sharedPreferences, boc bocVar) {
        this.b = context;
        this.c = sharedPreferences;
        this.d = bocVar;
    }

    public final void a(String str) {
        this.c.getAll().get(str);
    }
}

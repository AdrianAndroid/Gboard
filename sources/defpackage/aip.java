package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* compiled from: PG */
/* renamed from: aip  reason: default package */
/* loaded from: classes.dex */
public final class aip {
    public aia a;
    public boolean b;
    public PreferenceScreen c;
    public aio d;
    public aim e;
    public ain f;
    private final Context g;
    private long h = 0;
    private SharedPreferences i = null;
    private SharedPreferences.Editor j;
    private final String k;

    public aip(Context context) {
        this.g = context;
        this.k = String.valueOf(context.getPackageName()).concat("_preferences");
    }

    public final long a() {
        long j;
        synchronized (this) {
            j = this.h;
            this.h = 1 + j;
        }
        return j;
    }

    public final SharedPreferences.Editor b() {
        if (this.a != null) {
            return null;
        }
        if (!this.b) {
            return c().edit();
        }
        if (this.j == null) {
            this.j = c().edit();
        }
        return this.j;
    }

    public final SharedPreferences c() {
        if (this.a != null) {
            return null;
        }
        if (this.i == null) {
            this.i = this.g.getSharedPreferences(this.k, 0);
        }
        return this.i;
    }

    public final Preference d(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.c;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.l(charSequence);
    }

    public final PreferenceScreen e(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.C(this);
        return preferenceScreen;
    }

    public final void f(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.j) != null) {
            editor.apply();
        }
        this.b = z;
    }
}

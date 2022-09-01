package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jek  reason: default package */
/* loaded from: classes.dex */
public final class jek implements SharedPreferences, AutoCloseable {
    public final SharedPreferences a;
    public final jel b;

    public jek(Context context, SharedPreferences sharedPreferences, jee jeeVar) {
        this.a = sharedPreferences;
        jel jelVar = new jel(context, sharedPreferences, jeeVar);
        this.b = jelVar;
        if (jelVar.b.e().k()) {
            jey.a.e(jelVar);
            jelVar.c = jelVar.b.d();
            ((fje) jelVar.b).a.add(jelVar);
        } else {
            jelVar.c = true;
        }
        ((ltd) ((ltd) jel.a.b()).k("com/google/android/libraries/inputmethod/workprofile/CrossProfileSharedPreferencesEditor", "initialize", 76, "CrossProfileSharedPreferencesEditor.java")).w("work profile available: %s", Boolean.valueOf(jelVar.c));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.a.contains(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this.b;
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return this.a.getAll();
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return this.a.getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return this.a.getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return this.a.getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return this.a.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return this.a.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}

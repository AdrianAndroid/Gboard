package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jel  reason: default package */
/* loaded from: classes.dex */
public final class jel implements SharedPreferences.Editor, AutoCloseable, fjf, hhk {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/workprofile/CrossProfileSharedPreferencesEditor");
    public final fjh b;
    public volatile boolean c;
    private final Context d;
    private final jee e;
    private final SharedPreferences f;
    private final SharedPreferences.Editor g;
    private final boe h;

    public jel(Context context, SharedPreferences sharedPreferences, jee jeeVar) {
        this.d = context;
        this.f = sharedPreferences;
        this.g = sharedPreferences.edit();
        fjh a2 = jez.a(context);
        this.b = a2;
        this.h = new boe(a2);
        this.e = jeeVar;
    }

    private final boolean d() {
        return this.c && jez.e(this.d);
    }

    private final boolean e(String str) {
        return d() && this.e.b(str);
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.g.apply();
    }

    @Override // defpackage.fjf
    public final void b() {
        this.c = this.b.d();
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/workprofile/CrossProfileSharedPreferencesEditor", "availabilityChanged", 88, "CrossProfileSharedPreferencesEditor.java")).w("work profile availability is changed to %s", Boolean.valueOf(this.c));
        if (jez.g(this.d)) {
            c();
        }
        ieh.j().e(jfa.a, new Object[0]);
    }

    public final void c() {
        if (!d()) {
            return;
        }
        jfb.c(this.h.r().h(new jed(this.e, this.f)), jfc.SYNC_PREFERENCE_ALL, "");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        return this.g.clear();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((fje) this.b).a.remove(this);
        jey.a.g(this);
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return this.g.commit();
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        if (((Boolean) hhlVar.c()).booleanValue()) {
            c();
        } else if (!d()) {
        } else {
            jfb.c(jco.c(this.b).d(), jfc.RESET_PHENOTYPE_FLAG, "");
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        if (!this.f.contains(str) || z != this.f.getBoolean(str, false)) {
            this.g.putBoolean(str, z);
            if (e(str)) {
                jfb.c(this.h.r().a(str, z), jfc.SYNC_PREFERENCE_PUT_BOOLEAN, str);
            }
            return this;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        if (!this.f.contains(str) || f != this.f.getFloat(str, Float.MAX_VALUE)) {
            this.g.putFloat(str, f);
            if (e(str)) {
                jfb.c(this.h.r().b(str, f), jfc.SYNC_PREFERENCE_PUT_FLOAT, str);
            }
            return this;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        if (!this.f.contains(str) || i != this.f.getInt(str, Integer.MAX_VALUE)) {
            this.g.putInt(str, i);
            if (e(str)) {
                jfb.c(this.h.r().c(str, i), jfc.SYNC_PREFERENCE_PUT_INT, str);
            }
            return this;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        if (!this.f.contains(str) || j != this.f.getLong(str, Long.MAX_VALUE)) {
            this.g.putLong(str, j);
            if (e(str)) {
                jfb.c(this.h.r().d(str, j), jfc.SYNC_PREFERENCE_PUT_LONG, str);
            }
            return this;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            remove(str);
            return this;
        } else if (str2.equals(this.f.getString(str, null))) {
            return this;
        } else {
            this.g.putString(str, str2);
            if (e(str)) {
                jfb.c(this.h.r().e(str, str2), jfc.SYNC_PREFERENCE_PUT_STRING, str);
            }
            return this;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            remove(str);
            return this;
        } else if (set.equals(this.f.getStringSet(str, null))) {
            return this;
        } else {
            this.g.putStringSet(str, set);
            if (e(str)) {
                jfb.c(this.h.r().f(str, set), jfc.SYNC_PREFERENCE_PUT_STRING_SET, str);
            }
            return this;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        if (!this.f.contains(str)) {
            return this;
        }
        this.g.remove(str);
        if (e(str)) {
            jfb.c(this.h.r().g(str), jfc.SYNC_PREFERENCE_REMOVE, str);
        }
        return this;
    }
}

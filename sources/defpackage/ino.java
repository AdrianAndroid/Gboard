package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Printer;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ino  reason: default package */
/* loaded from: classes.dex */
public final class ino extends aia implements gzv {
    public static final inn a;
    private static volatile ino h;
    public final boolean b;
    public volatile ind d;
    public final jls f;
    private static final lug g = hin.a;
    private static final Map i = new qo();
    private final qv j = new qv();
    private final SharedPreferences.OnSharedPreferenceChangeListener k = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ink
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            ino inoVar = ino.this;
            if (str != null && inoVar.c.get()) {
                inoVar.T(sharedPreferences, str, str);
                inoVar.T(sharedPreferences, "", str);
            }
        }
    };
    public final AtomicBoolean c = new AtomicBoolean(true);
    public volatile llw e = lrq.b;

    static {
        inn innVar = new inn();
        a = innVar;
        ijf.g("Preferences_UserUnlocked", innVar);
    }

    private ino(Context context, String str) {
        ind indVar;
        boolean z = !TextUtils.isEmpty(str);
        this.b = z;
        this.f = new jls(context.getResources());
        if (z) {
            if (jai.b.b()) {
                indVar = new inp(context.getApplicationContext(), str);
            } else {
                throw new IllegalStateException("Private preferences should not be used before user unlocked");
            }
        } else {
            inq inqVar = new inq(context.getApplicationContext());
            Context m = jbt.m(inqVar.a);
            if (Build.VERSION.SDK_INT < 24 || m == inqVar.a) {
                inqVar.b(PreferenceManager.getDefaultSharedPreferences(inqVar.a), false);
                inqVar.c = true;
            } else {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(m);
                boolean z2 = defaultSharedPreferences.getBoolean("has_migrated_to_de_storage", false);
                inqVar.b(defaultSharedPreferences, true);
                inqVar.d = ijf.a(new idx(inqVar, new bdx(inqVar, z2, 7), 9), jai.a);
                inqVar.d.e(mjl.a);
            }
            indVar = inqVar;
        }
        this.d = indVar;
        if (!z) {
            gzt.a.a(this);
        }
    }

    public static int H(String str, int i2) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static ino K(Context context, String str) {
        ino inoVar;
        if (!jai.b.b()) {
            throw new IllegalStateException("Private preferences should not be used before user unlocked");
        }
        if (true == TextUtils.isEmpty(str)) {
            str = "_private";
        }
        synchronized (ino.class) {
            Map map = i;
            inoVar = (ino) map.get(str);
            if (inoVar == null) {
                inoVar = new ino(context.getApplicationContext(), str);
                inoVar.ap();
                map.put(str, inoVar);
            }
        }
        return inoVar;
    }

    @Deprecated
    public static ino L() {
        ino inoVar = h;
        return inoVar != null ? inoVar : M(guw.a());
    }

    public static ino M(Context context) {
        ino inoVar;
        ino inoVar2 = h;
        if (inoVar2 != null) {
            return inoVar2;
        }
        synchronized (ino.class) {
            if (h == null) {
                h = new ino(context.getApplicationContext(), null);
                h.ap();
            }
            inoVar = h;
        }
        return inoVar;
    }

    private final inc ao() {
        return new inl(this);
    }

    private final void ap() {
        this.d.f(ao());
    }

    private final synchronized void aq(SharedPreferences sharedPreferences) {
        if (this.j.isEmpty()) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.k);
        }
    }

    private final synchronized void ar(SharedPreferences sharedPreferences) {
        if (this.j.isEmpty()) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.k);
        }
    }

    private static void as(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else {
            if (obj instanceof Set) {
                Set<String> set = (Set) obj;
                if (lre.ag(set, new lfi(String.class))) {
                    editor.putStringSet(str, set);
                    return;
                }
            }
            if (obj == null) {
                editor.remove(str);
                return;
            }
            String obj2 = obj.toString();
            String canonicalName = obj.getClass().getCanonicalName();
            throw new IllegalArgumentException(obj2 + " is unexpected type (" + canonicalName + ")");
        }
    }

    public final float A(int i2, float f) {
        return B(this.f.n(i2), f);
    }

    public final float B(String str, float f) {
        try {
            return Float.parseFloat(d(str, ""));
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public final int C(int i2) {
        return n(i2, 0);
    }

    public final int D(String str) {
        return b(str, 0);
    }

    public final int E(int i2) {
        return F(i2, 0);
    }

    public final int F(int i2, int i3) {
        return G(this.f.n(i2), i3);
    }

    public final int G(String str, int i2) {
        return H(d(str, ""), i2);
    }

    public final long I(String str) {
        return c(str, 0L);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final SharedPreferences J() {
        return this.d.a();
    }

    @Deprecated
    public final Object N(int i2) {
        return O(this.f.n(i2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    @Deprecated
    public final Object O(String str) {
        Object obj = this.d.a().getAll().get(str);
        if (obj != null) {
            return obj;
        }
        Object obj2 = this.e.get(str);
        return obj2 instanceof lgb ? ((lgb) obj2).a() : obj2;
    }

    public final String P() {
        return this.d.e();
    }

    public final String Q(String str) {
        return d(str, "");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final Map R() {
        qo qoVar = new qo();
        qoVar.putAll(this.d.a().getAll());
        return qoVar;
    }

    public final Set S(String str) {
        return e(str, lrr.a);
    }

    public final void T(SharedPreferences sharedPreferences, String str, String str2) {
        inm[] inmVarArr;
        synchronized (this) {
            Set set = (Set) this.j.get(str);
            if (set == null) {
                inmVarArr = null;
            } else if (set.isEmpty()) {
                this.j.remove(str);
                ar(sharedPreferences);
                return;
            } else {
                inmVarArr = (inm[]) set.toArray(new inm[set.size()]);
            }
            if (inmVarArr != null) {
                for (inm inmVar : inmVarArr) {
                    if (inmVar != null) {
                        inmVar.go(this, str2);
                    }
                }
            }
        }
    }

    public final void U(int i2, Object obj) {
        SharedPreferences.Editor d = this.d.d();
        as(d, this.f.n(i2), obj);
        d.apply();
    }

    public final void V(String str, Object obj) {
        SharedPreferences.Editor d = this.d.d();
        as(d, str, obj);
        d.apply();
    }

    public final synchronized void W(inm inmVar) {
        Y(inmVar, "");
    }

    public final synchronized void X(inm inmVar, int i2) {
        Y(inmVar, this.f.n(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void Y(inm inmVar, String str) {
        aq(this.d.a());
        Set set = (Set) this.j.get(str);
        if (set == null) {
            set = Collections.newSetFromMap(new WeakHashMap());
            this.j.put(str, set);
        }
        set.add(inmVar);
    }

    public final synchronized void Z(inm inmVar, int... iArr) {
        for (int i2 : iArr) {
            Y(inmVar, this.f.n(i2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.aia
    public final float a(String str, float f) {
        try {
            Object obj = this.e.get(str);
            if (obj instanceof lgb) {
                f = ((Float) ((lgb) obj).a()).floatValue();
            } else if (obj != null) {
                f = ((Float) obj).floatValue();
            }
            return this.d.a().getFloat(str, f);
        } catch (ClassCastException e) {
            ((luc) ((luc) ((luc) g.c()).i(e)).k("com/google/android/libraries/inputmethod/preferences/Preferences", "getFloat", 538, "Preferences.java")).w("Preference %s is not a float value.", str);
            return f;
        }
    }

    public final synchronized void aa(inm inmVar, String... strArr) {
        for (String str : strArr) {
            Y(inmVar, str);
        }
    }

    public final synchronized void ab(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        if (sharedPreferences == sharedPreferences2) {
            return;
        }
        if (this.j.isEmpty()) {
            return;
        }
        sharedPreferences2.unregisterOnSharedPreferenceChangeListener(this.k);
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void ac(ind indVar) {
        if (!this.b) {
            ind indVar2 = this.d;
            if (indVar2 == indVar) {
                return;
            }
            this.d = indVar;
            indVar2.f(null);
            gvt.a(indVar2);
            ((jem) indVar).b = ao();
            ab(((jem) indVar).a, indVar2.a());
            return;
        }
        throw new UnsupportedOperationException("Can't set provider for private Preferences.");
    }

    public final synchronized void ad(inm inmVar) {
        af(inmVar, "");
    }

    public final synchronized void ae(inm inmVar, int i2) {
        af(inmVar, this.f.n(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void af(inm inmVar, String str) {
        Set set = (Set) this.j.get(str);
        if (set != null) {
            set.remove(inmVar);
            if (set.isEmpty()) {
                this.j.remove(str);
                ar(this.d.a());
            }
        }
    }

    public final synchronized void ag(inm inmVar, int... iArr) {
        for (int i2 : iArr) {
            af(inmVar, this.f.n(i2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean ah(int i2) {
        return this.d.a().contains(this.f.n(i2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean ai(String str) {
        return this.d.a().contains(str);
    }

    public final boolean aj(int i2) {
        return x(i2, false);
    }

    public final boolean ak(String str) {
        return al(str, false, false);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean al(String str, boolean z, boolean z2) {
        try {
            Object obj = this.e.get(str);
            if (obj instanceof lgb) {
                z = ((Boolean) ((lgb) obj).a()).booleanValue();
            } else if (obj != null) {
                z = ((Boolean) obj).booleanValue();
            }
            return this.d.a().getBoolean(str, z);
        } catch (ClassCastException | NullPointerException e) {
            ((luc) ((luc) ((luc) g.c()).i(e)).k("com/google/android/libraries/inputmethod/preferences/Preferences", "getBoolean", 453, "Preferences.java")).w("Preference %s is not a boolean value.", str);
            return z2;
        }
    }

    public final boolean am(int i2, int i3, boolean z, boolean z2) {
        try {
            z = ((Resources) this.f.b).getBoolean(i3);
        } catch (Resources.NotFoundException | NullPointerException e) {
            ((luc) ((luc) ((luc) g.c()).i(e)).k("com/google/android/libraries/inputmethod/preferences/Preferences", "getBoolean", (char) 487, "Preferences.java")).t("Failed to read preference default value.");
        }
        return al(p(i2), z, z2);
    }

    public final boolean an(String str, int i2) {
        return str.equals(this.f.n(i2));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.aia
    public final int b(String str, int i2) {
        try {
            Object obj = this.e.get(str);
            if (obj instanceof lgb) {
                i2 = ((Integer) ((lgb) obj).a()).intValue();
            } else if (obj != null) {
                i2 = ((Integer) obj).intValue();
            }
            return this.d.a().getInt(str, i2);
        } catch (ClassCastException e) {
            ((luc) ((luc) ((luc) g.c()).i(e)).k("com/google/android/libraries/inputmethod/preferences/Preferences", "getInt", 573, "Preferences.java")).w("Preference %s is not a int value.", str);
            return i2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.aia
    public final long c(String str, long j) {
        try {
            return this.d.a().getLong(str, j);
        } catch (ClassCastException e) {
            ((luc) ((luc) ((luc) g.c()).i(e)).k("com/google/android/libraries/inputmethod/preferences/Preferences", "getLong", 600, "Preferences.java")).w("Preference %s is not a long value.", str);
            return j;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.aia
    public final String d(String str, String str2) {
        String str3;
        try {
            Object obj = this.e.get(str);
            if (obj instanceof lgb) {
                str3 = (String) ((lgb) obj).a();
            } else {
                if (obj != null) {
                    str3 = (String) obj;
                }
                return this.d.a().getString(str, str2);
            }
            str2 = str3;
            return this.d.a().getString(str, str2);
        } catch (ClassCastException e) {
            ((luc) ((luc) ((luc) g.c()).i(e)).k("com/google/android/libraries/inputmethod/preferences/Preferences", "getString", 635, "Preferences.java")).w("Preference %s is not a string value.", str);
            return str2;
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        if (this.b) {
            throw new UnsupportedOperationException("Cannot dump private preferences");
        }
        Map R = R();
        for (String str : R.keySet()) {
            gzu.a(printer, "%s: \"%s\"", str, R.get(str));
        }
        gzu.b(printer, new gzw(printer), this.d, z);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.aia
    public final Set e(String str, Set set) {
        Set set2;
        try {
            Object obj = this.e.get(str);
            if (obj instanceof lgb) {
                set2 = (Set) ((lgb) obj).a();
            } else {
                if (obj != null) {
                    set2 = (Set) obj;
                }
                return this.d.a().getStringSet(str, set);
            }
            set = set2;
            return this.d.a().getStringSet(str, set);
        } catch (ClassCastException e) {
            ((luc) ((luc) ((luc) g.c()).i(e)).k("com/google/android/libraries/inputmethod/preferences/Preferences", "getStringSet", 680, "Preferences.java")).w("Preference %s is not a string set value.", str);
            return set;
        }
    }

    @Override // defpackage.aia
    public final void f(String str, boolean z) {
        this.d.d().putBoolean(str, z).apply();
    }

    @Override // defpackage.aia
    public final void g(String str, float f) {
        this.d.d().putFloat(str, f).apply();
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "Preferences";
    }

    @Override // defpackage.aia
    public final void h(String str, int i2) {
        this.d.d().putInt(str, i2).apply();
    }

    @Override // defpackage.aia
    public final void i(String str, long j) {
        this.d.d().putLong(str, j).apply();
    }

    @Override // defpackage.aia
    public final void j(String str, String str2) {
        this.d.d().putString(str, str2).apply();
    }

    @Override // defpackage.aia
    public final void k(String str, Set set) {
        this.d.d().putStringSet(str, set).apply();
    }

    @Override // defpackage.aia
    public final boolean l(String str, boolean z) {
        return al(str, z, z);
    }

    @Override // defpackage.aia
    public final String p(int i2) {
        return this.f.n(i2);
    }

    @Override // defpackage.aia
    public final void w(String str) {
        this.d.d().remove(str).apply();
    }

    public final float z(int i2) {
        return m(i2, 0.0f);
    }
}

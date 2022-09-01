package defpackage;

import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: jft  reason: default package */
/* loaded from: classes.dex */
public final class jft extends jfe {
    private static final ltg d = ltg.j("com/google/android/libraries/inputmethod/xml/KeyboardModeConditionMatcherProvider");
    public String a;
    private final irm e;
    private final inm f;
    private final hhk g;
    private volatile String h;

    public jft() {
        super(R.string.f166980_resource_name_obfuscated_res_0x7f140915);
        fdo fdoVar = new fdo(this, 16);
        this.f = fdoVar;
        ffp ffpVar = new ffp(this, 9);
        this.g = ffpVar;
        String l = hyq.l("phone");
        this.a = l;
        this.h = h(l);
        ino.L().W(fdoVar);
        gzq.b.e(ffpVar);
        jfs jfsVar = new jfs(this);
        this.e = jfsVar;
        jfsVar.g(gyc.b);
    }

    public static jfn f(String str) {
        return new jgb("keyboard_mode", str);
    }

    public static String g(int i) {
        return i != 3 ? (i == 4 && ((Boolean) gzq.b.c()).booleanValue()) ? "split" : "normal" : "floating";
    }

    static String h(String str) {
        return g(ino.L().b(str, 1));
    }

    @Override // defpackage.jfp
    public final jfn a() {
        return f(this.h);
    }

    @Override // defpackage.jfp
    public final boolean c() {
        String str = this.a;
        if (str == null) {
            ((ltd) ((ltd) d.d()).k("com/google/android/libraries/inputmethod/xml/KeyboardModeConditionMatcherProvider", "updateAttributeValue", 111, "KeyboardModeConditionMatcherProvider.java")).t("Needs to update keyboard mode condition when prefKey is ready!");
            return false;
        }
        String h = h(str);
        if (TextUtils.equals(this.h, h)) {
            return false;
        }
        this.h = h;
        return true;
    }

    public final void i() {
        if (c()) {
            e();
        }
    }
}

package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: ezn  reason: default package */
/* loaded from: classes.dex */
public final class ezn {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/translate/TranslateLanguage");
    public final ezl b;
    public final ezm c;

    public ezn(Context context) {
        this.b = new ezl(context);
        this.c = new ezm(context);
    }

    public static boolean e(String str) {
        return "auto".equalsIgnoreCase(str);
    }

    public final Locale a() {
        return this.b.b;
    }

    public final void b() {
        this.b.j(R.string.f162680_resource_name_obfuscated_res_0x7f14072d, R.string.f162660_resource_name_obfuscated_res_0x7f14072b, R.string.f162640_resource_name_obfuscated_res_0x7f140729);
        this.c.j(R.string.f162690_resource_name_obfuscated_res_0x7f14072e, R.string.f162670_resource_name_obfuscated_res_0x7f14072c, R.string.f162650_resource_name_obfuscated_res_0x7f14072a);
    }

    public final void c(Locale locale) {
        this.b.k(locale);
        this.c.k(locale);
    }

    public final boolean d() {
        return !TextUtils.isEmpty(this.b.d) && !TextUtils.isEmpty(this.c.d) && !ezz.g(this.b.d, this.c.d);
    }

    public final boolean f() {
        return e(this.b.d);
    }

    public final boolean g() {
        return d() && !TextUtils.isEmpty(this.b.a(this.c.d)) && !TextUtils.isEmpty(this.c.a(this.b.m()));
    }
}

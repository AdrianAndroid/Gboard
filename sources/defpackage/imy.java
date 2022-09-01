package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: imy  reason: default package */
/* loaded from: classes.dex */
public final class imy implements inj, inh {
    public static final boolean d(Bundle bundle, boolean z) {
        if (bundle != null && (bundle.containsKey("hide_if_flag_is_false") || bundle.containsKey("hide_if_flag_is_true"))) {
            if ((e(bundle, "hide_if_flag_is_false", false) || e(bundle, "hide_if_flag_is_true", true)) == z) {
                return true;
            }
        }
        return false;
    }

    private static boolean e(Bundle bundle, String str, boolean z) {
        String string = bundle.getString(str);
        if (!TextUtils.isEmpty(string)) {
            if (string.contains("=")) {
                hhl b = hhq.b(string);
                if (b == null) {
                    throw new IllegalStateException("Failed to parse flag from string: ".concat(String.valueOf(string)));
                }
                return ((Boolean) b.c()).booleanValue() == z;
            }
            throw new IllegalStateException("Value: " + string + " is invalid. The value must be declared in format: flag=true|false");
        }
        return false;
    }

    private static final void f(ini iniVar, Object obj, boolean z) {
        if (d(iniVar.d(obj), z)) {
            iniVar.p(obj, !z);
        }
    }

    @Override // defpackage.inj
    public final void a(Context context, ini iniVar) {
        iniVar.q(this);
    }

    @Override // defpackage.inh
    public final void b(ini iniVar, Object obj, Object obj2, boolean z) {
        f(iniVar, obj2, z);
    }

    @Override // defpackage.inh
    public final void c(ini iniVar, Object obj, Object obj2, boolean z) {
        f(iniVar, obj2, z);
    }
}

package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eul  reason: default package */
/* loaded from: classes.dex */
public final class eul {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingItemSpec");
    public final eui b;

    public eul(eui euiVar) {
        this.b = euiVar;
    }

    public static eul d(Context context) {
        return new eul(new euh(context));
    }

    public static eul e(Context context) {
        String y = ino.M(context).y(R.string.f161570_resource_name_obfuscated_res_0x7f1406be);
        if (TextUtils.isEmpty(y)) {
            if (o(context)) {
                return d(context);
            }
            return j(context);
        } else if (y.equals(context.getString(R.string.f160020_resource_name_obfuscated_res_0x7f14061f))) {
            return d(context);
        } else {
            if (y.equals(context.getString(R.string.f160110_resource_name_obfuscated_res_0x7f140628))) {
                return j(context);
            }
            if (y.equals(context.getString(R.string.f160130_resource_name_obfuscated_res_0x7f14062a))) {
                return i(context);
            }
            return y.equals(context.getString(R.string.f160120_resource_name_obfuscated_res_0x7f140629)) ? h(context) : g(context, new eqg(y));
        }
    }

    public static eul f(Context context, String str) {
        return g(context, new eqg(erj.g(str)));
    }

    public static eul g(Context context, eqg eqgVar) {
        return new eul(new euj(context, eqgVar));
    }

    public static eul h(Context context) {
        return erg.a() ? new eul(new eug(context, false)) : g(context, eqg.d(context));
    }

    public static eul i(Context context) {
        return erg.a() ? new eul(new eug(context, true)) : g(context, eqg.f(context));
    }

    public static eul j(Context context) {
        return erg.a() ? new eul(new euk(context)) : g(context, eqg.f(context));
    }

    public static boolean o(Context context) {
        return eqg.b(context).h(context);
    }

    private final boolean q(Context context) {
        eri b = erj.b(context, this.b.b());
        return b != null && b.e().g;
    }

    public final eqg a() {
        return this.b.a();
    }

    public final eqg b() {
        return this.b.b();
    }

    public final erm c(Context context) {
        return erm.c(context, this.b.b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eul) {
            return this.b.equals(((eul) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String k() {
        return this.b.c();
    }

    public final void l() {
        this.b.e();
    }

    public final boolean m(Context context) {
        if (n(context)) {
            return q(context);
        }
        return q(context) || itb.h(context);
    }

    public final boolean n(Context context) {
        eri b = erj.b(context, this.b.b());
        return b != null && b.e().j;
    }

    public final boolean p() {
        return this.b.g();
    }

    public final String toString() {
        String obj = this.b.toString();
        return "ThemeListingItemSpec{" + obj + "}";
    }
}

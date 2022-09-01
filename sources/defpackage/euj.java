package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: euj  reason: default package */
/* loaded from: classes.dex */
final class euj implements eui {
    private final Context a;
    private final eqg b;

    public euj(Context context, eqg eqgVar) {
        this.a = context;
        this.b = eqgVar;
    }

    public static eui h(Context context, Bundle bundle) {
        return new euj(context, new eqg(bundle.getString("arg_simple_theme_name", "")));
    }

    @Override // defpackage.eui
    public final eqg a() {
        return this.b;
    }

    @Override // defpackage.eui
    public final eqg b() {
        return this.b;
    }

    @Override // defpackage.eui
    public final String c() {
        return this.b.a;
    }

    @Override // defpackage.eui
    public final void d(Bundle bundle) {
        bundle.putInt("arg_theme_spec_provider_type", 1);
        bundle.putString("arg_simple_theme_name", c());
    }

    @Override // defpackage.eui
    public final void e() {
        ino.M(this.a).u(R.string.f161570_resource_name_obfuscated_res_0x7f1406be, this.b.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof euj) {
            return this.b.equals(((euj) obj).b);
        }
        return false;
    }

    @Override // defpackage.eui
    public final boolean f() {
        return true;
    }

    @Override // defpackage.eui
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String obj = this.b.toString();
        return "SimpleThemeSpecProvider{" + obj + "}";
    }
}

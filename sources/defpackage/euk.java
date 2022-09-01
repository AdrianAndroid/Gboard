package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: euk  reason: default package */
/* loaded from: classes.dex */
final class euk implements eui {
    private final Context a;

    public euk(Context context) {
        this.a = context;
    }

    @Override // defpackage.eui
    public final eqg a() {
        return eqg.d(this.a);
    }

    @Override // defpackage.eui
    public final eqg b() {
        return eqg.f(this.a);
    }

    @Override // defpackage.eui
    public final String c() {
        return null;
    }

    @Override // defpackage.eui
    public final void d(Bundle bundle) {
        bundle.putInt("arg_theme_spec_provider_type", 2);
    }

    @Override // defpackage.eui
    public final void e() {
        if (eul.o(this.a)) {
            ino.M(this.a).u(R.string.f161570_resource_name_obfuscated_res_0x7f1406be, this.a.getString(R.string.f160110_resource_name_obfuscated_res_0x7f140628));
        } else {
            ino.M(this.a).v(R.string.f161570_resource_name_obfuscated_res_0x7f1406be);
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof euk;
    }

    @Override // defpackage.eui
    public final boolean f() {
        return false;
    }

    @Override // defpackage.eui
    public final boolean g() {
        return !b().equals(a());
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "SystemAutoThemeSpecProvider";
    }
}

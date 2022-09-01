package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: euh  reason: default package */
/* loaded from: classes.dex */
final class euh implements eui {
    private final Context a;
    private final eqg b;

    public euh(Context context) {
        this.a = context;
        this.b = eqg.c(context);
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
        bundle.putInt("arg_theme_spec_provider_type", 4);
    }

    @Override // defpackage.eui
    public final void e() {
        if (eul.o(this.a)) {
            ino.M(this.a).v(R.string.f161570_resource_name_obfuscated_res_0x7f1406be);
        } else {
            ino.M(this.a).u(R.string.f161570_resource_name_obfuscated_res_0x7f1406be, this.b.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof euh) {
            return this.b.equals(((euh) obj).b);
        }
        return false;
    }

    @Override // defpackage.eui
    public final boolean f() {
        return false;
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
        return "DynamicColorThemeSpecProvider{" + obj + "}";
    }
}

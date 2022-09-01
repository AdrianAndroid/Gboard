package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eug  reason: default package */
/* loaded from: classes.dex */
final class eug implements eui {
    private final Context a;
    private final boolean b;

    public eug(Context context, boolean z) {
        this.a = context;
        this.b = z;
    }

    @Override // defpackage.eui
    public final eqg a() {
        return b();
    }

    @Override // defpackage.eui
    public final eqg b() {
        return this.b ? eqg.f(this.a) : eqg.d(this.a);
    }

    @Override // defpackage.eui
    public final String c() {
        return null;
    }

    @Override // defpackage.eui
    public final void d(Bundle bundle) {
        bundle.putInt("arg_theme_spec_provider_type", 3);
        bundle.putBoolean("arg_dark_mode_locked_is_light_mode", this.b);
    }

    @Override // defpackage.eui
    public final void e() {
        ino.M(this.a).u(R.string.f161570_resource_name_obfuscated_res_0x7f1406be, this.a.getString(true != this.b ? R.string.f160120_resource_name_obfuscated_res_0x7f140629 : R.string.f160130_resource_name_obfuscated_res_0x7f14062a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eug) && this.b == ((eug) obj).b;
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
        return this.b ? 1231 : 1237;
    }

    public final String toString() {
        boolean z = this.b;
        return "DarkModeLockedSystemAutoThemeSpecProvider{" + z + "}";
    }
}

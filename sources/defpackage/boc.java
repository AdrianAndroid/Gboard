package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.inputmethod.latin.ImeLatinApp;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: boc  reason: default package */
/* loaded from: classes.dex */
public final class boc {
    final /* synthetic */ ImeLatinApp a;
    private volatile boolean b;

    public boc(ImeLatinApp imeLatinApp) {
        this.a = imeLatinApp;
    }

    public final void a() {
        this.b = false;
    }

    public final void b() {
        if (this.b) {
            this.b = false;
            gyc.b.execute(new hob((hrx) hrx.y(this.a), 14));
        }
    }

    public final boolean c(String str, Object obj, SharedPreferences sharedPreferences) {
        boolean z = true;
        if (!str.equals(this.a.getString(R.string.f161570_resource_name_obfuscated_res_0x7f1406be)) || !(obj instanceof String)) {
            boolean z2 = this.b;
            if (!str.equals(this.a.getString(R.string.f161120_resource_name_obfuscated_res_0x7f140690)) && !str.equals(this.a.getString(R.string.f160620_resource_name_obfuscated_res_0x7f14065e)) && !str.startsWith("multilingual:") && !str.startsWith("default_variant_")) {
                z = false;
            }
            this.b = z2 | z;
            return false;
        }
        ImeLatinApp imeLatinApp = this.a;
        String str2 = (String) obj;
        if (!erj.j(str2) || erj.l(imeLatinApp, str2)) {
            return false;
        }
        String h = erj.h(imeLatinApp, str2);
        if (h == null) {
            return true;
        }
        kcu.U(jez.b(imeLatinApp, h, false), new bpn(imeLatinApp, str2, sharedPreferences, str, 1), gyc.b);
        return true;
    }
}

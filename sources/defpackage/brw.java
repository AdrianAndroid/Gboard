package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import com.google.android.inputmethod.latin.R;
import j$.util.concurrent.ThreadLocalRandom;

/* compiled from: PG */
/* renamed from: brw  reason: default package */
/* loaded from: classes.dex */
public final class brw implements ahw {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/latin/preference/dictionary/LatinSyncDictionarySettings");
    protected Context c;
    public int d;
    public Preference e;
    public iyg g;
    public boolean h;
    private boolean i;
    private Preference k;
    public final guh b = new brv(this);
    private String j = "";
    public CharSequence f = "";

    public static int b() {
        return ThreadLocalRandom.current().nextInt(10000);
    }

    @Override // defpackage.ahw
    public final void a() {
        guc.a.a(this.c, "ClearDictionary");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        Preference preference;
        if (!this.h && (preference = this.e) != null) {
            preference.n(this.k == preference ? this.j : this.f);
            this.e.J(!this.i);
        }
    }

    public final void d(int i, boolean z) {
        if (i - 1 != 2) {
            this.i = false;
            this.j = this.c.getString(true != z ? R.string.f163730_resource_name_obfuscated_res_0x7f1407b4 : R.string.f163750_resource_name_obfuscated_res_0x7f1407b6);
            this.k = this.e;
            c();
            return;
        }
        this.i = true;
        this.j = this.c.getString(R.string.f163740_resource_name_obfuscated_res_0x7f1407b5);
        this.k = this.e;
        c();
    }
}

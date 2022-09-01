package defpackage;

import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ieq  reason: default package */
/* loaded from: classes.dex */
public final class ieq implements gjq {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/metricsgk/UserMetricsPreferencesCollectionBasisResolver");
    public final ino b;
    public volatile boolean d;
    public final inm e = new fdo(this, 13);
    public final int c = R.string.f161080_resource_name_obfuscated_res_0x7f14068c;
    private final int f = R.bool.f20080_resource_name_obfuscated_res_0x7f050059;
    private final boolean g = true;

    public ieq(ino inoVar) {
        this.b = inoVar;
        this.d = b(inoVar);
    }

    @Override // defpackage.gjq
    public final boolean a() {
        return this.d;
    }

    public final boolean b(ino inoVar) {
        return inoVar.am(this.c, this.f, this.g, false);
    }
}

package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: kio  reason: default package */
/* loaded from: classes.dex */
public final class kio {
    public final String a;
    public final String b = "ANDROID_IME_ANDROID_PRIMES";
    public final boolean c;
    private final kic d;
    private final kif e;
    private final kim f;

    public kio(Context context, lfb lfbVar, lfb lfbVar2, lfb lfbVar3, lfb lfbVar4) {
        String packageName = context.getPackageName();
        boolean booleanValue = ((Boolean) lfbVar4.c(false)).booleanValue();
        this.d = (kic) lfbVar.c(kic.b);
        this.e = (kif) lfbVar2.c(kif.b);
        this.f = (kim) lfbVar3.c(kim.b);
        this.c = booleanValue;
        this.a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(packageName));
    }

    public final mko a() {
        mko a = this.d.a();
        mko a2 = this.e.a();
        mko a3 = this.f.a();
        return kcu.X(a, a2, a3).a(new eid(this, a, a2, a3, 8), mjl.a);
    }
}

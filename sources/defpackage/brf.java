package defpackage;

import android.content.Context;
import androidx.preference.Preference;

/* compiled from: PG */
/* renamed from: brf  reason: default package */
/* loaded from: classes.dex */
final class brf extends hqq {
    final /* synthetic */ Preference a;
    final /* synthetic */ Context b;

    public brf(Preference preference, Context context) {
        this.a = preference;
        this.b = context;
    }

    @Override // defpackage.hqq
    public final void a(llp llpVar) {
        Preference preference = this.a;
        hrx.y(this.b);
        preference.n(jbt.L(", ", hqr.b(), hht.s));
    }
}

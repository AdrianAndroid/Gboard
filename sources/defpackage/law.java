package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: law  reason: default package */
/* loaded from: classes.dex */
final class law implements lam {
    final /* synthetic */ lbh a;
    final /* synthetic */ Intent b;
    final /* synthetic */ Context c;
    final /* synthetic */ lax d;

    public law(lax laxVar, lbh lbhVar, Intent intent, Context context) {
        this.d = laxVar;
        this.a = lbhVar;
        this.b = intent;
        this.c = context;
    }

    @Override // defpackage.lam
    public final void a() {
        this.d.h(this.a, 5, 0);
    }

    @Override // defpackage.lam
    public final void b(int i) {
        this.d.h(this.a, 6, i);
    }

    @Override // defpackage.lam
    public final void c() {
        if (!this.b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.b.putExtra("triggered_from_app_after_verification", true);
            this.c.sendBroadcast(this.b);
            return;
        }
        this.d.b.e("Splits copied and verified more than once.", new Object[0]);
    }
}

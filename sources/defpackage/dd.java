package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: dd  reason: default package */
/* loaded from: classes.dex */
final class dd extends aan {
    final /* synthetic */ dr a;

    public dd(dr drVar) {
        this.a = drVar;
    }

    @Override // defpackage.aan, defpackage.aam
    public final void a() {
        this.a.s.setAlpha(1.0f);
        this.a.N.l(null);
        this.a.N = null;
    }

    @Override // defpackage.aan, defpackage.aam
    public final void b() {
        this.a.s.setVisibility(0);
        if (this.a.s.getParent() instanceof View) {
            aad.K((View) this.a.s.getParent());
        }
    }
}

package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: ddm  reason: default package */
/* loaded from: classes.dex */
final class ddm implements ddv {
    final /* synthetic */ View a;
    final /* synthetic */ ddp b;

    public ddm(ddp ddpVar, View view) {
        this.b = ddpVar;
        this.a = view;
    }

    @Override // defpackage.ddv
    public final void a() {
        ddp ddpVar = this.b;
        if (ddpVar.g) {
            ddpVar.b(ddpVar.h, ddpVar.i, ddpVar.j);
            ddp ddpVar2 = this.b;
            ddpVar2.h = null;
            ddpVar2.i = null;
            ddpVar2.j = false;
            ddpVar2.g = false;
            this.a.measure(0, 0);
        }
    }

    @Override // defpackage.ddv
    public final void b() {
        ddx ddxVar = this.b.e;
        if (ddxVar != null) {
            ddxVar.C();
            this.a.measure(0, 0);
        }
    }
}

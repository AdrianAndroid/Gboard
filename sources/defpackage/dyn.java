package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* renamed from: dyn  reason: default package */
/* loaded from: classes.dex */
final class dyn implements hws {
    final /* synthetic */ dyp a;

    public dyn(dyp dypVar) {
        this.a = dypVar;
    }

    @Override // defpackage.hws
    public final void hL() {
        dyp dypVar = this.a;
        if (dypVar.f != null) {
            dypVar.b();
            this.a.h = true;
        }
    }

    @Override // defpackage.hws
    public final void hM() {
        iou iouVar = this.a.f;
        if (iouVar != null) {
            lgb lgbVar = iouVar.g;
            if (lgbVar == null || ((Boolean) lgbVar.a()).booleanValue()) {
                dyp dypVar = this.a;
                iou iouVar2 = dypVar.f;
                if (iouVar2 == null || !dypVar.h) {
                    return;
                }
                hwv hwvVar = dypVar.g;
                if (hwvVar == null) {
                    hwvVar = hwv.DEFAULT;
                }
                dypVar.i(iouVar2, hwvVar);
                return;
            }
            this.a.e();
        }
    }

    @Override // defpackage.hws
    public final /* synthetic */ Animator m() {
        return null;
    }
}

package defpackage;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ol  reason: default package */
/* loaded from: classes2.dex */
public final class ol extends oq {
    final /* synthetic */ int a;
    final /* synthetic */ mo b;
    final /* synthetic */ ot c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(ot otVar, mo moVar, int i, float f, float f2, float f3, float f4, int i2, mo moVar2) {
        super(moVar, i, f, f2, f3, f4);
        this.c = otVar;
        this.a = i2;
        this.b = moVar2;
    }

    @Override // defpackage.oq, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.n) {
            return;
        }
        if (this.a <= 0) {
            ot otVar = this.c;
            otVar.j.g(otVar.m, this.b);
        } else {
            this.c.a.add(this.b.a);
            this.k = true;
            if (this.a > 0) {
                ot otVar2 = this.c;
                otVar2.m.post(new bw(otVar2, (oq) this, 7));
            }
        }
        ot otVar3 = this.c;
        View view = otVar3.p;
        View view2 = this.b.a;
        if (view != view2) {
            return;
        }
        otVar3.n(view2);
    }
}

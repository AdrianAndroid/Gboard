package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* renamed from: dyg  reason: default package */
/* loaded from: classes.dex */
public final class dyg implements Animator.AnimatorListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public dyg(aji ajiVar, ajh ajhVar, int i) {
        this.c = i;
        this.b = ajiVar;
        this.a = ajhVar;
    }

    public dyg(dyi dyiVar, View view, int i) {
        this.c = i;
        this.b = dyiVar;
        this.a = view;
    }

    public dyg(ilu iluVar, View view, int i) {
        this.c = i;
        this.b = iluVar;
        this.a = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (this.c != 1) {
            return;
        }
        ((aji) this.b).a(1.0f, (ajh) this.a, true);
        ((ajh) this.a).e();
        ajh ajhVar = (ajh) this.a;
        ajhVar.f();
        ajhVar.g();
        aji ajiVar = (aji) this.b;
        if (!ajiVar.d) {
            ajiVar.c += 1.0f;
            return;
        }
        ajiVar.d = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            ((aji) this.b).c = 0.0f;
            return;
        }
        ((dyi) this.b).b((View) this.a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                return;
            }
            ((ilu) this.b).b.b((View) this.a, 2);
            return;
        }
        ((dyi) this.b).b((View) this.a);
    }
}

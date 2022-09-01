package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hek  reason: default package */
/* loaded from: classes.dex */
public final class hek {
    public static volatile hek a;
    public final Object b;

    public hek() {
        this.b = gxo.a(1);
    }

    public hek(nfh nfhVar) {
        this.b = nfhVar;
    }

    public hek(nsx nsxVar, byte[] bArr) {
        this.b = nsxVar;
    }

    public hek(byte[] bArr) {
        this.b = new xy(10);
    }

    public static Animator[] h(View view, Context context, AttributeSet attributeSet) {
        if (gqa.a(context).e) {
            return null;
        }
        int f = jgd.f(context, attributeSet, null, "show_animation", 0);
        int f2 = jgd.f(context, attributeSet, null, "hide_animation", 0);
        if (f == 0) {
            if (f2 == 0) {
                return null;
            }
            f = 0;
        }
        return new Animator[]{j(view, context, f), j(view, context, f2)};
    }

    public static igc i() {
        return new igc();
    }

    private static Animator j(View view, Context context, int i) {
        if (i == 0) {
            return null;
        }
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
        if (loadAnimator != null) {
            loadAnimator.setTarget(view);
        }
        return loadAnimator;
    }

    public final /* synthetic */ hih a() {
        nfm cz = ((nfh) this.b).cz();
        oll.d(cz, "_builder.build()");
        return (hih) cz;
    }

    public final void b(double d) {
        nfh nfhVar = (nfh) this.b;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        hih hihVar = (hih) nfhVar.b;
        hih hihVar2 = hih.c;
        hihVar.a = 3;
        hihVar.b = Double.valueOf(d);
    }

    public final void c(long j) {
        nfh nfhVar = (nfh) this.b;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        hih hihVar = (hih) nfhVar.b;
        hih hihVar2 = hih.c;
        hihVar.a = 2;
        hihVar.b = Long.valueOf(j);
    }

    public final hiz d(Callable callable, Executor executor) {
        return hiz.k(((nsx) this.b).a(callable, executor));
    }

    public final hiz e(mix mixVar, Executor executor) {
        return hiz.k(((nsx) this.b).b(mixVar, executor));
    }

    public final hiz f() {
        return d(hji.b, mjl.a);
    }

    public final void g(Animator animator, ilv ilvVar, int i) {
        if (animator != null) {
            ilt iltVar = (ilt) ((xy) this.b).a();
            if (iltVar != null) {
                iltVar.a = ilvVar;
                iltVar.b = i;
            } else {
                iltVar = new ilt(this, ilvVar, i, null, null);
            }
            animator.addListener(iltVar);
        }
    }

    public hek(ibw ibwVar, ibz ibzVar) {
        int[] d = ibwVar.d(ibzVar);
        this.b = d;
        if (d != null) {
            return;
        }
        throw new lgj("No resources for keyboard defs.");
    }

    public hek(Context context) {
        this.b = jdg.n(new ihp(context, 1));
    }

    public hek(igc igcVar) {
        ibz[] ibzVarArr = new ibz[igcVar.a.size()];
        this.b = ibzVarArr;
        igcVar.a.toArray(ibzVarArr);
    }

    public hek(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843091});
        this.b = obtainStyledAttributes.hasValue(0) ? Integer.valueOf(obtainStyledAttributes.getInteger(0, 100)) : null;
        obtainStyledAttributes.recycle();
    }
}

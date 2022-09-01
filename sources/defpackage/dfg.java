package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: dfg  reason: default package */
/* loaded from: classes.dex */
final class dfg extends akt {
    final /* synthetic */ dfh a;

    public dfg(dfh dfhVar) {
        this.a = dfhVar;
    }

    @Override // defpackage.ald
    public final int a() {
        return this.a.B;
    }

    @Override // defpackage.ald
    public final Object b(ViewGroup viewGroup, int i) {
        View view;
        dfh dfhVar = this.a;
        der derVar = dfhVar.A;
        if (derVar == null) {
            view = dfhVar.F();
        } else {
            dfhVar.A = null;
            view = (View) derVar;
        }
        dfh dfhVar2 = this.a;
        if (dfhVar2.t > 0) {
            int measuredWidth = dfhVar2.getMeasuredWidth();
            dfh dfhVar3 = this.a;
            int i2 = measuredWidth / dfhVar3.t;
            dfhVar3.fI(-i2);
            view.setPadding(0, 0, i2, 0);
        }
        viewGroup.addView(view, 0);
        dfh dfhVar4 = this.a;
        der derVar2 = (der) view;
        derVar2.A(dfhVar4.D);
        derVar2.t(dfhVar4.E);
        derVar2.y(dfhVar4.F, dfhVar4.G);
        derVar2.h(dfhVar4.v(i, derVar2, dfhVar4.J.get(i)));
        return view;
    }

    @Override // defpackage.ald
    public final void c(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
        this.a.N.b(obj);
    }

    @Override // defpackage.ald
    public final boolean h(View view, Object obj) {
        return view == obj;
    }

    @Override // defpackage.ald
    public final void i() {
    }

    @Override // defpackage.ald
    public final int j() {
        return -2;
    }

    @Override // defpackage.ald
    public final void k(int i, Object obj) {
        this.a.z = (der) obj;
    }
}

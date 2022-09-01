package defpackage;

import android.net.Uri;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: eks  reason: default package */
/* loaded from: classes.dex */
public class eks extends ls {
    public final List d = new ArrayList();
    final /* synthetic */ ekt e;

    /* JADX INFO: Access modifiers changed from: protected */
    public eks(ekt ektVar) {
        this.e = ektVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int A(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int B() {
        return this.d.size();
    }

    public final void C() {
        this.d.clear();
        fc();
    }

    @Override // defpackage.ls
    public mo d(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e.T).inflate(this.e.U, viewGroup, false);
        frameLayout.setVisibility(0);
        return new ekp(this.e, frameLayout);
    }

    @Override // defpackage.ls
    public int ha() {
        return x();
    }

    @Override // defpackage.ls
    public int he(int i) {
        return 0;
    }

    @Override // defpackage.ls
    public void o(mo moVar, int i) {
        CharSequence charSequence;
        int y = y(i);
        cqp cqpVar = (cqp) this.d.get(y);
        if (cqpVar == null) {
            ((ltd) ((ltd) ekt.S.c()).k("com/google/android/apps/inputmethod/libs/search/widget/AnimatedImageHolderView$SoftKeyScrollAdapter", "onBindViewHolder", 349, "AnimatedImageHolderView.java")).J("onBindViewHolder called with invalid image index %d and adapter position %d (mImages.size() == %d)", Integer.valueOf(y), Integer.valueOf(i), Integer.valueOf(this.d.size()));
            return;
        }
        ekp ekpVar = (ekp) moVar;
        ekpVar.s.f(ekpVar.B);
        View view = ekpVar.u;
        if (view != null) {
            view.setVisibility(8);
        }
        ekpVar.s.setOnClickListener(null);
        dxs dxsVar = ekpVar.C.af;
        if (dxsVar != null) {
            ekpVar.s.e(dxsVar.m(cqpVar.d()));
        }
        ekpVar.s.b(cqpVar, ekpVar.w);
        if (ekpVar.A.e()) {
            ((AppCompatTextView) ekpVar.A.a()).setVisibility(8);
        }
        AppCompatTextView appCompatTextView = ekpVar.t;
        if (appCompatTextView != null) {
            appCompatTextView.setText(cqpVar.p());
        }
        ekpVar.s.setContentDescription(cqpVar.n() != null ? cqpVar.n() : ekpVar.x);
        ekpVar.z = cqpVar;
        if (!ekpVar.A.e() || !cqpVar.j().e()) {
            return;
        }
        ((AppCompatTextView) ekpVar.A.a()).setVisibility(0);
        cha chaVar = ekpVar.s;
        if (cqpVar.n() != null) {
            charSequence = String.format("%s (%s)", cqpVar.n(), ((AppCompatTextView) ekpVar.A.a()).getContentDescription());
        } else {
            charSequence = ekpVar.y;
        }
        chaVar.setContentDescription(charSequence);
    }

    @Override // defpackage.ls
    public final void p(mo moVar, int i, List list) {
        boolean z = false;
        for (Object obj : list) {
            if (obj instanceof chh) {
                ((ekp) moVar).s.e((chh) obj);
                z = true;
            }
        }
        if (!z) {
            o(moVar, i);
        }
    }

    @Override // defpackage.ls
    public final void r(mo moVar) {
        if (moVar instanceof ekp) {
            lfb f = lfb.f(((ekp) moVar).z);
            if (!f.e() || !((cqp) f.a()).j().e()) {
                return;
            }
            dxs dxsVar = this.e.ae;
            cyo f2 = cyp.f();
            f2.c = 1;
            f2.b(((crn) ((cqp) f.a()).j().a()).a);
            dxsVar.i(f2.a());
            llp llpVar = ((crn) ((cqp) f.a()).j().a()).b;
            int i = ((lrl) llpVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                this.e.ae.l((Uri) llpVar.get(i2));
            }
        }
    }

    @Override // defpackage.ls
    public void t(mo moVar) {
        ((ekp) moVar).s.d();
    }

    public final int x() {
        return this.d.size();
    }

    protected int y(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int z(cqp cqpVar) {
        return this.d.indexOf(cqpVar);
    }
}

package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ekw  reason: default package */
/* loaded from: classes.dex */
public class ekw extends eks {
    final /* synthetic */ ekx f;
    public int g = 1;
    elc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekw(ekx ekxVar) {
        super(ekxVar);
        this.f = ekxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eks
    public final int A(int i) {
        return this.g == 1 ? i + D() : i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eks
    public final int B() {
        return this.g == 1 ? ha() : super.B();
    }

    protected final int D() {
        return this.h != null ? 1 : 0;
    }

    protected int E() {
        return R.layout.f133530_resource_name_obfuscated_res_0x7f0e002a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean F(int i) {
        return i == G(this.g) && D() > 0;
    }

    public final int G(int i) {
        if (i == 1) {
            return 0;
        }
        return x();
    }

    @Override // defpackage.eks, defpackage.ls
    public mo d(ViewGroup viewGroup, int i) {
        if (i == 1) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f.getContext()).inflate(E(), viewGroup, false);
            frameLayout.setVisibility(0);
            return new ekv(frameLayout);
        }
        return super.d(viewGroup, i);
    }

    @Override // defpackage.eks, defpackage.ls
    public final int ha() {
        return x() + D();
    }

    @Override // defpackage.eks, defpackage.ls
    public final int he(int i) {
        return F(i) ? 1 : 0;
    }

    @Override // defpackage.eks, defpackage.ls
    public void o(mo moVar, int i) {
        if (F(i)) {
            ekv ekvVar = (ekv) moVar;
            elc elcVar = this.h;
            ekvVar.s.removeAllViews();
            if (elcVar == null) {
                return;
            }
            View view = elcVar.a;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
                ((ltd) ((ltd) ekx.ag.d()).k("com/google/android/apps/inputmethod/libs/search/widget/AnimatedImageSidebarHolderView$ImageAndSidebarAdapter$SidebarAdapterViewHolder", "setSidebar", 244, "AnimatedImageSidebarHolderView.java")).w("Sidebar was not removed from it's previous parent %s", elcVar);
            }
            ekvVar.s.addView(view);
            view.setVisibility(0);
            return;
        }
        super.o(moVar, i);
    }

    @Override // defpackage.eks, defpackage.ls
    public final void t(mo moVar) {
        if (moVar instanceof ekv) {
            ((ekv) moVar).s.removeAllViews();
        } else {
            super.t(moVar);
        }
    }

    @Override // defpackage.eks
    protected final int y(int i) {
        return this.g == 1 ? i - D() : i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eks
    public final int z(cqp cqpVar) {
        return this.g == 1 ? super.z(cqpVar) + D() : super.z(cqpVar);
    }
}

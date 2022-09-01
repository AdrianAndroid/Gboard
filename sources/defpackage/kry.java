package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* renamed from: kry  reason: default package */
/* loaded from: classes.dex */
public final class kry implements yy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kry(CoordinatorLayout coordinatorLayout, int i) {
        this.b = i;
        this.a = coordinatorLayout;
    }

    public kry(AppBarLayout appBarLayout, int i) {
        this.b = i;
        this.a = appBarLayout;
    }

    public kry(ktb ktbVar, int i) {
        this.b = i;
        this.a = ktbVar;
    }

    @Override // defpackage.yy
    public final abc a(View view, abc abcVar) {
        int i = this.b;
        boolean z = true;
        if (i == 0) {
            Object obj = this.a;
            abc abcVar2 = true != aad.ad((View) obj) ? null : abcVar;
            AppBarLayout appBarLayout = (AppBarLayout) obj;
            if (!xu.b(appBarLayout.c, abcVar2)) {
                appBarLayout.c = abcVar2;
                appBarLayout.j();
                appBarLayout.requestLayout();
            }
            return abcVar;
        } else if (i == 1) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
            if (!xu.b(coordinatorLayout.e, abcVar)) {
                coordinatorLayout.e = abcVar;
                boolean z2 = abcVar.d() > 0;
                coordinatorLayout.f = z2;
                if (z2 || coordinatorLayout.getBackground() != null) {
                    z = false;
                }
                coordinatorLayout.setWillNotDraw(z);
                if (!abcVar.r()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = coordinatorLayout.getChildAt(i2);
                        if (aad.ad(childAt) && ((tr) childAt.getLayoutParams()).a != null && abcVar.r()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return abcVar;
        } else {
            ktb ktbVar = (ktb) this.a;
            kta ktaVar = ktbVar.f;
            if (ktaVar != null) {
                ktbVar.a.C.remove(ktaVar);
            }
            ktb ktbVar2 = (ktb) this.a;
            ktbVar2.f = new kta(ktbVar2.b, abcVar);
            ktb ktbVar3 = (ktb) this.a;
            ktbVar3.f.d(ktbVar3.getWindow());
            ktb ktbVar4 = (ktb) this.a;
            ktbVar4.a.w(ktbVar4.f);
            return abcVar;
        }
    }
}

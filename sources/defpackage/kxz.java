package defpackage;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* compiled from: PG */
/* renamed from: kxz  reason: default package */
/* loaded from: classes.dex */
public final class kxz implements yy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kxz(CollapsingToolbarLayout collapsingToolbarLayout, int i) {
        this.b = i;
        this.a = collapsingToolbarLayout;
    }

    public kxz(kye kyeVar, int i) {
        this.b = i;
        this.a = kyeVar;
    }

    @Override // defpackage.yy
    public final abc a(View view, abc abcVar) {
        if (this.b == 0) {
            ((kye) this.a).f = abcVar.a();
            ((kye) this.a).g = abcVar.b();
            ((kye) this.a).h = abcVar.c();
            ((kye) this.a).i();
            return abcVar;
        }
        Object obj = this.a;
        abc abcVar2 = true != aad.ad((View) obj) ? null : abcVar;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) obj;
        if (!xu.b(collapsingToolbarLayout.f, abcVar2)) {
            collapsingToolbarLayout.f = abcVar2;
            collapsingToolbarLayout.requestLayout();
        }
        return abcVar.k();
    }
}

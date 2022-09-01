package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.google.android.apps.inputmethod.libs.framework.firstrun.PageIndicatorView;

/* compiled from: PG */
/* renamed from: ddh  reason: default package */
/* loaded from: classes.dex */
public final class ddh extends ddz {
    final /* synthetic */ ddi a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ddh(ddi ddiVar) {
        this.a = ddiVar;
    }

    @Override // defpackage.ald
    public final int a() {
        return this.a.r.length;
    }

    @Override // defpackage.ald
    public final Object b(ViewGroup viewGroup, int i) {
        int i2 = this.a.r[l(i)];
        if (i2 == 0) {
            ((luc) ddi.k.a(hip.a).k("com/google/android/apps/inputmethod/libs/framework/firstrun/FirstRunActivity$SimpleBidiPageAdapter", "instantiateItem", 139, "FirstRunActivity.java")).u("Got invalid layout at pos=%s", i);
            return new Space(this.a);
        }
        View inflate = View.inflate(this.a, i2, null);
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    @Override // defpackage.ald
    public final void c(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // defpackage.ald
    public final boolean h(View view, Object obj) {
        return view == obj;
    }

    @Override // defpackage.ald
    public final void k(int i, Object obj) {
        int l = l(i);
        ddi ddiVar = this.a;
        PageIndicatorView pageIndicatorView = ddiVar.q;
        if (pageIndicatorView != null && ddiVar.r.length > 1) {
            pageIndicatorView.a(l);
        }
        ddi ddiVar2 = this.a;
        int length = ddiVar2.r.length - 1;
        int i2 = 4;
        int i3 = l == length ? 0 : 4;
        View view = ddiVar2.p;
        if (view != null) {
            view.setVisibility(i3);
        }
        ddi ddiVar3 = this.a;
        if (l != length) {
            i2 = 0;
        }
        View view2 = ddiVar3.o;
        if (view2 != null) {
            view2.setVisibility(i2);
        }
        View view3 = this.a.n;
        if (view3 != null) {
            view3.setVisibility(i2);
        }
        ddi ddiVar4 = this.a;
        ddiVar4.t = l;
        String str = (String) ddi.l.get(ddiVar4.r[l]);
        if (TextUtils.isEmpty(str)) {
            ((luc) ((luc) ddi.k.b()).k("com/google/android/apps/inputmethod/libs/framework/firstrun/FirstRunActivity$SimpleBidiPageAdapter", "setPrimaryItem", 175, "FirstRunActivity.java")).u("Failed to find name for id: %s", this.a.r[l]);
        } else {
            ieh.j().e(dda.SETUP_WIZARD_PAGE_SHOWN, str);
        }
    }
}

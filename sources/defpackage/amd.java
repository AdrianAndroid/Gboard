package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* renamed from: amd  reason: default package */
/* loaded from: classes.dex */
public final class amd extends wi {
    final /* synthetic */ ViewPager2 a;
    private final abs b = new amb(this, 1);
    private final abs c = new amb(this, 0);
    private dg d;

    public amd(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.wi
    public final String d() {
        return "androidx.viewpager.widget.ViewPager";
    }

    @Override // defpackage.wi
    public final void e(ls lsVar) {
        x();
        if (lsVar != null) {
            lsVar.hm(this.d);
        }
    }

    @Override // defpackage.wi
    public final void f(ls lsVar) {
        if (lsVar != null) {
            lsVar.hn(this.d);
        }
    }

    @Override // defpackage.wi
    public final void g(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int ha;
        abj b = abj.b(accessibilityNodeInfo);
        if (this.a.c() == null) {
            i = 0;
            i2 = 0;
        } else if (this.a.a() == 1) {
            i = this.a.c().ha();
            i2 = 1;
        } else {
            i2 = this.a.c().ha();
            i = 1;
        }
        b.i(aqq.E(i, i2, 0));
        ls c = this.a.c();
        if (c == null || (ha = c.ha()) == 0) {
            return;
        }
        ViewPager2 viewPager2 = this.a;
        if (!viewPager2.j) {
            return;
        }
        if (viewPager2.c > 0) {
            b.d(8192);
        }
        if (this.a.c < ha - 1) {
            b.d(4096);
        }
        b.l(true);
    }

    @Override // defpackage.wi
    public final void i(View view, abj abjVar) {
        abjVar.j(aqq.D(this.a.a() == 1 ? LinearLayoutManager.bo(view) : 0, 1, this.a.a() == 0 ? LinearLayoutManager.bo(view) : 0, 1, false));
    }

    @Override // defpackage.wi
    public final void j() {
        x();
    }

    @Override // defpackage.wi
    public final void k(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setSource(this.a);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // defpackage.wi
    public final void l() {
        x();
    }

    @Override // defpackage.wi
    public final void m() {
        x();
    }

    @Override // defpackage.wi
    public final void n() {
        x();
    }

    @Override // defpackage.wi
    public final void o() {
        x();
    }

    @Override // defpackage.wi
    public final boolean p() {
        return true;
    }

    @Override // defpackage.wi
    public final boolean s(int i) {
        return i == 8192 || i == 4096;
    }

    @Override // defpackage.wi
    public final void t(RecyclerView recyclerView) {
        aad.U(recyclerView, 2);
        this.d = new amc(this);
        if (aad.d(this.a) == 0) {
            aad.U(this.a, 1);
        }
    }

    @Override // defpackage.wi
    public final void v(int i) {
        if (!s(i)) {
            throw new IllegalStateException();
        }
        w(i == 8192 ? this.a.c - 1 : this.a.c + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.j) {
            viewPager2.h(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x() {
        int ha;
        ViewPager2 viewPager2 = this.a;
        int i = 16908360;
        aad.J(viewPager2, 16908360);
        aad.J(viewPager2, 16908361);
        aad.J(viewPager2, 16908358);
        aad.J(viewPager2, 16908359);
        if (this.a.c() == null || (ha = this.a.c().ha()) == 0) {
            return;
        }
        ViewPager2 viewPager22 = this.a;
        if (!viewPager22.j) {
            return;
        }
        if (viewPager22.a() != 0) {
            if (this.a.c < ha - 1) {
                aad.am(viewPager2, new abi(16908359, (CharSequence) null), this.b);
            }
            if (this.a.c <= 0) {
                return;
            }
            aad.am(viewPager2, new abi(16908358, (CharSequence) null), this.c);
            return;
        }
        boolean f = this.a.f();
        int i2 = true != f ? 16908361 : 16908360;
        if (true == f) {
            i = 16908361;
        }
        if (this.a.c < ha - 1) {
            aad.am(viewPager2, new abi(i2, (CharSequence) null), this.b);
        }
        if (this.a.c <= 0) {
            return;
        }
        aad.am(viewPager2, new abi(i, (CharSequence) null), this.c);
    }
}

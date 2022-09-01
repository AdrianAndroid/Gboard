package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* renamed from: alv  reason: default package */
/* loaded from: classes.dex */
public final class alv extends wj {
    final /* synthetic */ ViewPager2 a;

    public alv(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.wj
    public final void e(int i) {
        if (i == 0) {
            this.a.e();
        }
    }

    @Override // defpackage.wj
    public final void g(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.c != i) {
            viewPager2.c = i;
            viewPager2.m.m();
        }
    }
}

package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* renamed from: alw  reason: default package */
/* loaded from: classes.dex */
public final class alw extends wj {
    final /* synthetic */ ViewPager2 a;

    public alw(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.wj
    public final void g(int i) {
        this.a.clearFocus();
        if (this.a.hasFocus()) {
            this.a.f.requestFocus(2);
        }
    }
}

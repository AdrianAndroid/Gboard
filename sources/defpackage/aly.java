package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* renamed from: aly  reason: default package */
/* loaded from: classes.dex */
public final class aly extends wi {
    final /* synthetic */ ViewPager2 a;

    public aly(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.wi
    public final CharSequence c() {
        return "androidx.viewpager.widget.ViewPager";
    }

    @Override // defpackage.wi
    public final void h(abj abjVar) {
        if (!this.a.j) {
            abjVar.o(abi.c);
            abjVar.o(abi.b);
            abjVar.l(false);
        }
    }

    @Override // defpackage.wi
    public final boolean q(int i) {
        return (i == 8192 || i == 4096) && !this.a.j;
    }

    @Override // defpackage.wi
    public final boolean r() {
        return true;
    }

    @Override // defpackage.wi
    public final void u(int i) {
        if (q(i)) {
            return;
        }
        throw new IllegalStateException();
    }
}

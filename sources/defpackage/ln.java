package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: ln  reason: default package */
/* loaded from: classes.dex */
final class ln extends lp {
    public ln(ly lyVar) {
        super(lyVar);
    }

    @Override // defpackage.lp
    public final int a(View view) {
        return ly.bA(view) + ((lz) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.lp
    public final int b(View view) {
        lz lzVar = (lz) view.getLayoutParams();
        return ly.bm(view) + lzVar.leftMargin + lzVar.rightMargin;
    }

    @Override // defpackage.lp
    public final int c(View view) {
        lz lzVar = (lz) view.getLayoutParams();
        return ly.bl(view) + lzVar.topMargin + lzVar.bottomMargin;
    }

    @Override // defpackage.lp
    public final int d(View view) {
        return ly.bz(view) - ((lz) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.lp
    public final int e() {
        return this.a.C;
    }

    @Override // defpackage.lp
    public final int f() {
        ly lyVar = this.a;
        return lyVar.C - lyVar.aA();
    }

    @Override // defpackage.lp
    public final int g() {
        return this.a.aA();
    }

    @Override // defpackage.lp
    public final int h() {
        return this.a.A;
    }

    @Override // defpackage.lp
    public final int i() {
        return this.a.B;
    }

    @Override // defpackage.lp
    public final int j() {
        return this.a.az();
    }

    @Override // defpackage.lp
    public final int k() {
        ly lyVar = this.a;
        return (lyVar.C - lyVar.az()) - this.a.aA();
    }

    @Override // defpackage.lp
    public final int l(View view) {
        this.a.br(view, this.c);
        return this.c.right;
    }

    @Override // defpackage.lp
    public final int m(View view) {
        this.a.br(view, this.c);
        return this.c.left;
    }

    @Override // defpackage.lp
    public final void n(int i) {
        this.a.aN(i);
    }
}

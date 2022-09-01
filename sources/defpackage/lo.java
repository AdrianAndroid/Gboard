package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: lo  reason: default package */
/* loaded from: classes.dex */
final class lo extends lp {
    public lo(ly lyVar) {
        super(lyVar);
    }

    @Override // defpackage.lp
    public final int a(View view) {
        return ly.by(view) + ((lz) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.lp
    public final int b(View view) {
        lz lzVar = (lz) view.getLayoutParams();
        return ly.bl(view) + lzVar.topMargin + lzVar.bottomMargin;
    }

    @Override // defpackage.lp
    public final int c(View view) {
        lz lzVar = (lz) view.getLayoutParams();
        return ly.bm(view) + lzVar.leftMargin + lzVar.rightMargin;
    }

    @Override // defpackage.lp
    public final int d(View view) {
        return ly.bB(view) - ((lz) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.lp
    public final int e() {
        return this.a.D;
    }

    @Override // defpackage.lp
    public final int f() {
        ly lyVar = this.a;
        return lyVar.D - lyVar.ay();
    }

    @Override // defpackage.lp
    public final int g() {
        return this.a.ay();
    }

    @Override // defpackage.lp
    public final int h() {
        return this.a.B;
    }

    @Override // defpackage.lp
    public final int i() {
        return this.a.A;
    }

    @Override // defpackage.lp
    public final int j() {
        return this.a.aB();
    }

    @Override // defpackage.lp
    public final int k() {
        ly lyVar = this.a;
        return (lyVar.D - lyVar.aB()) - this.a.ay();
    }

    @Override // defpackage.lp
    public final int l(View view) {
        this.a.br(view, this.c);
        return this.c.bottom;
    }

    @Override // defpackage.lp
    public final int m(View view) {
        this.a.br(view, this.c);
        return this.c.top;
    }

    @Override // defpackage.lp
    public final void n(int i) {
        this.a.aO(i);
    }
}

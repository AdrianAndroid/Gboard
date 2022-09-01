package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lw  reason: default package */
/* loaded from: classes.dex */
public final class lw implements og {
    final /* synthetic */ ly a;
    private final /* synthetic */ int b;

    public lw(ly lyVar, int i) {
        this.b = i;
        this.a = lyVar;
    }

    @Override // defpackage.og
    public final int c() {
        int i;
        int ay;
        if (this.b != 0) {
            ly lyVar = this.a;
            i = lyVar.C;
            ay = lyVar.aA();
        } else {
            ly lyVar2 = this.a;
            i = lyVar2.D;
            ay = lyVar2.ay();
        }
        return i - ay;
    }

    @Override // defpackage.og
    public final int d() {
        return this.b != 0 ? this.a.az() : this.a.aB();
    }

    @Override // defpackage.og
    public final View e(int i) {
        return this.b != 0 ? this.a.aE(i) : this.a.aE(i);
    }

    @Override // defpackage.og
    public final int a(View view) {
        int by;
        int i;
        if (this.b == 0) {
            by = ly.by(view);
            i = ((lz) view.getLayoutParams()).bottomMargin;
        } else {
            by = ly.bA(view);
            i = ((lz) view.getLayoutParams()).rightMargin;
        }
        return by + i;
    }

    @Override // defpackage.og
    public final int b(View view) {
        int bB;
        int i;
        if (this.b == 0) {
            bB = ly.bB(view);
            i = ((lz) view.getLayoutParams()).topMargin;
        } else {
            bB = ly.bz(view);
            i = ((lz) view.getLayoutParams()).leftMargin;
        }
        return bB - i;
    }
}

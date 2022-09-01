package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: bfa  reason: default package */
/* loaded from: classes.dex */
public abstract class bfa implements bfh {
    public bep c;

    public bfa() {
        if (bgj.p(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    @Override // defpackage.bfh
    public final void a(Drawable drawable) {
    }

    @Override // defpackage.bfh
    public final bep d() {
        return this.c;
    }

    @Override // defpackage.bfh
    public final void e(bfg bfgVar) {
        bfgVar.g(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.bfh
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.bfh
    public final void g(bfg bfgVar) {
    }

    @Override // defpackage.bfh
    public final void h(bep bepVar) {
        this.c = bepVar;
    }

    @Override // defpackage.bdj
    public final void m() {
    }

    @Override // defpackage.bdj
    public final void n() {
    }

    @Override // defpackage.bdj
    public final void o() {
    }
}

package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: bq  reason: default package */
/* loaded from: classes.dex */
public abstract class bq {
    int e;
    int f;
    int g;
    int h;
    int i;
    boolean j;
    String l;
    public int m;
    public CharSequence n;
    int o;
    CharSequence p;
    ArrayList q;
    ArrayList r;
    final ArrayList d = new ArrayList();
    boolean k = true;
    boolean s = false;

    public abstract void d();

    public abstract void e();

    public void f(int i, an anVar, String str, int i2) {
        throw null;
    }

    public abstract void j();

    public abstract void k();

    public void m(an anVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(bp bpVar) {
        this.d.add(bpVar);
        bpVar.d = this.e;
        bpVar.e = this.f;
        bpVar.f = this.g;
        bpVar.g = this.h;
    }

    public final void o(an anVar, String str) {
        f(0, anVar, str, 1);
    }

    public final void p() {
        if (this.k) {
            this.j = true;
            this.l = null;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void q() {
        if (!this.j) {
            this.k = false;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    @Deprecated
    public final void r(CharSequence charSequence) {
        this.m = 0;
        this.n = charSequence;
    }

    public final void s() {
        this.s = true;
    }

    public final void t(int i, an anVar) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        f(i, anVar, null, 2);
    }
}

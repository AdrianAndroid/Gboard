package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* renamed from: aas  reason: default package */
/* loaded from: classes.dex */
public class aas extends aau {
    final WindowInsets.Builder a;

    public aas() {
        this.a = new WindowInsets.Builder();
    }

    @Override // defpackage.aau
    public abc a() {
        h();
        abc m = abc.m(this.a.build());
        m.p(this.b);
        return m;
    }

    @Override // defpackage.aau
    public void b(vq vqVar) {
        this.a.setStableInsets(vqVar.a());
    }

    @Override // defpackage.aau
    public void c(vq vqVar) {
        this.a.setSystemWindowInsets(vqVar.a());
    }

    @Override // defpackage.aau
    public void d(vq vqVar) {
        this.a.setMandatorySystemGestureInsets(vqVar.a());
    }

    @Override // defpackage.aau
    public void e(vq vqVar) {
        this.a.setSystemGestureInsets(vqVar.a());
    }

    @Override // defpackage.aau
    public void f(vq vqVar) {
        this.a.setTappableElementInsets(vqVar.a());
    }

    public aas(abc abcVar) {
        super(abcVar);
        WindowInsets.Builder builder;
        WindowInsets e = abcVar.e();
        if (e != null) {
            builder = new WindowInsets.Builder(e);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.a = builder;
    }
}

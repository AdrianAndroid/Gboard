package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lhr  reason: default package */
/* loaded from: classes.dex */
public class lhr extends lgt {
    final Object g;
    final int h;
    final lih i;
    volatile lhv j = lig.b;

    public lhr(Object obj, int i, lih lihVar) {
        this.g = obj;
        this.h = i;
        this.i = lihVar;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final int a() {
        return this.h;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final lhv d() {
        return this.j;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final lih e() {
        return this.i;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final Object j() {
        return this.g;
    }

    @Override // defpackage.lgt, defpackage.lih
    public final void p(lhv lhvVar) {
        this.j = lhvVar;
    }
}

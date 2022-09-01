package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: llo  reason: default package */
/* loaded from: classes.dex */
public final class llo extends llp {
    final transient int a;
    final transient int b;
    final /* synthetic */ llp c;

    public llo(llp llpVar, int i, int i2) {
        this.c = llpVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.llg
    public final int c() {
        return this.c.j() + this.a + this.b;
    }

    @Override // defpackage.llp
    public final llp d(int i, int i2) {
        jdg.E(i, i2, this.b);
        llp llpVar = this.c;
        int i3 = this.a;
        return llpVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        jdg.N(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.llg
    public final int j() {
        return this.c.j() + this.a;
    }

    @Override // defpackage.llg
    public final boolean m() {
        return true;
    }

    @Override // defpackage.llg
    public final Object[] n() {
        return this.c.n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.llp, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}

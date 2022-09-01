package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* renamed from: lrl  reason: default package */
/* loaded from: classes.dex */
public final class lrl extends llp {
    static final llp a = new lrl(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public lrl(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.llp, defpackage.llg
    public final int b(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    @Override // defpackage.llg
    public final int c() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jdg.N(i, this.c);
        return Objects.requireNonNull(this.b[i]);
    }

    @Override // defpackage.llg
    public final int j() {
        return 0;
    }

    @Override // defpackage.llg
    public final boolean m() {
        return false;
    }

    @Override // defpackage.llg
    public final Object[] n() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}

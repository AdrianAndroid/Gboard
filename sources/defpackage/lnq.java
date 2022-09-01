package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lnq  reason: default package */
/* loaded from: classes.dex */
public abstract class lnq extends lmz {
    public abstract Object a(int i);

    @Override // defpackage.llg
    public final int b(Object[] objArr, int i) {
        return k().b(objArr, i);
    }

    @Override // defpackage.lmz
    public final llp f() {
        return new lnp(this);
    }

    @Override // defpackage.lmz, defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public lsz iterator() {
        return k().listIterator();
    }
}

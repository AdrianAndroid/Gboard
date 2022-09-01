package defpackage;

/* compiled from: PG */
/* renamed from: lrr  reason: default package */
/* loaded from: classes.dex */
public final class lrr extends lmz {
    public static final lrr a;
    private static final Object[] e;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    private final transient int f;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        e = objArr;
        a = new lrr(objArr, 0, objArr, 0, 0);
    }

    public lrr(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.llg
    public final int b(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.g);
        return i + this.g;
    }

    @Override // defpackage.llg
    public final int c() {
        return this.g;
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.d;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int H = jez.H(obj);
        while (true) {
            int i = H & this.f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            H = i + 1;
        }
    }

    @Override // defpackage.lmz
    public final boolean d() {
        return true;
    }

    @Override // defpackage.lmz
    public final llp f() {
        return llp.h(this.b, this.g);
    }

    @Override // defpackage.lmz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.llg
    public final int j() {
        return 0;
    }

    @Override // defpackage.lmz, defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final lsz iterator() {
        return k().listIterator();
    }

    @Override // defpackage.llg
    public final boolean m() {
        return false;
    }

    @Override // defpackage.llg
    public final Object[] n() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }
}

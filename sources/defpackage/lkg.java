package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lkg  reason: default package */
/* loaded from: classes.dex */
final class lkg extends lke {
    private transient int[] c;
    private transient int[] d;
    private transient int e;
    private transient int f;

    public lkg() {
    }

    private final int n(int i) {
        return p()[i] - 1;
    }

    private final int[] p() {
        return (int[]) Objects.requireNonNull(this.c);
    }

    private final int[] q() {
        return (int[]) Objects.requireNonNull(this.d);
    }

    @Override // defpackage.lke
    public final int a(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // defpackage.lke
    public final int b() {
        int b = super.b();
        this.c = new int[b];
        this.d = new int[b];
        return b;
    }

    @Override // defpackage.lke
    public final int c() {
        return this.e;
    }

    @Override // defpackage.lke, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (m()) {
            return;
        }
        this.e = -2;
        this.f = -2;
        int[] iArr = this.c;
        if (iArr != null && this.d != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.d, 0, size(), 0);
        }
        super.clear();
    }

    @Override // defpackage.lke
    public final int d(int i) {
        return q()[i] - 1;
    }

    @Override // defpackage.lke
    public final Set f() {
        Set f = super.f();
        this.c = null;
        this.d = null;
        return f;
    }

    @Override // defpackage.lke
    public final void i(int i) {
        super.i(i);
        this.e = -2;
        this.f = -2;
    }

    @Override // defpackage.lke
    public final void j(int i, Object obj, int i2, int i3) {
        super.j(i, obj, i2, i3);
        o(this.f, i);
        o(i, -2);
    }

    @Override // defpackage.lke
    public final void k(int i, int i2) {
        int size = size() - 1;
        super.k(i, i2);
        o(n(i), d(i));
        if (i < size) {
            o(n(size), i);
            o(i, d(size));
        }
        p()[size] = 0;
        q()[size] = 0;
    }

    @Override // defpackage.lke
    public final void l(int i) {
        super.l(i);
        this.c = Arrays.copyOf(p(), i);
        this.d = Arrays.copyOf(q(), i);
    }

    @Override // defpackage.lke, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        lre.j(this, objArr);
        return objArr;
    }

    public lkg(int i) {
        super(i);
    }

    private final void o(int i, int i2) {
        if (i != -2) {
            q()[i] = i2 + 1;
        } else {
            this.e = i2;
            i = -2;
        }
        if (i2 == -2) {
            this.f = i;
        } else {
            p()[i2] = i + 1;
        }
    }

    @Override // defpackage.lke, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = lre.b(objArr, size);
        }
        lre.j(this, objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }
}

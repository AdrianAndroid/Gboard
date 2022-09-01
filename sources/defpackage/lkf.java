package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lkf  reason: default package */
/* loaded from: classes.dex */
final class lkf extends lkc {
    transient long[] g;
    private transient int h;
    private transient int i;

    public lkf() {
        super(3);
    }

    private final int A(int i) {
        return ((int) (B(i) >>> 32)) - 1;
    }

    private final long B(int i) {
        return E()[i];
    }

    private final void C(int i, long j) {
        E()[i] = j;
    }

    private final long[] E() {
        return (long[]) Objects.requireNonNull(this.g);
    }

    public static lkf z(int i) {
        return new lkf(i);
    }

    @Override // defpackage.lkc
    public final int a(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // defpackage.lkc
    public final int b() {
        int b = super.b();
        this.g = new long[b];
        return b;
    }

    @Override // defpackage.lkc
    public final int c() {
        return this.h;
    }

    @Override // defpackage.lkc, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (v()) {
            return;
        }
        this.h = -2;
        this.i = -2;
        long[] jArr = this.g;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // defpackage.lkc
    public final int d(int i) {
        return ((int) B(i)) - 1;
    }

    @Override // defpackage.lkc
    public final Map m() {
        Map m = super.m();
        this.g = null;
        return m;
    }

    @Override // defpackage.lkc
    public final Map n(int i) {
        return new LinkedHashMap(i, 1.0f, false);
    }

    @Override // defpackage.lkc
    public final void q(int i) {
        super.q(i);
        this.h = -2;
        this.i = -2;
    }

    @Override // defpackage.lkc
    public final void r(int i, Object obj, Object obj2, int i2, int i3) {
        super.r(i, obj, obj2, i2, i3);
        D(this.i, i);
        D(i, -2);
    }

    @Override // defpackage.lkc
    public final void s(int i, int i2) {
        int size = size() - 1;
        super.s(i, i2);
        D(A(i), d(i));
        if (i < size) {
            D(A(size), i);
            D(i, d(size));
        }
        C(size, 0L);
    }

    @Override // defpackage.lkc
    public final void t(int i) {
        super.t(i);
        this.g = Arrays.copyOf(E(), i);
    }

    public lkf(int i) {
        super(i);
    }

    private final void D(int i, int i2) {
        if (i != -2) {
            C(i, (B(i) & (-4294967296L)) | ((i2 + 1) & 4294967295L));
        } else {
            this.h = i2;
            i = -2;
        }
        if (i2 == -2) {
            this.i = i;
        } else {
            C(i2, (4294967295L & B(i2)) | ((i + 1) << 32));
        }
    }
}

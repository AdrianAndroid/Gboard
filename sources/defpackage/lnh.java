package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: lnh  reason: default package */
/* loaded from: classes.dex */
public final class lnh extends lls {
    private transient Object[] d = new Object[4];
    private transient Object[] e = new Object[4];
    private final Comparator f;

    public lnh(Comparator comparator) {
        jdg.u(comparator);
        this.f = comparator;
    }

    @Override // defpackage.lls
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        int i = this.b + 1;
        int length = this.d.length;
        if (i > length) {
            int a = llf.a(length, i);
            this.d = Arrays.copyOf(this.d, a);
            this.e = Arrays.copyOf(this.e, a);
        }
        jez.U(obj, obj2);
        Object[] objArr = this.d;
        int i2 = this.b;
        objArr[i2] = obj;
        this.e[i2] = obj2;
        this.b = i2 + 1;
    }

    @Override // defpackage.lls
    /* renamed from: b */
    public final lnj l() {
        int i;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 == 1) {
                return lnj.t(this.f, Objects.requireNonNull(this.d[0]), Objects.requireNonNull(this.e[0]));
            }
            Object[] copyOf = Arrays.copyOf(this.d, i2);
            Arrays.sort(copyOf, this.f);
            Object[] objArr = new Object[this.b];
            for (int i3 = 0; i3 < this.b; i3++) {
                if (i3 > 0) {
                    if (this.f.compare(copyOf[i3 - 1], copyOf[i3]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + copyOf[i] + " and " + copyOf[i3]);
                    }
                }
                objArr[Arrays.binarySearch(copyOf, Objects.requireNonNull(this.d[i3]), this.f)] = Objects.requireNonNull(this.e[i3]);
            }
            return new lnj(new lrs(llp.g(copyOf), this.f), llp.g(objArr));
        }
        return lnj.r(this.f);
    }
}

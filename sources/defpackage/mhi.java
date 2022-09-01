package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: mhi  reason: default package */
/* loaded from: classes.dex */
public final class mhi extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    public final long[] a;
    public final int b;
    public final int c;

    public mhi(long[] jArr, int i, int i2) {
        this.a = jArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Long) && mhq.e(this.a, ((Long) obj).longValue(), this.b, this.c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mhi) {
            mhi mhiVar = (mhi) obj;
            int size = size();
            if (mhiVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] != mhiVar.a[mhiVar.b + i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        jdg.N(i, size());
        return Long.valueOf(this.a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + mhq.d(this.a[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int e;
        if (!(obj instanceof Long) || (e = mhq.e(this.a, ((Long) obj).longValue(), this.b, this.c)) < 0) {
            return -1;
        }
        return e - this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Long) {
            long[] jArr = this.a;
            long longValue = ((Long) obj).longValue();
            int i = this.b;
            int i2 = this.c - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                } else if (jArr[i2] == longValue) {
                    break;
                } else {
                    i2--;
                }
            }
            if (i2 >= 0) {
                return i2 - this.b;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Long l = (Long) obj;
        jdg.N(i, size());
        long[] jArr = this.a;
        int i2 = this.b + i;
        long j = jArr[i2];
        jdg.u(l);
        jArr[i2] = l.longValue();
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        jdg.E(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        long[] jArr = this.a;
        int i3 = this.b;
        return new mhi(jArr, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 10);
        sb.append('[');
        sb.append(this.a[this.b]);
        int i = this.b;
        while (true) {
            i++;
            if (i < this.c) {
                sb.append(", ");
                sb.append(this.a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}

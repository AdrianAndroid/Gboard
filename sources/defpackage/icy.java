package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: icy  reason: default package */
/* loaded from: classes.dex */
public final class icy implements Parcelable {
    public final long[] a;
    public final Object[] b;
    public final long c;
    private volatile int d;

    public icy(long[] jArr, Object[] objArr, long j, int i) {
        this.a = jArr;
        this.b = objArr;
        this.c = j;
        this.d = i;
    }

    public final int a() {
        Object[] objArr;
        if (this.d == Integer.MAX_VALUE) {
            int length = (this.a.length * 8) + 8;
            for (Object obj : this.b) {
                if (obj instanceof ict) {
                    length += ((ict) obj).a();
                } else if (obj instanceof ict[]) {
                    for (ict ictVar : (ict[]) obj) {
                        length += ictVar.a();
                    }
                }
            }
            this.d = length;
        }
        return this.d;
    }

    public final Object b(long j) {
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            if (j == this.a[i]) {
                return this.b[i];
            }
        }
        return null;
    }

    public final Object c(long j) {
        long j2;
        if ((this.c & j) == 0) {
            return this.b[0];
        }
        int length = this.a.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
            j2 = this.a[length];
        } while ((j & j2) != j2);
        return this.b[length];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}

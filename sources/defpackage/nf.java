package defpackage;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: nf  reason: default package */
/* loaded from: classes2.dex */
public final class nf implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public nf(int i) {
        this.a = i;
    }

    public static final acy a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return acy.c;
        }
        throw new IllegalStateException("superState must be null");
    }

    public static final amg b(Parcel parcel, ClassLoader classLoader) {
        return Build.VERSION.SDK_INT >= 24 ? new amg(parcel, classLoader) : new amg(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return new mh(parcel, null);
            }
            if (i == 2) {
                return new ny(parcel, null);
            }
            if (i == 3) {
                return new ts(parcel, null);
            }
            if (i == 4) {
                return a(parcel, null);
            }
            return i != 5 ? b(parcel, null) : new all(parcel, null);
        }
        return new ng(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == 1) {
                return new mh[i];
            }
            if (i2 == 2) {
                return new ny[i];
            }
            if (i2 == 3) {
                return new ts[i];
            }
            if (i2 == 4) {
                return new acy[i];
            }
            return i2 != 5 ? new amg[i] : new all[i];
        }
        return new ng[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return new mh(parcel, classLoader);
            }
            if (i == 2) {
                return new ny(parcel, classLoader);
            }
            if (i == 3) {
                return new ts(parcel, classLoader);
            }
            if (i == 4) {
                return a(parcel, classLoader);
            }
            return i != 5 ? b(parcel, classLoader) : new all(parcel, classLoader);
        }
        return new ng(parcel, classLoader);
    }
}

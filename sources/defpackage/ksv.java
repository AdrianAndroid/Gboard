package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: ksv  reason: default package */
/* loaded from: classes.dex */
public final class ksv implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public ksv(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return new ksc(parcel, null);
            }
            if (i == 2) {
                return new ktf(parcel, null);
            }
            return i != 3 ? new kyk(parcel, null) : new kuv(parcel, null);
        }
        return new ksw(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == 1) {
                return new ksc[i];
            }
            if (i2 == 2) {
                return new ktf[i];
            }
            return i2 != 3 ? new kyk[i] : new kuv[i];
        }
        return new ksw[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return new ksc(parcel, classLoader);
            }
            if (i == 2) {
                return new ktf(parcel, classLoader);
            }
            return i != 3 ? new kyk(parcel, classLoader) : new kuv(parcel, classLoader);
        }
        return new ksw(parcel, classLoader);
    }
}

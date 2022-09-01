package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: acy  reason: default package */
/* loaded from: classes.dex */
public class acy implements Parcelable {
    public final Parcelable d;
    public static final acy c = new acx();
    public static final Parcelable.Creator CREATOR = new nf(4);

    public acy() {
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public acy(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.d = readParcelable == null ? c : readParcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public acy(Parcelable parcelable) {
        if (parcelable != null) {
            this.d = parcelable == c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
}

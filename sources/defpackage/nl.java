package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: nl  reason: default package */
/* loaded from: classes2.dex */
public final class nl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new u(18);
    public int a;
    public int b;
    public int[] c;
    public boolean d;

    public nl() {
    }

    public nl(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.d = parcel.readInt() != 1 ? false : true;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.c = iArr;
            parcel.readIntArray(iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        int[] iArr = this.c;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.d ? 1 : 0);
        int[] iArr = this.c;
        if (iArr == null || (length = iArr.length) <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(length);
        parcel.writeIntArray(this.c);
    }
}

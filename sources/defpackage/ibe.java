package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ibe  reason: default package */
/* loaded from: classes.dex */
public final class ibe implements Parcelable.Creator {
    private final /* synthetic */ int a;
    private final kns b;

    public ibe(kns knsVar, int i, byte[] bArr) {
        this.a = i;
        this.b = knsVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == 1) {
                return new ial[i];
            }
            if (i2 == 2) {
                return new icy[i];
            }
            return i2 != 3 ? new ict[i] : new icf[i];
        }
        return new icy[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        int i2 = 0;
        if (i == 0) {
            int readInt = parcel.readInt();
            if (readInt == -1) {
                return null;
            }
            long[] jArr = new long[readInt];
            ict[][] ictVarArr = new ict[readInt];
            while (i2 < readInt) {
                jArr[i2] = parcel.readLong();
                ictVarArr[i2] = (ict[]) this.b.k(parcel);
                i2++;
            }
            return new icy(jArr, ictVarArr, parcel.readLong(), parcel.readInt());
        } else if (i == 1) {
            return new ial(parcel, this.b, null);
        } else {
            if (i != 2) {
                if (i == 3) {
                    return new icf(parcel, this.b, null);
                }
                return new ict(parcel, this.b, null);
            }
            int readInt2 = parcel.readInt();
            if (readInt2 == -1) {
                return null;
            }
            long[] jArr2 = new long[readInt2];
            ict[] ictVarArr2 = new ict[readInt2];
            while (i2 < readInt2) {
                jArr2[i2] = parcel.readLong();
                ictVarArr2[i2] = (ict) this.b.e(parcel);
                i2++;
            }
            return new icy(jArr2, ictVarArr2, parcel.readLong(), parcel.readInt());
        }
    }
}

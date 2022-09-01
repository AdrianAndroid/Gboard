package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: PG */
/* renamed from: ibg  reason: default package */
/* loaded from: classes.dex */
final class ibg implements Parcelable.Creator {
    private final ibe a;
    private final ibe b;

    public ibg(kns knsVar, byte[] bArr) {
        this.b = new ibe(knsVar, 2, null);
        this.a = new ibe(knsVar, 0, null);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public final ibi createFromParcel(Parcel parcel) {
        SparseArray A = kki.A(parcel, this.b);
        SparseArray A2 = kki.A(parcel, this.a);
        if (A == null) {
            A = new SparseArray();
        }
        if (A2 == null) {
            A2 = new SparseArray();
        }
        return new ibi(A, A2, 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ibi[i];
    }
}

package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: cj  reason: default package */
/* loaded from: classes.dex */
public class cj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new u(15);
    ci a;

    public cj(Parcel parcel) {
        ci cgVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            cgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            cgVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ci)) ? new cg(readStrongBinder) : (ci) queryLocalInterface;
        }
        this.a = cgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new ch(this);
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }
}

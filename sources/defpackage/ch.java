package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: ch  reason: default package */
/* loaded from: classes.dex */
public final class ch extends Binder implements ci {
    final /* synthetic */ cj a;

    public ch() {
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public ch(cj cjVar) {
        this.a = cjVar;
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface("android.support.v4.os.IResultReceiver");
        parcel.readInt();
        if (parcel.readInt() != 0) {
            Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        this.a.a();
        return true;
    }
}

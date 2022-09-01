package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: frh  reason: default package */
/* loaded from: classes.dex */
public final class frh extends bkf implements frj {
    public frh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.frj
    public final int e() {
        Parcel hG = hG(2, a());
        int readInt = hG.readInt();
        hG.recycle();
        return readInt;
    }

    @Override // defpackage.frj
    public final ftm f() {
        ftm ftkVar;
        Parcel hG = hG(1, a());
        IBinder readStrongBinder = hG.readStrongBinder();
        if (readStrongBinder == null) {
            ftkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            ftkVar = queryLocalInterface instanceof ftm ? (ftm) queryLocalInterface : new ftk(readStrongBinder);
        }
        hG.recycle();
        return ftkVar;
    }
}

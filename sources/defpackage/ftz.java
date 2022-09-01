package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: ftz  reason: default package */
/* loaded from: classes.dex */
public final class ftz extends bkf implements IInterface {
    public ftz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int e() {
        Parcel hG = hG(6, a());
        int readInt = hG.readInt();
        hG.recycle();
        return readInt;
    }
}

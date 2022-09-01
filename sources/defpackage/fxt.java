package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: fxt  reason: default package */
/* loaded from: classes.dex */
public final class fxt extends bkf implements fxv {
    public fxt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.proxy.IExampleStoreProxy");
    }

    @Override // defpackage.fxv
    public final void e(String str, byte[] bArr, byte[] bArr2, fxs fxsVar, byte[] bArr3) {
        Parcel a = a();
        a.writeString(str);
        a.writeByteArray(bArr);
        a.writeByteArray(bArr2);
        bkh.f(a, fxsVar);
        a.writeByteArray(bArr3);
        hJ(3, a);
    }
}

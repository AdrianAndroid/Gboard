package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fxn  reason: default package */
/* loaded from: classes.dex */
public final class fxn extends bkf implements fxp {
    public fxn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIteratorCallback");
    }

    @Override // defpackage.fxp
    public final void e(byte[] bArr, boolean z, byte[] bArr2, long j, long j2) {
        Parcel a = a();
        a.writeByteArray(bArr);
        bkh.c(a, z);
        a.writeByteArray(bArr2);
        a.writeLong(j);
        a.writeLong(j2);
        hI(4, a);
    }

    @Override // defpackage.fxp
    public final void f(Status status, long j, long j2) {
        Parcel a = a();
        bkh.d(a, status);
        a.writeLong(j);
        a.writeLong(j2);
        hI(3, a);
    }
}

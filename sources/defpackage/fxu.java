package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl;

/* compiled from: PG */
/* renamed from: fxu  reason: default package */
/* loaded from: classes.dex */
public final class fxu extends bkg implements fxv {
    final /* synthetic */ InAppExampleStoreProxyImpl a;

    public fxu() {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreProxy");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0120 A[Catch: all -> 0x0115, TRY_LEAVE, TryCatch #4 {, blocks: (B:27:0x008d, B:29:0x0090, B:31:0x009a, B:33:0x0154, B:37:0x00d8, B:40:0x010a, B:43:0x011c, B:45:0x0120, B:47:0x0127, B:50:0x0133, B:54:0x014d), top: B:26:0x008d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    @Override // defpackage.fxv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r23, byte[] r24, byte[] r25, defpackage.fxs r26, byte[] r27) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxu.e(java.lang.String, byte[], byte[], fxs, byte[]):void");
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        fxs fxqVar;
        if (i == 3) {
            String readString = parcel.readString();
            byte[] createByteArray = parcel.createByteArray();
            byte[] createByteArray2 = parcel.createByteArray();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                fxqVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingQueryCallback");
                fxqVar = queryLocalInterface instanceof fxs ? (fxs) queryLocalInterface : new fxq(readStrongBinder);
            }
            byte[] createByteArray3 = parcel.createByteArray();
            bkh.b(parcel);
            e(readString, createByteArray, createByteArray2, fxqVar, createByteArray3);
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxu(InAppExampleStoreProxyImpl inAppExampleStoreProxyImpl) {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreProxy");
        this.a = inAppExampleStoreProxyImpl;
    }
}

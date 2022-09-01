package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* compiled from: PG */
/* renamed from: frk  reason: default package */
/* loaded from: classes.dex */
public final class frk extends bkg implements IInterface {
    private fqq a;
    private final int b;

    public frk(fqq fqqVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = fqqVar;
        this.b = i;
    }

    public final void b(int i, IBinder iBinder, Bundle bundle) {
        fyb.aH(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.y(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            bkh.b(parcel);
            b(parcel.readInt(), parcel.readStrongBinder(), (Bundle) bkh.a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) bkh.a(parcel, Bundle.CREATOR);
            bkh.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            fqu fquVar = (fqu) bkh.a(parcel, fqu.CREATOR);
            bkh.b(parcel);
            fqq fqqVar = this.a;
            fyb.aH(fqqVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            fyb.ax(fquVar);
            fqqVar.m = fquVar;
            if (fqqVar.e()) {
                fqv fqvVar = fquVar.d;
                frs.a().b(fqvVar == null ? null : fqvVar.a);
            }
            b(readInt, readStrongBinder, fquVar.a);
        }
        parcel2.writeNoException();
        return true;
    }

    public frk() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
}

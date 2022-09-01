package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: fzw  reason: default package */
/* loaded from: classes.dex */
public abstract class fzw extends bkg implements fzx {
    public fzw() {
        super("com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
    }

    public static fzx asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
        return queryLocalInterface instanceof fzx ? (fzx) queryLocalInterface : new fzv(iBinder);
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        ftm ftkVar;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                fzu fzuVar = null;
                if (readStrongBinder == null) {
                    ftkVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar = queryLocalInterface instanceof ftm ? (ftm) queryLocalInterface : new ftk(readStrongBinder);
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreV2");
                    fzuVar = queryLocalInterface2 instanceof fzu ? (fzu) queryLocalInterface2 : new fzs(readStrongBinder2);
                }
                bkh.b(parcel);
                init(ftkVar, fzuVar);
                parcel2.writeNoException();
                return true;
            case 2:
                onDestroy();
                parcel2.writeNoException();
                return true;
            case 3:
                bkh.b(parcel);
                IBinder onBind = onBind((Intent) bkh.a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(onBind);
                return true;
            case 4:
                int readInt = parcel.readInt();
                bkh.b(parcel);
                onTrimMemory(readInt);
                parcel2.writeNoException();
                return true;
            case 5:
                bkh.b(parcel);
                boolean onUnbind = onUnbind((Intent) bkh.a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                bkh.c(parcel2, onUnbind);
                return true;
            case 6:
                bkh.b(parcel);
                onRebind((Intent) bkh.a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

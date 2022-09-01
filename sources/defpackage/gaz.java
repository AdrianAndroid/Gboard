package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: gaz  reason: default package */
/* loaded from: classes.dex */
public abstract class gaz extends bkg implements gba {
    public gaz() {
        super("com.google.android.gms.learning.internal.training.IInAppTrainingService");
    }

    public static gba asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainingService");
        return queryLocalInterface instanceof gba ? (gba) queryLocalInterface : new gay(iBinder);
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        ftm ftmVar = null;
        gal galVar = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftmVar = queryLocalInterface instanceof ftm ? (ftm) queryLocalInterface : new ftk(readStrongBinder);
                }
                bkh.b(parcel);
                onCreate(ftmVar);
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
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                bkh.b(parcel);
                int onStartCommand = onStartCommand((Intent) bkh.a(parcel, Intent.CREATOR), readInt2, readInt3);
                parcel2.writeNoException();
                parcel2.writeInt(onStartCommand);
                return true;
            case 6:
                bkh.b(parcel);
                boolean onUnbind = onUnbind((Intent) bkh.a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                bkh.c(parcel2, onUnbind);
                return true;
            case 7:
                bkh.b(parcel);
                onRebind((Intent) bkh.a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                setPRFSdkImpl();
                parcel2.writeNoException();
                return true;
            case 9:
                String readString = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
                    galVar = queryLocalInterface2 instanceof gal ? (gal) queryLocalInterface2 : new gaj(readStrongBinder2);
                }
                bkh.b(parcel);
                addHttpUrlConnectionFactory(readString, galVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

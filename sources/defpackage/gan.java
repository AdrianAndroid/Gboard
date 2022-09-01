package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: gan  reason: default package */
/* loaded from: classes.dex */
public abstract class gan extends bkg implements gao {
    public gan() {
        super("com.google.android.gms.learning.internal.training.IInAppJobService");
    }

    public static gao asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppJobService");
        return queryLocalInterface instanceof gao ? (gao) queryLocalInterface : new gam(iBinder);
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        ftm ftkVar;
        switch (i) {
            case 2:
                onDestroy();
                parcel2.writeNoException();
                return true;
            case 3:
                int readInt = parcel.readInt();
                bkh.b(parcel);
                onTrimMemory(readInt);
                parcel2.writeNoException();
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                bkh.b(parcel);
                int onStartCommand = onStartCommand((Intent) bkh.a(parcel, Intent.CREATOR), readInt2, readInt3);
                parcel2.writeNoException();
                parcel2.writeInt(onStartCommand);
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
            case 7:
                bkh.b(parcel);
                boolean onStartJob = onStartJob((JobParameters) bkh.a(parcel, JobParameters.CREATOR));
                parcel2.writeNoException();
                bkh.c(parcel2, onStartJob);
                return true;
            case 8:
                bkh.b(parcel);
                boolean onStopJob = onStopJob((JobParameters) bkh.a(parcel, JobParameters.CREATOR));
                parcel2.writeNoException();
                bkh.c(parcel2, onStopJob);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                ftm ftmVar = null;
                if (readStrongBinder == null) {
                    ftkVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftkVar = queryLocalInterface instanceof ftm ? (ftm) queryLocalInterface : new ftk(readStrongBinder);
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    ftmVar = queryLocalInterface2 instanceof ftm ? (ftm) queryLocalInterface2 : new ftk(readStrongBinder2);
                }
                bkh.b(parcel);
                boolean init = init(ftkVar, ftmVar);
                parcel2.writeNoException();
                bkh.c(parcel2, init);
                return true;
            default:
                return false;
        }
    }
}

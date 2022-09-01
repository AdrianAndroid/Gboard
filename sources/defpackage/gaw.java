package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: gaw  reason: default package */
/* loaded from: classes.dex */
public abstract class gaw extends bkg implements gax {
    public gaw() {
        super("com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
    }

    public static gax asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
        return queryLocalInterface instanceof gax ? (gax) queryLocalInterface : new gav(iBinder);
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        ftm ftkVar;
        ftm ftkVar2;
        fpo fpoVar = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                ftkVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                ftkVar = queryLocalInterface instanceof ftm ? (ftm) queryLocalInterface : new ftk(readStrongBinder);
            }
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 == null) {
                ftkVar2 = null;
            } else {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                ftkVar2 = queryLocalInterface2 instanceof ftm ? (ftm) queryLocalInterface2 : new ftk(readStrongBinder2);
            }
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                fpoVar = queryLocalInterface3 instanceof fpo ? (fpo) queryLocalInterface3 : new fpm(readStrongBinder3);
            }
            bkh.b(parcel);
            boolean init = init(ftkVar, ftkVar2, fpoVar);
            parcel2.writeNoException();
            bkh.c(parcel2, init);
        } else if (i != 2) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                fpoVar = queryLocalInterface4 instanceof fpo ? (fpo) queryLocalInterface4 : new fpm(readStrongBinder4);
            }
            bkh.b(parcel);
            cancelJobsByType(readInt, fpoVar);
            parcel2.writeNoException();
        }
        return true;
    }
}

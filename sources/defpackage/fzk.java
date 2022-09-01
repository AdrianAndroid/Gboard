package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fzk  reason: default package */
/* loaded from: classes.dex */
public abstract class fzk extends bkg implements fzl {
    public fzk() {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        ftm ftkVar;
        if (i == 2) {
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
            long readLong = parcel.readLong();
            bkh.b(parcel);
            c(ftkVar, ftmVar, readLong);
        } else if (i != 3) {
            return false;
        } else {
            long readLong2 = parcel.readLong();
            bkh.b(parcel);
            b((Status) bkh.a(parcel, Status.CREATOR), readLong2);
        }
        parcel2.writeNoException();
        return true;
    }
}

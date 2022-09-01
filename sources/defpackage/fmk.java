package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* renamed from: fmk  reason: default package */
/* loaded from: classes.dex */
public class fmk extends bkg implements IInterface {
    public fmk() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                bkh.b(parcel);
                c((Status) bkh.a(parcel, Status.CREATOR));
                return true;
            case 2:
                Status status = (Status) bkh.a(parcel, Status.CREATOR);
                bkh.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                Status status2 = (Status) bkh.a(parcel, Status.CREATOR);
                parcel.readLong();
                bkh.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                Status status3 = (Status) bkh.a(parcel, Status.CREATOR);
                bkh.b(parcel);
                throw new UnsupportedOperationException();
            case 5:
                Status status4 = (Status) bkh.a(parcel, Status.CREATOR);
                parcel.readLong();
                bkh.b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                Status status5 = (Status) bkh.a(parcel, Status.CREATOR);
                fmc[] fmcVarArr = (fmc[]) parcel.createTypedArray(fmc.CREATOR);
                bkh.b(parcel);
                throw new UnsupportedOperationException();
            case 7:
                DataHolder dataHolder = (DataHolder) bkh.a(parcel, DataHolder.CREATOR);
                bkh.b(parcel);
                throw new UnsupportedOperationException();
            case 8:
                bkh.b(parcel);
                b((Status) bkh.a(parcel, Status.CREATOR));
                return true;
            default:
                return false;
        }
    }
}

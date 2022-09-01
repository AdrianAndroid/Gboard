package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: gfi  reason: default package */
/* loaded from: classes.dex */
public class gfi extends bkg implements IInterface {
    public gfi() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public void b(Status status, gfh gfhVar) {
        throw new IllegalStateException("Not implemented.");
    }

    public void c(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    public void d(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                bkh.b(parcel);
                b((Status) bkh.a(parcel, Status.CREATOR), (gfh) bkh.a(parcel, gfh.CREATOR));
                return true;
            case 3:
                Status status = (Status) bkh.a(parcel, Status.CREATOR);
                bkh.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 4:
                bkh.b(parcel);
                c((Status) bkh.a(parcel, Status.CREATOR));
                return true;
            case 5:
                bkh.b(parcel);
                d((Status) bkh.a(parcel, Status.CREATOR));
                return true;
            case 6:
                Status status2 = (Status) bkh.a(parcel, Status.CREATOR);
                parcel.createStringArrayList();
                bkh.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 7:
                Status status3 = (Status) bkh.a(parcel, Status.CREATOR);
                bkh.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 8:
                Status status4 = (Status) bkh.a(parcel, Status.CREATOR);
                bkh.g(parcel);
                gew gewVar = (gew) bkh.a(parcel, gew.CREATOR);
                bkh.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 9:
                Status status5 = (Status) bkh.a(parcel, Status.CREATOR);
                gew gewVar2 = (gew) bkh.a(parcel, gew.CREATOR);
                bkh.b(parcel);
                throw new IllegalStateException("Not implemented");
            default:
                return false;
        }
    }
}

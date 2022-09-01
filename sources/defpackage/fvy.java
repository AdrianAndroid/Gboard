package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fvy  reason: default package */
/* loaded from: classes.dex */
public class fvy extends bkg implements IInterface {
    public fvy() {
        super("com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
    }

    public void b(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) bkh.a(parcel, Status.CREATOR);
            parcel.readString();
            bkh.b(parcel);
            throw new UnsupportedOperationException();
        } else if (i == 2) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(fvt.CREATOR);
            bkh.b(parcel);
            b((Status) bkh.a(parcel, Status.CREATOR), createTypedArrayList);
            return true;
        } else if (i == 3) {
            Status status2 = (Status) bkh.a(parcel, Status.CREATOR);
            parcel.createTypedArrayList(fvs.CREATOR);
            bkh.b(parcel);
            throw new UnsupportedOperationException();
        } else if (i != 4) {
            return false;
        } else {
            Status status3 = (Status) bkh.a(parcel, Status.CREATOR);
            parcel.readArrayList(bkh.a);
            bkh.b(parcel);
            throw new UnsupportedOperationException();
        }
    }
}

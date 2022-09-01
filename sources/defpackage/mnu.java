package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: mnu  reason: default package */
/* loaded from: classes2.dex */
public class mnu extends bkg implements IInterface {
    public mnu() {
        super("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    public void b(Status status, mnx mnxVar) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, mnm mnmVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            bkh.b(parcel);
            c((Status) bkh.a(parcel, Status.CREATOR), (mnm) bkh.a(parcel, mnm.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            bkh.b(parcel);
            b((Status) bkh.a(parcel, Status.CREATOR), (mnx) bkh.a(parcel, mnx.CREATOR));
        }
        return true;
    }
}

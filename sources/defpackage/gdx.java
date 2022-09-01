package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: gdx  reason: default package */
/* loaded from: classes.dex */
public class gdx extends bkg implements IInterface {
    public gdx() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public void c(gec gecVar) {
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                fmt fmtVar = (fmt) bkh.a(parcel, fmt.CREATOR);
                gdw gdwVar = (gdw) bkh.a(parcel, gdw.CREATOR);
                bkh.b(parcel);
                break;
            case 4:
                Status status = (Status) bkh.a(parcel, Status.CREATOR);
                bkh.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) bkh.a(parcel, Status.CREATOR);
                bkh.b(parcel);
                break;
            case 7:
                Status status3 = (Status) bkh.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) bkh.a(parcel, GoogleSignInAccount.CREATOR);
                bkh.b(parcel);
                break;
            case 8:
                bkh.b(parcel);
                c((gec) bkh.a(parcel, gec.CREATOR));
                break;
            case 9:
                gdz gdzVar = (gdz) bkh.a(parcel, gdz.CREATOR);
                bkh.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}

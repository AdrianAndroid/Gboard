package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fvn  reason: default package */
/* loaded from: classes.dex */
public class fvn extends bkg implements IInterface {
    public fvn() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    public void b() {
        throw new UnsupportedOperationException();
    }

    public void c() {
        throw new UnsupportedOperationException();
    }

    public void d(GoogleHelp googleHelp) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                bkh.b(parcel);
                d((GoogleHelp) bkh.a(parcel, GoogleHelp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                TogglingData togglingData = (TogglingData) bkh.a(parcel, TogglingData.CREATOR);
                bkh.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            case 7:
                b();
                return true;
            case 8:
                c();
                return true;
            case 9:
                parcel.readInt();
                bkh.b(parcel);
                throw new UnsupportedOperationException();
            case 10:
                throw new UnsupportedOperationException();
            case 11:
                throw new UnsupportedOperationException();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                throw new UnsupportedOperationException();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                parcel.createByteArray();
                bkh.b(parcel);
                throw new UnsupportedOperationException();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                throw new UnsupportedOperationException();
            case 15:
                parcel.createByteArray();
                bkh.b(parcel);
                throw new UnsupportedOperationException();
            case 16:
                throw new UnsupportedOperationException();
            case 17:
                fuz fuzVar = (fuz) bkh.a(parcel, fuz.CREATOR);
                bkh.b(parcel);
                throw new UnsupportedOperationException();
            case 18:
                parcel.createByteArray();
                bkh.b(parcel);
                throw new UnsupportedOperationException();
            case 19:
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}

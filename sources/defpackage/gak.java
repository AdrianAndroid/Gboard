package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: gak  reason: default package */
/* loaded from: classes.dex */
public abstract class gak extends bkg implements gal {
    public gak() {
        super("com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                boolean e = e();
                parcel2.writeNoException();
                bkh.c(parcel2, e);
                break;
            case 2:
                String readString = parcel.readString();
                bkh.b(parcel);
                ftm b = b(readString);
                parcel2.writeNoException();
                bkh.f(parcel2, b);
                break;
            case 3:
                parcel2.writeNoException();
                bkh.c(parcel2, true);
                break;
            case 4:
                parcel2.writeNoException();
                bkh.c(parcel2, false);
                break;
            case 5:
                parcel2.writeNoException();
                bkh.c(parcel2, false);
                break;
            case 6:
                boolean g = bkh.g(parcel);
                bkh.b(parcel);
                c(g);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: gdo  reason: default package */
/* loaded from: classes.dex */
public final class gdo extends bkg implements IInterface {
    private final /* synthetic */ int a;
    private final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdo(fxa fxaVar, int i, byte[] bArr, byte[] bArr2) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = i;
        this.b = fxaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdo(fxa fxaVar, int i, byte[] bArr) {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
        this.a = i;
        this.b = fxaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdo(fpt fptVar, int i) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        this.a = i;
        this.b = fptVar;
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.a;
        if (i2 == 0) {
            if (i == 1) {
                bkh.b(parcel);
                fhr.q((Status) bkh.a(parcel, Status.CREATOR), (gdn) bkh.a(parcel, gdn.CREATOR), (fxa) this.b);
                return true;
            } else if (i == 2) {
                bkh.b(parcel);
                fhr.p((Status) bkh.a(parcel, Status.CREATOR), (fxa) this.b);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                long readLong = parcel.readLong();
                bkh.b(parcel);
                fhr.q((Status) bkh.a(parcel, Status.CREATOR), Long.valueOf(readLong), (fxa) this.b);
                return true;
            }
        } else if (i2 != 1) {
            if (i != 2) {
                return false;
            }
            fpt fptVar = (fpt) this.b;
            fptVar.a.execute(new fqa(fptVar, 1));
            return true;
        } else {
            switch (i) {
                case 1:
                    bkh.b(parcel);
                    fhr.p((Status) bkh.a(parcel, Status.CREATOR), (fxa) this.b);
                    return true;
                case 2:
                    bkh.b(parcel);
                    fhr.p((Status) bkh.a(parcel, Status.CREATOR), (fxa) this.b);
                    return true;
                case 3:
                    bkh.b(parcel);
                    fhr.p((Status) bkh.a(parcel, Status.CREATOR), (fxa) this.b);
                    return true;
                case 4:
                    bkh.b(parcel);
                    fhr.q((Status) bkh.a(parcel, Status.CREATOR), (gct) bkh.a(parcel, gct.CREATOR), (fxa) this.b);
                    return true;
                case 5:
                    bkh.b(parcel);
                    fhr.p((Status) bkh.a(parcel, Status.CREATOR), (fxa) this.b);
                    return true;
                case 6:
                    bkh.b(parcel);
                    fhr.q((Status) bkh.a(parcel, Status.CREATOR), (gcv) bkh.a(parcel, gcv.CREATOR), (fxa) this.b);
                    return true;
                case 7:
                    bkh.b(parcel);
                    fhr.q((Status) bkh.a(parcel, Status.CREATOR), (gcu) bkh.a(parcel, gcu.CREATOR), (fxa) this.b);
                    return true;
                case 8:
                    bkh.b(parcel);
                    fhr.p((Status) bkh.a(parcel, Status.CREATOR), (fxa) this.b);
                    return true;
                case 9:
                    bkh.b(parcel);
                    fhr.q((Status) bkh.a(parcel, Status.CREATOR), (gcx) bkh.a(parcel, gcx.CREATOR), (fxa) this.b);
                    return true;
                case 10:
                    bkh.b(parcel);
                    fhr.q((Status) bkh.a(parcel, Status.CREATOR), (gct) bkh.a(parcel, gct.CREATOR), (fxa) this.b);
                    return true;
                case 11:
                    long readLong2 = parcel.readLong();
                    bkh.b(parcel);
                    fhr.q((Status) bkh.a(parcel, Status.CREATOR), Long.valueOf(readLong2), (fxa) this.b);
                    return true;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    bkh.b(parcel);
                    fhr.p((Status) bkh.a(parcel, Status.CREATOR), (fxa) this.b);
                    return true;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    bkh.b(parcel);
                    fhr.q((Status) bkh.a(parcel, Status.CREATOR), (gda) bkh.a(parcel, gda.CREATOR), (fxa) this.b);
                    return true;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    bkh.b(parcel);
                    fhr.p((Status) bkh.a(parcel, Status.CREATOR), (fxa) this.b);
                    return true;
                case 15:
                    bkh.b(parcel);
                    fhr.p((Status) bkh.a(parcel, Status.CREATOR), (fxa) this.b);
                    return true;
                case 16:
                    long readLong3 = parcel.readLong();
                    bkh.b(parcel);
                    fhr.q((Status) bkh.a(parcel, Status.CREATOR), Long.valueOf(readLong3), (fxa) this.b);
                    return true;
                default:
                    return false;
            }
        }
    }
}

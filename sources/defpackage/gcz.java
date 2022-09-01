package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: gcz  reason: default package */
/* loaded from: classes.dex */
public final class gcz implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public gcz(int i) {
        this.a = i;
    }

    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new gcy[i];
            case 1:
                return new gcx[i];
            case 2:
                return new gda[i];
            case 3:
                return new gdb[i];
            case 4:
                return new gdn[i];
            case 5:
                return new gdw[i];
            case 6:
                return new gdz[i];
            case 7:
                return new geb[i];
            case 8:
                return new gec[i];
            case 9:
                return new gev[i];
            case 10:
                return new gew[i];
            case 11:
                return new gfh[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new gpm[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new gpj[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new gpk[i];
            case 15:
                return new gpl[i];
            case 16:
                return new gpn[i];
            case 17:
                return new gpp[i];
            case 18:
                return new gpo[i];
            case 19:
                return new gpq[i];
            default:
                return new iay[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        fmt fmtVar = null;
        frq frqVar = null;
        ArrayList arrayList = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        switch (this.a) {
            case 0:
                int ac = fyb.ac(parcel);
                String str3 = null;
                gcx gcxVar = null;
                while (parcel.dataPosition() < ac) {
                    int readInt = parcel.readInt();
                    int Y = fyb.Y(readInt);
                    if (Y == 2) {
                        str = fyb.ai(parcel, readInt);
                    } else if (Y == 3) {
                        str3 = fyb.ai(parcel, readInt);
                    } else if (Y == 4) {
                        gcxVar = (gcx) fyb.ag(parcel, readInt, gcx.CREATOR);
                    } else if (Y == 5) {
                        z = fyb.ap(parcel, readInt);
                    } else {
                        fyb.ao(parcel, readInt);
                    }
                }
                fyb.am(parcel, ac);
                return new gcy(str, str3, gcxVar, z);
            case 1:
                int ac2 = fyb.ac(parcel);
                long j = 0;
                String str4 = null;
                String str5 = null;
                byte[] bArr = null;
                double d = 0.0d;
                boolean z3 = false;
                int i5 = 0;
                int i6 = 0;
                while (parcel.dataPosition() < ac2) {
                    int readInt2 = parcel.readInt();
                    switch (fyb.Y(readInt2)) {
                        case 2:
                            str4 = fyb.ai(parcel, readInt2);
                            break;
                        case 3:
                            j = fyb.ad(parcel, readInt2);
                            break;
                        case 4:
                            z3 = fyb.ap(parcel, readInt2);
                            break;
                        case 5:
                            fyb.an(parcel, readInt2, 8);
                            d = parcel.readDouble();
                            break;
                        case 6:
                            str5 = fyb.ai(parcel, readInt2);
                            break;
                        case 7:
                            bArr = fyb.aq(parcel, readInt2);
                            break;
                        case 8:
                            i5 = fyb.aa(parcel, readInt2);
                            break;
                        case 9:
                            i6 = fyb.aa(parcel, readInt2);
                            break;
                        default:
                            fyb.ao(parcel, readInt2);
                            break;
                    }
                }
                fyb.am(parcel, ac2);
                return new gcx(str4, j, z3, d, str5, bArr, i5, i6);
            case 2:
                int ac3 = fyb.ac(parcel);
                while (parcel.dataPosition() < ac3) {
                    int readInt3 = parcel.readInt();
                    if (fyb.Y(readInt3) == 2) {
                        arrayList2 = fyb.al(parcel, readInt3, gcy.CREATOR);
                    } else {
                        fyb.ao(parcel, readInt3);
                    }
                }
                fyb.am(parcel, ac3);
                return new gda(arrayList2);
            case 3:
                int ac4 = fyb.ac(parcel);
                int i7 = 0;
                while (parcel.dataPosition() < ac4) {
                    int readInt4 = parcel.readInt();
                    int Y2 = fyb.Y(readInt4);
                    if (Y2 == 1) {
                        i4 = fyb.aa(parcel, readInt4);
                    } else if (Y2 == 2) {
                        i7 = fyb.aa(parcel, readInt4);
                    } else {
                        fyb.ao(parcel, readInt4);
                    }
                }
                fyb.am(parcel, ac4);
                return new gdb(i4, i7);
            case 4:
                int ac5 = fyb.ac(parcel);
                while (parcel.dataPosition() < ac5) {
                    int readInt5 = parcel.readInt();
                    if (fyb.Y(readInt5) == 2) {
                        str2 = fyb.ai(parcel, readInt5);
                    } else {
                        fyb.ao(parcel, readInt5);
                    }
                }
                fyb.am(parcel, ac5);
                return new gdn(str2);
            case 5:
                int ac6 = fyb.ac(parcel);
                Intent intent = null;
                int i8 = 0;
                while (parcel.dataPosition() < ac6) {
                    int readInt6 = parcel.readInt();
                    int Y3 = fyb.Y(readInt6);
                    if (Y3 == 1) {
                        i3 = fyb.aa(parcel, readInt6);
                    } else if (Y3 == 2) {
                        i8 = fyb.aa(parcel, readInt6);
                    } else if (Y3 == 3) {
                        intent = (Intent) fyb.ag(parcel, readInt6, Intent.CREATOR);
                    } else {
                        fyb.ao(parcel, readInt6);
                    }
                }
                fyb.am(parcel, ac6);
                return new gdw(i3, i8, intent);
            case 6:
                int ac7 = fyb.ac(parcel);
                String str6 = null;
                while (parcel.dataPosition() < ac7) {
                    int readInt7 = parcel.readInt();
                    int Y4 = fyb.Y(readInt7);
                    if (Y4 == 1) {
                        arrayList = fyb.ak(parcel, readInt7);
                    } else if (Y4 == 2) {
                        str6 = fyb.ai(parcel, readInt7);
                    } else {
                        fyb.ao(parcel, readInt7);
                    }
                }
                fyb.am(parcel, ac7);
                return new gdz(arrayList, str6);
            case 7:
                int ac8 = fyb.ac(parcel);
                while (parcel.dataPosition() < ac8) {
                    int readInt8 = parcel.readInt();
                    int Y5 = fyb.Y(readInt8);
                    if (Y5 == 1) {
                        i2 = fyb.aa(parcel, readInt8);
                    } else if (Y5 == 2) {
                        frqVar = (frq) fyb.ag(parcel, readInt8, frq.CREATOR);
                    } else {
                        fyb.ao(parcel, readInt8);
                    }
                }
                fyb.am(parcel, ac8);
                return new geb(i2, frqVar);
            case 8:
                int ac9 = fyb.ac(parcel);
                frr frrVar = null;
                while (parcel.dataPosition() < ac9) {
                    int readInt9 = parcel.readInt();
                    int Y6 = fyb.Y(readInt9);
                    if (Y6 == 1) {
                        i = fyb.aa(parcel, readInt9);
                    } else if (Y6 == 2) {
                        fmtVar = (fmt) fyb.ag(parcel, readInt9, fmt.CREATOR);
                    } else if (Y6 == 3) {
                        frrVar = (frr) fyb.ag(parcel, readInt9, frr.CREATOR);
                    } else {
                        fyb.ao(parcel, readInt9);
                    }
                }
                fyb.am(parcel, ac9);
                return new gec(i, fmtVar, frrVar);
            case 9:
                int ac10 = fyb.ac(parcel);
                String str7 = null;
                byte[] bArr2 = null;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < ac10) {
                    int readInt10 = parcel.readInt();
                    int Y7 = fyb.Y(readInt10);
                    if (Y7 == 1) {
                        str7 = fyb.ai(parcel, readInt10);
                    } else if (Y7 == 2) {
                        bArr2 = fyb.aq(parcel, readInt10);
                    } else if (Y7 == 3) {
                        int ab = fyb.ab(parcel, readInt10);
                        int dataPosition = parcel.dataPosition();
                        if (ab == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            int readInt11 = parcel.readInt();
                            for (int i9 = 0; i9 < readInt11; i9++) {
                                arrayList4.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(dataPosition + ab);
                            arrayList3 = arrayList4;
                        }
                    } else {
                        fyb.ao(parcel, readInt10);
                    }
                }
                fyb.am(parcel, ac10);
                return new gev(str7, bArr2, arrayList3);
            case 10:
                int ac11 = fyb.ac(parcel);
                ArrayList arrayList5 = null;
                boolean z4 = false;
                while (parcel.dataPosition() < ac11) {
                    int readInt12 = parcel.readInt();
                    int Y8 = fyb.Y(readInt12);
                    if (Y8 == 1) {
                        arrayList5 = fyb.al(parcel, readInt12, gev.CREATOR);
                    } else if (Y8 == 2) {
                        z2 = fyb.ap(parcel, readInt12);
                    } else if (Y8 == 3) {
                        z4 = fyb.ap(parcel, readInt12);
                    } else {
                        fyb.ao(parcel, readInt12);
                    }
                }
                fyb.am(parcel, ac11);
                return new gew(arrayList5, z2, z4);
            case 11:
                int ac12 = fyb.ac(parcel);
                ArrayList arrayList6 = null;
                String str8 = null;
                int i10 = 0;
                boolean z5 = false;
                int i11 = 0;
                boolean z6 = false;
                while (parcel.dataPosition() < ac12) {
                    int readInt13 = parcel.readInt();
                    switch (fyb.Y(readInt13)) {
                        case 2:
                            i10 = fyb.aa(parcel, readInt13);
                            break;
                        case 3:
                            z5 = fyb.ap(parcel, readInt13);
                            break;
                        case 4:
                            arrayList6 = fyb.ak(parcel, readInt13);
                            break;
                        case 5:
                            i11 = fyb.aa(parcel, readInt13);
                            break;
                        case 6:
                            str8 = fyb.ai(parcel, readInt13);
                            break;
                        case 7:
                            z6 = fyb.ap(parcel, readInt13);
                            break;
                        default:
                            fyb.ao(parcel, readInt13);
                            break;
                    }
                }
                fyb.am(parcel, ac12);
                return new gfh(i10, z5, arrayList6, i11, str8, z6);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new gpm(parcel);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new gpj(parcel);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new gpk(parcel);
            case 15:
                return new gpl(parcel);
            case 16:
                return new gpn(parcel);
            case 17:
                return new gpp(parcel);
            case 18:
                return new gpo(parcel);
            case 19:
                return new gpq(parcel);
            default:
                return new iay(parcel.readInt(), (iax) kki.B(parcel, iax.values()), TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt());
        }
    }
}

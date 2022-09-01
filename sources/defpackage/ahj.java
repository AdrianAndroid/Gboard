package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ahj  reason: default package */
/* loaded from: classes.dex */
public final class ahj implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ahj(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ahk[i];
            case 1:
                return new acm[i];
            case 2:
                return new ahn[i];
            case 3:
                return new ahq[i];
            case 4:
                return new aht[i];
            case 5:
                return new aii[i];
            case 6:
                return new aiw[i];
            case 7:
                return new aiy[i];
            case 8:
                return new amo[i];
            case 9:
                return new asz[i];
            case 10:
                return new dnh[i];
            case 11:
                return new fke[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new fki[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new fkm[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new fkq[i];
            case 15:
                return new TokenData[i];
            case 16:
                return new GoogleSignInAccount[i];
            case 17:
                return new flh[i];
            case 18:
                return new fmc[i];
            case 19:
                return new fme[i];
            default:
                return new fmm[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        switch (this.a) {
            case 0:
                return new ahk(parcel);
            case 1:
                return new acm(parcel);
            case 2:
                return new ahn(parcel);
            case 3:
                return new ahq(parcel);
            case 4:
                return new aht(parcel);
            case 5:
                return new aii(parcel);
            case 6:
                return new aiw(parcel);
            case 7:
                return new aiy(parcel);
            case 8:
                return new amo(parcel);
            case 9:
                return new asz(parcel);
            case 10:
                return new dnh(parcel);
            case 11:
                return new fke(parcel);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new fki(parcel);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int ac = fyb.ac(parcel);
                String str3 = null;
                byte[][] bArr = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                int i2 = 0;
                int i3 = 0;
                while (parcel.dataPosition() < ac) {
                    int readInt = parcel.readInt();
                    switch (fyb.Y(readInt)) {
                        case 1:
                            i2 = fyb.aa(parcel, readInt);
                            break;
                        case 2:
                            i3 = fyb.aa(parcel, readInt);
                            break;
                        case 3:
                            str3 = fyb.ai(parcel, readInt);
                            break;
                        case 4:
                            bArr = fyb.au(parcel, readInt);
                            break;
                        case 5:
                            bArr2 = fyb.aq(parcel, readInt);
                            break;
                        case 6:
                            bArr3 = fyb.aq(parcel, readInt);
                            break;
                        default:
                            fyb.ao(parcel, readInt);
                            break;
                    }
                }
                fyb.am(parcel, ac);
                return new fkm(i2, i3, str3, bArr, bArr2, bArr3);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int ac2 = fyb.ac(parcel);
                String[] strArr = null;
                while (parcel.dataPosition() < ac2) {
                    int readInt2 = parcel.readInt();
                    int Y = fyb.Y(readInt2);
                    if (Y == 1) {
                        str = fyb.ai(parcel, readInt2);
                    } else if (Y == 2) {
                        strArr = fyb.at(parcel, readInt2);
                    } else {
                        fyb.ao(parcel, readInt2);
                    }
                }
                fyb.am(parcel, ac2);
                return new fkq(str, strArr);
            case 15:
                int ac3 = fyb.ac(parcel);
                String str4 = null;
                Long l = null;
                ArrayList arrayList2 = null;
                String str5 = null;
                int i4 = 0;
                boolean z = false;
                boolean z2 = false;
                while (parcel.dataPosition() < ac3) {
                    int readInt3 = parcel.readInt();
                    switch (fyb.Y(readInt3)) {
                        case 1:
                            i4 = fyb.aa(parcel, readInt3);
                            break;
                        case 2:
                            str4 = fyb.ai(parcel, readInt3);
                            break;
                        case 3:
                            int ab = fyb.ab(parcel, readInt3);
                            if (ab != 0) {
                                fyb.av(parcel, ab, 8);
                                l = Long.valueOf(parcel.readLong());
                                break;
                            } else {
                                l = null;
                                break;
                            }
                        case 4:
                            z = fyb.ap(parcel, readInt3);
                            break;
                        case 5:
                            z2 = fyb.ap(parcel, readInt3);
                            break;
                        case 6:
                            arrayList2 = fyb.ak(parcel, readInt3);
                            break;
                        case 7:
                            str5 = fyb.ai(parcel, readInt3);
                            break;
                        default:
                            fyb.ao(parcel, readInt3);
                            break;
                    }
                }
                fyb.am(parcel, ac3);
                return new TokenData(i4, str4, l, z, z2, arrayList2, str5);
            case 16:
                int ac4 = fyb.ac(parcel);
                long j = 0;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                Uri uri = null;
                String str10 = null;
                String str11 = null;
                ArrayList arrayList3 = null;
                String str12 = null;
                String str13 = null;
                int i5 = 0;
                while (parcel.dataPosition() < ac4) {
                    int readInt4 = parcel.readInt();
                    switch (fyb.Y(readInt4)) {
                        case 1:
                            i5 = fyb.aa(parcel, readInt4);
                            break;
                        case 2:
                            str6 = fyb.ai(parcel, readInt4);
                            break;
                        case 3:
                            str7 = fyb.ai(parcel, readInt4);
                            break;
                        case 4:
                            str8 = fyb.ai(parcel, readInt4);
                            break;
                        case 5:
                            str9 = fyb.ai(parcel, readInt4);
                            break;
                        case 6:
                            uri = (Uri) fyb.ag(parcel, readInt4, Uri.CREATOR);
                            break;
                        case 7:
                            str10 = fyb.ai(parcel, readInt4);
                            break;
                        case 8:
                            j = fyb.ad(parcel, readInt4);
                            break;
                        case 9:
                            str11 = fyb.ai(parcel, readInt4);
                            break;
                        case 10:
                            arrayList3 = fyb.al(parcel, readInt4, Scope.CREATOR);
                            break;
                        case 11:
                            str12 = fyb.ai(parcel, readInt4);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            str13 = fyb.ai(parcel, readInt4);
                            break;
                        default:
                            fyb.ao(parcel, readInt4);
                            break;
                    }
                }
                fyb.am(parcel, ac4);
                return new GoogleSignInAccount(i5, str6, str7, str8, str9, uri, str10, j, str11, arrayList3, str12, str13);
            case 17:
                int ac5 = fyb.ac(parcel);
                while (parcel.dataPosition() < ac5) {
                    int readInt5 = parcel.readInt();
                    int Y2 = fyb.Y(readInt5);
                    if (Y2 == 1) {
                        i = fyb.aa(parcel, readInt5);
                    } else if (Y2 == 2) {
                        str2 = fyb.ai(parcel, readInt5);
                    } else {
                        fyb.ao(parcel, readInt5);
                    }
                }
                fyb.am(parcel, ac5);
                return new flh(i, str2);
            case 18:
                int ac6 = fyb.ac(parcel);
                fmp fmpVar = null;
                byte[] bArr4 = null;
                int[] iArr = null;
                String[] strArr2 = null;
                int[] iArr2 = null;
                byte[][] bArr5 = null;
                gcv[] gcvVarArr = null;
                fmo fmoVar = null;
                String[] strArr3 = null;
                boolean z3 = true;
                while (parcel.dataPosition() < ac6) {
                    int readInt6 = parcel.readInt();
                    switch (fyb.Y(readInt6)) {
                        case 2:
                            fmpVar = (fmp) fyb.ag(parcel, readInt6, fmp.CREATOR);
                            break;
                        case 3:
                            bArr4 = fyb.aq(parcel, readInt6);
                            break;
                        case 4:
                            iArr = fyb.ar(parcel, readInt6);
                            break;
                        case 5:
                            strArr2 = fyb.at(parcel, readInt6);
                            break;
                        case 6:
                            iArr2 = fyb.ar(parcel, readInt6);
                            break;
                        case 7:
                            bArr5 = fyb.au(parcel, readInt6);
                            break;
                        case 8:
                            z3 = fyb.ap(parcel, readInt6);
                            break;
                        case 9:
                            gcvVarArr = (gcv[]) fyb.as(parcel, readInt6, gcv.CREATOR);
                            break;
                        case 10:
                        default:
                            fyb.ao(parcel, readInt6);
                            break;
                        case 11:
                            fmoVar = (fmo) fyb.ag(parcel, readInt6, fmo.CREATOR);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            strArr3 = fyb.at(parcel, readInt6);
                            break;
                    }
                }
                fyb.am(parcel, ac6);
                return new fmc(fmpVar, bArr4, iArr, strArr2, iArr2, bArr5, z3, gcvVarArr, fmoVar, strArr3);
            case 19:
                int ac7 = fyb.ac(parcel);
                while (parcel.dataPosition() < ac7) {
                    int readInt7 = parcel.readInt();
                    if (fyb.Y(readInt7) == 1) {
                        arrayList = fyb.al(parcel, readInt7, fmm.CREATOR);
                    } else {
                        fyb.ao(parcel, readInt7);
                    }
                }
                fyb.am(parcel, ac7);
                return new fme(arrayList);
            default:
                int ac8 = fyb.ac(parcel);
                String str14 = null;
                int i6 = 0;
                while (parcel.dataPosition() < ac8) {
                    int readInt8 = parcel.readInt();
                    int Y3 = fyb.Y(readInt8);
                    if (Y3 == 1) {
                        str14 = fyb.ai(parcel, readInt8);
                    } else if (Y3 == 2) {
                        i = fyb.aa(parcel, readInt8);
                    } else if (Y3 == 3) {
                        i6 = fyb.aa(parcel, readInt8);
                    } else {
                        fyb.ao(parcel, readInt8);
                    }
                }
                fyb.am(parcel, ac8);
                return new fmm(str14, i, i6);
        }
    }
}

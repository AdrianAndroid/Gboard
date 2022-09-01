package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fuo  reason: default package */
/* loaded from: classes.dex */
public final class fuo implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public fuo(int i) {
        this.a = i;
    }

    public static final ErrorReport a(Parcel parcel) {
        int ac = fyb.ac(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        fun[] funVarArr = null;
        String[] strArr4 = null;
        String str29 = null;
        fuq fuqVar = null;
        fup fupVar = null;
        String str30 = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        String str31 = null;
        ArrayList arrayList2 = null;
        String[] strArr5 = null;
        String[] strArr6 = null;
        String[] strArr7 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < ac) {
            int Z = fyb.Z(parcel);
            switch (fyb.Y(Z)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) fyb.ag(parcel, Z, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = fyb.ai(parcel, Z);
                    break;
                case 4:
                    i = fyb.aa(parcel, Z);
                    break;
                case 5:
                    str2 = fyb.ai(parcel, Z);
                    break;
                case 6:
                    str3 = fyb.ai(parcel, Z);
                    break;
                case 7:
                    str4 = fyb.ai(parcel, Z);
                    break;
                case 8:
                    str5 = fyb.ai(parcel, Z);
                    break;
                case 9:
                    str6 = fyb.ai(parcel, Z);
                    break;
                case 10:
                    str7 = fyb.ai(parcel, Z);
                    break;
                case 11:
                    str8 = fyb.ai(parcel, Z);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    i2 = fyb.aa(parcel, Z);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    str9 = fyb.ai(parcel, Z);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    str10 = fyb.ai(parcel, Z);
                    break;
                case 15:
                    str11 = fyb.ai(parcel, Z);
                    break;
                case 16:
                    str12 = fyb.ai(parcel, Z);
                    break;
                case 17:
                    str13 = fyb.ai(parcel, Z);
                    break;
                case 18:
                    strArr = fyb.at(parcel, Z);
                    break;
                case 19:
                    strArr2 = fyb.at(parcel, Z);
                    break;
                case 20:
                    strArr3 = fyb.at(parcel, Z);
                    break;
                case 21:
                    str14 = fyb.ai(parcel, Z);
                    break;
                case 22:
                    str15 = fyb.ai(parcel, Z);
                    break;
                case 23:
                    bArr = fyb.aq(parcel, Z);
                    break;
                case 24:
                    i3 = fyb.aa(parcel, Z);
                    break;
                case 25:
                    i4 = fyb.aa(parcel, Z);
                    break;
                case 26:
                    i5 = fyb.aa(parcel, Z);
                    break;
                case 27:
                    i6 = fyb.aa(parcel, Z);
                    break;
                case 28:
                    str16 = fyb.ai(parcel, Z);
                    break;
                case 29:
                    str17 = fyb.ai(parcel, Z);
                    break;
                case 30:
                    str18 = fyb.ai(parcel, Z);
                    break;
                case 31:
                    bundle = fyb.ae(parcel, Z);
                    break;
                case 32:
                    z = fyb.ap(parcel, Z);
                    break;
                case 33:
                    i7 = fyb.aa(parcel, Z);
                    break;
                case 34:
                    i8 = fyb.aa(parcel, Z);
                    break;
                case 35:
                    z2 = fyb.ap(parcel, Z);
                    break;
                case 36:
                    str19 = fyb.ai(parcel, Z);
                    break;
                case 37:
                    str20 = fyb.ai(parcel, Z);
                    break;
                case 38:
                    i9 = fyb.aa(parcel, Z);
                    break;
                case 39:
                    str21 = fyb.ai(parcel, Z);
                    break;
                case 40:
                    str22 = fyb.ai(parcel, Z);
                    break;
                case 41:
                    str23 = fyb.ai(parcel, Z);
                    break;
                case 42:
                    str24 = fyb.ai(parcel, Z);
                    break;
                case 43:
                    str25 = fyb.ai(parcel, Z);
                    break;
                case 44:
                    str26 = fyb.ai(parcel, Z);
                    break;
                case 45:
                    str27 = fyb.ai(parcel, Z);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) fyb.ag(parcel, Z, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = fyb.ai(parcel, Z);
                    break;
                case 48:
                    funVarArr = (fun[]) fyb.as(parcel, Z, fun.CREATOR);
                    break;
                case 49:
                    strArr4 = fyb.at(parcel, Z);
                    break;
                case 50:
                    z3 = fyb.ap(parcel, Z);
                    break;
                case 51:
                    str29 = fyb.ai(parcel, Z);
                    break;
                case 52:
                    fuqVar = (fuq) fyb.ag(parcel, Z, fuq.CREATOR);
                    break;
                case 53:
                    fupVar = (fup) fyb.ag(parcel, Z, fup.CREATOR);
                    break;
                case 54:
                    str30 = fyb.ai(parcel, Z);
                    break;
                case 55:
                    z4 = fyb.ap(parcel, Z);
                    break;
                case 56:
                    bundle2 = fyb.ae(parcel, Z);
                    break;
                case 57:
                    arrayList = fyb.al(parcel, Z, RectF.CREATOR);
                    break;
                case 58:
                    z5 = fyb.ap(parcel, Z);
                    break;
                case 59:
                    bitmap = (Bitmap) fyb.ag(parcel, Z, Bitmap.CREATOR);
                    break;
                case 60:
                    str31 = fyb.ai(parcel, Z);
                    break;
                case 61:
                    arrayList2 = fyb.ak(parcel, Z);
                    break;
                case 62:
                    i10 = fyb.aa(parcel, Z);
                    break;
                case 63:
                    i11 = fyb.aa(parcel, Z);
                    break;
                case 64:
                    strArr5 = fyb.at(parcel, Z);
                    break;
                case 65:
                    strArr6 = fyb.at(parcel, Z);
                    break;
                case 66:
                    strArr7 = fyb.at(parcel, Z);
                    break;
                case 67:
                    z6 = fyb.ap(parcel, Z);
                    break;
                case 68:
                    z7 = fyb.ap(parcel, Z);
                    break;
                default:
                    fyb.ao(parcel, Z);
                    break;
            }
        }
        fyb.am(parcel, ac);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, funVarArr, strArr4, z3, str29, fuqVar, fupVar, str30, z4, bundle2, arrayList, z5, bitmap, str31, arrayList2, i10, i11, strArr5, strArr6, strArr7, z6, z7);
    }

    public static void b(fuz fuzVar, Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.R(parcel, 1, fuzVar.a, i);
        fyb.S(parcel, 2, fuzVar.b);
        fyb.S(parcel, 3, fuzVar.c);
        fyb.I(parcel, 4, fuzVar.d);
        fyb.S(parcel, 5, fuzVar.e);
        fyb.I(parcel, 6, fuzVar.f);
        fyb.E(parcel, C);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new fun[i];
            case 1:
                return new ErrorReport[i];
            case 2:
                return new fup[i];
            case 3:
                return new fuq[i];
            case 4:
                return new FRDProductSpecificDataEntry[i];
            case 5:
                return new fuz[i];
            case 6:
                return new ND4CSettings[i];
            case 7:
                return new fva[i];
            case 8:
                return new fvp[i];
            case 9:
                return new TogglingData[i];
            case 10:
                return new fvs[i];
            case 11:
                return new fvt[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new fvu[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new fwf[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new fwm[i];
            case 15:
                return new fwn[i];
            case 16:
                return new fwq[i];
            case 17:
                return new gcs[i];
            case 18:
                return new gct[i];
            case 19:
                return new gcu[i];
            default:
                return new gcv[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 555
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:60)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r28) {
        /*
            Method dump skipped, instructions count: 1580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuo.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}

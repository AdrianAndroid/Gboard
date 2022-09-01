package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fum  reason: default package */
/* loaded from: classes.dex */
public final class fum implements Parcelable.Creator {
    public static void a(ful fulVar, Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.S(parcel, 2, fulVar.a);
        fyb.K(parcel, 3, fulVar.b);
        fyb.S(parcel, 5, fulVar.c);
        fyb.R(parcel, 6, fulVar.d, i);
        fyb.S(parcel, 7, fulVar.e);
        fyb.R(parcel, 8, fulVar.f, i);
        fyb.S(parcel, 9, fulVar.g);
        fyb.W(parcel, 10, fulVar.h);
        fyb.F(parcel, 11, fulVar.i);
        fyb.R(parcel, 12, fulVar.j, i);
        fyb.R(parcel, 13, fulVar.k, i);
        fyb.F(parcel, 14, fulVar.l);
        fyb.R(parcel, 15, fulVar.m, i);
        fyb.S(parcel, 16, fulVar.n);
        fyb.F(parcel, 17, fulVar.o);
        fyb.J(parcel, 18, fulVar.p);
        fyb.F(parcel, 19, fulVar.q);
        fyb.E(parcel, C);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int ac = fyb.ac(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        fuq fuqVar = null;
        fup fupVar = null;
        Bitmap bitmap = null;
        String str5 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < ac) {
            int readInt = parcel.readInt();
            switch (fyb.Y(readInt)) {
                case 2:
                    str = fyb.ai(parcel, readInt);
                    break;
                case 3:
                    bundle = fyb.ae(parcel, readInt);
                    break;
                case 4:
                default:
                    fyb.ao(parcel, readInt);
                    break;
                case 5:
                    str2 = fyb.ai(parcel, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) fyb.ag(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = fyb.ai(parcel, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) fyb.ag(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = fyb.ai(parcel, readInt);
                    break;
                case 10:
                    arrayList = fyb.al(parcel, readInt, fun.CREATOR);
                    break;
                case 11:
                    z = fyb.ap(parcel, readInt);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    fuqVar = (fuq) fyb.ag(parcel, readInt, fuq.CREATOR);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    fupVar = (fup) fyb.ag(parcel, readInt, fup.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    z2 = fyb.ap(parcel, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) fyb.ag(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = fyb.ai(parcel, readInt);
                    break;
                case 17:
                    z3 = fyb.ap(parcel, readInt);
                    break;
                case 18:
                    j = fyb.ad(parcel, readInt);
                    break;
                case 19:
                    z4 = fyb.ap(parcel, readInt);
                    break;
            }
        }
        fyb.am(parcel, ac);
        return new ful(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, fuqVar, fupVar, z2, bitmap, str5, z3, j, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ful[i];
    }
}

package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fuw  reason: default package */
/* loaded from: classes.dex */
public final class fuw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int ac = fyb.ac(parcel);
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        ArrayList arrayList = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        String str4 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        fuq fuqVar = null;
        ArrayList arrayList3 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String str5 = null;
        String str6 = null;
        ND4CSettings nD4CSettings = null;
        ArrayList arrayList4 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < ac) {
            int readInt = parcel.readInt();
            switch (fyb.Y(readInt)) {
                case 1:
                    i = fyb.aa(parcel, readInt);
                    break;
                case 2:
                    str = fyb.ai(parcel, readInt);
                    break;
                case 3:
                    account = (Account) fyb.ag(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = fyb.ae(parcel, readInt);
                    break;
                case 5:
                    z = fyb.ap(parcel, readInt);
                    break;
                case 6:
                    z2 = fyb.ap(parcel, readInt);
                    break;
                case 7:
                    arrayList = fyb.ak(parcel, readInt);
                    break;
                case 8:
                case 9:
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                case 24:
                case 26:
                case 27:
                case 29:
                case 30:
                default:
                    fyb.ao(parcel, readInt);
                    break;
                case 10:
                    bundle2 = fyb.ae(parcel, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) fyb.ag(parcel, readInt, Bitmap.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    str4 = fyb.ai(parcel, readInt);
                    break;
                case 15:
                    uri = (Uri) fyb.ag(parcel, readInt, Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = fyb.al(parcel, readInt, fvp.CREATOR);
                    break;
                case 17:
                    i4 = fyb.aa(parcel, readInt);
                    break;
                case 18:
                    arrayList3 = fyb.al(parcel, readInt, fva.CREATOR);
                    break;
                case 19:
                    bArr = fyb.aq(parcel, readInt);
                    break;
                case 20:
                    i2 = fyb.aa(parcel, readInt);
                    break;
                case 21:
                    i3 = fyb.aa(parcel, readInt);
                    break;
                case 22:
                    z3 = fyb.ap(parcel, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) fyb.ag(parcel, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    fuqVar = (fuq) fyb.ag(parcel, readInt, fuq.CREATOR);
                    break;
                case 28:
                    str2 = fyb.ai(parcel, readInt);
                    break;
                case 31:
                    togglingData = (TogglingData) fyb.ag(parcel, readInt, TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = fyb.aa(parcel, readInt);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) fyb.ag(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 34:
                    str3 = fyb.ai(parcel, readInt);
                    break;
                case 35:
                    bitmap = (Bitmap) fyb.ag(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 36:
                    i6 = fyb.aa(parcel, readInt);
                    break;
                case 37:
                    z4 = fyb.ap(parcel, readInt);
                    break;
                case 38:
                    z5 = fyb.ap(parcel, readInt);
                    break;
                case 39:
                    i7 = fyb.aa(parcel, readInt);
                    break;
                case 40:
                    str5 = fyb.ai(parcel, readInt);
                    break;
                case 41:
                    z6 = fyb.ap(parcel, readInt);
                    break;
                case 42:
                    str6 = fyb.ai(parcel, readInt);
                    break;
                case 43:
                    z7 = fyb.ap(parcel, readInt);
                    break;
                case 44:
                    nD4CSettings = (ND4CSettings) fyb.ag(parcel, readInt, ND4CSettings.CREATOR);
                    break;
                case 45:
                    z8 = fyb.ap(parcel, readInt);
                    break;
                case 46:
                    arrayList4 = fyb.al(parcel, readInt, FRDProductSpecificDataEntry.CREATOR);
                    break;
            }
        }
        fyb.am(parcel, ac);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, arrayList, bundle2, bitmap2, bArr, i2, i3, str4, uri, arrayList2, i4, fuqVar, arrayList3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6, str6, z7, nD4CSettings, z8, arrayList4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}

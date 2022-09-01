package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fmt  reason: default package */
/* loaded from: classes.dex */
public final class fmt extends frw {
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;
    public static final fmt a = new fmt(0);
    public static final Parcelable.Creator CREATOR = new fmq(2);

    public fmt(int i) {
        this(i, null, null);
    }

    public fmt(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public final boolean a() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean b() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fmt)) {
            return false;
        }
        fmt fmtVar = (fmt) obj;
        return this.c == fmtVar.c && fyb.aJ(this.d, fmtVar.d) && fyb.aJ(this.e, fmtVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        String str;
        ArrayList arrayList = new ArrayList();
        int i = this.c;
        if (i == 99) {
            str = "UNFINISHED";
        } else if (i != 1500) {
            switch (i) {
                case -1:
                    str = "UNKNOWN";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                    str = "SERVICE_MISSING";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 9:
                    str = "SERVICE_INVALID";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 11:
                    str = "LICENSE_CHECK_FAILED";
                    break;
                default:
                    switch (i) {
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            str = "CANCELED";
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            str = "TIMEOUT";
                            break;
                        case 15:
                            str = "INTERRUPTED";
                            break;
                        case 16:
                            str = "API_UNAVAILABLE";
                            break;
                        case 17:
                            str = "SIGN_IN_FAILED";
                            break;
                        case 18:
                            str = "SERVICE_UPDATING";
                            break;
                        case 19:
                            str = "SERVICE_MISSING_PERMISSION";
                            break;
                        case 20:
                            str = "RESTRICTED_PROFILE";
                            break;
                        case 21:
                            str = "API_VERSION_UPDATE_REQUIRED";
                            break;
                        case 22:
                            str = "RESOLUTION_ACTIVITY_NOT_FOUND";
                            break;
                        case 23:
                            str = "API_DISABLED";
                            break;
                        case 24:
                            str = "API_DISABLED_FOR_CONNECTION";
                            break;
                        default:
                            str = "UNKNOWN_ERROR_CODE(" + i + ")";
                            break;
                    }
            }
        } else {
            str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        fyb.aL("statusCode", str, arrayList);
        fyb.aL("resolution", this.d, arrayList);
        fyb.aL("message", this.e, arrayList);
        return fyb.aK(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int C = fyb.C(parcel);
        fyb.I(parcel, 1, this.b);
        fyb.I(parcel, 2, this.c);
        fyb.R(parcel, 3, this.d, i);
        fyb.S(parcel, 4, this.e);
        fyb.E(parcel, C);
    }

    public fmt(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public fmt(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}

package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* renamed from: pd  reason: default package */
/* loaded from: classes2.dex */
public final class pd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new akq(1);
    public final int a;
    public final Intent b;

    public pd(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public pd(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.a;
        if (i != -1) {
            str = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b == null ? 0 : 1);
        Intent intent = this.b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}

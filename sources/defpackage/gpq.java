package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: gpq  reason: default package */
/* loaded from: classes.dex */
public final class gpq extends ArrayList implements Parcelable {
    private static final long serialVersionUID = 1;
    public int b;
    public int c;
    public final String d;
    public String e;
    private final int f;
    private final int g;
    private final String h;
    private final String i;
    public static final gpq a = new gpq();
    public static final Parcelable.Creator CREATOR = new gcz(19);

    public gpq() {
        this.f = 0;
        this.g = 0;
        this.d = "";
        this.e = "";
        this.h = "";
        this.i = "";
    }

    public final void a(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeTypedList(this);
    }

    public gpq(byte[] bArr) {
        super(1);
        this.f = 0;
        this.g = 0;
        this.d = "";
        this.e = "";
        this.h = "";
        this.i = "";
    }

    public gpq(Parcel parcel) {
        this();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        parcel.readTypedList(this, gpp.CREATOR);
    }
}

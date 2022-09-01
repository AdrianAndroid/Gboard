package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: fke  reason: default package */
/* loaded from: classes.dex */
public final class fke implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ahj(11);
    public final String a;
    public final List b;

    public fke(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.createTypedArrayList(CREATOR);
    }

    private fke(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public static fke a(String str) {
        return new fke(str, Collections.emptyList());
    }

    public static fke b(fke... fkeVarArr) {
        return new fke("java.util.Set", Arrays.asList(fkeVarArr));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fke fkeVar = (fke) obj;
            if (this.a.equals(fkeVar.a) && this.b.equals(fkeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeTypedList(this.b);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ahq  reason: default package */
/* loaded from: classes.dex */
public final class ahq extends aht {
    public static final Parcelable.Creator CREATOR = new ahj(3);
    public Set a;

    public ahq(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.a = new HashSet();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Collections.addAll(this.a, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a.size());
        Set set = this.a;
        parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
    }

    public ahq(Parcelable parcelable) {
        super(parcelable);
    }
}

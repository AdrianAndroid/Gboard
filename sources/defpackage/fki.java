package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fki  reason: default package */
/* loaded from: classes.dex */
public final class fki implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ahj(12);
    public final Set a;
    private final fkd b;
    private final fke c;

    public fki(Parcel parcel) {
        this.b = (fkd) parcel.readParcelable(fkd.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.c = null;
            this.a = null;
            return;
        }
        this.a = new HashSet();
        fke fkeVar = (fke) parcel.readParcelable(fkd.class.getClassLoader());
        this.c = fkeVar;
        if (readInt <= 0) {
            return;
        }
        fke fkeVar2 = (fke) fkeVar.b.get(0);
        for (int i = 0; i < readInt; i++) {
            this.a.add(this.b.b(parcel, fkeVar2));
        }
    }

    public static fki a(fkd fkdVar, fke fkeVar, Set set) {
        return new fki(fkdVar, fkeVar, set);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        Set set = this.a;
        if (set == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(set.size());
        parcel.writeParcelable(this.c, i);
        if (this.a.isEmpty()) {
            return;
        }
        fke fkeVar = (fke) this.c.b.get(0);
        for (Object obj : this.a) {
            this.b.d(parcel, obj, fkeVar, i);
        }
    }

    private fki(fkd fkdVar, fke fkeVar, Set set) {
        fkeVar.getClass();
        this.b = fkdVar;
        this.c = fkeVar;
        this.a = set;
    }
}

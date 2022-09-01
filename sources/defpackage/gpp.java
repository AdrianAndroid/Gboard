package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: gpp  reason: default package */
/* loaded from: classes.dex */
public final class gpp implements Parcelable, Iterable {
    public static final Parcelable.Creator CREATOR = new gcz(17);
    private final ArrayList a;
    private final boolean b;

    public gpp() {
        this.a = new ArrayList();
        this.b = true;
    }

    public final int a() {
        return this.a.size();
    }

    public final gpo b(int i) {
        return (gpo) this.a.get(i);
    }

    public final gpo c() {
        return (gpo) this.a.get(0);
    }

    public final gpo d() {
        ArrayList arrayList = this.a;
        return (gpo) arrayList.get(arrayList.size() - 1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(float f, float f2, long j, float f3) {
        this.a.add(new gpo(f, f2, j, f3));
    }

    public final boolean f() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBooleanArray(new boolean[]{this.b});
        parcel.writeTypedList(this.a);
    }

    public gpp(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = parcel.createBooleanArray()[0];
        parcel.readTypedList(arrayList, gpo.CREATOR);
    }
}

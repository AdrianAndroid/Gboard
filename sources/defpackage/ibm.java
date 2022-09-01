package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ibm  reason: default package */
/* loaded from: classes.dex */
public final class ibm implements Parcelable {
    public final int b;
    public final String c;
    public final int d;
    public final long e;
    public final float f;
    public final float g;
    public final long h;
    public final String i;
    public final long j;
    public final ibl k;
    public final ibz l;
    public final int m;
    public final int n;
    public final icf[] o;
    private volatile int p;
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/metadata/KeyboardDef");
    public static final Parcelable.Creator CREATOR = new icc(1);

    public ibm(Parcel parcel) {
        this.p = Integer.MAX_VALUE;
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.f = parcel.readFloat();
        this.g = parcel.readFloat();
        this.h = parcel.readLong();
        this.i = parcel.readString();
        this.j = parcel.readLong();
        this.k = (ibl) kki.B(parcel, ibl.values());
        String readString = parcel.readString();
        this.l = TextUtils.isEmpty(readString) ? null : ibz.a(readString);
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        kns knsVar = new kns(ibj.a, iay.CREATOR);
        knsVar.f(parcel);
        kns knsVar2 = new kns(new ibf(knsVar, 1, null), new ibe(knsVar, 1, null));
        knsVar2.f(parcel);
        kns knsVar3 = new kns(new ibf(knsVar2, 4, null), new ibe(knsVar2, 4, null));
        knsVar3.f(parcel);
        this.o = (icf[]) kki.F(parcel, new ibe(knsVar3, 3, null));
        this.p = parcel.readInt();
    }

    public static ibk a() {
        return new ibk();
    }

    public final icf b(ice iceVar, int i) {
        icf[] icfVarArr;
        for (icf icfVar : this.o) {
            if (icfVar.b == iceVar && icfVar.a == i) {
                return icfVar;
            }
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/metadata/KeyboardDef", "getKeyboardViewDef", 629, "KeyboardDef.java")).J("KeyboardViewDef is not found: keyboardDef=%s, type=%s, id=%s", this, iceVar, Integer.valueOf(i));
        return null;
    }

    public final boolean c() {
        if (this.b == 0) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/metadata/KeyboardDef", "isValid", 230, "KeyboardDef.java")).t("Invalid keyboard id.");
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("className", this.c);
        S.b("id", jbi.h(this.b));
        S.g("initialStates", this.e);
        S.b("keyboardViewDefs", Arrays.toString(this.o));
        S.e("keyTextSizeRatio", this.g);
        S.g("persistentStates", this.h);
        S.b("persistentStatesPrefKey", this.i);
        S.b("popupBubbleLayoutId", jbi.h(this.d));
        S.b("recentKeyLayoutId", jbi.h(this.m));
        S.b("recentKeyPopupLayoutId", jbi.h(this.n));
        S.b("recentKeyType", this.l);
        S.b("rememberRecentKey", this.k);
        S.g("sessionStates", this.j);
        return S.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        ict[] ictVarArr;
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
        parcel.writeLong(this.h);
        parcel.writeString(this.i);
        parcel.writeLong(this.j);
        kki.C(parcel, this.k);
        ibz ibzVar = this.l;
        parcel.writeString(ibzVar != null ? ibzVar.l : "");
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        kns knsVar = new kns(ibj.b, iay.CREATOR);
        kns knsVar2 = new kns(new ibf(knsVar, 1, null), new ibe(knsVar, 1, null));
        kns knsVar3 = new kns(new ibf(knsVar2, 4, null), new ibe(knsVar2, 4, null));
        icf[] icfVarArr = this.o;
        if (icfVarArr != null) {
            int length = icfVarArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                ibi ibiVar = icfVarArr[i3].h;
                int size = ibiVar.b.size();
                for (int i4 = 0; i4 < size; i4++) {
                    for (ict ictVar : (ict[]) ((icy) ibiVar.b.valueAt(i4)).b) {
                        if (ictVar != null && knsVar3.j(ictVar)) {
                            ictVar.h(knsVar, knsVar2);
                        }
                    }
                }
                int size2 = ibiVar.c.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ict[][] ictVarArr2 = (ict[][]) ((icy) ibiVar.c.valueAt(i5)).b;
                    int length2 = ictVarArr2.length;
                    int i6 = 0;
                    while (i6 < length2) {
                        ict[] ictVarArr3 = ictVarArr2[i6];
                        icf[] icfVarArr2 = icfVarArr;
                        if (ictVarArr3 != null) {
                            int length3 = ictVarArr3.length;
                            i2 = size2;
                            int i7 = 0;
                            while (i7 < length3) {
                                int i8 = length3;
                                ict ictVar2 = ictVarArr3[i7];
                                if (ictVar2 != null && knsVar3.j(ictVar2)) {
                                    ictVar2.h(knsVar, knsVar2);
                                }
                                i7++;
                                length3 = i8;
                            }
                        } else {
                            i2 = size2;
                        }
                        i6++;
                        icfVarArr = icfVarArr2;
                        size2 = i2;
                    }
                }
            }
        }
        knsVar.i(parcel, i);
        knsVar2.i(parcel, i);
        knsVar3.i(parcel, i);
        icf[] icfVarArr3 = this.o;
        ibf ibfVar = new ibf(knsVar3, 3, null);
        if (icfVarArr3 == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(icfVarArr3.length);
            for (icf icfVar : icfVarArr3) {
                ibfVar.a(parcel, icfVar, i);
            }
        }
        if (this.p == Integer.MAX_VALUE) {
            String str = this.c;
            int i9 = 56;
            if (str != null) {
                i9 = 56 + str.getBytes().length;
            }
            String str2 = this.i;
            if (str2 != null) {
                i9 += str2.getBytes().length;
            }
            if (this.l != null) {
                i9 += 4;
            }
            icf[] icfVarArr4 = this.o;
            if (icfVarArr4 != null) {
                for (icf icfVar2 : icfVarArr4) {
                    i9 += icfVar2.a();
                }
            }
            this.p = i9;
        }
        parcel.writeInt(this.p);
    }

    public ibm(ibk ibkVar) {
        this.p = Integer.MAX_VALUE;
        int i = ibkVar.a;
        this.b = i;
        this.c = ibkVar.b;
        this.d = ibkVar.c;
        this.e = ibkVar.d;
        this.f = ibkVar.e;
        this.g = ibkVar.f;
        long j = ibkVar.g;
        this.h = j;
        String str = ibkVar.h;
        this.i = str;
        int i2 = 0;
        if (j == 0 || !TextUtils.isEmpty(str)) {
            this.j = ibkVar.i;
            this.k = ibkVar.j;
            this.l = ibkVar.k;
            this.m = ibkVar.l;
            this.n = ibkVar.m;
            ArrayList arrayList = new ArrayList();
            for (ica icaVar : ibkVar.n) {
                int i3 = icaVar.d;
                if (i3 != 0) {
                    if (i3 != 0) {
                        arrayList.add(new icf(icaVar));
                    } else {
                        throw new lgj("Invalid layout id.");
                    }
                }
            }
            this.o = new icf[arrayList.size()];
            int size = arrayList.size();
            int i4 = 0;
            while (i2 < size) {
                this.o[i4] = (icf) arrayList.get(i2);
                i2++;
                i4++;
            }
            return;
        }
        throw new IllegalStateException(String.format("Invalid keyboard (%s): persistentStatesPrefKey must be specified if persistentStates is not normal", jbi.h(i)));
    }
}

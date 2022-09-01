package defpackage;

import android.os.Parcel;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ibf  reason: default package */
/* loaded from: classes.dex */
public final class ibf implements jbd {
    private final /* synthetic */ int a;
    private final kns b;

    public ibf(kns knsVar, int i, byte[] bArr) {
        this.a = i;
        this.b = knsVar;
    }

    @Override // defpackage.jbd
    public final /* synthetic */ void a(Parcel parcel, Object obj, int i) {
        int i2 = this.a;
        int i3 = 0;
        if (i2 == 0) {
            icy icyVar = (icy) obj;
            if (icyVar == null) {
                parcel.writeInt(-1);
                return;
            }
            int length = icyVar.a.length;
            parcel.writeInt(length);
            while (i3 < length) {
                parcel.writeLong(icyVar.a[i3]);
                this.b.g(parcel, ((ict[][]) icyVar.b)[i3]);
                i3++;
            }
            parcel.writeLong(icyVar.c);
            parcel.writeInt(icyVar.a());
        } else if (i2 == 1) {
            ial ialVar = (ial) obj;
            kki.C(parcel, ialVar.c);
            this.b.g(parcel, ialVar.d);
            parcel.writeInt(ialVar.e ? 1 : 0);
            parcel.writeInt(ialVar.f ? 1 : 0);
            parcel.writeInt(ialVar.h ? 1 : 0);
            parcel.writeInt(ialVar.i ? 1 : 0);
            parcel.writeInt(ialVar.g);
            parcel.writeStringArray(ialVar.m);
            parcel.writeIntArray(ialVar.n);
            parcel.writeInt(ialVar.j);
            parcel.writeInt(ialVar.k);
            parcel.writeString(ialVar.l);
            parcel.writeInt(ialVar.hashCode());
            parcel.writeInt(ialVar.a());
        } else if (i2 == 2) {
            icy icyVar2 = (icy) obj;
            if (icyVar2 == null) {
                parcel.writeInt(-1);
                return;
            }
            int length2 = icyVar2.a.length;
            parcel.writeInt(length2);
            while (i3 < length2) {
                parcel.writeLong(icyVar2.a[i3]);
                this.b.h(parcel, ((ict[]) icyVar2.b)[i3]);
                i3++;
            }
            parcel.writeLong(icyVar2.c);
            parcel.writeInt(icyVar2.a());
        } else {
            String str = null;
            if (i2 == 3) {
                icf icfVar = (icf) obj;
                parcel.writeInt(icfVar.a);
                kki.C(parcel, icfVar.b);
                parcel.writeInt(icfVar.c ? 1 : 0);
                parcel.writeInt(icfVar.d);
                parcel.writeInt(icfVar.e ? 1 : 0);
                parcel.writeInt(icfVar.f ? 1 : 0);
                kki.C(parcel, icfVar.g);
                new ibh(this.b, null).a(parcel, icfVar.h, i);
                icd[] icdVarArr = icfVar.i;
                if (icdVarArr == null) {
                    parcel.writeInt(-1);
                } else {
                    int length3 = icdVarArr.length;
                    parcel.writeInt(length3);
                    while (i3 < length3) {
                        icdVarArr[i3].writeToParcel(parcel, i);
                        i3++;
                    }
                }
                parcel.writeInt(icfVar.a());
                return;
            }
            ict ictVar = (ict) obj;
            parcel.writeInt(ictVar.c);
            kki.C(parcel, ictVar.d);
            parcel.writeInt(ictVar.e);
            kki.C(parcel, ictVar.f);
            parcel.writeInt(ictVar.g);
            parcel.writeInt(ictVar.h);
            parcel.writeInt(ictVar.i);
            hhl hhlVar = ictVar.j;
            if (hhlVar != null) {
                str = hhq.l(hhlVar);
            }
            parcel.writeString(str);
            parcel.writeInt(ictVar.k ? 1 : 0);
            parcel.writeInt(ictVar.l ? 1 : 0);
            this.b.g(parcel, ictVar.m);
            CharSequence[] charSequenceArr = ictVar.n;
            if (charSequenceArr == null) {
                parcel.writeInt(-1);
            } else {
                parcel.writeInt(charSequenceArr.length);
                for (CharSequence charSequence : charSequenceArr) {
                    TextUtils.writeToParcel(charSequence, parcel, i);
                }
            }
            parcel.writeIntArray(ictVar.o);
            int[] iArr = new int[ictVar.p.length];
            int i4 = 0;
            while (true) {
                Object[] objArr = ictVar.p;
                if (i4 < objArr.length) {
                    Object obj2 = objArr[i4];
                    iArr[i4] = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                    i4++;
                } else {
                    parcel.writeIntArray(iArr);
                    parcel.writeIntArray(ictVar.q);
                    parcel.writeInt(ictVar.r ? 1 : 0);
                    parcel.writeFloat(ictVar.s);
                    parcel.writeString(ictVar.t);
                    parcel.writeInt(ictVar.u);
                    parcel.writeInt(ictVar.hashCode());
                    parcel.writeInt(ictVar.a());
                    return;
                }
            }
        }
    }
}

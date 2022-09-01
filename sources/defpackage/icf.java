package defpackage;

import android.os.Parcel;
import android.view.ViewDebug;
import java.util.List;

/* compiled from: PG */
/* renamed from: icf  reason: default package */
/* loaded from: classes.dex */
public final class icf {
    @ViewDebug.ExportedProperty(resolveId = true)
    public final int a;
    @ViewDebug.ExportedProperty
    public final ice b;
    @ViewDebug.ExportedProperty
    public final boolean c;
    @ViewDebug.ExportedProperty(resolveId = true)
    public final int d;
    @ViewDebug.ExportedProperty
    public final boolean e;
    @ViewDebug.ExportedProperty
    public final boolean f;
    @ViewDebug.ExportedProperty
    public final icb g;
    @ViewDebug.ExportedProperty(deepExport = true)
    public final ibi h;
    public final icd[] i;
    private volatile int j;

    public icf(Parcel parcel, kns knsVar, byte[] bArr) {
        this.j = Integer.MAX_VALUE;
        this.a = parcel.readInt();
        this.b = (ice) kki.B(parcel, ice.values());
        this.c = kki.E(parcel);
        this.d = parcel.readInt();
        this.e = kki.E(parcel);
        this.f = kki.E(parcel);
        this.g = (icb) kki.B(parcel, icb.values());
        this.h = new ibg(knsVar, null).createFromParcel(parcel);
        this.i = (icd[]) kki.F(parcel, icd.CREATOR);
        this.j = parcel.readInt();
    }

    public final int a() {
        if (this.j == Integer.MAX_VALUE) {
            int i = this.g != null ? 19 : 15;
            if (this.b != null) {
                i += 4;
            }
            ibi ibiVar = this.h;
            if (ibiVar.e == Integer.MAX_VALUE) {
                int size = ibiVar.b.size();
                int i2 = (size * 4) + 17;
                for (int i3 = 0; i3 < size; i3++) {
                    i2 += ((icy) ibiVar.b.valueAt(i3)).a();
                }
                int size2 = ibiVar.c.size();
                int i4 = i2 + (size2 * 4) + 5;
                for (int i5 = 0; i5 < size2; i5++) {
                    i4 += ((icy) ibiVar.c.valueAt(i5)).a();
                }
                ibiVar.e = i4;
            }
            int i6 = i + ibiVar.e;
            icd[] icdVarArr = this.i;
            if (icdVarArr != null) {
                for (icd icdVar : icdVarArr) {
                    i6 += icdVar.a();
                }
            }
            this.j = i6;
        }
        return this.j;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("direction", this.g);
        S.b("id", jbi.h(this.a));
        S.h("isScalable", this.f);
        S.b("layoutId", jbi.h(this.d));
        S.b("type", this.b);
        S.h("touchable", this.c);
        return S.toString();
    }

    public icf(ica icaVar) {
        icd[] icdVarArr;
        this.j = Integer.MAX_VALUE;
        this.a = icaVar.a;
        this.b = icaVar.b;
        this.c = icaVar.c;
        this.d = icaVar.d;
        this.e = icaVar.e;
        this.f = icaVar.f;
        this.g = icaVar.g;
        this.h = icaVar.h.a();
        if (icaVar.i.isEmpty()) {
            icdVarArr = null;
        } else {
            List list = icaVar.i;
            icdVarArr = (icd[]) list.toArray(new icd[list.size()]);
        }
        this.i = icdVarArr;
    }
}

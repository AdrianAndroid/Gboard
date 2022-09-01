package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: sd  reason: default package */
/* loaded from: classes2.dex */
public class sd extends rz {
    public rz[] ar = new rz[4];
    public int as = 0;

    public final void T(ArrayList arrayList, int i, ss ssVar) {
        for (int i2 = 0; i2 < this.as; i2++) {
            ssVar.d(this.ar[i2]);
        }
        for (int i3 = 0; i3 < this.as; i3++) {
            is.b(this.ar[i3], i, arrayList, ssVar);
        }
    }
}

package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: icw  reason: default package */
/* loaded from: classes.dex */
public final class icw {
    public final int a;
    public final SparseArray b;
    public final ict[] c;
    public final SparseArray d;

    public icw(icv icvVar) {
        this.a = icvVar.a;
        this.b = icvVar.c;
        icvVar.c = null;
        List list = icvVar.b;
        this.c = (ict[]) list.toArray(new ict[list.size()]);
        this.d = icvVar.d;
        icvVar.d = null;
    }

    public static icv a() {
        return new icv();
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("allSoftKeyDefs", Arrays.toString(this.c));
        return S.toString();
    }
}

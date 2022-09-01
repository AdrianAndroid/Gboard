package defpackage;

import android.util.AttributeSet;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ibb  reason: default package */
/* loaded from: classes.dex */
final class ibb implements jfx {
    final /* synthetic */ long[] a;
    final /* synthetic */ long[] b;
    final /* synthetic */ ibd c;

    public ibb(ibd ibdVar, long[] jArr, long[] jArr2) {
        this.c = ibdVar;
        this.a = jArr;
        this.b = jArr2;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.jfx
    public final void a(jfy jfyVar) {
        ibd ibdVar;
        ibd ibdVar2;
        boolean z;
        if ("merge".equals(jfyVar.b())) {
            AttributeSet a = jfyVar.a();
            int attributeResourceValue = a.getAttributeResourceValue(null, "view_id", 0);
            if (attributeResourceValue == 0) {
                throw jfyVar.c("SoftKeyView ID is not set or invalid.");
            }
            int attributeResourceValue2 = a.getAttributeResourceValue(null, "key_id", 0);
            if (attributeResourceValue2 == 0) {
                throw jfyVar.c("Softkey is not set or its ID is invalid." + attributeResourceValue);
            }
            ict g = this.c.g(attributeResourceValue2);
            if (g == null) {
                return;
            }
            ibd ibdVar3 = this.c;
            long[] jArr = this.a;
            long[] jArr2 = this.b;
            fws h = ibdVar3.h(attributeResourceValue);
            icy h2 = h.h();
            h.c.clear();
            h.b.clear();
            h.c.add(0L);
            h.b.add(null);
            int i = 0;
            while (true) {
                long[] jArr3 = h2.a;
                if (i >= jArr3.length) {
                    return;
                }
                long j = jArr3[i];
                ict ictVar = ((ict[]) h2.b)[i];
                h.j(j, ictVar);
                if (ictVar == null || ibd.b(j, jArr2)) {
                    ibdVar = ibdVar3;
                } else {
                    int length = jArr.length;
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 < length) {
                        boolean z3 = z2;
                        long j2 = jArr[i2];
                        if (!iby.c(j, j2)) {
                            long j3 = j2 | j;
                            if (!ibd.b(j3, jArr2)) {
                                if (ibdVar3.e == null) {
                                    ibdVar3.e = ict.d();
                                }
                                ico icoVar = ibdVar3.e;
                                icoVar.v();
                                icoVar.i(ictVar);
                                ibdVar2 = ibdVar3;
                                icoVar.l(g.m, false);
                                icoVar.j.addAll(Arrays.asList(g.p));
                                icoVar.k.c(g.q);
                                icoVar.l.addAll(Arrays.asList(g.n));
                                icoVar.m.c(g.o);
                                int i3 = g.e;
                                if (i3 != 0) {
                                    icoVar.n = i3;
                                }
                                int i4 = g.i;
                                if (i4 != -1) {
                                    icoVar.o = i4;
                                }
                                hhl hhlVar = g.j;
                                if (hhlVar != null) {
                                    icoVar.p = hhlVar;
                                }
                                if (g.r) {
                                    icoVar.q = true;
                                }
                                if (g.f != icq.ON_GESTURE) {
                                    icoVar.r = g.f;
                                }
                                if (g.d != icr.NO_SLIDE) {
                                    icoVar.s = g.d;
                                }
                                float f = g.s;
                                if (f != 1.0f) {
                                    icoVar.t = f;
                                }
                                int i5 = g.h;
                                if (i5 != 50) {
                                    icoVar.u = i5;
                                }
                                int i6 = g.g;
                                if (i6 != 400) {
                                    icoVar.v = i6;
                                }
                                int i7 = g.u;
                                if (i7 != 255) {
                                    icoVar.w = i7;
                                }
                                if (g.k) {
                                    z = true;
                                    icoVar.x = true;
                                } else {
                                    z = true;
                                }
                                if (g.l) {
                                    icoVar.y = z;
                                }
                                h.j(j3, icoVar.c());
                                z2 = true;
                                i2++;
                                ibdVar3 = ibdVar2;
                            }
                        }
                        ibdVar2 = ibdVar3;
                        z2 = z3;
                        i2++;
                        ibdVar3 = ibdVar2;
                    }
                    ibdVar = ibdVar3;
                    if (z2 && jArr2 != null) {
                        for (long j4 : jArr2) {
                            if (!iby.c(j, j4)) {
                                h.j(j4 | j, ictVar);
                            }
                        }
                    }
                }
                i++;
                ibdVar3 = ibdVar;
            }
        } else {
            throw jfyVar.c("Tag <" + jfyVar.b() + "> should not be inside + <merge_key_mapping>.");
        }
    }
}

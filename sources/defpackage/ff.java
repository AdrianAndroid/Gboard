package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: ff  reason: default package */
/* loaded from: classes.dex */
public final class ff {
    public final List a;
    public final int[] b;
    public final int[] c;
    public final fe d;
    public final int e;
    public final int f;

    public ff(fe feVar, List list, int[] iArr, int[] iArr2) {
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = feVar;
        int b = feVar.b();
        this.e = b;
        int a = feVar.a();
        this.f = a;
        lcv lcvVar = list.isEmpty() ? null : (lcv) list.get(0);
        if (lcvVar == null || lcvVar.b != 0 || lcvVar.c != 0) {
            list.add(0, new lcv(0, 0, 0, (char[]) null));
        }
        list.add(new lcv(b, a, 0, (char[]) null));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lcv lcvVar2 = (lcv) it.next();
            for (int i = 0; i < lcvVar2.a; i++) {
                int i2 = lcvVar2.b + i;
                int i3 = lcvVar2.c + i;
                int i4 = true != this.d.c(i2, i3) ? 2 : 1;
                this.b[i2] = (i3 << 4) | i4;
                this.c[i3] = (i2 << 4) | i4;
            }
        }
        int i5 = 0;
        for (lcv lcvVar3 : this.a) {
            while (i5 < lcvVar3.b) {
                if (this.b[i5] == 0) {
                    int size = this.a.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i6 < size) {
                            lcv lcvVar4 = (lcv) this.a.get(i6);
                            while (i7 < lcvVar4.c) {
                                if (this.c[i7] != 0 || !this.d.d(i5, i7)) {
                                    i7++;
                                } else {
                                    int i8 = true != this.d.c(i5, i7) ? 4 : 8;
                                    this.b[i5] = (i7 << 4) | i8;
                                    this.c[i7] = i8 | (i5 << 4);
                                }
                            }
                            i7 = lcvVar4.b();
                            i6++;
                        }
                    }
                }
                i5++;
            }
            i5 = lcvVar3.a();
        }
    }

    public static fg a(Collection collection, int i, boolean z) {
        fg fgVar;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                fgVar = null;
                break;
            }
            fgVar = (fg) it.next();
            if (fgVar.a == i && fgVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            fg fgVar2 = (fg) it.next();
            if (z) {
                fgVar2.b--;
            } else {
                fgVar2.b++;
            }
        }
        return fgVar;
    }
}

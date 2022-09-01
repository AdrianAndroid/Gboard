package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hsb  reason: default package */
/* loaded from: classes.dex */
public final class hsb implements jfo {
    public final lmz a;
    public final SparseArray b;
    public final hsa c;
    public final jls d;
    public final kdr e;

    public hsb(hsa hsaVar, kdr kdrVar, jls jlsVar, byte[] bArr) {
        SparseArray sparseArray = new SparseArray();
        this.b = sparseArray;
        this.c = hsaVar;
        this.e = kdrVar;
        this.d = jlsVar;
        Object obj = kdrVar.a;
        Object obj2 = kdrVar.g;
        int[] iArr = (int[]) obj2;
        int[] iArr2 = (int[]) obj;
        d(jlsVar, this, sparseArray, null, iArr2, iArr, (int[]) kdrVar.b, (int[]) kdrVar.f);
        lsz it = ((llw) kdrVar.d).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iaw iawVar = (iaw) entry.getValue();
            if (iawVar.g.length == 0 && iawVar.h.length == 0) {
                int[] iArr3 = iawVar.i;
                if (iawVar.j.length != 0) {
                }
            }
            d(jlsVar, this, sparseArray, jav.f((String) entry.getKey()), iawVar.g, iawVar.h, iawVar.i, iawVar.j);
        }
        this.a = null;
    }

    public static void b(SparseIntArray sparseIntArray, int[]... iArr) {
        int[] iArr2;
        for (int i = 0; i < 4; i++) {
            for (int i2 : iArr[i]) {
                sparseIntArray.put(i2, i2);
            }
        }
    }

    private static void c(SparseArray sparseArray, int i, jav javVar) {
        if (javVar != null) {
            Set set = (Set) sparseArray.get(i);
            if (set == null) {
                set = new qq();
                sparseArray.put(i, set);
            }
            set.add(javVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [jfp] */
    /* JADX WARN: Type inference failed for: r2v4, types: [jfp] */
    /* JADX WARN: Type inference failed for: r2v5, types: [jfe, java.lang.Object, jff] */
    /* JADX WARN: Type inference failed for: r3v7, types: [jfp] */
    /* JADX WARN: Type inference failed for: r3v8, types: [jfp] */
    /* JADX WARN: Type inference failed for: r3v9, types: [jfe, jfg, java.lang.Object] */
    private static void d(jls jlsVar, jfo jfoVar, SparseArray sparseArray, jav javVar, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i : iArr) {
            ?? r3 = (jfp) ((SparseArray) jlsVar.b).get(i);
            if (r3 == 0) {
                r3 = new jfg((Context) jlsVar.a, i, ino.L());
                ((SparseArray) jlsVar.b).put(r3.b, r3);
            }
            r3.b(jfoVar);
            c(sparseArray, i, javVar);
        }
        for (int i2 : iArr2) {
            ?? r2 = (jfp) ((SparseArray) jlsVar.b).get(i2);
            if (r2 == 0) {
                r2 = new jff((Context) jlsVar.a, i2);
                ((SparseArray) jlsVar.b).put(r2.b, r2);
            }
            r2.b(jfoVar);
            c(sparseArray, i2, javVar);
        }
        for (int i3 : iArr4) {
            jfp jfpVar = (jfp) ((SparseArray) jlsVar.b).get(i3);
            if (jfpVar == null) {
                throw new NoSuchElementException("Invalid SpecialConditionMatcherProvider: ".concat(String.valueOf(((Context) jlsVar.a).getString(i3))));
            }
            jfpVar.b(jfoVar);
            c(sparseArray, i3, javVar);
        }
    }

    public final void a(jga jgaVar, int[]... iArr) {
        for (int i = 0; i < 4; i++) {
            for (int i2 : iArr[i]) {
                jgaVar.c(this.d.g(i2).a());
            }
        }
    }
}

package defpackage;

import android.util.AttributeSet;
import android.util.SparseArray;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ibd  reason: default package */
/* loaded from: classes.dex */
public final class ibd implements iar {
    public ico e;
    public static final long[] a = {0};
    private static final lfy g = lfy.c(',').h();
    private static final icx h = new ibc(1);
    public static final icx b = new ibc(0);
    public SparseArray c = new SparseArray();
    public SparseArray d = new SparseArray();
    private final SparseArray i = new SparseArray();
    public final SparseArray f = new SparseArray();

    public static boolean b(long j, long[] jArr) {
        if (jArr == null) {
            return false;
        }
        for (long j2 : jArr) {
            if ((j & j2) == j2) {
                return true;
            }
        }
        return false;
    }

    public static long[] d(AttributeSet attributeSet, String str, long[] jArr) {
        long[] d = iby.d(attributeSet.getAttributeValue(null, str), g);
        return d.length == 0 ? jArr : d;
    }

    private static SparseArray i(SparseArray sparseArray) {
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), ((fws) sparseArray.valueAt(i)).h());
        }
        return sparseArray2;
    }

    public final ibi a() {
        return new ibi(i(this.i), i(this.f), Integer.MAX_VALUE);
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    public final void e(int i, ict ictVar, long... jArr) {
        if (ictVar != null) {
            fws h2 = h(i);
            for (long j : jArr) {
                h2.i(j, ictVar);
            }
        }
    }

    public final void f() {
        this.e = null;
        this.i.clear();
        this.f.clear();
    }

    public final ict g(int i) {
        if (i == R.id.f85450_resource_name_obfuscated_res_0x7f0b0f9b) {
            return ict.b;
        }
        ict ictVar = (ict) this.c.get(i);
        if (ictVar == null) {
            ((luc) ((luc) ibi.a.d()).k("com/google/android/libraries/inputmethod/metadata/KeyMappingDef$Builder", "findSoftKeyDef", 677, "KeyMappingDef.java")).z("SoftKeyDef 0x%x (%s) has not been defined.", i, jbi.i(i));
        }
        return ictVar;
    }

    public final fws h(int i) {
        fws fwsVar = (fws) this.i.get(i);
        if (fwsVar == null) {
            fws fwsVar2 = new fws(h);
            this.i.put(i, fwsVar2);
            return fwsVar2;
        }
        return fwsVar;
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ void m(jfy jfyVar) {
        throw null;
    }
}

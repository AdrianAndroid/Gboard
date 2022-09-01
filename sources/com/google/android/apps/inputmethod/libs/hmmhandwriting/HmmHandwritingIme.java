package com.google.android.apps.inputmethod.libs.hmmhandwriting;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme;
import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterfaceImpl;
import com.google.android.apps.inputmethod.libs.hmm.Range;
import com.google.android.apps.inputmethod.libs.hmm.ScoredInput;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HmmHandwritingIme extends HandwritingIme {
    public static final lug n = hin.a;
    public static final jav o = jav.e("zh_CN");
    public static final jav p = jav.e("zh_TW");
    public static final jav q = jav.e("zh_HK");
    public djh s;
    public MutableDictionaryAccessorInterfaceImpl t;
    final obc u;
    private String w;
    public final bti r = new bti();
    private final oir x = new oir((char[]) null);
    private final dih v = new dkm(this, 0);

    public HmmHandwritingIme(Context context, iav iavVar, hls hlsVar) {
        super(context, iavVar, hlsVar);
        this.u = new obc(M(iavVar), H(context, iavVar));
    }

    private static int H(Context context, iav iavVar) {
        ino M = ino.M(context);
        jav javVar = iavVar.e;
        if (o.equals(javVar)) {
            return M.aj(R.string.f160950_resource_name_obfuscated_res_0x7f14067f) ? 2 : 1;
        } else if (p.equals(javVar)) {
            return M.aj(R.string.f160970_resource_name_obfuscated_res_0x7f140681) ? 1 : 2;
        } else if (q.equals(javVar)) {
            return M.aj(R.string.f160960_resource_name_obfuscated_res_0x7f140680) ? 1 : 3;
        } else {
            ((luc) n.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmmhandwriting/HmmHandwritingIme", "getDisplayLocale", 314, "HmmHandwritingIme.java")).w("Language %s not supported", javVar);
            return 1;
        }
    }

    private static int M(iav iavVar) {
        jav javVar = iavVar.e;
        if (o.equals(javVar)) {
            return 1;
        }
        if (p.equals(javVar)) {
            return 2;
        }
        if (q.equals(javVar)) {
            return 3;
        }
        ((luc) n.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmmhandwriting/HmmHandwritingIme", "getInternalLocale", 293, "HmmHandwritingIme.java")).w("Language %s not supported", javVar);
        return 1;
    }

    private final void R() {
        this.b.execute(new bwt(this, this.E.j(20), 19));
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme, defpackage.hlp
    public final boolean B(hfd hfdVar) {
        String str;
        MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl;
        boolean B = super.B(hfdVar);
        iay f = hfdVar.f();
        if (f != null && f.c == 67 && (str = this.w) != null && (mutableDictionaryAccessorInterfaceImpl = this.t) != null) {
            mutableDictionaryAccessorInterfaceImpl.d(null, null, str);
        }
        return B;
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme
    protected final boolean C() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme
    public final boolean D() {
        return this.G.aj(R.string.f162160_resource_name_obfuscated_res_0x7f1406f9);
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme
    protected final boolean E() {
        return false;
    }

    final dij F() {
        jav javVar = this.F.e;
        if (o.equals(javVar)) {
            return dxu.l(this.D);
        }
        if (p.equals(javVar)) {
            return fgj.l(this.D);
        }
        if (q.equals(javVar)) {
            return btg.a(this.D);
        }
        ((luc) n.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmmhandwriting/HmmHandwritingIme", "engineFactory", 135, "HmmHandwritingIme.java")).w("Language %s not supported", javVar);
        return dxu.l(this.D);
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme
    protected final String c(String str) {
        return this.u.h(str);
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme, defpackage.dha
    public final List e(gpm gpmVar) {
        djh djhVar = this.s;
        if (djhVar == null) {
            return dip.d(gpmVar);
        }
        this.w = null;
        List list = gpmVar.a;
        int size = list.size();
        String[] strArr = new String[size];
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            gpn gpnVar = (gpn) list.get(i);
            strArr[i] = gpnVar.a;
            fArr[i] = -gpnVar.b;
            ((luc) ((luc) n.b()).k("com/google/android/apps/inputmethod/libs/hmmhandwriting/HmmHandwritingIme", "generateCandidates", 165, "HmmHandwritingIme.java")).D("%s -> %f", strArr[i], fArr[i]);
        }
        djhVar.t();
        djhVar.x(this.r.a(), false);
        ScoredInput[] scoredInputArr = new ScoredInput[size];
        for (int i2 = 0; i2 < size; i2++) {
            scoredInputArr[i2] = new ScoredInput(strArr[i2], fArr[i2]);
        }
        dik dikVar = (dik) djhVar;
        HmmEngineInterfaceImpl hmmEngineInterfaceImpl = dikVar.m;
        Range nativeBulkInputWithTargetWords = hmmEngineInterfaceImpl.nativeBulkInputWithTargetWords(hmmEngineInterfaceImpl.a, scoredInputArr, dik.c);
        if (nativeBulkInputWithTargetWords == null || dik.a.equals(nativeBulkInputWithTargetWords) || dik.b.equals(nativeBulkInputWithTargetWords)) {
            return dip.d(gpmVar);
        }
        dikVar.j = nativeBulkInputWithTargetWords;
        dikVar.y();
        dji djiVar = dikVar.l;
        if (djiVar != null) {
            djiVar.H(1, nativeBulkInputWithTargetWords.startVertexIndex);
        }
        ArrayList arrayList = new ArrayList();
        Iterator f = djhVar.f();
        if (f != null) {
            while (f.hasNext()) {
                arrayList.add(((diw) f).next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme
    public final void g(CharSequence charSequence, boolean z, boolean z2, boolean z3) {
        super.g(charSequence, z, z2, z3);
        if (z) {
            String obj = charSequence.toString();
            djh djhVar = this.s;
            if (djhVar != null && !TextUtils.isEmpty(obj) && D()) {
                this.b.execute(new bue(this, obj, djhVar, 8));
            }
        }
        if (this.t != null) {
            String obj2 = charSequence.toString();
            this.w = obj2;
            this.t.c(null, null, obj2, true);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme, com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void i(EditorInfo editorInfo, boolean z) {
        super.i(editorInfo, z);
        if (F().q() == null) {
            F().C(this.v);
        } else {
            this.v.a();
        }
        R();
        this.u.k(M(this.F), H(this.D, this.F));
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme, defpackage.dha
    public final void n(List list, int[] iArr, gpq gpqVar) {
        Object obj;
        int i;
        int i2;
        oir oirVar = this.x;
        String str = null;
        if (!list.isEmpty() && !TextUtils.isEmpty(((hln) list.get(0)).a)) {
            str = ((hln) list.get(0)).a.toString();
        }
        int i3 = 1;
        if (TextUtils.isEmpty(str) || str.codePointCount(0, str.length()) < 2 || gpqVar.size() < 2) {
            oirVar.a = new int[1];
            ((int[]) oirVar.a)[0] = gpqVar.size();
            obj = oirVar.a;
        } else {
            int codePointCount = str.codePointCount(0, str.length());
            Object obj2 = oirVar.a;
            if (obj2 == null || codePointCount > ((int[]) obj2).length) {
                int[] iArr2 = new int[codePointCount];
                int length = obj2 == null ? 0 : ((int[]) obj2).length - 1;
                if (length > 0) {
                    System.arraycopy(obj2, 0, iArr2, 0, length);
                }
                int[] iArr3 = (int[]) obj2;
                if (iArr3.length != 0 && length != 0) {
                    i3 = Math.max(iArr3[length] - 4, iArr3[length - 1] + 1);
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                int size = gpqVar.size();
                while (i3 < size) {
                    int i4 = (int) (((gpp) gpqVar.get(i3)).c().c - ((gpp) gpqVar.get(i3 - 1)).d().c);
                    while (sparseIntArray.get(i4, -1) != -1) {
                        i4++;
                    }
                    sparseIntArray.put(i4, i3);
                    i3++;
                }
                int size2 = sparseIntArray.size();
                int i5 = length;
                while (true) {
                    i = codePointCount - 1;
                    if (i5 >= i || (i2 = ((size2 - 1) - i5) + length) < 0) {
                        break;
                    }
                    iArr2[i5] = sparseIntArray.valueAt(i2);
                    i5++;
                }
                Arrays.fill(iArr2, i5, i, size);
                Arrays.sort(iArr2, length, i);
                oirVar.a = iArr2;
            }
            int[] iArr4 = (int[]) oirVar.a;
            if (codePointCount < iArr4.length) {
                oirVar.a = Arrays.copyOf(iArr4, codePointCount);
                ((int[]) oirVar.a)[codePointCount - 1] = gpqVar.size();
            } else {
                iArr4[codePointCount - 1] = gpqVar.size();
            }
            obj = oirVar.a;
        }
        super.n(list, (int[]) obj, gpqVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme, com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void p(hqe hqeVar, int i, int i2, int i3, int i4) {
        super.p(hqeVar, i, i2, i3, i4);
        if (hqeVar != hqe.IME) {
            this.w = null;
            R();
        }
    }
}

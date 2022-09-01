package com.google.android.libraries.inputmethod.ime.processor;

import android.content.Context;
import android.util.SparseArray;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import com.google.android.libraries.inputmethod.ime.AbstractIme;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProcessorBasedIme extends AbstractIme implements hna {
    protected final gwv a;

    public ProcessorBasedIme(Context context, iav iavVar, hls hlsVar) {
        super(context, iavVar, hlsVar);
        gwv gwvVar = new gwv();
        this.a = gwvVar;
        ifn ifnVar = this.C;
        int length = iavVar.r.b.length;
        if (length == 0) {
            return;
        }
        gwvVar.a = new hnj[length];
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < length; i++) {
            int i2 = iavVar.r.b[i].a;
            if (sparseArray.get(i2) == null) {
                Object obj = iavVar.r.b[i].b;
                hnj hnjVar = (hnj) jbt.u(context.getClassLoader(), hnj.class, (String) obj, new Object[0]);
                if (hnjVar != null) {
                    hnjVar.ad(context, gwvVar, iavVar);
                    if (hnjVar instanceof hnh) {
                        ((hnh) hnjVar).fl(hlsVar);
                    }
                    if (hnjVar instanceof hng) {
                        ((hng) hnjVar).b(hlsVar);
                    }
                    if (hnjVar instanceof hnk) {
                        hnk hnkVar = (hnk) hnjVar;
                        hnkVar.fm(hlsVar);
                        hnkVar.fn(ifnVar);
                    }
                    sparseArray.put(i2, hnjVar);
                    ((hnj[]) gwvVar.a)[i] = hnjVar;
                    if (hnjVar instanceof hni) {
                        if (gwvVar.b == null) {
                            gwvVar.b = (hni) hnjVar;
                        } else {
                            throw new lgj("Multiple decode processors are specified.");
                        }
                    }
                } else {
                    throw new lgj("Processor class not found: ".concat(String.valueOf(obj)));
                }
            } else {
                throw new lgj("Duplicate define processors with the same id.");
            }
        }
    }

    @Override // defpackage.hlp
    public final boolean B(hfd hfdVar) {
        Object obj;
        Object obj2;
        gwv gwvVar = this.a;
        iay f = hfdVar.f();
        if (f == null || f.c != -300007 || (obj2 = f.e) == null) {
            if (f == null || f.c != -10141 || (obj = f.e) == null) {
                hnl i = hnl.i(4, gwvVar);
                i.j = hfdVar;
                return gwvVar.b(i);
            }
            icn icnVar = (icn) obj;
            return gwvVar.b(hnl.l(icnVar.a, icnVar.b, icnVar.c, gwvVar));
        }
        return gwvVar.b((hnl) obj2);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void W(int i) {
        gwv gwvVar = this.a;
        gwvVar.b(hnl.i(27, gwvVar));
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void a(long j, long j2) {
        super.a(j, j2);
        gwv gwvVar = this.a;
        hnl i = hnl.i(16, gwvVar);
        i.n = j2;
        gwvVar.b(i);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, java.lang.AutoCloseable
    public final void close() {
        gwv gwvVar = this.a;
        gwvVar.b(hnl.i(24, gwvVar));
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gS(hln hlnVar) {
        gwv gwvVar = this.a;
        hnl i = hnl.i(21, gwvVar);
        i.k = hlnVar;
        gwvVar.b(i);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gT(CompletionInfo[] completionInfoArr) {
        gwv gwvVar = this.a;
        hnl i = hnl.i(22, gwvVar);
        i.o = completionInfoArr;
        gwvVar.b(i);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gV(hln hlnVar, boolean z) {
        gwv gwvVar = this.a;
        hnl i = hnl.i(10, gwvVar);
        i.k = hlnVar;
        i.l = z;
        gwvVar.b(i);
    }

    @Override // defpackage.hlp
    public final void gX() {
        gwv gwvVar = this.a;
        gwvVar.b(hnl.i(19, gwvVar));
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gY(hln hlnVar, boolean z) {
        gwv gwvVar = this.a;
        hnl i = hnl.i(13, gwvVar);
        i.k = hlnVar;
        i.l = z;
        gwvVar.b(i);
    }

    @Override // defpackage.hlp
    public final void h(hfd hfdVar) {
        gwv gwvVar = this.a;
        gwvVar.b(hnl.f(hfdVar, gwvVar));
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void i(EditorInfo editorInfo, boolean z) {
        super.i(editorInfo, z);
        gwv gwvVar = this.a;
        hnl i = hnl.i(2, gwvVar);
        i.b = editorInfo;
        i.c = z;
        gwvVar.b(i);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void j() {
        super.j();
        gwv gwvVar = this.a;
        gwvVar.b(hnl.i(25, gwvVar));
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void l(ibz ibzVar, boolean z) {
        gwv gwvVar = this.a;
        hnl i = hnl.i(3, gwvVar);
        i.d = ibzVar;
        i.e = z;
        gwvVar.b(i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hni, java.lang.Object] */
    @Override // defpackage.hna
    public final boolean m() {
        ?? r0 = this.a.b;
        return r0 != 0 && r0.ao();
    }

    @Override // defpackage.hna
    public final boolean n(hfd hfdVar, hfd hfdVar2) {
        int i = hfdVar.b[0].c;
        int i2 = hfdVar2.b[0].c;
        if (i == -10028) {
            return i2 == -10028 || i2 == -10029;
        }
        return false;
    }

    @Override // defpackage.hna
    public final boolean o(hfd hfdVar) {
        for (hnj hnjVar : (hnj[]) this.a.a) {
            if (hnjVar.ar(hfdVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void p(hqe hqeVar, int i, int i2, int i3, int i4) {
        gwv gwvVar = this.a;
        hnl i5 = hnl.i(17, gwvVar);
        i5.f = hqeVar;
        i5.g = i;
        i5.h = i2;
        i5.i = i3;
        gwvVar.b(i5);
    }

    @Override // defpackage.hlp
    public final void w(int i) {
        gwv gwvVar = this.a;
        hnl i2 = hnl.i(8, gwvVar);
        i2.m = i;
        gwvVar.b(i2);
    }
}

package com.google.android.apps.inputmethod.libs.handwriting.ime;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.handwriting.recognition.HandwritingJniUtil;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.ime.AbstractIme;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HandwritingIme extends AbstractIme implements dha, jbw {
    protected final jav d;
    protected enx e;
    hnn f;
    hno g;
    dhb k;
    hln l;
    public final int m;
    private final boolean p;
    private final boolean q;
    private jby t;
    private static final ltg n = ltg.j("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingIme");
    public static final hhl a = hhq.a("enable_voice_in_handwriting", false);
    private static final CharSequence o = "";
    public final ExecutorService b = gxo.c(2);
    public final ExecutorService c = gyc.b;
    private int r = 0;
    private boolean s = false;
    List h = new ArrayList();
    List i = new ArrayList();
    CharSequence j = o;
    private int u = 1;

    public HandwritingIme(Context context, iav iavVar, hls hlsVar) {
        super(context, iavVar, hlsVar);
        int i = 2;
        ((ltd) ((ltd) n.b()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingIme", "<init>", 152, "HandwritingIme.java")).w("LanguageTag = %s", iavVar.e);
        this.m = true == iavVar.q.d(R.id.f54900_resource_name_obfuscated_res_0x7f0b01d2, false) ? 1 : i;
        this.q = iavVar.q.d(R.id.f54900_resource_name_obfuscated_res_0x7f0b01d2, false);
        this.f = new hnn(hlsVar);
        this.g = new hno(hlsVar, iavVar.e.C());
        this.p = hdz.a().d("␣");
        this.d = iavVar.e;
        S(context, iavVar.e);
    }

    private static int H(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f != null) {
            Object obj = f.e;
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return 0;
        }
        return 0;
    }

    private final xv M() {
        return xv.a(Integer.valueOf(this.j.length()), 0);
    }

    private final jby R() {
        if (this.t == null) {
            this.t = new fbu(this.D, this.F, this, mjl.a);
        }
        return this.t;
    }

    private final void S(Context context, jav javVar) {
        if (this.k != null) {
            return;
        }
        dgb dgbVar = new dgb();
        this.k = dgbVar;
        ExecutorService executorService = this.b;
        ExecutorService executorService2 = this.c;
        idk V = V();
        ((ltd) ((ltd) dgz.f.b()).k("com/google/android/apps/inputmethod/libs/handwriting/recognition/AbstractHandwritingRecognizerWrapper", "initialize", 84, "AbstractHandwritingRecognizerWrapper.java")).t("initialize");
        dgb dgbVar2 = dgbVar;
        dgbVar2.j = this;
        dgbVar2.g = executorService;
        dgbVar2.h = executorService2;
        dgbVar2.i = V;
        dgbVar2.h();
        dgbVar2.k = true;
        if (!HandwritingJniUtil.a) {
            synchronized (HandwritingJniUtil.class) {
                if (!HandwritingJniUtil.a) {
                    if (NativeLibHelper.a("latin_handwriting", false)) {
                        HandwritingJniUtil.a = true;
                    }
                }
            }
        }
        if (dgbVar2.k) {
            dgbVar.c = executorService;
            dgbVar.b = context;
            dgbVar.d = javVar;
            dgbVar.e = V;
            dgbVar.e(true);
            return;
        }
        ((luc) dgb.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingRecognizerWrapper", "loadRecognizer", 73, "HandwritingRecognizerWrapper.java")).t("loadRecognizer(): wrapper not initialized.");
    }

    private final void T(mbi mbiVar, int i) {
        V().e(dgt.HANDWRITING_OPERATION, mbiVar, this.d, Integer.valueOf(i));
    }

    private final void U(CharSequence charSequence) {
        dhb dhbVar = this.k;
        if (dhbVar != null) {
            dhbVar.h();
            String obj = charSequence.toString();
            dgz dgzVar = (dgz) dhbVar;
            if (!dgzVar.k) {
                ((ltd) ((ltd) dgz.f.c()).k("com/google/android/apps/inputmethod/libs/handwriting/recognition/AbstractHandwritingRecognizerWrapper", "setPrecontext", 150, "AbstractHandwritingRecognizerWrapper.java")).t("setPrecontext(): class not initialized");
            } else {
                dgzVar.m.i(obj);
            }
        }
    }

    private final void Z(boolean z) {
        if (this.F == null) {
            ((ltd) ((ltd) n.c()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingIme", "sendRecognizerStatus", 723, "HandwritingIme.java")).t("sendRecognizerStatus(): no imeDef set.");
            return;
        }
        hls hlsVar = this.E;
        if (hlsVar == null) {
            ((ltd) ((ltd) n.c()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingIme", "sendRecognizerStatus", 728, "HandwritingIme.java")).t("sendRecognizerStatus(): no imeDelegate set.");
        } else {
            hlsVar.O(hfd.d(new iay(-10040, null, Boolean.valueOf(z))));
        }
    }

    public final void A(List list) {
        this.i.clear();
        int size = list.size();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < size) {
                List list2 = this.i;
                hlk hlkVar = new hlk();
                hlkVar.a = d(((hln) list.get(i)).a.toString());
                if (i != 0) {
                    z = false;
                }
                hlkVar.g = z;
                hlkVar.j = ((hln) list.get(i)).a;
                hlkVar.i = fhr.u(i, size, this);
                hlkVar.e = ((hln) list.get(i)).e;
                hlkVar.h = ((hln) list.get(i)).h;
                list2.add(hlkVar.a());
                i++;
            } else {
                this.E.hY(!list.isEmpty());
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // defpackage.hlp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean B(defpackage.hfd r21) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme.B(hfd):boolean");
    }

    protected boolean C() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean D() {
        return false;
    }

    protected boolean E() {
        return true;
    }

    @Override // defpackage.jbw
    public final /* synthetic */ jbu b() {
        return jbu.a;
    }

    protected String c(String str) {
        return str;
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, java.lang.AutoCloseable
    public final void close() {
        gvt.a(this.k);
        R().b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d(String str) {
        if (str.startsWith(" ")) {
            return (true != this.p ? "_" : "␣").concat(String.valueOf(str.substring(1)));
        }
        return str;
    }

    @Override // defpackage.dha
    public /* synthetic */ List e(gpm gpmVar) {
        return dip.d(gpmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(CharSequence charSequence, boolean z, boolean z2, boolean z3) {
        if (TextUtils.equals(charSequence, this.j)) {
            this.E.hW();
        } else {
            this.E.hV(charSequence, false, 1);
        }
    }

    @Override // defpackage.hlp
    public final void gX() {
        if (this.j.length() > 0) {
            T(mbi.CONFIRM_CLOSE, this.j.length());
        }
        x(true);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public void gY(hln hlnVar, boolean z) {
        mbi mbiVar;
        if (!z) {
            return;
        }
        CharSequence charSequence = (CharSequence) hlnVar.j;
        if (charSequence == null) {
            ((ltd) ((ltd) n.c()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingIme", "selectTextCandidate", 749, "HandwritingIme.java")).t("selectTextCandidate data is null, which should never happen by construction of the candidates.");
            return;
        }
        if (hlnVar.e == hlm.RESTORABLE_TEXT) {
            this.l = null;
            this.E.x();
            this.E.hW();
            g(charSequence, true, false, true);
            this.E.D();
        } else {
            CharSequence charSequence2 = hlnVar.a;
            g(charSequence, true, false, true);
            if (TextUtils.equals(charSequence, this.j)) {
                mbiVar = mbi.SELECT_FIRST_CANDIDATE;
            } else {
                mbiVar = mbi.SELECT_OTHER_CANDIDATE;
            }
            T(mbiVar, charSequence.length());
        }
        x(!D());
    }

    @Override // defpackage.hlp
    public final void h(hfd hfdVar) {
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public void i(EditorInfo editorInfo, boolean z) {
        super.i(editorInfo, z);
        T(mbi.ACTIVATE, -1);
        x(true);
        R().a(editorInfo, z);
        Context applicationContext = this.D.getApplicationContext();
        if (!N(editorInfo) || !kez.t(applicationContext)) {
            return;
        }
        enx enxVar = new enx(applicationContext, this.E);
        this.e = enxVar;
        enxVar.c();
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void j() {
        enx enxVar = this.e;
        if (enxVar != null) {
            enxVar.d();
            this.e = null;
        }
        R().c();
        super.j();
    }

    @Override // defpackage.dha
    public final void k() {
        this.k = null;
        Z(false);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public void l(ibz ibzVar, boolean z) {
        z(jbx.KEYBOARD_CHANGE);
        if (z) {
            this.E.hW();
        }
        boolean z2 = true;
        x(true);
        int i = this.u;
        if (i != 1) {
            if (i != 3) {
                z2 = false;
            }
            Z(z2);
        }
        R().d(ibzVar);
    }

    @Override // defpackage.jbw
    public final void m() {
    }

    @Override // defpackage.dha
    public void n(List list, int[] iArr, gpq gpqVar) {
        this.E.O(hfd.d(new iay(-10039, null, iArr)));
        CharSequence charSequence = list.isEmpty() ? o : ((hln) list.get(0)).a;
        if (!TextUtils.isEmpty(charSequence)) {
            this.j = charSequence;
            this.E.g(charSequence, 1);
        }
        A(list);
    }

    @Override // defpackage.dha
    public final void o(boolean z) {
        this.u = z ? 3 : 2;
        Z(z);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public void p(hqe hqeVar, int i, int i2, int i3, int i4) {
        if (hqeVar == hqe.IME) {
            return;
        }
        enx enxVar = this.e;
        if (enxVar != null) {
            enxVar.e(hqeVar);
            if (this.e.h) {
                return;
            }
        }
        z(jbx.SELECTION_CHANGE);
        if (this.j.length() > 0) {
            T(mbi.CONFIRM_PLACE_CURSOR, this.j.length());
        }
        this.f.c();
        x(true);
    }

    @Override // defpackage.jbw
    public final void q() {
        this.E.x();
        this.E.g("", 1);
        this.E.hX(this.r, 0, "", false);
        this.E.D();
        fbr.c(this.s, false);
        this.r = 0;
    }

    @Override // defpackage.jbw
    public final /* synthetic */ void r() {
        lre.aK(this);
    }

    @Override // defpackage.jbw
    public final void s() {
        this.E.hW();
        boolean booleanValue = ((Boolean) fbh.f.c()).booleanValue();
        this.s = booleanValue;
        fbr.c(booleanValue, false);
        this.r = 0;
    }

    @Override // defpackage.jbw
    public final void t() {
        this.E.hW();
        this.r = 0;
    }

    @Override // defpackage.jbw
    public final /* synthetic */ void u(bnq bnqVar) {
        lre.aL(this, bnqVar);
    }

    @Override // defpackage.jbw
    public final void v(bnq bnqVar, jbv jbvVar) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (bns bnsVar : bnqVar.a) {
            if (!bnsVar.b.isEmpty()) {
                if (!bnsVar.c) {
                    sb.append(bnsVar.b);
                } else {
                    sb2.append(bnsVar.b);
                }
            }
        }
        this.E.x();
        this.E.g("", 1);
        this.E.hV(c(sb2.toString()), false, 1);
        this.E.g(c(sb.toString()), 1);
        this.E.D();
        int length = this.r + sb2.toString().length();
        this.r = length;
        if (length > 0 || sb.toString().length() > 0) {
            fbr.c(this.s, true);
        }
    }

    @Override // defpackage.hlp
    public final void w(int i) {
        hln hlnVar = this.l;
        hln hlnVar2 = null;
        if (hlnVar != null) {
            this.E.l(Collections.singletonList(hlnVar), null, false);
        } else if (!this.h.isEmpty()) {
            this.E.l(llp.o(this.h), null, false);
        } else {
            ArrayList arrayList = new ArrayList(this.i);
            if (this.q && !arrayList.isEmpty() && ((hln) arrayList.get(0)).e != hlm.PREDICTION) {
                hlnVar2 = (hln) arrayList.get(0);
            }
            this.E.l(arrayList, hlnVar2, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(boolean z) {
        if (this.k == null) {
            S(this.D, this.d);
            return;
        }
        U(this.E.j(20));
        this.j = o;
        this.i.clear();
        if (!z) {
            return;
        }
        hls hlsVar = this.E;
        boolean z2 = true;
        if (this.l == null && this.h.isEmpty()) {
            z2 = false;
        }
        hlsVar.hY(z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(jbx jbxVar) {
        R().e(jbxVar);
    }
}

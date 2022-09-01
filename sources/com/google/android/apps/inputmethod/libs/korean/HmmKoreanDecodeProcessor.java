package com.google.android.apps.inputmethod.libs.korean;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterfaceImpl;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HmmKoreanDecodeProcessor extends AbstractHmmDecodeProcessor implements hlu {
    private static final lug d = hin.a;
    private static final float[] e = {0.0f};
    private static final float[] f = {0.0f};
    private long A;
    private String B;
    private boolean C;
    private dim D;
    private dmg E;
    private boolean F;
    private boolean G;
    private boolean H;
    private String I;
    private int J;
    private MutableDictionaryAccessorInterfaceImpl K;
    protected long a;
    protected String b;
    protected boolean c;
    private djk g;
    private final die h = new dme();
    private final djf m = new dmd();
    private final iay[] n = new iay[1];
    private final List v = lre.A();
    private final List w = lre.A();
    private boolean x;
    private boolean y;
    private boolean z;

    private final void A() {
        boolean z = true;
        if (!this.y && (!this.x || !this.G)) {
            z = false;
        }
        s(z);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence, java.lang.Object] */
    private final CharSequence b() {
        return this.i.N(this.m).b;
    }

    private final void c(String str) {
        this.i.x(str, true);
        List g = this.i.g();
        if (!g.isEmpty()) {
            an(((llp) g).listIterator());
        } else {
            an(null);
        }
    }

    private final void w(String str, boolean z, CharSequence charSequence, boolean z2) {
        if (!ao()) {
            return;
        }
        int b = this.i.b();
        String obj = b().toString();
        this.i.v();
        if (b <= 0) {
            String obj2 = b().toString();
            if (!TextUtils.equals(obj, obj2)) {
                this.I = obj;
                this.J = obj2.length() + charSequence.length();
            }
        }
        q(str, z);
        ah(charSequence);
        if (!z2) {
            return;
        }
        af().e(dja.SPACE_INSERTED_AFTER_COMMIT, new Object[0]);
    }

    @Override // defpackage.hlu
    public final void E(hfd hfdVar) {
        q("FINISH_INPUT", false);
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void I(hfd hfdVar) {
        E(hfdVar);
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final void J(ibz ibzVar, boolean z) {
        if (z) {
            E(null);
        } else if (ao()) {
            N(0L);
        } else if (!this.k || !this.c) {
        } else {
            c(((dik) this.i).g);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    protected final void L() {
        this.E.f();
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final void M(hqe hqeVar, int i, int i2, int i3) {
        super.M(hqeVar, i, i2, i3);
        if (hqeVar != hqe.IME) {
            this.I = null;
            this.J = 0;
            an(null);
        }
    }

    @Override // defpackage.hlu
    public final void N(long j) {
        al(b());
        if (j > 0) {
            af().g(idv.USER_ACTION_TO_TEXT_FIELD_UPDATED, SystemClock.uptimeMillis() - j);
        }
        an(z());
    }

    @Override // defpackage.hlu
    public final boolean O() {
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final boolean T(hln hlnVar) {
        String d2 = this.i.d(hlnVar);
        MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl = this.K;
        if (mutableDictionaryAccessorInterfaceImpl == null || d2 == null || !mutableDictionaryAccessorInterfaceImpl.b(d2)) {
            return true;
        }
        this.i.j(hlnVar);
        N(0L);
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final boolean V(hln hlnVar, boolean z) {
        if (hlnVar == null) {
            return false;
        }
        if (this.i == null || !((dik) this.i).e) {
            ((luc) ((luc) d.c()).k("com/google/android/apps/inputmethod/libs/korean/HmmKoreanDecodeProcessor", "onSelectTextCandidate", 739, "HmmKoreanDecodeProcessor.java")).t("Older verion of candidates selected");
            return false;
        } else if (!z) {
            if (ao()) {
                this.i.m(hlnVar);
                al(b());
            }
            return true;
        } else {
            if (ao()) {
                if (!this.i.F(hlnVar)) {
                    return false;
                }
                dik dikVar = (dik) this.i;
                if (dikVar.e) {
                    Object obj = hlnVar.j;
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("candidate.data is not an Integer");
                    }
                    int C = dikVar.m.C(((Integer) obj).intValue());
                    if (C == 5 || C == 7) {
                        af().e(dja.CANDIDATE_SELECTED, hlnVar, "AUTO_COMPLETION", true);
                    } else {
                        af().e(dja.CANDIDATE_SELECTED, hlnVar, "TEXT", true);
                    }
                    this.i.u(hlnVar);
                    q("SELECT_CANDIDATE", this.c);
                } else {
                    throw new IllegalArgumentException("mCandidateListEnabled is false");
                }
            } else {
                CharSequence charSequence = hlnVar.a;
                if (charSequence != null) {
                    String obj2 = charSequence.toString();
                    as(obj2, 3, !this.c);
                    this.I = null;
                    this.J = 0;
                    af().e(dja.CANDIDATE_SELECTED, hlnVar, "PREDICT", true);
                    aj("SELECT_CANDIDATE", obj2, this.i.B());
                    j();
                    if (this.c) {
                        c(obj2);
                    }
                }
            }
            return true;
        }
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final void ac(long j) {
        boolean z = this.G;
        boolean z2 = (j & 137438953472L) == 137438953472L;
        this.G = z2;
        if (z != z2) {
            A();
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor, defpackage.hnj
    public final void ad(Context context, gwv gwvVar, iav iavVar) {
        super.ad(context, gwvVar, iavVar);
        djk djkVar = new djk();
        this.g = djkVar;
        djkVar.h(this.m);
        this.g.h(this.h);
        this.E = new dmg(context, this, this.r);
        boolean z = true;
        this.F = true;
        if (iavVar != null) {
            if (!h() || !iavVar.q.d(R.id.f54750_resource_name_obfuscated_res_0x7f0b01c3, true)) {
                z = false;
            }
            this.F = z;
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void ai() {
        super.ai();
        this.I = null;
        this.J = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean d(hfd hfdVar) {
        this.E.k();
        boolean z = hfdVar.a == iah.DOUBLE_TAP;
        if (z && this.i != null) {
            this.i.A(false);
        }
        boolean v = v(hfdVar);
        t(hfdVar, !z);
        return v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final dij e() {
        return dmh.l(this.o);
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    protected final djh g() {
        diy diyVar = new diy(dmh.l(this.o).m());
        diyVar.i(dmh.l(this.o).H(3));
        diyVar.M();
        return diyVar;
    }

    protected boolean h() {
        return true;
    }

    protected boolean ho(iay iayVar) {
        if (ao() && this.z) {
            Object obj = iayVar.e;
            if ((obj instanceof String) && dmf.b(((String) obj).charAt(0)) == 2) {
                long j = this.a;
                long j2 = this.A;
                long doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout();
                if (j - j2 < doubleTapTimeout + doubleTapTimeout && this.b != null) {
                    return true;
                }
            }
        }
        return false;
    }

    protected final void j() {
        this.D = null;
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final void k() {
        super.k();
        if (this.r.aj(R.string.f162280_resource_name_obfuscated_res_0x7f140705)) {
            this.K = dmh.l(this.o).M(3);
        }
        boolean z = this.C;
        dmh l = dmh.l(this.o);
        l.a = z;
        l.E();
        this.i.s();
        this.E.c();
        this.E.b = this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public void l(EditorInfo editorInfo, boolean z) {
        boolean aj = this.r.aj(R.string.f161600_resource_name_obfuscated_res_0x7f1406c1);
        boolean z2 = true;
        this.C = aj && this.r.aj(R.string.f162570_resource_name_obfuscated_res_0x7f140722) && ham.am(editorInfo);
        super.l(editorInfo, z);
        this.y = aj;
        this.x = (editorInfo.inputType & 65536) != 0;
        A();
        this.z = this.r.x(R.string.f161590_resource_name_obfuscated_res_0x7f1406c0, true);
        iav iavVar = this.p;
        if ((iavVar != null && !iavVar.q.d(R.id.f54850_resource_name_obfuscated_res_0x7f0b01cd, true)) || !this.r.aj(R.string.f162160_resource_name_obfuscated_res_0x7f1406f9)) {
            z2 = false;
        }
        this.c = z2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void m() {
        super.m();
        this.E.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void n() {
        super.n();
        this.E.b();
        gvt.a(this.K);
        this.K = null;
    }

    @Override // defpackage.hlu
    public final boolean o(iay iayVar) {
        throw null;
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final boolean p(hfd hfdVar) {
        dim dimVar;
        dmg dmgVar = this.E;
        if (dmgVar == null || !dmgVar.h(hfdVar)) {
            if (hfdVar.a != iah.DOWN && hfdVar.a != iah.UP) {
                iay iayVar = hfdVar.b[0];
                if (iayVar.c == 67) {
                    t(null, true);
                    if (this.I == null || this.i == null) {
                        if (ao()) {
                            if (ao()) {
                                this.i.A(true);
                            }
                            if (((dik) this.i).i) {
                                N(0L);
                                return true;
                            }
                            as(null, 1, true);
                            return true;
                        } else if (this.k) {
                            as(null, 1, true);
                            return true;
                        } else {
                            af().e(dja.TEXT_COMMIT_DELETED, new Object[0]);
                            as(null, 1, true);
                            if (this.l) {
                                MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl = this.K;
                                if (mutableDictionaryAccessorInterfaceImpl != null && (dimVar = this.D) != null) {
                                    mutableDictionaryAccessorInterfaceImpl.d(dimVar.b, dimVar.c, dimVar.a);
                                }
                                j();
                            }
                            return false;
                        }
                    }
                    int i = this.J;
                    gwv gwvVar = this.u;
                    if (gwvVar != null) {
                        hnl i2 = hnl.i(20, this);
                        i2.u = i;
                        i2.v = 0;
                        i2.p = null;
                        gwvVar.b(i2);
                    }
                    String str = this.I;
                    for (int i3 = 0; i3 < str.length(); i3++) {
                        this.n[0] = new iay(0, iax.DECODE, Character.valueOf(str.charAt(i3)));
                        this.i.L(this.n, e);
                    }
                    this.J = 0;
                    this.I = null;
                    dik dikVar = (dik) this.i;
                    if (!dikVar.e || dikVar.m.b() <= 0) {
                        throw new IllegalArgumentException();
                    }
                    dikVar.l(0);
                    dikVar.d = 0;
                    N(0L);
                    af().e(dja.AUTO_CORRECTION_REVERTED, new Object[0]);
                    return true;
                }
                j();
                this.I = null;
                this.J = 0;
                int i4 = iayVar.c;
                if (i4 == 62) {
                    t(null, true);
                    if (!ao()) {
                        as(null, 1, true);
                        return false;
                    }
                    String str2 = " ";
                    if (!((dik) this.i).e && u("SPACE", false) && this.F) {
                        ah(str2);
                        af().e(dja.SPACE_INSERTED_AFTER_COMMIT, new Object[0]);
                    }
                    if (!ao()) {
                        return true;
                    }
                    boolean z = this.c;
                    boolean z2 = this.F;
                    if (true != z2) {
                        str2 = "";
                    }
                    w("SPACE", z, str2, z2);
                    return true;
                } else if (i4 == 66) {
                    t(null, true);
                    if (!ao() || ((dik) this.i).e) {
                        if (ao()) {
                            w("ENTER", false, "\n", false);
                            return true;
                        }
                        as(null, 1, true);
                        return false;
                    }
                    u("ENTER", false);
                    ah("\n");
                    return true;
                } else {
                    Object obj = iayVar.e;
                    if (!(obj instanceof String) || !".\t ,;:!?\n()[]*&@{}/<>_+=|\"'".contains((String) obj)) {
                        if (dzg.i(iayVar)) {
                            return d(hfdVar);
                        }
                        t(null, true);
                        if (iayVar.d != null) {
                            q("PUNCTUATION", false);
                            if (iaz.i(iayVar.c)) {
                                ah((String) iayVar.e);
                                return true;
                            }
                        }
                    } else {
                        t(null, true);
                        if (this.i == null || ((dik) this.i).e) {
                            if (ao()) {
                                w("PUNCTUATION", false, (String) iayVar.e, false);
                                return true;
                            }
                            as(null, 1, true);
                            return false;
                        }
                        u("PUNCTUATION", false);
                        ah((String) iayVar.e);
                        return true;
                    }
                }
            }
            return false;
        }
        t(null, true);
        return true;
    }

    protected final void q(String str, boolean z) {
        if (ao()) {
            u(str, z);
        } else {
            as(null, 1, true);
        }
    }

    public final void s(boolean z) {
        if (this.i != null) {
            dik dikVar = (dik) this.i;
            dikVar.e = z;
            dikVar.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(hfd hfdVar, boolean z) {
        String str = null;
        iay iayVar = hfdVar != null ? hfdVar.b[0] : null;
        if (iayVar == null) {
            this.B = null;
            this.A = 0L;
            this.b = null;
            this.a = 0L;
            return;
        }
        Object obj = iayVar.e;
        if (obj instanceof String) {
            str = (String) obj;
        }
        if (z) {
            this.A = this.a;
            this.B = this.b;
        }
        this.a = hfdVar.h;
        this.b = str;
    }

    protected final boolean u(String str, boolean z) {
        String[] strArr;
        if (!ao()) {
            return false;
        }
        String obj = this.i.N(this.g).b.toString();
        dim l = this.h.l();
        if (this.l) {
            j();
            if (this.K != null && (((strArr = l.b) == null || strArr.length != 1 || strArr[0].length() != 1 || !dzg.j(l.b[0].charAt(0))) && this.K.c(l.b, l.c, l.a, l.e))) {
                this.D = l;
            }
        }
        aj(str, obj, this.i.B());
        as(obj, 3, !z);
        if (z) {
            c(obj);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean v(hfd hfdVar) {
        int length;
        Context context;
        if (this.i == null) {
            if (e().q() == null && !this.H && (context = this.o) != null) {
                ker.l(context, R.string.f176600_resource_name_obfuscated_res_0x7f140ce6, new Object[0]);
                this.H = true;
            }
            return false;
        }
        j();
        iay[] iayVarArr = hfdVar.b;
        float[] fArr = hfdVar.f;
        if (iayVarArr.length > 1) {
            List list = this.v;
            List list2 = this.w;
            list.clear();
            list2.clear();
            int i = 0;
            while (true) {
                length = iayVarArr.length;
                if (i >= length) {
                    break;
                }
                iay iayVar = iayVarArr[i];
                if (dzg.i(iayVar)) {
                    list.add(iayVar);
                    list2.add(Float.valueOf(fArr[i]));
                }
                i++;
            }
            if (list.size() != length) {
                iayVarArr = (iay[]) this.v.toArray(iay.b);
                fArr = mhq.q(this.w);
            }
        }
        if (ho(iayVarArr[0])) {
            char charAt = this.b.charAt(0);
            if (dmf.c(charAt)) {
                this.i.A(false);
                int a = this.i.a();
                this.n[0] = new iay(0, iax.DECODE, Character.valueOf(dmf.a(charAt)));
                djh djhVar = this.i;
                iay[] iayVarArr2 = this.n;
                float[] fArr2 = f;
                djhVar.L(iayVarArr2, fArr2);
                this.i.L(this.n, fArr2);
                this.i.K(a, this.i.a(), new iay(0, iax.DECODE, Character.valueOf(charAt)), djj.SOURCE_INPUT_UNIT);
            } else {
                String str = this.B;
                if (str != null) {
                    char charAt2 = str.charAt(0);
                    if (dmf.c(charAt2) && dmf.a(charAt2) == charAt) {
                        this.i.A(false);
                        this.i.A(false);
                        int a2 = this.i.a();
                        iay iayVar2 = new iay(0, iax.DECODE, Character.valueOf(charAt));
                        iay iayVar3 = new iay(0, iax.DECODE, Character.valueOf(charAt2));
                        this.n[0] = iayVar2;
                        this.i.L(this.n, f);
                        int a3 = this.i.a();
                        int i2 = a3 + 1;
                        this.i.K(a2, i2, iayVar3, djj.SOURCE_INPUT_UNIT);
                        int i3 = i2 + 1;
                        this.i.K(a3, i3, iayVar3, djj.SOURCE_INPUT_UNIT);
                        this.i.K(i2, i3, iayVar2, djj.SOURCE_INPUT_UNIT);
                    }
                }
            }
        }
        djh djhVar2 = this.i;
        int i4 = hfdVar.g;
        if (djhVar2.L(iayVarArr, fArr)) {
            N(hfdVar.i);
        }
        return true;
    }
}

package com.google.android.apps.inputmethod.libs.chinese.ime.hmm;

import android.content.Context;
import android.text.TextUtils;
import android.view.InputDevice;
import com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor;
import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterfaceImpl;
import com.google.android.apps.inputmethod.libs.hmm.Range;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractHmmChineseDecodeProcessor extends AbstractHmmDecodeProcessor implements hlu {
    private static final lug m = hin.a;
    private dim D;
    private boolean E;
    private boolean H;
    protected int a;
    protected boolean b;
    protected boolean c;
    protected MutableDictionaryAccessorInterfaceImpl e;
    protected MutableDictionaryAccessorInterfaceImpl f;
    protected dbf g;
    public obc h;
    private boolean n;
    private boolean v;
    private did w;
    private djk x;
    private final btx y = new btx();
    private final List z = lre.A();
    private final List A = lre.A();
    private final Stack B = new Stack();
    private final Stack C = new Stack();
    private final bth F = new bth();
    private final bti G = new bti();
    public final dcv d = new btr(this);

    private final void ay(String str) {
        this.G.c();
        if (str == null) {
            if (this.i == null) {
                return;
            }
            this.i.x(null, false);
            return;
        }
        this.G.b(str);
        if (this.i == null) {
            return;
        }
        this.i.x(this.G.a(), this.G.d());
    }

    private final void b() {
        ((Integer) this.B.pop()).intValue();
        ((Integer) this.C.pop()).intValue();
    }

    protected final synchronized void A() {
        if (this.c) {
            if (this.i != null) {
                this.i.s();
            }
            MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl = this.e;
            if (mutableDictionaryAccessorInterfaceImpl != null) {
                mutableDictionaryAccessorInterfaceImpl.a();
            }
            MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl2 = this.f;
            if (mutableDictionaryAccessorInterfaceImpl2 != null) {
                mutableDictionaryAccessorInterfaceImpl2.a();
            }
            this.c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B() {
        this.D = null;
    }

    protected final void C() {
        Iterator it;
        if (!this.n || this.i == null || TextUtils.isEmpty(((dik) this.i).g)) {
            return;
        }
        List j = this.i != null ? j() : new ArrayList();
        if (!j.isEmpty()) {
            if (this.H) {
                it = new bts(j.iterator());
            } else {
                it = j.iterator();
            }
            an(it);
        }
        if (this.i == null) {
            return;
        }
        this.i.t();
    }

    protected void D(dim dimVar) {
    }

    @Override // defpackage.hlu
    public final void E(hfd hfdVar) {
        I(hfdVar);
    }

    protected final void F(String str) {
        G(str);
        C();
    }

    protected final void G(String str) {
        if (ao()) {
            this.i.v();
            aa(str);
            return;
        }
        as(null, 1, true);
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, defpackage.dji
    public final void H(int i, int i2) {
        int intValue = this.B.empty() ? 0 : ((Integer) this.B.peek()).intValue();
        if (i == 1 && intValue == 1) {
            return;
        }
        this.B.push(Integer.valueOf(i));
        this.C.push(Integer.valueOf(i2));
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void I(hfd hfdVar) {
        G("FINISH_INPUT");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public void J(ibz ibzVar, boolean z) {
        au(2305843009213693952L, a());
        if (z) {
            I(null);
        } else if (ao()) {
            N(0L);
        } else if (!this.k) {
        } else {
            C();
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, defpackage.dig
    public final synchronized void K() {
        this.c = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public void L() {
        this.B.clear();
        this.C.clear();
        this.a = 0;
        A();
        if (this.H) {
            this.H = false;
            au(576460752303423488L, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public final void M(hqe hqeVar, int i, int i2, int i3) {
        super.M(hqeVar, i, i2, i3);
        if (this.i == null || hqeVar == hqe.IME) {
            return;
        }
        B();
        if (ao()) {
            return;
        }
        as(null, 1, true);
        ay(null);
    }

    @Override // defpackage.hlu
    public void N(long j) {
        if (this.i == null) {
            return;
        }
        CharSequence w = w();
        this.a = w.length();
        al(w);
        if (r()) {
            am(this.i.h());
        }
        an(z());
    }

    @Override // defpackage.hlu
    public boolean O() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean P(iay iayVar) {
        if (iayVar.d != null) {
            G("PUNCTUATION");
            if (!iaz.i(iayVar.c)) {
                return false;
            }
            String str = (String) iayVar.e;
            Y(str, str, 1, true);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean Q(iay iayVar) {
        bth bthVar;
        if (btp.b(iayVar)) {
            String str = (String) iayVar.e;
            bth bthVar2 = this.F;
            String d = lfd.d(str);
            int length = d.length();
            int[] iArr = new int[d.codePointCount(0, length)];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int codePointAt = d.codePointAt(i);
                int i3 = i2 + 1;
                btm btmVar = bthVar2.b;
                int i4 = bth.a.get(codePointAt);
                if (i4 <= 0) {
                    i4 = btj.a.get(codePointAt, codePointAt);
                }
                int[][] iArr2 = btm.a;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= 4) {
                        bthVar = bthVar2;
                        break;
                    }
                    int[] iArr3 = iArr2[i5];
                    bthVar = bthVar2;
                    if (iArr3[0] != i4) {
                        if (iArr3[1] == i4) {
                            btmVar.b[i6] = i4;
                            break;
                        }
                        i6++;
                        i5++;
                        bthVar2 = bthVar;
                    } else {
                        int[] iArr4 = btmVar.b;
                        if (iArr4[i6] == i4) {
                            i4 = iArr3[1];
                        }
                        iArr4[i6] = i4;
                    }
                }
                iArr[i2] = i4;
                i += Character.charCount(codePointAt);
                i2 = i3;
                bthVar2 = bthVar;
            }
            String str2 = new String(iArr, 0, i2);
            if (!str2.equals(str)) {
                G("PUNCTUATION");
                Y(str2, str2, 1, true);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean R(hfd hfdVar) {
        InputDevice device;
        Context context;
        if (this.i == null) {
            if (e().q() == null && !this.v && (context = this.o) != null) {
                ker.l(context, R.string.f176600_resource_name_obfuscated_res_0x7f140ce6, new Object[0]);
                this.v = true;
            }
            return false;
        }
        B();
        iay[] iayVarArr = hfdVar.b;
        float[] fArr = hfdVar.f;
        List list = this.z;
        List list2 = this.A;
        boolean z = hfdVar.p == 6 && (device = InputDevice.getDevice(hfdVar.o)) != null && device.getKeyboardType() == 2;
        list.clear();
        list2.clear();
        for (int i = 0; i < iayVarArr.length; i++) {
            iay iayVar = iayVarArr[i];
            if (o(iayVar) && !S(iayVar, fArr[i], list, list2, z)) {
                break;
            }
        }
        int size = list.size();
        if (size == 0) {
            return false;
        }
        List list3 = this.z;
        iay[] iayVarArr2 = hfdVar.b;
        if (size != iayVarArr2.length) {
            iayVarArr2 = new iay[size];
        }
        iay[] iayVarArr3 = (iay[]) list3.toArray(iayVarArr2);
        float[] q = mhq.q(this.A);
        if (this.i != null && !((dik) this.i).i && ((dik) this.i).g == null) {
            ax();
        }
        if (this.i != null) {
            djh djhVar = this.i;
            int i2 = hfdVar.g;
            if (djhVar.L(iayVarArr3, q)) {
                N(hfdVar.i);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean S(iay iayVar, float f, List list, List list2, boolean z) {
        list.add(iayVar);
        list2.add(Float.valueOf(f));
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final boolean T(hln hlnVar) {
        boolean z = false;
        if (this.i == null || !this.i.F(hlnVar)) {
            return false;
        }
        String d = this.i.d(hlnVar);
        if (d != null) {
            MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl = this.e;
            boolean z2 = mutableDictionaryAccessorInterfaceImpl != null && mutableDictionaryAccessorInterfaceImpl.b(d);
            MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl2 = this.f;
            if (mutableDictionaryAccessorInterfaceImpl2 != null && mutableDictionaryAccessorInterfaceImpl2.b(d)) {
                z = true;
            }
            if (z2 || z) {
                this.i.j(hlnVar);
                N(0L);
            }
        }
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final boolean U(hln hlnVar, boolean z) {
        if (z && hlnVar != null && this.i != null) {
            djh djhVar = this.i;
            if (hlnVar.e == hlm.READING_TEXT) {
                dik dikVar = (dik) djhVar;
                if (dikVar.G(hlnVar, dikVar.m.g()) && ao()) {
                    dik dikVar2 = (dik) this.i;
                    if (dikVar2.f) {
                        Object obj = hlnVar.j;
                        if (!(obj instanceof Integer)) {
                            throw new IllegalArgumentException();
                        }
                        int intValue = ((Integer) obj).intValue();
                        HmmEngineInterfaceImpl hmmEngineInterfaceImpl = dikVar2.m;
                        Range nativeGetTokenCandidateRange = hmmEngineInterfaceImpl.nativeGetTokenCandidateRange(hmmEngineInterfaceImpl.a, intValue);
                        HmmEngineInterfaceImpl hmmEngineInterfaceImpl2 = dikVar2.m;
                        if (hmmEngineInterfaceImpl2.nativeSelectTokenCandidate(hmmEngineInterfaceImpl2.a, intValue)) {
                            dikVar2.k.add(nativeGetTokenCandidateRange);
                            dikVar2.k(nativeGetTokenCandidateRange);
                            dji djiVar = dikVar2.l;
                            if (djiVar != null) {
                                djiVar.H(4, nativeGetTokenCandidateRange.startVertexIndex);
                            }
                        }
                    }
                    idk af = af();
                    dja djaVar = dja.CANDIDATE_SELECTED;
                    Object[] objArr = new Object[3];
                    objArr[0] = hlnVar;
                    objArr[1] = true != this.i.B() ? "READING" : "GESTURE_READING";
                    objArr[2] = false;
                    af.e(djaVar, objArr);
                    N(0L);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean W() {
        dim dimVar;
        if (!ao()) {
            if (this.k) {
                as(null, 1, true);
                return true;
            }
            af().e(dja.TEXT_COMMIT_DELETED, new Object[0]);
            as(null, 1, true);
            if (this.l && (dimVar = this.D) != null) {
                if (this.E) {
                    MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl = this.f;
                    if (mutableDictionaryAccessorInterfaceImpl != null) {
                        mutableDictionaryAccessorInterfaceImpl.d(dimVar.b, dimVar.c, dimVar.a);
                    }
                } else {
                    MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl2 = this.e;
                    if (mutableDictionaryAccessorInterfaceImpl2 != null) {
                        mutableDictionaryAccessorInterfaceImpl2.d(dimVar.b, dimVar.c, dimVar.a);
                    }
                }
                B();
            }
            return false;
        } else if (this.B.empty()) {
            throw new dix("corrupted edit operation stack.");
        } else {
            int intValue = ((Integer) this.B.peek()).intValue();
            int intValue2 = ((Integer) this.C.peek()).intValue();
            if (intValue == 1 || intValue == 2) {
                if (this.i.A(false)) {
                    if (intValue2 >= this.i.a()) {
                        b();
                    }
                } else {
                    throw new dix("Undeletable input.");
                }
            } else if (intValue != 3) {
                if (intValue == 4) {
                    if (this.i.I()) {
                        b();
                    } else {
                        throw new dix("Unselectable selected token candidate.");
                    }
                } else {
                    throw new dix("Unknown edit operation.");
                }
            } else if (this.i.H()) {
                b();
            } else {
                throw new dix("Unselectable selected candidate.");
            }
            if (((dik) this.i).i) {
                if (this.B.empty()) {
                    throw new dix("Edit operation stack shouldn't be empty.");
                }
                N(0L);
            } else if (!this.B.empty()) {
                throw new dix("Edit operation stack should be empty.");
            } else {
                as(null, 1, true);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean X(String str) {
        if (!ao()) {
            return false;
        }
        this.i.v();
        if (this.i.C(true)) {
            F(str);
        } else {
            N(0L);
        }
        return true;
    }

    protected final void Y(String str, String str2, int i, boolean z) {
        as(str, i, true);
        if (q(z)) {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.G.b(str2);
            if (this.i == null) {
                return;
            }
            this.i.x(this.G.a(), this.G.d());
            return;
        }
        ay("");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean Z() {
        return aa("ENTER");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a() {
        ino inoVar = this.r;
        return inoVar != null && inoVar.aj(R.string.f160950_resource_name_obfuscated_res_0x7f14067f);
    }

    protected final boolean aa(String str) {
        MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl;
        boolean z = false;
        if (!ao()) {
            return false;
        }
        String obj = this.i.N(this.x).b.toString();
        dim l = this.y.l();
        boolean z2 = this.i != null && this.i.C(false);
        if (!l.a.isEmpty()) {
            if (this.l) {
                B();
                djj[] djjVarArr = l.d;
                if (djjVarArr == null || djjVarArr[0] != djj.TARGET_TOKEN) {
                    int[] iArr = l.c;
                    if (iArr != null) {
                        for (int i : iArr) {
                            if (i != 0) {
                                int[] iArr2 = l.c;
                                if (iArr2 != null) {
                                    for (int i2 : iArr2) {
                                        if (i2 != 0 && i2 != 16 && i2 != 69 && i2 != 300) {
                                            break;
                                        }
                                    }
                                }
                                mutableDictionaryAccessorInterfaceImpl = this.e;
                                this.E = false;
                            }
                        }
                    }
                    mutableDictionaryAccessorInterfaceImpl = this.f;
                    this.E = true;
                } else if (jbs.h(l.a)) {
                    mutableDictionaryAccessorInterfaceImpl = this.f;
                    this.E = true;
                } else {
                    mutableDictionaryAccessorInterfaceImpl = this.e;
                    this.E = false;
                }
                D(l);
                if (mutableDictionaryAccessorInterfaceImpl != null) {
                    if (!mutableDictionaryAccessorInterfaceImpl.c(l.b, l.c, l.a, l.e) || !z2) {
                        ((luc) ((luc) m.d()).k("com/google/android/apps/inputmethod/libs/chinese/ime/hmm/AbstractHmmChineseDecodeProcessor", "addConvertedComposingTextToUserDictionary", 459, "AbstractHmmChineseDecodeProcessor.java")).w("Failed to insert %s converted text into user dictionary", true != this.E ? "Chinese" : "English");
                    } else {
                        this.D = l;
                    }
                }
            }
        } else if (this.l && this.f != null) {
            int length = obj.length();
            String[] strArr = new String[length];
            int[] iArr3 = new int[length];
            String lowerCase = obj.toLowerCase(Locale.US);
            for (int i3 = 0; i3 < length; i3++) {
                strArr[i3] = String.valueOf(lowerCase.charAt(i3));
                iArr3[i3] = 0;
            }
            if (this.f.c(strArr, iArr3, obj, true)) {
                this.E = true;
                this.D = new dim(obj, strArr, iArr3, null, true);
            } else {
                ((luc) ((luc) m.d()).k("com/google/android/apps/inputmethod/libs/chinese/ime/hmm/AbstractHmmChineseDecodeProcessor", "addRawComposingTextToEnglishUserDictionary", 517, "AbstractHmmChineseDecodeProcessor.java")).t("Failed to insert raw composing text into user dictionary");
            }
        }
        if (this.i != null && this.i.B()) {
            z = true;
        }
        aj(str, obj, z);
        Y(obj, l.a, true != str.equals("ENTER") ? 3 : 2, z2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean ab(iay iayVar) {
        if (!btp.b(iayVar) || !"'".equals(iayVar.e) || !ao()) {
            return false;
        }
        djh djhVar = this.i;
        djo i = i();
        dik dikVar = (dik) djhVar;
        int a = dikVar.a();
        if (!dikVar.i || dikVar.m.s(a) == i || !dikVar.m.B(a, i)) {
            if (dikVar.i) {
                return true;
            }
            dikVar.t();
            return true;
        }
        dikVar.y();
        dji djiVar = dikVar.l;
        if (djiVar != null) {
            djiVar.H(2, a);
        }
        N(0L);
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final void ac(long j) {
        boolean z = this.H;
        boolean z2 = (j & 576460752303423488L) != 0;
        this.H = z2;
        if (z == z2 || !this.k) {
            return;
        }
        if (ao()) {
            Iterator z3 = z();
            if (z3 == null || !z3.hasNext()) {
                return;
            }
            an(z3);
            return;
        }
        C();
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor, defpackage.hnj
    public void ad(Context context, gwv gwvVar, iav iavVar) {
        super.ad(context, gwvVar, iavVar);
        this.h = new obc(v(), u());
        this.w = d(context, iavVar);
        did c = c();
        djk djkVar = new djk();
        this.x = djkVar;
        djkVar.h(c);
        this.x.h(this.y);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public did c() {
        btv btvVar = new btv();
        btvVar.d = this.d;
        return btvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public did d(Context context, iav iavVar) {
        btw btwVar = new btw(context, iavVar.h);
        btwVar.d = this.d;
        return btwVar;
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, defpackage.dji
    public djf f() {
        if (this.b) {
            return this.w;
        }
        return null;
    }

    protected djo i() {
        return djo.TOKEN_SEPARATOR;
    }

    protected List j() {
        return this.i.g();
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public void k() {
        ino inoVar;
        dij e;
        djm q;
        super.k();
        Context context = this.o;
        if (context == null) {
            return;
        }
        iav iavVar = this.p;
        boolean z = true;
        this.n = iavVar != null && iavVar.q.d(R.id.f54850_resource_name_obfuscated_res_0x7f0b01cd, true) && (inoVar = this.r) != null && inoVar.aj(R.string.f160510_resource_name_obfuscated_res_0x7f140650);
        ino inoVar2 = this.r;
        if (inoVar2 == null || !inoVar2.aj(R.string.f162500_resource_name_obfuscated_res_0x7f14071b)) {
            z = false;
        }
        this.b = z;
        if (this.o != null) {
            this.h.k(v(), u());
        }
        au(2305843009213693952L, a());
        if (this.i != null) {
            this.i.t();
        }
        ino inoVar3 = this.r;
        if (inoVar3 != null && inoVar3.aj(R.string.f162280_resource_name_obfuscated_res_0x7f140705)) {
            this.e = t(context);
            this.f = s(context);
        }
        B();
        ax();
        A();
        dbf dbfVar = null;
        if (gqa.a(context).g && (q = (e = e()).q()) != null) {
            btt bttVar = (btt) e;
            if (bttVar.e == null) {
                bttVar.e = new dbf(q);
            }
            dbfVar = bttVar.e;
        }
        this.g = dbfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public void n() {
        ay(null);
        btm btmVar = this.F.b;
        for (int i = 0; i < 4; i++) {
            btmVar.b[i] = 0;
        }
        super.n();
        gvt.a(this.e);
        this.e = null;
        gvt.a(this.f);
        this.f = null;
    }

    protected boolean q(boolean z) {
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public boolean r() {
        return true;
    }

    protected abstract MutableDictionaryAccessorInterfaceImpl s(Context context);

    protected abstract MutableDictionaryAccessorInterfaceImpl t(Context context);

    protected abstract int u();

    protected abstract int v();

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence, java.lang.Object] */
    protected final CharSequence w() {
        return this.i.N(this.w).b;
    }

    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, defpackage.dji
    public final String x(String str) {
        return this.h.h(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor
    public final Iterator z() {
        Iterator f;
        if (this.i == null || (f = this.i.f()) == null) {
            return null;
        }
        if (this.H) {
            bts btsVar = new bts(f);
            if (btsVar.hasNext()) {
                this.i.m(btsVar.a);
            }
            return btsVar;
        }
        return new djs(new bty(f, this.i));
    }

    private final void ax() {
        hlr hlrVar = this.q;
        CharSequence j = hlrVar == null ? null : hlrVar.j(20);
        if (!TextUtils.isEmpty(j)) {
            ay(this.h.i(j.toString()).toString());
        } else {
            ay("");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public boolean V(hln hlnVar, boolean z) {
        if (hlnVar == null) {
            return false;
        }
        if (ao()) {
            if (!this.i.F(hlnVar)) {
                return false;
            }
            if (!z) {
                this.i.m(hlnVar);
                al(w());
                return true;
            }
            this.i.u(hlnVar);
            if (this.i.C(true)) {
                af().e(dja.CANDIDATE_SELECTED, hlnVar, "TEXT", true);
                F("SELECT_CANDIDATE");
            } else {
                af().e(dja.CANDIDATE_SELECTED, hlnVar, "TEXT", false);
                N(0L);
            }
        } else if (!z) {
            return false;
        } else {
            af().e(dja.CANDIDATE_SELECTED, hlnVar, "PREDICT", false);
            CharSequence charSequence = hlnVar.a;
            if (charSequence != null) {
                String obj = charSequence.toString();
                Y(obj, this.h.i(obj), 3, true);
                ak("SELECT_CANDIDATE", 1, null, obj, gvw.g, gvw.b, false);
                C();
                B();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    @Override // com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor, defpackage.dji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String y(java.lang.String r18, java.lang.String[] r19) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.chinese.ime.hmm.AbstractHmmChineseDecodeProcessor.y(java.lang.String, java.lang.String[]):java.lang.String");
    }
}

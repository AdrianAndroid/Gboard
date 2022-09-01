package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;
import com.google.android.apps.inputmethod.libs.hmm.Range;
import com.google.android.apps.inputmethod.libs.hmm.ScoredInput;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: dik  reason: default package */
/* loaded from: classes.dex */
public abstract class dik implements djh {
    public String g;
    public int h;
    public Range j;
    public dji l;
    public final HmmEngineInterfaceImpl m;
    private boolean q;
    private boolean r;
    private boolean s;
    private ArrayList t;
    private static final lug n = hin.a;
    private static final dpe A = new dpe("");
    private static final Range o = new Range(32767, 32767);
    public static final Range a = new Range(-1, -1);
    public static final Range b = new Range(0, 0);
    public static final Range c = new Range(0, 32767);
    public int d = -1;
    private int p = -1;
    public boolean e = true;
    public boolean f = true;
    public volatile boolean i = false;
    public final ArrayList k = lre.A();
    private final ArrayList u = lre.A();
    private final List v = lre.F();
    private final BitSet w = new BitSet();
    private int x = -1;
    private final hlk y = hln.a();
    private final ScoredInput[] z = new ScoredInput[1];

    public dik(HmmEngineInterfaceImpl hmmEngineInterfaceImpl) {
        this.m = hmmEngineInterfaceImpl;
    }

    public static void J(HmmEngineInterfaceImpl hmmEngineInterfaceImpl, long j, boolean z, dje djeVar) {
        boolean z2 = hmmEngineInterfaceImpl.z(j);
        djeVar.a = hmmEngineInterfaceImpl.w(j);
        djeVar.b = z2 ? djeVar.a : hmmEngineInterfaceImpl.nativeGetTokenConfidentString(hmmEngineInterfaceImpl.a, j);
        djeVar.c = hmmEngineInterfaceImpl.v(j);
        djeVar.d = hmmEngineInterfaceImpl.i(j);
        djeVar.e = z2;
        djeVar.f = hmmEngineInterfaceImpl.A(j);
        djeVar.g = z;
        djeVar.h = hmmEngineInterfaceImpl.n(j);
    }

    private final int O() {
        return this.u.isEmpty() ? this.h : ((Range) Q(this.u)).endVertexIndex;
    }

    private final int P() {
        return this.k.isEmpty() ? this.h : ((Range) Q(this.k)).endVertexIndex;
    }

    private static Object Q(ArrayList arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    private static Object R(ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    private final void S() {
        if (!this.i && !this.q) {
            this.q = true;
            if (TextUtils.isEmpty(this.g)) {
                return;
            }
            String str = this.g;
            int i = 0;
            while (i < str.length()) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                this.z[0] = new ScoredInput(str.substring(i, charCount), 0.0f);
                if (this.m.a(this.z, djj.TARGET_TOKEN) <= 0) {
                    t();
                    return;
                }
                i = charCount;
            }
            this.m.B(32767, djo.TOKEN_SEPARATOR);
            if (!this.s) {
                return;
            }
            this.m.B(32767, djo.SEGMENT_SEPARATOR);
        }
    }

    private final void T(int i) {
        if (i >= this.m.b()) {
            throw new IllegalArgumentException(String.format(Locale.US, "candidate index: %d, which is >= CandidateCount %d", Integer.valueOf(i), Integer.valueOf(this.m.b())));
        }
        HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
        Range nativeGetCandidateRange = hmmEngineInterfaceImpl.nativeGetCandidateRange(hmmEngineInterfaceImpl.a, i);
        HmmEngineInterfaceImpl hmmEngineInterfaceImpl2 = this.m;
        if (!hmmEngineInterfaceImpl2.nativeSelectCandidate(hmmEngineInterfaceImpl2.a, i)) {
            throw new dix();
        }
        this.u.add(nativeGetCandidateRange);
        if (this.k.isEmpty() || nativeGetCandidateRange.endVertexIndex > ((Range) Q(this.k)).endVertexIndex) {
            k(nativeGetCandidateRange);
        } else {
            y();
        }
        dji djiVar = this.l;
        if (djiVar == null) {
            return;
        }
        djiVar.H(3, nativeGetCandidateRange.startVertexIndex);
    }

    private final void U() {
        if (!this.q || this.r) {
            return;
        }
        Range o2 = this.m.o();
        if (!o2.a()) {
            HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
            if (!hmmEngineInterfaceImpl.nativeSelectRange(hmmEngineInterfaceImpl.a, o2)) {
                t();
                return;
            }
        }
        this.r = true;
        this.h = o2.endVertexIndex;
    }

    private final void V(String str) {
        HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
        int nativeGetDataSourceIndex = hmmEngineInterfaceImpl.nativeGetDataSourceIndex(hmmEngineInterfaceImpl.a, str);
        if (nativeGetDataSourceIndex >= 0) {
            this.w.set(nativeGetDataSourceIndex);
        }
    }

    private final void W() {
        this.t = null;
        if (!this.f || !this.i) {
            return;
        }
        Range range = new Range(Math.max(O(), P()), a());
        if (range.a()) {
            return;
        }
        HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
        if (!hmmEngineInterfaceImpl.nativeFillTokenCandidateList(hmmEngineInterfaceImpl.a, range)) {
            return;
        }
        int g = this.m.g();
        this.t = lre.E(g);
        for (int i = 0; i < g; i++) {
            HmmEngineInterfaceImpl hmmEngineInterfaceImpl2 = this.m;
            String nativeGetTokenCandidateString = hmmEngineInterfaceImpl2.nativeGetTokenCandidateString(hmmEngineInterfaceImpl2.a, i);
            ArrayList arrayList = this.t;
            hlk hlkVar = this.y;
            hlkVar.c();
            hlkVar.b = nativeGetTokenCandidateString;
            dji djiVar = this.l;
            if (djiVar != null) {
                nativeGetTokenCandidateString = djiVar.ag(nativeGetTokenCandidateString);
            }
            hlkVar.c = nativeGetTokenCandidateString;
            hlkVar.e = hlm.READING_TEXT;
            hlkVar.j = Integer.valueOf(i);
            hlkVar.h = i;
            arrayList.add(hlkVar.a());
        }
    }

    private final boolean X(int i) {
        return this.m.s(i).compareTo(djo.TOKEN_SEPARATOR) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    @Override // defpackage.djh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A(boolean r19) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dik.A(boolean):boolean");
    }

    @Override // defpackage.djh
    public final boolean B() {
        if (!this.i) {
            return false;
        }
        int e = this.m.e();
        for (int i = 0; i < e; i++) {
            long k = this.m.k(i);
            if (this.m.q(k).startVertexIndex >= this.h) {
                int f = this.m.f(k);
                for (int i2 = 0; i2 < f; i2++) {
                    HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
                    if (hmmEngineInterfaceImpl.n(hmmEngineInterfaceImpl.l(k, i2)) != djj.SOURCE_TOKEN) {
                        return false;
                    }
                }
                continue;
            }
        }
        return true;
    }

    @Override // defpackage.djh
    public final boolean C(boolean z) {
        if (O() >= a()) {
            return true;
        }
        int e = this.m.e();
        do {
            e--;
            if (e < 0) {
                return z;
            }
            long k = this.m.k(e);
            if (this.m.y(k)) {
                return this.m.x(k);
            }
        } while (z);
        return false;
    }

    @Override // defpackage.djh
    public final boolean D(hln hlnVar) {
        Object obj = hlnVar.j;
        if (!(obj instanceof Integer) || !this.e) {
            throw new IllegalArgumentException();
        }
        return this.p != -1 && ((Integer) obj).intValue() == this.p;
    }

    @Override // defpackage.djh
    public final boolean E() {
        return this.i;
    }

    @Override // defpackage.djh
    public final boolean F(hln hlnVar) {
        return (hlnVar.e == hlm.RECOMMENDATION || hlnVar.e == hlm.EMOJI) && G(hlnVar, this.m.b());
    }

    public final boolean G(hln hlnVar, int i) {
        int intValue;
        if (this.e && hlnVar != null) {
            Object obj = hlnVar.j;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue()) >= 0 && intValue < i) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.djh
    public final boolean H() {
        if (this.u.isEmpty() || !this.e) {
            return false;
        }
        Range range = (Range) R(this.u);
        HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
        hmmEngineInterfaceImpl.nativeUnconvertSegments(hmmEngineInterfaceImpl.a, range);
        if (this.k.isEmpty() || range.endVertexIndex > ((Range) Q(this.k)).endVertexIndex) {
            k(range);
            return true;
        }
        y();
        return true;
    }

    @Override // defpackage.djh
    public final boolean I() {
        if (this.k.isEmpty() || O() > ((Range) Q(this.k)).startVertexIndex) {
            return false;
        }
        Range range = (Range) Q(this.k);
        R(this.k);
        HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
        hmmEngineInterfaceImpl.nativeUnselectTokens(hmmEngineInterfaceImpl.a, range);
        k(range);
        q();
        return true;
    }

    @Override // defpackage.djh
    public final void K(int i, int i2, iay iayVar, djj djjVar) {
        int a2 = a();
        Object obj = iayVar.e;
        if (obj == null) {
            return;
        }
        HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
        if (hmmEngineInterfaceImpl.nativeAddInputEdge(hmmEngineInterfaceImpl.a, i, i2, new ScoredInput(((Character) obj).toString(), 0.0f), djjVar.ordinal()) <= 0) {
            return;
        }
        this.j = null;
        y();
        dji djiVar = this.l;
        if (djiVar == null) {
            return;
        }
        djiVar.H(1, a2);
    }

    @Override // defpackage.djh
    public final void M() {
        this.f = false;
        W();
    }

    @Override // defpackage.djh
    public final dpe N(djf djfVar) {
        int i;
        int i2;
        djfVar.d();
        if (!this.i) {
            return A;
        }
        int e = this.m.e();
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i4 < e) {
            long k = this.m.k(i4);
            if (this.m.q(k).startVertexIndex >= this.h) {
                HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
                if (hmmEngineInterfaceImpl.x(k)) {
                    i2 = 0;
                } else {
                    i2 = hmmEngineInterfaceImpl.y(k) ? 1 : 2;
                }
                HmmEngineInterfaceImpl hmmEngineInterfaceImpl2 = this.m;
                boolean nativeIsSegmentTargeted = hmmEngineInterfaceImpl2.nativeIsSegmentTargeted(hmmEngineInterfaceImpl2.a, k);
                int m = djfVar.m(i2, nativeIsSegmentTargeted);
                if (m == 0) {
                    i = e;
                    z = false;
                } else {
                    int f = this.m.f(k);
                    if (f == 0) {
                        throw new dix("tokenCount is 0");
                    }
                    if ((m & 1) != 0 && i2 != 2) {
                        djd djdVar = new djd();
                        HmmEngineInterfaceImpl hmmEngineInterfaceImpl3 = this.m;
                        djdVar.e = hmmEngineInterfaceImpl3.nativeGetSegmentConvertedString(hmmEngineInterfaceImpl3.a, k);
                        djdVar.a = hmmEngineInterfaceImpl3.f(k);
                        djdVar.b = hmmEngineInterfaceImpl3.i(hmmEngineInterfaceImpl3.l(k, i3));
                        djdVar.c = hmmEngineInterfaceImpl3.i(hmmEngineInterfaceImpl3.l(k, f - 1));
                        djdVar.d = hmmEngineInterfaceImpl3.nativeIsSegmentTokenFullyMatched(hmmEngineInterfaceImpl3.a, k);
                        djfVar.o(djdVar);
                    }
                    boolean z2 = ((m & 2) == 0 || i2 == 2) ? false : true;
                    int i5 = m & 4;
                    boolean z3 = z2 || i5 != 0;
                    if (z2 || i5 != 0) {
                        int i6 = 0;
                        while (i6 < f) {
                            long l = this.m.l(k, i6);
                            if (X(this.m.r(l).startVertexIndex)) {
                                djfVar.g();
                            }
                            if (z2) {
                                dje djeVar = new dje();
                                J(this.m, l, nativeIsSegmentTargeted, djeVar);
                                djfVar.c(djeVar);
                            }
                            if (i5 != 0) {
                                int h = this.m.h(l);
                                int i7 = 0;
                                while (i7 < h) {
                                    int i8 = e;
                                    long m2 = this.m.m(l, i7);
                                    boolean z4 = z2;
                                    Range p = this.m.p(m2);
                                    if (i7 > 0 && X(p.startVertexIndex)) {
                                        djfVar.g();
                                    }
                                    djc djcVar = new djc();
                                    long j = k;
                                    HmmEngineInterfaceImpl hmmEngineInterfaceImpl4 = this.m;
                                    boolean z5 = nativeIsSegmentTargeted;
                                    boolean nativeIsInputUnitConfident = hmmEngineInterfaceImpl4.nativeIsInputUnitConfident(hmmEngineInterfaceImpl4.a, m2);
                                    djcVar.a = hmmEngineInterfaceImpl4.u(m2);
                                    djcVar.b = nativeIsInputUnitConfident ? djcVar.a : hmmEngineInterfaceImpl4.nativeGetInputUnitConfidentString(hmmEngineInterfaceImpl4.a, m2);
                                    djfVar.n(djcVar);
                                    i7++;
                                    e = i8;
                                    z2 = z4;
                                    k = j;
                                    nativeIsSegmentTargeted = z5;
                                }
                            }
                            i6++;
                            e = e;
                            z2 = z2;
                            k = k;
                            nativeIsSegmentTargeted = nativeIsSegmentTargeted;
                        }
                    }
                    i = e;
                    z = z3;
                }
            } else {
                i = e;
            }
            i4++;
            e = i;
            i3 = 0;
        }
        if (z && X(a())) {
            djfVar.g();
        }
        CharSequence a2 = djfVar.a();
        a2.length();
        return new dpe(a2);
    }

    @Override // defpackage.djh
    public final int a() {
        return this.i ? this.m.o().endVertexIndex : this.h;
    }

    @Override // defpackage.djh
    public final int b() {
        return this.u.size();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        t();
        gvt.a(this.m);
    }

    @Override // defpackage.djh
    public final String d(hln hlnVar) {
        if (hlnVar != null) {
            Object obj = hlnVar.j;
            if (obj instanceof Integer) {
                return this.m.t(((Integer) obj).intValue());
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.djh
    public final String e() {
        if (!this.i) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int e = this.m.e();
        for (int i = 0; i < e; i++) {
            long k = this.m.k(i);
            if (this.m.q(k).startVertexIndex >= this.h) {
                int f = this.m.f(k);
                for (int i2 = 0; i2 < f; i2++) {
                    sb.append(this.m.w(this.m.l(k, i2)));
                }
            }
        }
        return sb.toString();
    }

    @Override // defpackage.djh
    public final Iterator f() {
        if (!this.e) {
            return null;
        }
        diw diwVar = new diw(this.m, this.w, this.l);
        l(this.d);
        return diwVar;
    }

    @Override // defpackage.djh
    public final List g() {
        String str;
        if (!this.i) {
            if (this.g == null) {
                return llp.q();
            }
            S();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            llk e = llp.e();
            HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
            if (hmmEngineInterfaceImpl.nativeFillPredictionCandidateList(hmmEngineInterfaceImpl.a)) {
                HmmEngineInterfaceImpl hmmEngineInterfaceImpl2 = this.m;
                int min = Math.min(hmmEngineInterfaceImpl2.nativeGetPredictionCandidateCount(hmmEngineInterfaceImpl2.a), 50);
                for (int i = 0; i < min; i++) {
                    HmmEngineInterfaceImpl hmmEngineInterfaceImpl3 = this.m;
                    String nativeGetPredictionCandidateString = hmmEngineInterfaceImpl3.nativeGetPredictionCandidateString(hmmEngineInterfaceImpl3.a, i);
                    dji djiVar = this.l;
                    if (djiVar != null) {
                        str = djiVar.y(nativeGetPredictionCandidateString, null);
                        nativeGetPredictionCandidateString = this.l.x(nativeGetPredictionCandidateString);
                    } else {
                        str = nativeGetPredictionCandidateString;
                    }
                    hlk hlkVar = this.y;
                    hlkVar.c();
                    hlkVar.a = nativeGetPredictionCandidateString;
                    hlkVar.c = str;
                    hlkVar.e = hlm.PREDICTION;
                    hlkVar.j = Integer.valueOf(i);
                    hlkVar.h = i;
                    HmmEngineInterfaceImpl hmmEngineInterfaceImpl4 = this.m;
                    hlkVar.n = hmmEngineInterfaceImpl4.nativeGetPredictionCandidateDataSourceMask(hmmEngineInterfaceImpl4.a, i);
                    HmmEngineInterfaceImpl hmmEngineInterfaceImpl5 = this.m;
                    hlkVar.o = hmmEngineInterfaceImpl5.nativeGetPredictionCandidateContextLength(hmmEngineInterfaceImpl5.a, i);
                    HmmEngineInterfaceImpl hmmEngineInterfaceImpl6 = this.m;
                    hlkVar.p = hmmEngineInterfaceImpl6.nativeGetPredictionCandidateContextWordCount(hmmEngineInterfaceImpl6.a, i);
                    e.h(hlkVar.a());
                }
            }
            r(djb.DECODE_HMM_PREDICTION, SystemClock.elapsedRealtime() - elapsedRealtime);
            llp g = e.g();
            p(g);
            return g;
        }
        throw new dix();
    }

    @Override // defpackage.djh
    public final List h() {
        if (this.f) {
            return this.t;
        }
        return null;
    }

    @Override // defpackage.djh
    public final void i(String str) {
        this.v.add(str);
        V(str);
    }

    @Override // defpackage.djh
    public final void j(hln hlnVar) {
        if (hlnVar != null) {
            Object obj = hlnVar.j;
            if ((obj instanceof Integer) && this.e) {
                HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
                if (hmmEngineInterfaceImpl.nativeDeleteCandidate(hmmEngineInterfaceImpl.a, ((Integer) obj).intValue())) {
                    y();
                    return;
                }
                throw new dix();
            }
        }
        throw new IllegalArgumentException();
    }

    public final void k(Range range) {
        Range range2;
        int i;
        long ae;
        if (this.i && (range2 = this.j) != null && (i = range.endVertexIndex) > range2.startVertexIndex && i < range2.endVertexIndex) {
            LinkedList F = lre.F();
            Range range3 = this.j;
            boolean z = false;
            int i2 = range3 == null ? 0 : range3.startVertexIndex;
            int e = this.m.e();
            loop0: while (true) {
                e--;
                if (e < 0) {
                    break;
                }
                long k = this.m.k(e);
                int f = this.m.f(k);
                boolean x = this.m.x(k);
                while (true) {
                    f--;
                    if (f >= 0) {
                        long l = this.m.l(k, f);
                        Range r = this.m.r(l);
                        if (range3 != null && r.startVertexIndex < range3.startVertexIndex) {
                            break loop0;
                        }
                        if (!z && (x || this.m.A(l))) {
                            i2 = r.endVertexIndex;
                            z = true;
                        }
                        if (z) {
                            F.addFirst(this.m.w(l));
                        }
                    }
                }
            }
            if (i2 == this.x) {
                ae = 0;
            } else {
                this.x = i2;
                ae = this.l.ae((String[]) F.toArray(new String[F.size()]));
            }
            if (ae != 0) {
                this.m.D(new Range(this.x, 32767));
                Range c2 = c(ae, djg.NEW);
                if (c2 != null) {
                    Range range4 = this.j;
                    if (range4 != null) {
                        this.j = new Range(range4.startVertexIndex, c2.endVertexIndex);
                    }
                } else {
                    throw new dix("Failed to filter bulk input");
                }
            }
        }
        y();
    }

    public final void l(int i) {
        if (i != this.p) {
            HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
            if (!hmmEngineInterfaceImpl.nativeHighlightCandidate(hmmEngineInterfaceImpl.a, i)) {
                throw new dix();
            }
            this.p = i;
        }
    }

    @Override // defpackage.djh
    public final void m(hln hlnVar) {
        if (hlnVar != null) {
            Object obj = hlnVar.j;
            if ((obj instanceof Integer) && this.e) {
                l(((Integer) obj).intValue());
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    protected void n(boolean z) {
    }

    protected void o(int i) {
    }

    protected abstract void p(List list);

    protected void q() {
    }

    public abstract void r(ids idsVar, long j);

    @Override // defpackage.djh
    public final void s() {
        HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
        hmmEngineInterfaceImpl.nativeRefreshData(hmmEngineInterfaceImpl.a);
        this.w.clear();
        for (String str : this.v) {
            V(str);
        }
    }

    @Override // defpackage.djh
    public final void t() {
        HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
        hmmEngineInterfaceImpl.nativeReset(hmmEngineInterfaceImpl.a);
        this.p = -1;
        this.d = -1;
        this.q = false;
        this.r = false;
        this.h = 0;
        this.i = false;
        this.j = null;
        this.k.clear();
        this.t = null;
        this.u.clear();
        this.x = -1;
    }

    @Override // defpackage.djh
    public final void u(hln hlnVar) {
        Object obj = hlnVar.j;
        if (!(obj instanceof Integer) || !this.e) {
            throw new IllegalArgumentException();
        }
        T(((Integer) obj).intValue());
    }

    @Override // defpackage.djh
    public final void v() {
        int i = this.p;
        if (i == -1 || !this.e) {
            return;
        }
        T(i);
        o(i);
    }

    @Override // defpackage.djh
    public final void w(dji djiVar) {
        this.l = djiVar;
    }

    @Override // defpackage.djh
    public final void x(String str, boolean z) {
        this.g = str;
        this.s = z;
    }

    public final void y() {
        Range o2 = this.m.o();
        boolean z = false;
        if (!o2.a() && o2.endVertexIndex > this.h) {
            z = true;
        }
        this.i = z;
        W();
        z();
    }

    public final void z() {
        if (!this.e) {
            return;
        }
        this.d = -1;
        this.p = -1;
        if (!this.i) {
            return;
        }
        Range range = new Range(O(), a());
        if (range.a()) {
            return;
        }
        HmmEngineInterfaceImpl hmmEngineInterfaceImpl = this.m;
        if (!hmmEngineInterfaceImpl.nativeFillCandidateList(hmmEngineInterfaceImpl.a, range)) {
            return;
        }
        int d = this.m.d();
        this.p = d;
        this.d = d;
    }

    @Override // defpackage.djh
    public final boolean L(iay[] iayVarArr, float[] fArr) {
        int length;
        if (iayVarArr == null || fArr == null || (length = iayVarArr.length) == 0 || length != fArr.length) {
            throw new IllegalArgumentException();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        S();
        U();
        ScoredInput[] scoredInputArr = new ScoredInput[length];
        for (int i = 0; i < iayVarArr.length; i++) {
            Object obj = iayVarArr[i].e;
            scoredInputArr[i] = new ScoredInput(obj == null ? "" : obj.toString(), fArr[i]);
        }
        int a2 = a();
        int a3 = this.m.a(scoredInputArr, djj.SOURCE_INPUT_UNIT);
        r(djb.DECODE_HMM_TYPING, SystemClock.elapsedRealtime() - elapsedRealtime);
        if (a3 > 0) {
            this.j = null;
            y();
            dji djiVar = this.l;
            if (djiVar != null) {
                djiVar.H(1, a2);
            }
        }
        return a3 > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.apps.inputmethod.libs.hmm.Range c(long r10, defpackage.djg r12) {
        /*
            r9 = this;
            if (r12 == 0) goto L74
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 == 0) goto L74
            r9.S()
            r9.U()
            djg r0 = defpackage.djg.NEW
            if (r12 != r0) goto L16
            com.google.android.apps.inputmethod.libs.hmm.Range r0 = defpackage.dik.o
        L14:
            r8 = r0
            goto L27
        L16:
            com.google.android.apps.inputmethod.libs.hmm.Range r0 = r9.j
            if (r0 != 0) goto L1d
            com.google.android.apps.inputmethod.libs.hmm.Range r0 = defpackage.dik.o
            goto L14
        L1d:
            com.google.android.apps.inputmethod.libs.hmm.Range r1 = new com.google.android.apps.inputmethod.libs.hmm.Range
            int r0 = r0.startVertexIndex
            r2 = 32767(0x7fff, float:4.5916E-41)
            r1.<init>(r0, r2)
            r8 = r1
        L27:
            com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl r3 = r9.m
            long r4 = r3.a
            r6 = r10
            com.google.android.apps.inputmethod.libs.hmm.Range r10 = r3.nativeBulkInputWithNativePointer(r4, r6, r8)
            if (r10 == 0) goto L44
            com.google.android.apps.inputmethod.libs.hmm.Range r11 = defpackage.dik.a
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L44
            com.google.android.apps.inputmethod.libs.hmm.Range r11 = defpackage.dik.b
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L43
            goto L44
        L43:
            return r10
        L44:
            lug r11 = defpackage.dik.n
            ltv r11 = r11.c()
            luc r11 = (defpackage.luc) r11
            r0 = 685(0x2ad, float:9.6E-43)
            java.lang.String r1 = "AbstractHmmEngineWrapper.java"
            java.lang.String r2 = "com/google/android/apps/inputmethod/libs/hmm/AbstractHmmEngineWrapper"
            java.lang.String r3 = "bulkInputWithNativePointerImpl"
            ltv r11 = r11.k(r2, r3, r0, r1)
            r0 = r11
            luc r0 = (defpackage.luc) r0
            java.lang.String r3 = java.lang.String.valueOf(r10)
            com.google.android.apps.inputmethod.libs.hmm.Range r10 = r9.j
            if (r10 == 0) goto L68
            java.lang.String r10 = r10.toString()
            goto L6a
        L68:
            java.lang.String r10 = "empty"
        L6a:
            r4 = r10
            java.lang.String r1 = "BulkInput failed: operation: %s, ret: %s, lastRange: %s, input: %s"
            r5 = 0
            r2 = r12
            r0.K(r1, r2, r3, r4, r5)
            r10 = 0
            return r10
        L74:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Invalid bulk input operation."
            r10.<init>(r11)
            goto L7d
        L7c:
            throw r10
        L7d:
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dik.c(long, djg):com.google.android.apps.inputmethod.libs.hmm.Range");
    }
}

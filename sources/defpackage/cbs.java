package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.apps.inputmethod.libs.latin5.LatinIme;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cbs  reason: default package */
/* loaded from: classes.dex */
public final class cbs implements cbg {
    private static final ltg g = ltg.j("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV4");
    private final cbf B;
    private final lgb C;
    private boolean D;
    public final hls a;
    final cbj b;
    private final cbi h;
    private final mks i;
    private List o;
    private volatile long r;
    private volatile long s;
    private final ccm u;
    private mko x;
    private final mko y;
    cbr c = null;
    cbr d = null;
    private boolean z = false;
    private boolean A = false;
    public boolean e = false;
    public boolean f = false;
    private mrw G = null;
    private boolean v = true;
    private lmz w = lrr.a;
    private boolean j = false;
    private int l = 0;
    private int m = 0;
    private mtv n = mtv.SHIFT_NONE;
    private boolean k = false;
    private boolean t = false;
    private int p = -1;
    private long q = -1;
    private volatile long E = ((Long) cas.u.c()).longValue();
    private volatile boolean F = ((Boolean) cas.v.c()).booleanValue();

    public cbs(hls hlsVar, cbi cbiVar, mks mksVar, cbf cbfVar, ccm ccmVar, lgb lgbVar) {
        mko mkoVar = mkk.a;
        this.x = mkoVar;
        this.y = mkoVar;
        this.a = hlsVar;
        this.h = cbiVar;
        this.u = ccmVar;
        this.b = new cbj(hlsVar);
        this.i = mksVar;
        this.B = cbfVar;
        this.C = lgbVar;
    }

    private static String M(msf msfVar) {
        msf msfVar2 = msf.OPERATION_CREATE_OR_RESET_DECODER;
        int ordinal = msfVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return "SetRuntimeParams";
            }
            if (ordinal == 2) {
                return "SetKeyboardLayout";
            }
            if (ordinal == 3) {
                return "GetLoudsLmContentVersion";
            }
            if (ordinal == 18) {
                return "ForgetTextCandidate";
            }
            if (ordinal == 19) {
                return "ParseInputContext";
            }
            if (ordinal == 33) {
                return "DecodeForHandwriting";
            }
            switch (ordinal) {
                case 5:
                    return "LoadShortcutMap";
                case 6:
                    return "LoadEmojiShortcutMap";
                case 7:
                    return "LoadLanguageModel";
                case 8:
                    return "UnloadLanguageModel";
                case 9:
                    return "FlushPersonalizedData";
                case 10:
                    return "DecodeTouch";
                case 11:
                    return "DecodeGesture";
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    return "DecodeGestureEnd";
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    return "CheckSpelling";
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    return "FetchSuggestions";
                case 15:
                    return "SearchForTerm";
                case 16:
                    return "SelectTextCandidate";
                default:
                    switch (ordinal) {
                        case 21:
                            return "ScrubDeleteStart";
                        case 22:
                            return "ScrubDeleteFinish";
                        case 23:
                            return "RecapitalizeSelection";
                        case 24:
                            return "ProcessVoiceTranscription";
                        case 25:
                            return "AbortComposing";
                        case 26:
                            return "OverrideDecodedCandidates";
                        default:
                            int i = msfVar.N;
                            return "Unknown(" + i + ")";
                    }
            }
        }
        return "CreateOrResetDecoder";
    }

    private final void N(mrw mrwVar, long j, ifn ifnVar) {
        boolean z;
        int length;
        if (mrwVar == null) {
            ((ltd) ((ltd) g.c()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV4", "applyTextFieldDiffInternal", 1024, "InputContextProxyV4.java")).t("clientDiff should not be null. It is @Nullable only because mergedCliendDiff is @Nullable, but it has been checked before");
            return;
        }
        mub mubVar = mrwVar.c;
        if (mubVar == null) {
            mubVar = mub.l;
        }
        this.D = mubVar.k;
        cbj cbjVar = this.b;
        boolean z2 = this.t;
        mub mubVar2 = mrwVar.c;
        mub mubVar3 = mubVar2 == null ? mub.l : mubVar2;
        String str = mrwVar.f;
        String str2 = mrwVar.g;
        if (mubVar2 == null) {
            mubVar2 = mub.l;
        }
        int i = 0;
        if (mubVar2.j) {
            idk hO = this.a.hO();
            cap capVar = cap.INVALID_WORD_UNDERLINED;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(str == null ? 0 : str.length());
            hO.e(capVar, objArr);
            z = true;
        } else {
            z = false;
        }
        cbjVar.a(z2, mubVar3, str, str2, z, this.u.e);
        if (this.D && ((Boolean) cas.L.c()).booleanValue()) {
            this.a.hT(1, 1, 1);
        }
        if (j > 0 && ifnVar != null) {
            long uptimeMillis = SystemClock.uptimeMillis() - j;
            if (uptimeMillis > 0) {
                this.a.hO().g(idv.USER_ACTION_TO_TEXT_FIELD_UPDATED, uptimeMillis);
                ifnVar.d(uptimeMillis);
            }
        }
        if (this.r > 0) {
            this.a.hO().g(idv.USER_ACTION_TO_TEXT_FIELD_UPDATED_IGNORED, SystemClock.uptimeMillis() - this.r);
            this.r = 0L;
        }
        mub mubVar4 = mrwVar.c;
        if (mubVar4 == null) {
            mubVar4 = mub.l;
        }
        if (mubVar4.g.isEmpty()) {
            length = 0;
        } else {
            mub mubVar5 = mrwVar.c;
            if (mubVar5 == null) {
                mubVar5 = mub.l;
            }
            length = mubVar5.g.length();
        }
        this.l = length;
        mub mubVar6 = mrwVar.c;
        if (mubVar6 == null) {
            mubVar6 = mub.l;
        }
        if (!mubVar6.h.isEmpty()) {
            mub mubVar7 = mrwVar.c;
            if (mubVar7 == null) {
                mubVar7 = mub.l;
            }
            i = mubVar7.h.length();
        }
        this.m = i;
        mub mubVar8 = mrwVar.c;
        if (mubVar8 == null) {
            mubVar8 = mub.l;
        }
        this.t = !mubVar8.i.isEmpty();
    }

    private final void O(mrw mrwVar, long j) {
        if (j > 0) {
            if ((mrwVar.a & 2) != 0 && this.r == 0) {
                this.r = j;
            }
            if ((mrwVar.a & 4) == 0 || this.s != 0) {
                return;
            }
            this.s = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void P(boolean r13) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbs.P(boolean):void");
    }

    @Override // defpackage.cbg
    public final boolean A() {
        return this.j;
    }

    @Override // defpackage.cbg
    public final boolean B() {
        return this.u.l();
    }

    @Override // defpackage.cbg
    public final boolean C() {
        return this.t;
    }

    @Override // defpackage.cbg
    public final boolean D() {
        return this.l > 0 || this.m > 0;
    }

    @Override // defpackage.cbg
    public final boolean E() {
        return this.D;
    }

    @Override // defpackage.cbg
    public final boolean F() {
        return this.k;
    }

    @Override // defpackage.cbg
    public final synchronized boolean G() {
        return this.z;
    }

    @Override // defpackage.cbg
    public final synchronized boolean H() {
        return this.A;
    }

    @Override // defpackage.cbg
    public final void I() {
        this.u.m();
    }

    @Override // defpackage.cbg
    public final void J() {
        this.t = true;
    }

    final void K(mtn mtnVar) {
        if (!mtnVar.b.isEmpty() || !mtnVar.c.isEmpty()) {
            this.l = mtnVar.b.length();
            int length = mtnVar.c.length();
            this.m = length;
            this.a.f(this.l, length, String.valueOf(mtnVar.b).concat(String.valueOf(mtnVar.c)));
            this.D = true;
            return;
        }
        this.a.hW();
        this.l = 0;
        this.m = 0;
        this.D = false;
    }

    public final boolean L(mrw mrwVar, msf msfVar, msh mshVar, boolean z, long j, long j2, ifn ifnVar) {
        long j3;
        long j4;
        mty mtyVar;
        hlm hlmVar;
        int i;
        int B;
        int B2;
        int B3;
        mrw mrwVar2;
        synchronized (this) {
            j3 = this.q;
            j4 = this.p;
        }
        boolean z2 = true;
        if (j3 > j) {
            ieh j5 = ieh.j();
            cap capVar = cap.ABANDON_CLIENT_DIFF_DUE_TO_STALE_CLIENT_REQUEST;
            Object[] objArr = new Object[6];
            objArr[0] = Integer.valueOf(msfVar.N);
            objArr[1] = Long.valueOf(j3 - j);
            objArr[2] = Integer.valueOf(mrwVar.b);
            objArr[3] = Boolean.valueOf((mrwVar.a & 2) != 0);
            if ((mrwVar.a & 4) == 0) {
                z2 = false;
            }
            objArr[4] = Boolean.valueOf(z2);
            Long valueOf = Long.valueOf(j);
            objArr[5] = valueOf;
            j5.e(capVar, objArr);
            O(mrwVar, j2);
            ((ltd) ((ltd) g.d()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV4", "applyClientDiffInternal", 896, "InputContextProxyV4.java")).L("Ignore [%s] diff due to stale request: %d<%d, inputStateId=%s, lastInputStateId=%d", M(msfVar), valueOf, Long.valueOf(j3), Integer.valueOf(mrwVar.b), Long.valueOf(j4));
            return false;
        }
        int i2 = mrwVar.b;
        if (j4 < i2) {
            q(i2);
            if (msfVar == msf.OPERATION_DECODE_GESTURE_END) {
                ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV4", "applyClientDiffInternal", 929, "InputContextProxyV4.java")).J("applyClientDiffInternal(): hasTextFieldDiff=%s, hasKeyboardDiff=%s, hasSuggestionDiff=%s", Boolean.valueOf((mrwVar.a & 2) != 0), Boolean.valueOf((mrwVar.a & 8) != 0), Boolean.valueOf((mrwVar.a & 4) != 0));
            }
            if ((mrwVar.a & 2) != 0) {
                if (z) {
                    this.G = cbt.b(this.G, mrwVar);
                } else {
                    mrw mrwVar3 = this.G;
                    if (mrwVar3 != null) {
                        mrw b = cbt.b(mrwVar3, mrwVar);
                        this.G = b;
                        N(b, j2, ifnVar);
                        this.G = null;
                    } else {
                        N(mrwVar, j2, ifnVar);
                    }
                }
            }
            if ((mrwVar.a & 2) == 0 && (mrwVar2 = this.G) != null) {
                N(mrwVar2, j2, ifnVar);
                this.G = null;
            }
            if ((mrwVar.a & 8) != 0) {
                mtd mtdVar = mrwVar.e;
                if (mtdVar == null) {
                    mtdVar = mtd.d;
                }
                mtv b2 = mtv.b(mtdVar.a);
                if (b2 == null) {
                    b2 = mtv.SHIFT_NONE;
                }
                this.n = b2;
                cbj cbjVar = this.b;
                mtd mtdVar2 = mrwVar.e;
                if (mtdVar2 == null) {
                    mtdVar2 = mtd.d;
                }
                mtv b3 = mtv.b(mtdVar2.a);
                if (b3 == null) {
                    b3 = mtv.SHIFT_NONE;
                }
                cbjVar.g(b3);
                mtd mtdVar3 = mrwVar.e;
                this.o = (mtdVar3 == null ? mtd.d : mtdVar3).b;
                cbj cbjVar2 = this.b;
                if (mtdVar3 == null) {
                    mtdVar3 = mtd.d;
                }
                cbjVar2.f(mtdVar3.b);
                cbj cbjVar3 = this.b;
                mtd mtdVar4 = mrwVar.e;
                if (mtdVar4 == null) {
                    mtdVar4 = mtd.d;
                }
                cbjVar3.i(mtdVar4.c);
            }
            if ((mrwVar.a & 4) != 0) {
                ccm ccmVar = this.u;
                mty mtyVar2 = mrwVar.d;
                if (mtyVar2 == null) {
                    mtyVar2 = mty.e;
                }
                mty c = ccmVar.c(mtyVar2, this.w);
                if (c == null) {
                    mtyVar = mrwVar.d;
                    if (mtyVar == null) {
                        mtyVar = mty.e;
                    }
                } else {
                    Object obj = ((boh) this.C).a;
                    ltg ltgVar = LatinIme.a;
                    long b4 = b();
                    nfh t = mtk.f.t();
                    nfh t2 = msg.l.t();
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    msg msgVar = (msg) t2.b;
                    msgVar.a |= 4;
                    msgVar.d = b4;
                    int a = a(b4);
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    msg msgVar2 = (msg) t2.b;
                    int i3 = msgVar2.a | 2;
                    msgVar2.a = i3;
                    msgVar2.c = a;
                    msgVar2.b = this.n.d;
                    msgVar2.a = i3 | 1;
                    long a2 = this.a.hO().b().a(iwd.a);
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    msg msgVar3 = (msg) t2.b;
                    msgVar3.a |= 512;
                    msgVar3.k = a2;
                    msg msgVar4 = (msg) t2.cz();
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mtk mtkVar = (mtk) t.b;
                    msgVar4.getClass();
                    mtkVar.b = msgVar4;
                    mtkVar.a |= 1;
                    t.dR(c.c);
                    if ((c.a & 2) != 0) {
                        mse mseVar = c.d;
                        if (mseVar == null) {
                            mseVar = mse.p;
                        }
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mtk mtkVar2 = (mtk) t.b;
                        mseVar.getClass();
                        mtkVar2.d = mseVar;
                        mtkVar2.a |= 2;
                    }
                    mtl x = ((Delight5Facilitator) obj).h.x(t);
                    mrw mrwVar4 = x.a;
                    if (((mrwVar4 == null ? mrw.h : mrwVar4).a & 4) == 0) {
                        ((ltd) g.a(hip.a).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV4", "getSuggestionDiffWithOptionalOverride", 1091, "InputContextProxyV4.java")).t("Failed to get override decoded candidates response");
                        mtyVar = mty.e;
                    } else {
                        if (mrwVar4 == null) {
                            mrwVar4 = mrw.h;
                        }
                        q(mrwVar4.b);
                        mrw mrwVar5 = x.a;
                        if (mrwVar5 == null) {
                            mrwVar5 = mrw.h;
                        }
                        mtyVar = mrwVar5.d;
                        if (mtyVar == null) {
                            mtyVar = mty.e;
                        }
                    }
                }
                this.u.j(mtyVar);
                String str = mrwVar.f;
                mub mubVar = mrwVar.c;
                if (mubVar == null) {
                    mubVar = mub.l;
                }
                String str2 = mubVar.d;
                if (true == TextUtils.isEmpty(str)) {
                    str = str2;
                }
                boolean hZ = this.a.hZ(ccm.a(this.u.e, str), false);
                if ((mtyVar.a & 2) != 0) {
                    this.a.hO().e(cap.INLINE_SUGGESTION_PROPOSED, mtyVar, Boolean.valueOf(hZ));
                }
                ccm ccmVar2 = this.u;
                mty mtyVar3 = mrwVar.d;
                if (mtyVar3 == null) {
                    mtyVar3 = mty.e;
                }
                int B4 = jco.B(mtyVar3.b);
                if (B4 == 0 || B4 != 6) {
                    if (!mrwVar.g.isEmpty() || !mrwVar.f.isEmpty()) {
                        hlmVar = hlm.RECOMMENDATION;
                    } else {
                        hlmVar = hlm.PREDICTION;
                    }
                } else {
                    hlmVar = hlm.UNDO_REVERT;
                }
                ccmVar2.i(hlmVar, mtyVar, hZ);
                if (this.v) {
                    this.a.T(this.u.e());
                    this.b.b(z());
                    if (j2 > 0 && ifnVar != null) {
                        long uptimeMillis = SystemClock.uptimeMillis() - j2;
                        this.a.hO().g(idv.USER_ACTION_TO_TEXT_CANDIDATES_UPDATED, uptimeMillis);
                        ifnVar.c(uptimeMillis);
                    }
                    if (this.s > 0) {
                        this.a.hO().g(idv.USER_ACTION_TO_TEXT_CANDIDATES_UPDATED_IGNORED, SystemClock.uptimeMillis() - this.s);
                        this.s = 0L;
                    }
                    if (mtyVar.c.size() != 0 && (((B = jco.B((i = mtyVar.b))) != 0 && B == 3) || (((B2 = jco.B(i)) != 0 && B2 == 4) || ((B3 = jco.B(i)) != 0 && B3 == 5)))) {
                        this.a.hO().e(cap.CANDIDATE_PROPOSED, mtyVar);
                    }
                }
            }
            if (mshVar != null && mshVar.a) {
                mtn b5 = this.h.b(b(), this.a.j(((Long) cas.A.c()).intValue()), "", "", true, ((Long) cas.A.c()).intValue());
                int D = jco.D(b5.e);
                if (D != 0 && D != 1) {
                    ltd ltdVar = (ltd) ((ltd) g.c()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV4", "extendBeforeCursor", 510, "InputContextProxyV4.java");
                    int D2 = jco.D(b5.e);
                    if (D2 == 0) {
                        D2 = 1;
                    }
                    ltdVar.y("extendBeforeCursor(): un-successful, parse_code: %d, input_state_id: %d", D2 - 1, b5.f);
                }
                int i4 = b5.e;
                int D3 = jco.D(i4);
                this.j = D3 != 0 && D3 == 3;
                int D4 = jco.D(i4);
                this.k = D4 == 0 || D4 == 1;
                mtv b6 = mtv.b(b5.d);
                if (b6 == null) {
                    b6 = mtv.SHIFT_NONE;
                }
                this.n = b6;
                synchronized (this) {
                    this.p = b5.f;
                }
                if (b5 != null) {
                    K(b5);
                }
            }
            this.a.hO().e(cap.APPLY_CLIENT_DIFF_REQUEST, Long.valueOf(j));
            return true;
        }
        O(mrwVar, j2);
        ieh j6 = ieh.j();
        cap capVar2 = cap.ABANDON_CLIENT_DIFF_DUE_TO_STALE_INPUT_STATE;
        Object[] objArr2 = new Object[6];
        objArr2[0] = Integer.valueOf(msfVar.N);
        objArr2[1] = Long.valueOf(j4 - mrwVar.b);
        objArr2[2] = Integer.valueOf(mrwVar.b);
        objArr2[3] = Boolean.valueOf((mrwVar.a & 2) != 0);
        if ((mrwVar.a & 4) == 0) {
            z2 = false;
        }
        objArr2[4] = Boolean.valueOf(z2);
        Long valueOf2 = Long.valueOf(j);
        objArr2[5] = valueOf2;
        j6.e(capVar2, objArr2);
        ((ltd) ((ltd) g.d()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV4", "applyClientDiffInternal", 916, "InputContextProxyV4.java")).L("Ignore [%s] diff due to stale input state: %d<%d, requestId=%s, lastServicedRequestId=%d", M(msfVar), Integer.valueOf(mrwVar.b), Long.valueOf(j4), valueOf2, Long.valueOf(j3));
        return false;
    }

    @Override // defpackage.cbg
    public final synchronized int a(long j) {
        if (this.q < j) {
            this.q = j;
        }
        return this.p;
    }

    @Override // defpackage.cbg
    public final synchronized long b() {
        return this.B.a();
    }

    @Override // defpackage.cbg
    public final synchronized long c() {
        return this.q;
    }

    @Override // defpackage.cbg
    public final xv d() {
        return xv.a(Integer.valueOf(this.l), Integer.valueOf(this.m));
    }

    @Override // defpackage.cbg
    public final hln e() {
        return this.u.b();
    }

    @Override // defpackage.cbg
    public final mtv f() {
        return this.n;
    }

    @Override // defpackage.cbg
    public final List g() {
        return this.o;
    }

    @Override // defpackage.cbg
    public final List h(int i) {
        return this.u.d(i);
    }

    @Override // defpackage.cbg
    public final void i(mrw mrwVar, msf msfVar, msh mshVar, boolean z, long j, long j2, ifn ifnVar) {
        if (mrwVar == null) {
            ((ltd) ((ltd) g.d()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV4", "applyClientDiff", 651, "InputContextProxyV4.java")).w("Ignore null [%s] diff", M(msfVar));
        } else if (hjg.r()) {
            L(mrwVar, msfVar, mshVar, z, j, j2, ifnVar);
        } else {
            cbr cbrVar = new cbr(this, mrwVar, msfVar, mshVar, z, j, j2, ifnVar, 0);
            mko hP = this.i.hP(cbrVar);
            if (msfVar == msf.OPERATION_DECODE_GESTURE_END) {
                synchronized (this) {
                    this.d = cbrVar;
                    this.x = hP;
                }
            } else if (msfVar != msf.OPERATION_FETCH_SUGGESTIONS) {
            } else {
                synchronized (this) {
                    this.c = cbrVar;
                    this.x = hP;
                }
            }
        }
    }

    @Override // defpackage.cbg
    public final void j(mtq mtqVar, msf msfVar) {
        synchronized (this) {
            if (this.p >= mtqVar.b) {
                ((ltd) ((ltd) g.d()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV4", "applyRecapitalizeSelection", 1201, "InputContextProxyV4.java")).J("Ignore stale [%s] diff id:%d<=%d", M(msfVar), Integer.valueOf(mtqVar.b), Integer.valueOf(this.p));
                return;
            }
            q(mtqVar.b);
            this.b.e(mtqVar.c, mtqVar.d);
            this.t = true;
        }
    }

    @Override // defpackage.cbg
    public final void k() {
        this.u.f();
        this.u.h();
    }

    @Override // defpackage.cbg
    public final void l() {
        if (hjg.r()) {
            this.b.c();
        } else {
            this.i.hP(new cbq(this, 0));
        }
    }

    @Override // defpackage.cbg
    public final void m(long j, boolean z, hqk hqkVar, boolean z2) {
        mtn b = this.h.b(j, hqkVar.d(), hqkVar.b(), hqkVar.c(), z, ((Long) cas.A.c()).intValue());
        int D = jco.D(b.e);
        boolean z3 = true;
        if (D != 0 && D != 1) {
            ltd ltdVar = (ltd) ((ltd) g.c()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV4", "reset", 371, "InputContextProxyV4.java");
            int D2 = jco.D(b.e);
            if (D2 == 0) {
                D2 = 1;
            }
            ltdVar.y("reset(): un-successful, parse_code: %s, input_state_id %d", D2 - 1, b.f);
        }
        int i = b.e;
        int D3 = jco.D(i);
        this.j = D3 != 0 && D3 == 3;
        int D4 = jco.D(i);
        if (D4 != 0 && D4 != 1) {
            z3 = false;
        }
        this.k = z3;
        this.t = hqkVar.e();
        mtv b2 = mtv.b(b.d);
        if (b2 == null) {
            b2 = mtv.SHIFT_NONE;
        }
        this.n = b2;
        q(b.f);
        if (z2) {
            if (hqkVar.e()) {
                this.a.hY(false);
            }
            K(b);
        }
        if (this.r > 0) {
            this.a.hO().g(idv.USER_ACTION_TO_TEXT_FIELD_UPDATED_IGNORED_RESET, SystemClock.uptimeMillis() - this.r);
        }
        if (this.s > 0) {
            this.a.hO().g(idv.USER_ACTION_TO_TEXT_CANDIDATES_UPDATED_IGNORED_RESET, SystemClock.uptimeMillis() - this.s);
        }
        this.r = 0L;
        this.s = 0L;
        this.E = ((Long) cas.u.c()).longValue();
        this.F = ((Boolean) cas.v.c()).booleanValue();
    }

    @Override // defpackage.cbg
    public final void n() {
        this.u.g();
    }

    @Override // defpackage.cbg
    public final void o(long j, mrq mrqVar) {
        synchronized (this) {
            mrw mrwVar = mrqVar.b;
            if (mrwVar == null) {
                mrwVar = mrw.h;
            }
            this.p = mrwVar.b;
            if (this.q < j) {
                this.q = j;
            }
        }
        this.j = false;
        this.t = false;
        this.l = 0;
        this.m = 0;
    }

    @Override // defpackage.cbg
    public final void p(boolean z) {
        this.u.d = z;
    }

    @Override // defpackage.cbg
    public final synchronized void q(int i) {
        this.p = i;
    }

    @Override // defpackage.cbg
    public final void r(mtv mtvVar) {
        this.n = mtvVar;
    }

    @Override // defpackage.cbg
    public final void s(boolean z) {
        this.v = z;
    }

    @Override // defpackage.cbg
    public final void t(boolean z, boolean z2, boolean z3) {
        this.w = cbt.a(z, z2, z3);
    }

    @Override // defpackage.cbg
    public final synchronized void u(boolean z) {
        this.z = z;
    }

    @Override // defpackage.cbg
    public final synchronized void v(boolean z) {
        this.A = z;
    }

    @Override // defpackage.cbg
    public final void w(mro mroVar) {
        if (mroVar.b.size() > 0) {
            this.b.h(((muv) mroVar.b.get(0)).h);
        }
    }

    @Override // defpackage.cbg
    public final void x() {
        P(false);
    }

    @Override // defpackage.cbg
    public final void y() {
        P(true);
    }

    @Override // defpackage.cbg
    public final boolean z() {
        return this.u.k();
    }
}

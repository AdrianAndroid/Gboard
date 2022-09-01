package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.apps.inputmethod.libs.latin5.LatinIme;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cbo  reason: default package */
/* loaded from: classes.dex */
public final class cbo implements cbg {
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV2");
    private boolean A;
    public final hls a;
    public final cbj b;
    private final cbi g;
    private final mks h;
    private List n;
    private long q;
    private long r;
    private final ccm t;
    private final cbf y;
    private final lgb z;
    private volatile boolean w = false;
    public long c = -1;
    private volatile boolean x = false;
    public long d = -1;
    private mrw B = null;
    private boolean u = true;
    private lmz v = lrr.a;
    private boolean i = false;
    private int k = 0;
    private int l = 0;
    private mtv m = mtv.SHIFT_NONE;
    private boolean j = false;
    private boolean s = false;
    private int o = -1;
    private long p = -1;
    public final long e = ((Long) cas.u.c()).longValue();

    public cbo(hls hlsVar, cbi cbiVar, mks mksVar, cbf cbfVar, ccm ccmVar, lgb lgbVar) {
        this.a = hlsVar;
        this.g = cbiVar;
        this.t = ccmVar;
        this.b = new cbj(hlsVar);
        this.h = mksVar;
        this.y = cbfVar;
        this.z = lgbVar;
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
            ((ltd) ((ltd) f.c()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV2", "applyTextFieldDiffInternal", 913, "InputContextProxyV2.java")).t("clientDiff should not be null. It is @Nullable only because mergedCliendDiff is @Nullable, but it has been checked before");
            return;
        }
        mub mubVar = mrwVar.c;
        if (mubVar == null) {
            mubVar = mub.l;
        }
        this.A = mubVar.k;
        cbj cbjVar = this.b;
        boolean z2 = this.s;
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
        cbjVar.a(z2, mubVar3, str, str2, z, this.t.e);
        if (this.A && ((Boolean) cas.L.c()).booleanValue()) {
            this.a.hT(1, 1, 1);
        }
        if (j > 0 && ifnVar != null) {
            long uptimeMillis = SystemClock.uptimeMillis() - j;
            if (uptimeMillis > 0) {
                this.a.hO().g(idv.USER_ACTION_TO_TEXT_FIELD_UPDATED, uptimeMillis);
                ifnVar.d(uptimeMillis);
            }
        }
        if (this.q > 0) {
            this.a.hO().g(idv.USER_ACTION_TO_TEXT_FIELD_UPDATED_IGNORED, SystemClock.uptimeMillis() - this.q);
            this.q = 0L;
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
        this.k = length;
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
        this.l = i;
        mub mubVar8 = mrwVar.c;
        if (mubVar8 == null) {
            mubVar8 = mub.l;
        }
        this.s = !mubVar8.i.isEmpty();
    }

    private final void O(mrw mrwVar, long j) {
        if (j > 0) {
            int i = mrwVar.a;
            if ((i & 2) != 0 && this.q == 0) {
                this.q = j;
            }
            if ((i & 4) == 0 || this.r != 0) {
                return;
            }
            this.r = j;
        }
    }

    @Override // defpackage.cbg
    public final boolean A() {
        return this.i;
    }

    @Override // defpackage.cbg
    public final boolean B() {
        return this.t.l();
    }

    @Override // defpackage.cbg
    public final boolean C() {
        return this.s;
    }

    @Override // defpackage.cbg
    public final boolean D() {
        return this.k > 0 || this.l > 0;
    }

    @Override // defpackage.cbg
    public final boolean E() {
        return this.A;
    }

    @Override // defpackage.cbg
    public final boolean F() {
        return this.j;
    }

    @Override // defpackage.cbg
    public final boolean G() {
        return this.x;
    }

    @Override // defpackage.cbg
    public final boolean H() {
        return this.x;
    }

    @Override // defpackage.cbg
    public final void I() {
        this.t.m();
    }

    @Override // defpackage.cbg
    public final void J() {
        this.s = true;
    }

    final void K(mtn mtnVar) {
        if (!mtnVar.b.isEmpty() || !mtnVar.c.isEmpty()) {
            this.k = mtnVar.b.length();
            int length = mtnVar.c.length();
            this.l = length;
            this.a.f(this.k, length, String.valueOf(mtnVar.b).concat(String.valueOf(mtnVar.c)));
            this.A = true;
            return;
        }
        this.a.hW();
        this.k = 0;
        this.l = 0;
        this.A = false;
    }

    public final boolean L(mrw mrwVar, msf msfVar, msh mshVar, boolean z, long j, long j2, ifn ifnVar) {
        mty mtyVar;
        hlm hlmVar;
        int i;
        int B;
        int B2;
        int B3;
        mrw mrwVar2;
        synchronized (this) {
            boolean z2 = true;
            if (this.p > j) {
                ieh j3 = ieh.j();
                cap capVar = cap.ABANDON_CLIENT_DIFF_DUE_TO_STALE_CLIENT_REQUEST;
                Object[] objArr = new Object[6];
                objArr[0] = Integer.valueOf(msfVar.N);
                objArr[1] = Long.valueOf(this.p - j);
                objArr[2] = Integer.valueOf(mrwVar.b);
                objArr[3] = Boolean.valueOf((mrwVar.a & 2) != 0);
                if ((mrwVar.a & 4) == 0) {
                    z2 = false;
                }
                objArr[4] = Boolean.valueOf(z2);
                Long valueOf = Long.valueOf(j);
                objArr[5] = valueOf;
                j3.e(capVar, objArr);
                O(mrwVar, j2);
                ((ltd) ((ltd) f.d()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV2", "applyClientDiffInternal", 782, "InputContextProxyV2.java")).L("Ignore [%s] diff due to stale request: %d<%d, inputStateId=%s, lastInputStateId=%d", M(msfVar), valueOf, Long.valueOf(this.p), Integer.valueOf(mrwVar.b), Integer.valueOf(this.o));
                return false;
            }
            int i2 = this.o;
            int i3 = mrwVar.b;
            if (i2 < i3) {
                q(i3);
                if (msfVar == msf.OPERATION_DECODE_GESTURE_END) {
                    ((ltd) ((ltd) f.b()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV2", "applyClientDiffInternal", 819, "InputContextProxyV2.java")).J("applyClientDiffInternal(): hasTextFieldDiff=%s, hasKeyboardDiff=%s, hasSuggestionDiff=%s", Boolean.valueOf((mrwVar.a & 2) != 0), Boolean.valueOf((mrwVar.a & 8) != 0), Boolean.valueOf((mrwVar.a & 4) != 0));
                }
                if ((mrwVar.a & 2) != 0) {
                    if (z) {
                        this.B = cbt.b(this.B, mrwVar);
                    } else {
                        mrw mrwVar3 = this.B;
                        if (mrwVar3 != null) {
                            mrw b = cbt.b(mrwVar3, mrwVar);
                            this.B = b;
                            N(b, j2, ifnVar);
                            this.B = null;
                        } else {
                            N(mrwVar, j2, ifnVar);
                        }
                    }
                }
                if ((mrwVar.a & 2) == 0 && (mrwVar2 = this.B) != null) {
                    N(mrwVar2, j2, ifnVar);
                    this.B = null;
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
                    this.m = b2;
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
                    this.n = (mtdVar3 == null ? mtd.d : mtdVar3).b;
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
                    ccm ccmVar = this.t;
                    mty mtyVar2 = mrwVar.d;
                    if (mtyVar2 == null) {
                        mtyVar2 = mty.e;
                    }
                    mty c = ccmVar.c(mtyVar2, this.v);
                    if (c == null) {
                        mtyVar = mrwVar.d;
                        if (mtyVar == null) {
                            mtyVar = mty.e;
                        }
                    } else {
                        Object obj = ((boh) this.z).a;
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
                        int i4 = msgVar2.a | 2;
                        msgVar2.a = i4;
                        msgVar2.c = a;
                        msgVar2.b = this.m.d;
                        msgVar2.a = i4 | 1;
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
                            ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV2", "getSuggestionDiffWithOptionalOverride", 980, "InputContextProxyV2.java")).t("Failed to get override decoded candidates response");
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
                    this.t.j(mtyVar);
                    String str = mrwVar.f;
                    mub mubVar = mrwVar.c;
                    if (mubVar == null) {
                        mubVar = mub.l;
                    }
                    String str2 = mubVar.d;
                    if (true == TextUtils.isEmpty(str)) {
                        str = str2;
                    }
                    boolean hZ = this.a.hZ(ccm.a(this.t.e, str), false);
                    if ((mtyVar.a & 2) != 0) {
                        this.a.hO().e(cap.INLINE_SUGGESTION_PROPOSED, mtyVar, Boolean.valueOf(hZ));
                    }
                    ccm ccmVar2 = this.t;
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
                    if (this.u) {
                        this.a.T(this.t.e());
                        this.b.b(z());
                        if (j2 > 0 && ifnVar != null) {
                            long uptimeMillis = SystemClock.uptimeMillis() - j2;
                            this.a.hO().g(idv.USER_ACTION_TO_TEXT_CANDIDATES_UPDATED, uptimeMillis);
                            ifnVar.c(uptimeMillis);
                        }
                        if (this.r > 0) {
                            this.a.hO().g(idv.USER_ACTION_TO_TEXT_CANDIDATES_UPDATED_IGNORED, SystemClock.uptimeMillis() - this.r);
                            this.r = 0L;
                        }
                        if (mtyVar.c.size() != 0 && (((B = jco.B((i = mtyVar.b))) != 0 && B == 3) || (((B2 = jco.B(i)) != 0 && B2 == 4) || ((B3 = jco.B(i)) != 0 && B3 == 5)))) {
                            this.a.hO().e(cap.CANDIDATE_PROPOSED, mtyVar);
                        }
                    }
                }
                if (mshVar != null && mshVar.a) {
                    mtn b5 = this.g.b(b(), this.a.j(((Long) cas.A.c()).intValue()), "", "", true, ((Long) cas.A.c()).intValue());
                    int D = jco.D(b5.e);
                    if (D != 0 && D != 1) {
                        ltd ltdVar = (ltd) ((ltd) f.c()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV2", "extendBeforeCursor", 491, "InputContextProxyV2.java");
                        int D2 = jco.D(b5.e);
                        if (D2 == 0) {
                            D2 = 1;
                        }
                        ltdVar.y("extendBeforeCursor(): un-successful, parse_code: %d, input_state_id: %d", D2 - 1, b5.f);
                    }
                    int i5 = b5.e;
                    int D3 = jco.D(i5);
                    this.i = D3 != 0 && D3 == 3;
                    int D4 = jco.D(i5);
                    this.j = D4 == 0 || D4 == 1;
                    q(b5.f);
                    mtv b6 = mtv.b(b5.d);
                    if (b6 == null) {
                        b6 = mtv.SHIFT_NONE;
                    }
                    this.m = b6;
                    if (b5 != null) {
                        K(b5);
                    }
                }
                this.a.hO().e(cap.APPLY_CLIENT_DIFF_REQUEST, Long.valueOf(j));
                return true;
            }
            O(mrwVar, j2);
            ieh j4 = ieh.j();
            cap capVar2 = cap.ABANDON_CLIENT_DIFF_DUE_TO_STALE_INPUT_STATE;
            Object[] objArr2 = new Object[6];
            objArr2[0] = Integer.valueOf(msfVar.N);
            objArr2[1] = Integer.valueOf(this.o - mrwVar.b);
            objArr2[2] = Integer.valueOf(mrwVar.b);
            objArr2[3] = Boolean.valueOf((mrwVar.a & 2) != 0);
            if ((mrwVar.a & 4) == 0) {
                z2 = false;
            }
            objArr2[4] = Boolean.valueOf(z2);
            Long valueOf2 = Long.valueOf(j);
            objArr2[5] = valueOf2;
            j4.e(capVar2, objArr2);
            ((ltd) ((ltd) f.d()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV2", "applyClientDiffInternal", 803, "InputContextProxyV2.java")).L("Ignore [%s] diff due to stale input state: %d<%d, requestId=%s, lastServicedRequestId=%d", M(msfVar), Integer.valueOf(mrwVar.b), Integer.valueOf(this.o), valueOf2, Long.valueOf(this.p));
            return false;
        }
    }

    @Override // defpackage.cbg
    public final synchronized int a(long j) {
        if (this.p < j) {
            this.p = j;
        }
        return this.o;
    }

    @Override // defpackage.cbg
    public final long b() {
        return this.y.a();
    }

    @Override // defpackage.cbg
    public final synchronized long c() {
        return this.p;
    }

    @Override // defpackage.cbg
    public final xv d() {
        return xv.a(Integer.valueOf(this.k), Integer.valueOf(this.l));
    }

    @Override // defpackage.cbg
    public final hln e() {
        return this.t.b();
    }

    @Override // defpackage.cbg
    public final mtv f() {
        return this.m;
    }

    @Override // defpackage.cbg
    public final List g() {
        return this.n;
    }

    @Override // defpackage.cbg
    public final List h(int i) {
        return this.t.d(i);
    }

    @Override // defpackage.cbg
    public final void i(final mrw mrwVar, final msf msfVar, final msh mshVar, final boolean z, final long j, final long j2, final ifn ifnVar) {
        if (mrwVar == null) {
            ((ltd) ((ltd) f.d()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV2", "applyClientDiff", 627, "InputContextProxyV2.java")).w("Ignore null [%s] diff", M(msfVar));
        } else if (!hjg.r()) {
            this.h.hP(new Runnable() { // from class: cbn
                @Override // java.lang.Runnable
                public final void run() {
                    cbo cboVar = cbo.this;
                    mrw mrwVar2 = mrwVar;
                    msf msfVar2 = msfVar;
                    boolean L = cboVar.L(mrwVar2, msfVar2, mshVar, z, j, j2, ifnVar);
                    if (msfVar2 == msf.OPERATION_DECODE_GESTURE_END) {
                        if (cboVar.c >= 0) {
                            idk hO = cboVar.a.hO();
                            cap capVar = cap.WAIT_FOR_DECODE_GESTURE;
                            Object[] objArr = new Object[2];
                            objArr[0] = Boolean.valueOf(cboVar.c >= cboVar.e);
                            objArr[1] = Boolean.valueOf(L);
                            hO.e(capVar, objArr);
                        }
                        cboVar.c = -1L;
                    } else if (msfVar2 != msf.OPERATION_FETCH_SUGGESTIONS) {
                    } else {
                        if (cboVar.d >= 0) {
                            idk hO2 = cboVar.a.hO();
                            cap capVar2 = cap.WAIT_FOR_FETCH_SUGGESTIONS;
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = Boolean.valueOf(cboVar.d >= cboVar.e);
                            objArr2[1] = Boolean.valueOf(L);
                            hO2.e(capVar2, objArr2);
                        }
                        cboVar.d = -1L;
                    }
                }
            });
            if (msfVar == msf.OPERATION_DECODE_GESTURE_END) {
                this.w = false;
            } else if (msfVar != msf.OPERATION_FETCH_SUGGESTIONS) {
            } else {
                this.x = false;
            }
        } else {
            L(mrwVar, msfVar, mshVar, z, j, j2, ifnVar);
        }
    }

    @Override // defpackage.cbg
    public final void k() {
        this.t.f();
        this.t.h();
    }

    @Override // defpackage.cbg
    public final void l() {
        if (hjg.r()) {
            this.b.c();
        } else {
            this.h.hP(new bqj(this, 20));
        }
    }

    @Override // defpackage.cbg
    public final void m(long j, boolean z, hqk hqkVar, boolean z2) {
        mtn b = this.g.b(j, hqkVar.d(), hqkVar.b(), hqkVar.c(), z, ((Long) cas.A.c()).intValue());
        int D = jco.D(b.e);
        boolean z3 = true;
        if (D != 0 && D != 1) {
            ltd ltdVar = (ltd) ((ltd) f.c()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV2", "reset", 355, "InputContextProxyV2.java");
            int D2 = jco.D(b.e);
            if (D2 == 0) {
                D2 = 1;
            }
            ltdVar.y("reset(): un-successful, parse_code: %s, input_state_id %d", D2 - 1, b.f);
        }
        q(b.f);
        int i = b.e;
        int D3 = jco.D(i);
        this.i = D3 != 0 && D3 == 3;
        int D4 = jco.D(i);
        if (D4 != 0 && D4 != 1) {
            z3 = false;
        }
        this.j = z3;
        this.s = hqkVar.e();
        mtv b2 = mtv.b(b.d);
        if (b2 == null) {
            b2 = mtv.SHIFT_NONE;
        }
        this.m = b2;
        if (z2) {
            if (hqkVar.e()) {
                this.a.hY(false);
            }
            K(b);
        }
        if (this.q > 0) {
            this.a.hO().g(idv.USER_ACTION_TO_TEXT_FIELD_UPDATED_IGNORED_RESET, SystemClock.uptimeMillis() - this.q);
        }
        if (this.r > 0) {
            this.a.hO().g(idv.USER_ACTION_TO_TEXT_CANDIDATES_UPDATED_IGNORED_RESET, SystemClock.uptimeMillis() - this.r);
        }
        this.q = 0L;
        this.r = 0L;
    }

    @Override // defpackage.cbg
    public final void n() {
        this.t.g();
    }

    @Override // defpackage.cbg
    public final void o(long j, mrq mrqVar) {
        synchronized (this) {
            mrw mrwVar = mrqVar.b;
            if (mrwVar == null) {
                mrwVar = mrw.h;
            }
            this.o = mrwVar.b;
            if (this.p < j) {
                this.p = j;
            }
        }
        this.i = false;
        this.s = false;
        this.k = 0;
        this.l = 0;
    }

    @Override // defpackage.cbg
    public final void p(boolean z) {
        this.t.d = z;
    }

    @Override // defpackage.cbg
    public final synchronized void q(int i) {
        this.o = i;
    }

    @Override // defpackage.cbg
    public final void r(mtv mtvVar) {
        this.m = mtvVar;
    }

    @Override // defpackage.cbg
    public final void s(boolean z) {
        this.u = z;
    }

    @Override // defpackage.cbg
    public final void t(boolean z, boolean z2, boolean z3) {
        this.v = cbt.a(z, z2, z3);
    }

    @Override // defpackage.cbg
    public final void u(boolean z) {
        this.w = z;
    }

    @Override // defpackage.cbg
    public final void v(boolean z) {
        this.x = true;
    }

    @Override // defpackage.cbg
    public final void w(mro mroVar) {
        if (mroVar.b.size() > 0) {
            this.b.h(((muv) mroVar.b.get(0)).h);
        }
    }

    @Override // defpackage.cbg
    public final void x() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (this.w && SystemClock.elapsedRealtime() - elapsedRealtime < this.e) {
        }
        this.c = SystemClock.elapsedRealtime() - elapsedRealtime;
        this.w = false;
    }

    @Override // defpackage.cbg
    public final void y() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (this.x && SystemClock.elapsedRealtime() - elapsedRealtime < this.e) {
        }
        this.d = SystemClock.elapsedRealtime() - elapsedRealtime;
        this.x = false;
    }

    @Override // defpackage.cbg
    public final boolean z() {
        return this.t.k();
    }

    @Override // defpackage.cbg
    public final void j(mtq mtqVar, msf msfVar) {
        synchronized (this) {
            int i = this.o;
            int i2 = mtqVar.b;
            if (i < i2) {
                q(i2);
                this.b.e(mtqVar.c, mtqVar.d);
                this.s = true;
                return;
            }
            ((ltd) ((ltd) f.d()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxyV2", "applyRecapitalizeSelection", 1092, "InputContextProxyV2.java")).J("Ignore stale [%s] diff id:%d<=%d", M(msfVar), Integer.valueOf(mtqVar.b), Integer.valueOf(this.o));
        }
    }
}

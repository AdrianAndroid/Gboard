package defpackage;

import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cbm  reason: default package */
/* loaded from: classes.dex */
public final class cbm implements cbg {
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/delight5/InputContextProxy");
    private final lgb A;
    private boolean B;
    public final hls a;
    public final cbj b;
    cbl c;
    private final cbi g;
    private final mks h;
    private List n;
    private volatile long q;
    private volatile long r;
    private final ccm t;
    private final cbf z;
    private mko w = mkk.a;
    private final AtomicBoolean x = new AtomicBoolean(false);
    private final AtomicBoolean y = new AtomicBoolean(false);
    public boolean d = false;
    public boolean e = false;
    private mrw C = null;
    private boolean u = true;
    private lmz v = lrr.a;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final AtomicInteger k = new AtomicInteger(0);
    private final AtomicInteger l = new AtomicInteger(0);
    private final AtomicReference m = new AtomicReference(mtv.SHIFT_NONE);
    private final AtomicBoolean j = new AtomicBoolean(false);
    private final AtomicBoolean s = new AtomicBoolean(false);
    private final AtomicInteger o = new AtomicInteger(-1);
    private final AtomicLong p = new AtomicLong(-1);

    public cbm(hls hlsVar, cbi cbiVar, mks mksVar, cbf cbfVar, ccm ccmVar, lgb lgbVar) {
        this.a = hlsVar;
        this.g = cbiVar;
        this.t = ccmVar;
        this.b = new cbj(hlsVar);
        this.h = mksVar;
        this.z = cbfVar;
        this.A = lgbVar;
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
            ((ltd) ((ltd) f.c()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxy", "applyTextFieldDiffInternal", 1050, "InputContextProxy.java")).t("clientDiff should not be null. It is @Nullable only because mergedCliendDiff is @Nullable, but it has been checked before");
            return;
        }
        mub mubVar = mrwVar.c;
        if (mubVar == null) {
            mubVar = mub.l;
        }
        this.B = mubVar.k;
        cbj cbjVar = this.b;
        boolean z2 = this.s.get();
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
        if (this.B && ((Boolean) cas.L.c()).booleanValue()) {
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
        AtomicInteger atomicInteger = this.k;
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
        atomicInteger.set(length);
        AtomicInteger atomicInteger2 = this.l;
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
        atomicInteger2.set(i);
        AtomicBoolean atomicBoolean = this.s;
        mub mubVar8 = mrwVar.c;
        if (mubVar8 == null) {
            mubVar8 = mub.l;
        }
        atomicBoolean.set(!mubVar8.i.isEmpty());
    }

    private final void O(mrw mrwVar, long j) {
        if (j > 0) {
            if ((mrwVar.a & 2) != 0 && this.q == 0) {
                this.q = j;
            }
            if ((mrwVar.a & 4) == 0 || this.r != 0) {
                return;
            }
            this.r = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0153 A[Catch: all -> 0x01c3, TryCatch #0 {, blocks: (B:9:0x0043, B:11:0x0052, B:13:0x0058, B:15:0x0066, B:21:0x014b, B:23:0x0153, B:24:0x0158, B:26:0x017f, B:27:0x019c, B:29:0x01a4, B:30:0x01c1, B:33:0x0156, B:34:0x00bc, B:37:0x00c7, B:39:0x00cd, B:43:0x00d3, B:61:0x00de, B:44:0x00e1, B:46:0x00e5, B:48:0x00eb, B:50:0x00f9, B:54:0x011c, B:56:0x0122, B:53:0x0144, B:63:0x0089, B:65:0x008f), top: B:8:0x0043, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017f A[Catch: all -> 0x01c3, TryCatch #0 {, blocks: (B:9:0x0043, B:11:0x0052, B:13:0x0058, B:15:0x0066, B:21:0x014b, B:23:0x0153, B:24:0x0158, B:26:0x017f, B:27:0x019c, B:29:0x01a4, B:30:0x01c1, B:33:0x0156, B:34:0x00bc, B:37:0x00c7, B:39:0x00cd, B:43:0x00d3, B:61:0x00de, B:44:0x00e1, B:46:0x00e5, B:48:0x00eb, B:50:0x00f9, B:54:0x011c, B:56:0x0122, B:53:0x0144, B:63:0x0089, B:65:0x008f), top: B:8:0x0043, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a4 A[Catch: all -> 0x01c3, TryCatch #0 {, blocks: (B:9:0x0043, B:11:0x0052, B:13:0x0058, B:15:0x0066, B:21:0x014b, B:23:0x0153, B:24:0x0158, B:26:0x017f, B:27:0x019c, B:29:0x01a4, B:30:0x01c1, B:33:0x0156, B:34:0x00bc, B:37:0x00c7, B:39:0x00cd, B:43:0x00d3, B:61:0x00de, B:44:0x00e1, B:46:0x00e5, B:48:0x00eb, B:50:0x00f9, B:54:0x011c, B:56:0x0122, B:53:0x0144, B:63:0x0089, B:65:0x008f), top: B:8:0x0043, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0156 A[Catch: all -> 0x01c3, TryCatch #0 {, blocks: (B:9:0x0043, B:11:0x0052, B:13:0x0058, B:15:0x0066, B:21:0x014b, B:23:0x0153, B:24:0x0158, B:26:0x017f, B:27:0x019c, B:29:0x01a4, B:30:0x01c1, B:33:0x0156, B:34:0x00bc, B:37:0x00c7, B:39:0x00cd, B:43:0x00d3, B:61:0x00de, B:44:0x00e1, B:46:0x00e5, B:48:0x00eb, B:50:0x00f9, B:54:0x011c, B:56:0x0122, B:53:0x0144, B:63:0x0089, B:65:0x008f), top: B:8:0x0043, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9 A[Catch: all -> 0x01c3, TryCatch #0 {, blocks: (B:9:0x0043, B:11:0x0052, B:13:0x0058, B:15:0x0066, B:21:0x014b, B:23:0x0153, B:24:0x0158, B:26:0x017f, B:27:0x019c, B:29:0x01a4, B:30:0x01c1, B:33:0x0156, B:34:0x00bc, B:37:0x00c7, B:39:0x00cd, B:43:0x00d3, B:61:0x00de, B:44:0x00e1, B:46:0x00e5, B:48:0x00eb, B:50:0x00f9, B:54:0x011c, B:56:0x0122, B:53:0x0144, B:63:0x0089, B:65:0x008f), top: B:8:0x0043, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c A[Catch: all -> 0x01c3, TryCatch #0 {, blocks: (B:9:0x0043, B:11:0x0052, B:13:0x0058, B:15:0x0066, B:21:0x014b, B:23:0x0153, B:24:0x0158, B:26:0x017f, B:27:0x019c, B:29:0x01a4, B:30:0x01c1, B:33:0x0156, B:34:0x00bc, B:37:0x00c7, B:39:0x00cd, B:43:0x00d3, B:61:0x00de, B:44:0x00e1, B:46:0x00e5, B:48:0x00eb, B:50:0x00f9, B:54:0x011c, B:56:0x0122, B:53:0x0144, B:63:0x0089, B:65:0x008f), top: B:8:0x0043, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void P(boolean r18) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbm.P(boolean):void");
    }

    @Override // defpackage.cbg
    public final boolean A() {
        return this.i.get();
    }

    @Override // defpackage.cbg
    public final boolean B() {
        return this.t.l();
    }

    @Override // defpackage.cbg
    public final boolean C() {
        return this.s.get();
    }

    @Override // defpackage.cbg
    public final boolean D() {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (cbk.a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            z = true;
            cbk.c(elapsedRealtime2, true);
            if (this.k.get() <= 0 && this.l.get() <= 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.cbg
    public final boolean E() {
        return this.B;
    }

    @Override // defpackage.cbg
    public final boolean F() {
        return this.j.get();
    }

    @Override // defpackage.cbg
    public final boolean G() {
        return this.x.get();
    }

    @Override // defpackage.cbg
    public final boolean H() {
        return this.y.get();
    }

    @Override // defpackage.cbg
    public final void I() {
        this.t.m();
    }

    @Override // defpackage.cbg
    public final void J() {
        synchronized (cbk.a) {
            this.s.set(true);
        }
    }

    final void K(mtn mtnVar) {
        if (!mtnVar.b.isEmpty() || !mtnVar.c.isEmpty()) {
            this.k.set(mtnVar.b.length());
            this.l.set(mtnVar.c.length());
            this.a.f(this.k.get(), this.l.get(), String.valueOf(mtnVar.b).concat(String.valueOf(mtnVar.c)));
            this.B = true;
            return;
        }
        this.a.hW();
        this.k.set(0);
        this.l.set(0);
        this.B = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x043f, code lost:
        if (r0 == 5) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0441, code lost:
        r23.a.hO().e(defpackage.cap.CANDIDATE_PROPOSED, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0436, code lost:
        if (r4 != 4) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x042c, code lost:
        if (r4 != 3) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03d0 A[Catch: all -> 0x050d, TryCatch #0 {, blocks: (B:4:0x0013, B:6:0x002f, B:9:0x005a, B:12:0x006c, B:13:0x00ba, B:18:0x00bc, B:20:0x00c3, B:23:0x00f4, B:26:0x0103, B:27:0x014e, B:31:0x0151, B:33:0x0158, B:36:0x0179, B:39:0x0186, B:42:0x0193, B:46:0x019a, B:49:0x01a3, B:50:0x01ac, B:52:0x01b0, B:53:0x01bc, B:54:0x01bf, B:57:0x01cf, B:59:0x01d5, B:61:0x01d9, B:62:0x01db, B:64:0x01e3, B:65:0x01e5, B:67:0x01ee, B:68:0x01f0, B:70:0x01f8, B:71:0x01fa, B:73:0x0201, B:74:0x0205, B:76:0x020d, B:77:0x020f, B:79:0x021a, B:80:0x021c, B:82:0x0221, B:84:0x0227, B:86:0x022d, B:87:0x022f, B:89:0x0237, B:91:0x023b, B:92:0x035b, B:94:0x0366, B:95:0x0368, B:98:0x0372, B:100:0x0387, B:101:0x039d, B:103:0x03a3, B:104:0x03a5, B:107:0x03b4, B:109:0x03bc, B:111:0x03c4, B:112:0x03c9, B:114:0x03d0, B:117:0x03ec, B:118:0x03ff, B:120:0x0405, B:121:0x0419, B:124:0x0422, B:127:0x042e, B:130:0x0438, B:134:0x0441, B:139:0x03c7, B:142:0x03b1, B:144:0x023f, B:146:0x025b, B:147:0x0261, B:149:0x0277, B:150:0x027d, B:152:0x0291, B:153:0x0297, B:155:0x02b8, B:156:0x02be, B:158:0x02d4, B:159:0x02da, B:161:0x02f3, B:163:0x02f7, B:164:0x02f9, B:166:0x02fd, B:167:0x0303, B:168:0x0312, B:170:0x031e, B:171:0x0322, B:174:0x032a, B:175:0x032c, B:177:0x0335, B:178:0x0337, B:180:0x033b, B:181:0x033e, B:184:0x0453, B:186:0x0457, B:189:0x04b8, B:192:0x04c8, B:196:0x04db, B:198:0x04ed, B:199:0x04ef, B:201:0x04f4, B:208:0x0490, B:211:0x04b1, B:212:0x04f7, B:215:0x01c6, B:217:0x01ca), top: B:3:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04ed A[Catch: all -> 0x050d, TryCatch #0 {, blocks: (B:4:0x0013, B:6:0x002f, B:9:0x005a, B:12:0x006c, B:13:0x00ba, B:18:0x00bc, B:20:0x00c3, B:23:0x00f4, B:26:0x0103, B:27:0x014e, B:31:0x0151, B:33:0x0158, B:36:0x0179, B:39:0x0186, B:42:0x0193, B:46:0x019a, B:49:0x01a3, B:50:0x01ac, B:52:0x01b0, B:53:0x01bc, B:54:0x01bf, B:57:0x01cf, B:59:0x01d5, B:61:0x01d9, B:62:0x01db, B:64:0x01e3, B:65:0x01e5, B:67:0x01ee, B:68:0x01f0, B:70:0x01f8, B:71:0x01fa, B:73:0x0201, B:74:0x0205, B:76:0x020d, B:77:0x020f, B:79:0x021a, B:80:0x021c, B:82:0x0221, B:84:0x0227, B:86:0x022d, B:87:0x022f, B:89:0x0237, B:91:0x023b, B:92:0x035b, B:94:0x0366, B:95:0x0368, B:98:0x0372, B:100:0x0387, B:101:0x039d, B:103:0x03a3, B:104:0x03a5, B:107:0x03b4, B:109:0x03bc, B:111:0x03c4, B:112:0x03c9, B:114:0x03d0, B:117:0x03ec, B:118:0x03ff, B:120:0x0405, B:121:0x0419, B:124:0x0422, B:127:0x042e, B:130:0x0438, B:134:0x0441, B:139:0x03c7, B:142:0x03b1, B:144:0x023f, B:146:0x025b, B:147:0x0261, B:149:0x0277, B:150:0x027d, B:152:0x0291, B:153:0x0297, B:155:0x02b8, B:156:0x02be, B:158:0x02d4, B:159:0x02da, B:161:0x02f3, B:163:0x02f7, B:164:0x02f9, B:166:0x02fd, B:167:0x0303, B:168:0x0312, B:170:0x031e, B:171:0x0322, B:174:0x032a, B:175:0x032c, B:177:0x0335, B:178:0x0337, B:180:0x033b, B:181:0x033e, B:184:0x0453, B:186:0x0457, B:189:0x04b8, B:192:0x04c8, B:196:0x04db, B:198:0x04ed, B:199:0x04ef, B:201:0x04f4, B:208:0x0490, B:211:0x04b1, B:212:0x04f7, B:215:0x01c6, B:217:0x01ca), top: B:3:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04f4 A[Catch: all -> 0x050d, TryCatch #0 {, blocks: (B:4:0x0013, B:6:0x002f, B:9:0x005a, B:12:0x006c, B:13:0x00ba, B:18:0x00bc, B:20:0x00c3, B:23:0x00f4, B:26:0x0103, B:27:0x014e, B:31:0x0151, B:33:0x0158, B:36:0x0179, B:39:0x0186, B:42:0x0193, B:46:0x019a, B:49:0x01a3, B:50:0x01ac, B:52:0x01b0, B:53:0x01bc, B:54:0x01bf, B:57:0x01cf, B:59:0x01d5, B:61:0x01d9, B:62:0x01db, B:64:0x01e3, B:65:0x01e5, B:67:0x01ee, B:68:0x01f0, B:70:0x01f8, B:71:0x01fa, B:73:0x0201, B:74:0x0205, B:76:0x020d, B:77:0x020f, B:79:0x021a, B:80:0x021c, B:82:0x0221, B:84:0x0227, B:86:0x022d, B:87:0x022f, B:89:0x0237, B:91:0x023b, B:92:0x035b, B:94:0x0366, B:95:0x0368, B:98:0x0372, B:100:0x0387, B:101:0x039d, B:103:0x03a3, B:104:0x03a5, B:107:0x03b4, B:109:0x03bc, B:111:0x03c4, B:112:0x03c9, B:114:0x03d0, B:117:0x03ec, B:118:0x03ff, B:120:0x0405, B:121:0x0419, B:124:0x0422, B:127:0x042e, B:130:0x0438, B:134:0x0441, B:139:0x03c7, B:142:0x03b1, B:144:0x023f, B:146:0x025b, B:147:0x0261, B:149:0x0277, B:150:0x027d, B:152:0x0291, B:153:0x0297, B:155:0x02b8, B:156:0x02be, B:158:0x02d4, B:159:0x02da, B:161:0x02f3, B:163:0x02f7, B:164:0x02f9, B:166:0x02fd, B:167:0x0303, B:168:0x0312, B:170:0x031e, B:171:0x0322, B:174:0x032a, B:175:0x032c, B:177:0x0335, B:178:0x0337, B:180:0x033b, B:181:0x033e, B:184:0x0453, B:186:0x0457, B:189:0x04b8, B:192:0x04c8, B:196:0x04db, B:198:0x04ed, B:199:0x04ef, B:201:0x04f4, B:208:0x0490, B:211:0x04b1, B:212:0x04f7, B:215:0x01c6, B:217:0x01ca), top: B:3:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L(defpackage.mrw r24, defpackage.msf r25, defpackage.msh r26, boolean r27, long r28, long r30, defpackage.ifn r32) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbm.L(mrw, msf, msh, boolean, long, long, ifn):boolean");
    }

    @Override // defpackage.cbg
    public final int a(long j) {
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (cbk.a) {
            cbk.c(SystemClock.elapsedRealtime() - elapsedRealtime, false);
            if (this.p.get() < j) {
                this.p.set(j);
            }
            i = this.o.get();
        }
        return i;
    }

    @Override // defpackage.cbg
    public final long b() {
        return this.z.a();
    }

    @Override // defpackage.cbg
    public final long c() {
        long j;
        synchronized (cbk.a) {
            j = this.p.get();
        }
        return j;
    }

    @Override // defpackage.cbg
    public final xv d() {
        xv a;
        synchronized (cbk.a) {
            a = xv.a(Integer.valueOf(this.k.get()), Integer.valueOf(this.l.get()));
        }
        return a;
    }

    @Override // defpackage.cbg
    public final hln e() {
        return this.t.b();
    }

    @Override // defpackage.cbg
    public final mtv f() {
        return (mtv) this.m.get();
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
    public final void i(mrw mrwVar, msf msfVar, msh mshVar, boolean z, long j, long j2, ifn ifnVar) {
        if (mrwVar == null) {
            ((ltd) ((ltd) f.d()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxy", "applyClientDiff", 676, "InputContextProxy.java")).w("Ignore null [%s] diff", M(msfVar));
        } else if (!hjg.r()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (cbk.a) {
                cbk.c(SystemClock.elapsedRealtime() - elapsedRealtime, false);
                cbl cblVar = new cbl(this, mrwVar, msfVar, mshVar, z, j, j2, ifnVar);
                this.c = cblVar;
                this.w = this.h.hP(cblVar);
                if (msfVar == msf.OPERATION_DECODE_GESTURE_END || msfVar == msf.OPERATION_FETCH_SUGGESTIONS) {
                    cbk.a.notifyAll();
                }
            }
        } else {
            L(mrwVar, msfVar, mshVar, z, j, j2, ifnVar);
        }
    }

    @Override // defpackage.cbg
    public final void j(mtq mtqVar, msf msfVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (cbk.a) {
            cbk.c(SystemClock.elapsedRealtime() - elapsedRealtime, true);
            int i = this.o.get();
            int i2 = mtqVar.b;
            if (i < i2) {
                q(i2);
                this.b.e(mtqVar.c, mtqVar.d);
                this.s.set(true);
                return;
            }
            ((ltd) ((ltd) f.d()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxy", "applyRecapitalizeSelection", 1231, "InputContextProxy.java")).J("Ignore stale [%s] diff id:%d<=%d", M(msfVar), Integer.valueOf(mtqVar.b), Integer.valueOf(this.o.get()));
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
            return;
        }
        synchronized (cbk.a) {
            this.w = this.h.hP(new bqj(this, 19));
        }
    }

    @Override // defpackage.cbg
    public final void m(long j, boolean z, hqk hqkVar, boolean z2) {
        mtn b = this.g.b(j, hqkVar.d(), hqkVar.b(), hqkVar.c(), z, ((Long) cas.A.c()).intValue());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (cbk.a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            boolean z3 = true;
            cbk.c(elapsedRealtime2, true);
            int D = jco.D(b.e);
            if (D != 0 && D != 1) {
                ltd ltdVar = (ltd) ((ltd) f.c()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextProxy", "reset", 378, "InputContextProxy.java");
                int D2 = jco.D(b.e);
                if (D2 == 0) {
                    D2 = 1;
                }
                ltdVar.y("reset(): un-successful, parse_code: %s, input_state_id %d", D2 - 1, b.f);
            }
            AtomicBoolean atomicBoolean = this.i;
            int D3 = jco.D(b.e);
            atomicBoolean.set(D3 != 0 && D3 == 3);
            AtomicBoolean atomicBoolean2 = this.j;
            int D4 = jco.D(b.e);
            if (D4 != 0 && D4 != 1) {
                z3 = false;
            }
            atomicBoolean2.set(z3);
            this.o.set(b.f);
            this.s.set(hqkVar.e());
            mtv b2 = mtv.b(b.d);
            if (b2 == null) {
                b2 = mtv.SHIFT_NONE;
            }
            r(b2);
            if (z2) {
                if (hqkVar.e()) {
                    this.a.hY(false);
                }
                K(b);
            }
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
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (cbk.a) {
            cbk.c(SystemClock.elapsedRealtime() - elapsedRealtime, true);
            this.i.set(false);
            AtomicInteger atomicInteger = this.o;
            mrw mrwVar = mrqVar.b;
            if (mrwVar == null) {
                mrwVar = mrw.h;
            }
            atomicInteger.set(mrwVar.b);
            if (this.p.get() < j) {
                this.p.set(j);
            }
            this.s.set(false);
            this.k.set(0);
            this.l.set(0);
        }
    }

    @Override // defpackage.cbg
    public final void p(boolean z) {
        this.t.d = z;
    }

    @Override // defpackage.cbg
    public final void q(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (cbk.a) {
            cbk.c(SystemClock.elapsedRealtime() - elapsedRealtime, false);
            this.o.set(i);
        }
    }

    @Override // defpackage.cbg
    public final void r(mtv mtvVar) {
        this.m.set(mtvVar);
    }

    @Override // defpackage.cbg
    public final void s(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (cbk.a) {
            cbk.c(SystemClock.elapsedRealtime() - elapsedRealtime, true);
            this.u = z;
        }
    }

    @Override // defpackage.cbg
    public final void t(boolean z, boolean z2, boolean z3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (cbk.a) {
            cbk.c(SystemClock.elapsedRealtime() - elapsedRealtime, true);
            this.v = cbt.a(z, z2, z3);
        }
    }

    @Override // defpackage.cbg
    public final void u(boolean z) {
        this.x.set(z);
    }

    @Override // defpackage.cbg
    public final void v(boolean z) {
        this.y.set(z);
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
        return this.t.k();
    }
}

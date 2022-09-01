package defpackage;

import j$.util.Objects;
import j$.util.function.Function;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: byw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class byw implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ byw u = new byw(20);
    public static final /* synthetic */ byw t = new byw(19);
    public static final /* synthetic */ byw s = new byw(18);
    public static final /* synthetic */ byw r = new byw(17);
    public static final /* synthetic */ byw q = new byw(16);
    public static final /* synthetic */ byw p = new byw(15);
    public static final /* synthetic */ byw o = new byw(14);
    public static final /* synthetic */ byw n = new byw(13);
    public static final /* synthetic */ byw m = new byw(12);
    public static final /* synthetic */ byw l = new byw(11);
    public static final /* synthetic */ byw k = new byw(10);
    public static final /* synthetic */ byw j = new byw(9);
    public static final /* synthetic */ byw i = new byw(8);
    public static final /* synthetic */ byw h = new byw(7);
    public static final /* synthetic */ byw g = new byw(6);
    public static final /* synthetic */ byw f = new byw(5);
    public static final /* synthetic */ byw e = new byw(4);
    public static final /* synthetic */ byw d = new byw(3);
    public static final /* synthetic */ byw c = new byw(2);
    public static final /* synthetic */ byw b = new byw(1);
    public static final /* synthetic */ byw a = new byw(0);

    private /* synthetic */ byw(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo40andThen(Function function) {
        switch (this.v) {
            case 0:
                return Objects.requireNonNull(function);
            case 1:
                return Objects.requireNonNull(function);
            case 2:
                return Objects.requireNonNull(function);
            case 3:
                return Objects.requireNonNull(function);
            case 4:
                return Objects.requireNonNull(function);
            case 5:
                return Objects.requireNonNull(function);
            case 6:
                return Objects.requireNonNull(function);
            case 7:
                return Objects.requireNonNull(function);
            case 8:
                return Objects.requireNonNull(function);
            case 9:
                return Objects.requireNonNull(function);
            case 10:
                return Objects.requireNonNull(function);
            case 11:
                return Objects.requireNonNull(function);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Objects.requireNonNull(function);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Objects.requireNonNull(function);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Objects.requireNonNull(function);
            case 15:
                return Objects.requireNonNull(function);
            case 16:
                return Objects.requireNonNull(function);
            case 17:
                return Objects.requireNonNull(function);
            case 18:
                return Objects.requireNonNull(function);
            case 19:
                return Objects.requireNonNull(function);
            default:
                return Objects.requireNonNull(function);
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.v) {
            case 0:
                return Objects.requireNonNull(function);
            case 1:
                return Objects.requireNonNull(function);
            case 2:
                return Objects.requireNonNull(function);
            case 3:
                return Objects.requireNonNull(function);
            case 4:
                return Objects.requireNonNull(function);
            case 5:
                return Objects.requireNonNull(function);
            case 6:
                return Objects.requireNonNull(function);
            case 7:
                return Objects.requireNonNull(function);
            case 8:
                return Objects.requireNonNull(function);
            case 9:
                return Objects.requireNonNull(function);
            case 10:
                return Objects.requireNonNull(function);
            case 11:
                return Objects.requireNonNull(function);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Objects.requireNonNull(function);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Objects.requireNonNull(function);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Objects.requireNonNull(function);
            case 15:
                return Objects.requireNonNull(function);
            case 16:
                return Objects.requireNonNull(function);
            case 17:
                return Objects.requireNonNull(function);
            case 18:
                return Objects.requireNonNull(function);
            case 19:
                return Objects.requireNonNull(function);
            default:
                return Objects.requireNonNull(function);
        }
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        cmf cmfVar;
        switch (this.v) {
            case 0:
                byy byyVar = byy.a;
                return ((byz) obj).a();
            case 1:
                return Boolean.valueOf(((dxs) obj).a());
            case 2:
                String str = (String) obj;
                return new HashMap();
            case 3:
                String str2 = (String) obj;
                return new HashMap();
            case 4:
                return new cdc();
            case 5:
                String str3 = (String) obj;
                return new HashMap();
            case 6:
                return jav.f((String) obj);
            case 7:
                return ((jav) obj).q();
            case 8:
                return ((cjo) obj).d().d();
            case 9:
                return (cjo) ((lfb) obj).a();
            case 10:
                return (cjo) ((lfb) obj).a();
            case 11:
                return ((cjo) obj).d().d();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((cjo) obj).d().d();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return (cjo) ((lfb) obj).a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i2 = cjy.b;
                return ((cjo) obj).d().d();
            case 15:
                return (cjo) ((lfb) obj).a();
            case 16:
                return ((cqp) obj).d();
            case 17:
                String str4 = (String) obj;
                try {
                    cmfVar = cmf.b(Integer.parseInt(str4));
                } catch (NumberFormatException e2) {
                    ((ltd) ((ltd) ((ltd) cna.a.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifySuggestionManager", "getPatternFromString", 232, "EmojifySuggestionManager.java")).w("Invalid pattern id: %s", str4);
                    cmfVar = null;
                }
                return cmfVar == null ? cmf.UNKNOWN : cmfVar;
            case 18:
                return ((cuq) obj).a;
            case 19:
                return (ggi) ((Map.Entry) obj).getKey();
            default:
                mwc mwcVar = (mwc) obj;
                nfh t2 = fin.e.t();
                String str5 = mwcVar.c;
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                fin finVar = (fin) t2.b;
                str5.getClass();
                finVar.a = str5;
                finVar.b = mwcVar.d;
                if ((mwcVar.a & 1) != 0) {
                    nfh t3 = fim.c.t();
                    mwa mwaVar = mwcVar.b;
                    if (mwaVar == null) {
                        mwaVar = mwa.c;
                    }
                    String str6 = mwaVar.a;
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    fim fimVar = (fim) t3.b;
                    str6.getClass();
                    fimVar.a = str6;
                    mwa mwaVar2 = mwcVar.b;
                    if (mwaVar2 == null) {
                        mwaVar2 = mwa.c;
                    }
                    String str7 = mwaVar2.b;
                    str7.getClass();
                    fimVar.b = str7;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    fim fimVar2 = (fim) t3.cz();
                    fimVar2.getClass();
                    ((fin) t2.b).d = fimVar2;
                }
                mrs b2 = mrs.b(mwcVar.e);
                if (b2 == null) {
                    b2 = mrs.CANDIDATE_SOURCE_UNKNOWN;
                }
                if (b2 != mrs.EXPRESSION_TRANSFORMER_CONCEPT_MODEL) {
                    mrs b3 = mrs.b(mwcVar.e);
                    if (b3 == null) {
                        b3 = mrs.CANDIDATE_SOURCE_UNKNOWN;
                    }
                    if (b3 != mrs.TRANSFORMER_EXPRESSION_PRED) {
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        ((fin) t2.b).c = fgy.d(4);
                        return (fin) t2.cz();
                    }
                }
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                ((fin) t2.b).c = fgy.d(3);
                return (fin) t2.cz();
        }
    }
}

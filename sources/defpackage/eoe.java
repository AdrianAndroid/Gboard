package defpackage;

import j$.util.Objects;
import j$.util.function.Function;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: eoe  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eoe implements Function {
    private final /* synthetic */ int q;
    public static final /* synthetic */ eoe p = new eoe(15);
    public static final /* synthetic */ eoe o = new eoe(14);
    public static final /* synthetic */ eoe n = new eoe(13);
    public static final /* synthetic */ eoe m = new eoe(12);
    public static final /* synthetic */ eoe l = new eoe(11);
    public static final /* synthetic */ eoe k = new eoe(10);
    public static final /* synthetic */ eoe j = new eoe(9);
    public static final /* synthetic */ eoe i = new eoe(8);
    public static final /* synthetic */ eoe h = new eoe(7);
    public static final /* synthetic */ eoe g = new eoe(6);
    public static final /* synthetic */ eoe f = new eoe(5);
    public static final /* synthetic */ eoe e = new eoe(4);
    public static final /* synthetic */ eoe d = new eoe(3);
    public static final /* synthetic */ eoe c = new eoe(2);
    public static final /* synthetic */ eoe b = new eoe(1);
    public static final /* synthetic */ eoe a = new eoe(0);

    private /* synthetic */ eoe(int i2) {
        this.q = i2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.util.List, java.lang.Object] */
    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        lof lofVar;
        lkp lkpVar;
        switch (this.q) {
            case 0:
                return ((String) obj).trim();
            case 1:
                return (efx) ((Map.Entry) obj).getValue();
            case 2:
                return llp.o(Arrays.asList((File[]) obj));
            case 3:
                return ((ijk) obj).a;
            case 4:
                String str = (String) obj;
                int i2 = fcr.c;
                nfh t = bns.f.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                bns bnsVar = (bns) t.b;
                str.getClass();
                int i3 = bnsVar.a | 1;
                bnsVar.a = i3;
                bnsVar.b = str;
                bnsVar.a = i3 | 2;
                bnsVar.c = true;
                return (bns) t.cz();
            case 5:
                String str2 = (String) obj;
                int i4 = fcr.c;
                nfh t2 = bns.f.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                bns bnsVar2 = (bns) t2.b;
                str2.getClass();
                int i5 = 1 | bnsVar2.a;
                bnsVar2.a = i5;
                bnsVar2.b = str2;
                bnsVar2.a = i5 | 2;
                bnsVar2.c = false;
                return (bns) t2.cz();
            case 6:
                return icu.n((String) obj);
            case 7:
                return icu.n((String) obj);
            case 8:
                return ((jho) obj).b;
            case 9:
                return ((ikm) obj).a;
            case 10:
                hhl hhlVar = isq.g;
                CharSequence charSequence = ((hln) obj).a;
                return charSequence == null ? "" : charSequence.toString();
            case 11:
                return ((jca) obj).a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                kcl kclVar = (kcl) obj;
                llk llkVar = new llk(kclVar.a.size());
                Collections.sort(kclVar.a, lrh.d());
                Iterator it = kclVar.a.iterator();
                if (it instanceof lof) {
                    lofVar = (lof) it;
                } else {
                    lofVar = new lof(it);
                }
                while (lofVar.hasNext()) {
                    lrh lrhVar = (lrh) lofVar.next();
                    while (lofVar.hasNext()) {
                        if (!lofVar.b) {
                            lofVar.c = lofVar.a.next();
                            lofVar.b = true;
                        }
                        lrh lrhVar2 = (lrh) lofVar.c;
                        if (lrhVar.p(lrhVar2)) {
                            jdg.D(lrhVar.h(lrhVar2).q(), "Overlapping ranges not permitted but found %s overlapping %s", lrhVar, lrhVar2);
                            lrh lrhVar3 = (lrh) lofVar.next();
                            int compareTo = lrhVar.b.compareTo(lrhVar3.b);
                            int compareTo2 = lrhVar.c.compareTo(lrhVar3.c);
                            if (compareTo > 0 || compareTo2 < 0) {
                                if (compareTo < 0 || compareTo2 > 0) {
                                    lkp lkpVar2 = compareTo <= 0 ? lrhVar.b : lrhVar3.b;
                                    if (compareTo2 >= 0) {
                                        lkpVar = lrhVar.c;
                                    } else {
                                        lkpVar = lrhVar3.c;
                                    }
                                    lrhVar = lrh.g(lkpVar2, lkpVar);
                                } else {
                                    lrhVar = lrhVar3;
                                }
                            }
                        }
                    }
                    llkVar.h(lrhVar);
                }
                llp g2 = llkVar.g();
                if (!g2.isEmpty()) {
                    if (((lrl) g2).c != 1 || !((lrh) lre.ad(g2)).equals(lrh.a)) {
                        return new lmw(g2);
                    }
                    return lmw.b;
                }
                return lmw.a;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((llk) obj).g();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((lmx) obj).g();
            default:
                return ((lls) obj).k();
        }
    }

    @Override // j$.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo40andThen(Function function) {
        switch (this.q) {
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
            default:
                return Objects.requireNonNull(function);
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.q) {
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
            default:
                return Objects.requireNonNull(function);
        }
    }
}

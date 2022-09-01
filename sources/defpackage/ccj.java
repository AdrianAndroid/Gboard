package defpackage;

import com.google.android.apps.inputmethod.libs.latin5.LatinIme;
import com.google.android.apps.inputmethod.libs.mozc.ime.SimpleJapaneseIme;
import j$.util.Objects;
import j$.util.function.Predicate;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ccj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ccj implements Predicate {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ccj u = new ccj(20);
    public static final /* synthetic */ ccj t = new ccj(19);
    public static final /* synthetic */ ccj s = new ccj(18);
    public static final /* synthetic */ ccj r = new ccj(17);
    public static final /* synthetic */ ccj q = new ccj(16);
    public static final /* synthetic */ ccj p = new ccj(15);
    public static final /* synthetic */ ccj o = new ccj(14);
    public static final /* synthetic */ ccj n = new ccj(13);
    public static final /* synthetic */ ccj m = new ccj(12);
    public static final /* synthetic */ ccj l = new ccj(11);
    public static final /* synthetic */ ccj k = new ccj(10);
    public static final /* synthetic */ ccj j = new ccj(9);
    public static final /* synthetic */ ccj i = new ccj(8);
    public static final /* synthetic */ ccj h = new ccj(7);
    public static final /* synthetic */ ccj g = new ccj(6);
    public static final /* synthetic */ ccj f = new ccj(5);
    public static final /* synthetic */ ccj e = new ccj(4);
    public static final /* synthetic */ ccj d = new ccj(3);
    public static final /* synthetic */ ccj c = new ccj(2);
    public static final /* synthetic */ ccj b = new ccj(1);
    public static final /* synthetic */ ccj a = new ccj(0);

    private /* synthetic */ ccj(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.v) {
            case 0:
                return Objects.requireNonNull(predicate);
            case 1:
                return Objects.requireNonNull(predicate);
            case 2:
                return Objects.requireNonNull(predicate);
            case 3:
                return Objects.requireNonNull(predicate);
            case 4:
                return Objects.requireNonNull(predicate);
            case 5:
                return Objects.requireNonNull(predicate);
            case 6:
                return Objects.requireNonNull(predicate);
            case 7:
                return Objects.requireNonNull(predicate);
            case 8:
                return Objects.requireNonNull(predicate);
            case 9:
                return Objects.requireNonNull(predicate);
            case 10:
                return Objects.requireNonNull(predicate);
            case 11:
                return Objects.requireNonNull(predicate);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Objects.requireNonNull(predicate);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Objects.requireNonNull(predicate);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Objects.requireNonNull(predicate);
            case 15:
                return Objects.requireNonNull(predicate);
            case 16:
                return Objects.requireNonNull(predicate);
            case 17:
                return Objects.requireNonNull(predicate);
            case 18:
                return Objects.requireNonNull(predicate);
            case 19:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.v) {
            case 0:
                return Predicate.CC.$default$negate(this);
            case 1:
                return Predicate.CC.$default$negate(this);
            case 2:
                return Predicate.CC.$default$negate(this);
            case 3:
                return Predicate.CC.$default$negate(this);
            case 4:
                return Predicate.CC.$default$negate(this);
            case 5:
                return Predicate.CC.$default$negate(this);
            case 6:
                return Predicate.CC.$default$negate(this);
            case 7:
                return Predicate.CC.$default$negate(this);
            case 8:
                return Predicate.CC.$default$negate(this);
            case 9:
                return Predicate.CC.$default$negate(this);
            case 10:
                return Predicate.CC.$default$negate(this);
            case 11:
                return Predicate.CC.$default$negate(this);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Predicate.CC.$default$negate(this);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Predicate.CC.$default$negate(this);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Predicate.CC.$default$negate(this);
            case 15:
                return Predicate.CC.$default$negate(this);
            case 16:
                return Predicate.CC.$default$negate(this);
            case 17:
                return Predicate.CC.$default$negate(this);
            case 18:
                return Predicate.CC.$default$negate(this);
            case 19:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.v) {
            case 0:
                return Objects.requireNonNull(predicate);
            case 1:
                return Objects.requireNonNull(predicate);
            case 2:
                return Objects.requireNonNull(predicate);
            case 3:
                return Objects.requireNonNull(predicate);
            case 4:
                return Objects.requireNonNull(predicate);
            case 5:
                return Objects.requireNonNull(predicate);
            case 6:
                return Objects.requireNonNull(predicate);
            case 7:
                return Objects.requireNonNull(predicate);
            case 8:
                return Objects.requireNonNull(predicate);
            case 9:
                return Objects.requireNonNull(predicate);
            case 10:
                return Objects.requireNonNull(predicate);
            case 11:
                return Objects.requireNonNull(predicate);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Objects.requireNonNull(predicate);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Objects.requireNonNull(predicate);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Objects.requireNonNull(predicate);
            case 15:
                return Objects.requireNonNull(predicate);
            case 16:
                return Objects.requireNonNull(predicate);
            case 17:
                return Objects.requireNonNull(predicate);
            case 18:
                return Objects.requireNonNull(predicate);
            case 19:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.v) {
            case 0:
                Pattern pattern = ccm.a;
                int b2 = msc.b(((mse) obj).c);
                return b2 != 0 && b2 == 35;
            case 1:
                return ((hln) obj).i < 0;
            case 2:
                return ((lfb) obj).e();
            case 3:
                return ((lfb) obj).e();
            case 4:
                return ((lfb) obj).e();
            case 5:
                ckc b3 = ckc.b(((ckd) obj).b);
                if (b3 == null) {
                    b3 = ckc.UNKNOWN;
                }
                return b3 == ckc.DYNAMIC_ART;
            case 6:
                int b4 = msc.b(((mse) obj).c);
                return b4 != 0 && b4 == 26;
            case 7:
                int b5 = msc.b(((mse) obj).c);
                return b5 != 0 && b5 == 33;
            case 8:
                int b6 = msc.b(((mse) obj).c);
                return b6 != 0 && b6 == 31;
            case 9:
                int b7 = msc.b(((mse) obj).c);
                return b7 != 0 && b7 == 18;
            case 10:
                return ((lfb) obj).e();
            case 11:
                int b8 = msc.b(((mse) obj).c);
                return b8 != 0 && b8 == 31;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int b9 = msc.b(((mse) obj).c);
                return b9 != 0 && b9 == 18;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int i2 = cjy.b;
                int b10 = msc.b(((mse) obj).c);
                return b10 != 0 && b10 == 26;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i3 = cjy.b;
                return ((cjo) obj).d().m() != mbr.DYNAMIC_ART_STICKER;
            case 15:
                return ((lfb) obj).e();
            case 16:
                cmf cmfVar = (cmf) obj;
                return (cmfVar == cmf.UNKNOWN || cmfVar == cmf.UNRECOGNIZED) ? false : true;
            case 17:
                cqp cqpVar = (cqp) obj;
                ltg ltgVar = cri.a;
                return (cqpVar.m() == mbr.AVATAR_STICKER || cqpVar.m() == mbr.UNKNOWN_CONTENT_TYPE) ? false : true;
            case 18:
                bns bnsVar = (bns) obj;
                ltg ltgVar2 = LatinIme.a;
                if (bnsVar.c && !bnsVar.b.isEmpty()) {
                    if (bnsVar.e.size() == 0) {
                        return true;
                    }
                    for (bnr bnrVar : bnsVar.e) {
                        int e2 = bvq.e(bnrVar.d);
                        if (e2 == 0) {
                            return true;
                        }
                        if (e2 != 3) {
                            return true;
                        }
                    }
                }
                return false;
            case 19:
                ltg ltgVar3 = SimpleJapaneseIme.a;
                int e3 = bvq.e(((bnr) obj).d);
                return e3 != 0 && e3 == 3;
            default:
                bns bnsVar2 = (bns) obj;
                if (bnsVar2.c && !bnsVar2.b.isEmpty()) {
                    if (bnsVar2.e.size() == 0) {
                        return true;
                    }
                    for (bnr bnrVar2 : bnsVar2.e) {
                        int e4 = bvq.e(bnrVar2.d);
                        if (e4 == 0) {
                            return true;
                        }
                        if (e4 != 3) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }
}

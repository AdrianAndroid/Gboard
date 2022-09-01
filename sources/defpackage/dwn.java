package defpackage;

import com.google.android.apps.inputmethod.libs.search.contentsuggestion.ContentSuggestionKeyboard;
import j$.util.Objects;
import j$.util.function.Function;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dwn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dwn implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ dwn u = new dwn(20);
    public static final /* synthetic */ dwn t = new dwn(19);
    public static final /* synthetic */ dwn s = new dwn(18);
    public static final /* synthetic */ dwn r = new dwn(17);
    public static final /* synthetic */ dwn q = new dwn(16);
    public static final /* synthetic */ dwn p = new dwn(15);
    public static final /* synthetic */ dwn o = new dwn(14);
    public static final /* synthetic */ dwn n = new dwn(13);
    public static final /* synthetic */ dwn m = new dwn(12);
    public static final /* synthetic */ dwn l = new dwn(11);
    public static final /* synthetic */ dwn k = new dwn(10);
    public static final /* synthetic */ dwn j = new dwn(9);
    public static final /* synthetic */ dwn i = new dwn(8);
    public static final /* synthetic */ dwn h = new dwn(7);
    public static final /* synthetic */ dwn g = new dwn(6);
    public static final /* synthetic */ dwn f = new dwn(5);
    public static final /* synthetic */ dwn e = new dwn(4);
    public static final /* synthetic */ dwn d = new dwn(3);
    public static final /* synthetic */ dwn c = new dwn(2);
    public static final /* synthetic */ dwn b = new dwn(1);
    public static final /* synthetic */ dwn a = new dwn(0);

    private /* synthetic */ dwn(int i2) {
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
        switch (this.v) {
            case 0:
                return Long.valueOf(nis.a((ney) obj));
            case 1:
                mwa mwaVar = (mwa) obj;
                nfh t2 = fim.c.t();
                String str = mwaVar.a;
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                fim fimVar = (fim) t2.b;
                str.getClass();
                fimVar.a = str;
                String str2 = mwaVar.b;
                str2.getClass();
                fimVar.b = str2;
                return (fim) t2.cz();
            case 2:
                ltg ltgVar = dzl.a;
                return (dzq) obj;
            case 3:
                return ((dzq) obj).d();
            case 4:
                return dzq.e((dzp) obj);
            case 5:
                cqo h2 = ((cqp) obj).h();
                h2.e(mbr.EMOJI_KITCHEN_STICKER);
                return dzp.a(h2.a(), dzo.PRIMARY_EMOJI_QUERY);
            case 6:
                ltg ltgVar2 = ContentSuggestionKeyboard.a;
                return (dzq) obj;
            case 7:
                return dzq.e((dzp) obj);
            case 8:
                return ((dzq) obj).d();
            case 9:
                cqo h3 = ((cqp) obj).h();
                h3.e(mbr.EMOJI_KITCHEN_STICKER);
                return dzp.a(h3.a(), dzo.PRIMARY_EMOJI_QUERY);
            case 10:
                hhl hhlVar = eal.a;
                return dzp.a((cqp) obj, dzo.RECENTS);
            case 11:
                hhl hhlVar2 = eal.a;
                return dzp.a((cqp) obj, dzo.CONTEXTUAL);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                hhl hhlVar3 = eal.a;
                return dzp.a((cqp) obj, dzo.CURATED);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return icu.n((String) obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return efq.h((cxc) obj);
            case 15:
                return efq.g((cxc) obj);
            case 16:
                ltg ltgVar3 = egf.a;
                return ((efx) obj).e().h.toLowerCase(Locale.US);
            case 17:
                return (efx) ((Map.Entry) obj).getValue();
            case 18:
                return efq.h((cxc) obj);
            case 19:
                return efq.g((cxc) obj);
            default:
                return ((efx) obj).e().h.toLowerCase(Locale.US);
        }
    }
}

package defpackage;

import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.search.contentsuggestion.ContentSuggestionKeyboard;
import j$.util.Objects;
import j$.util.function.Predicate;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cjx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cjx implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cjx(cjy cjyVar, int i) {
        this.b = i;
        this.a = cjyVar;
    }

    public /* synthetic */ cjx(cka ckaVar, int i) {
        this.b = i;
        this.a = ckaVar;
    }

    public /* synthetic */ cjx(cna cnaVar, int i) {
        this.b = i;
        this.a = cnaVar;
    }

    public /* synthetic */ cjx(dzo dzoVar, int i) {
        this.b = i;
        this.a = dzoVar;
    }

    public /* synthetic */ cjx(eyq eyqVar, int i) {
        this.b = i;
        this.a = eyqVar;
    }

    public /* synthetic */ cjx(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ cjx(List list, int i) {
        this.b = i;
        this.a = list;
    }

    public /* synthetic */ cjx(ZipEntry zipEntry, int i) {
        this.b = i;
        this.a = zipEntry;
    }

    public /* synthetic */ cjx(llp llpVar, int i) {
        this.b = i;
        this.a = llpVar;
    }

    public /* synthetic */ cjx(llw llwVar, int i) {
        this.b = i;
        this.a = llwVar;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
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
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.b) {
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
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
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
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [cka, java.lang.Object] */
    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                int i = cjy.b;
                String c = cjy.c(((cjo) obj).b());
                String c2 = cjy.c((mse) ((llp) obj2).get(0));
                if (c != null && c2 != null) {
                    return jdg.Z(c, c2);
                }
                return false;
            case 1:
                return this.a.f((mse) obj);
            case 2:
                Object obj3 = this.a;
                int i2 = cjy.b;
                return !((llp) obj3).contains((cjo) obj);
            case 3:
                return ((cjy) this.a).a.j(String.valueOf(((cka) obj).e().i));
            case 4:
                String str = (String) obj;
                return !TextUtils.isEmpty(str) && ((cna) this.a).g.g(str, hdn.instance.h);
            case 5:
                cmh cmhVar = (cmh) obj;
                return !cmhVar.a.isEmpty() && ((cna) this.a).g.g(cmhVar.a, hdn.instance.h);
            case 6:
                cmh cmhVar2 = (cmh) obj;
                return !cmhVar2.a.isEmpty() && ((cna) this.a).g.g(cmhVar2.a, hdn.instance.h);
            case 7:
                Object obj4 = this.a;
                ltg ltgVar = drw.a;
                return ((String) obj4).contentEquals(((hln) obj).a);
            case 8:
                return this.a.contains((Integer) obj);
            case 9:
                Object obj5 = this.a;
                ltg ltgVar2 = dzl.a;
                return ((dzp) obj).b == obj5;
            case 10:
                Object obj6 = this.a;
                ltg ltgVar3 = ContentSuggestionKeyboard.a;
                return ((dzp) obj).b == obj6;
            case 11:
                ?? r0 = this.a;
                ltg ltgVar4 = egf.a;
                return !jdg.Z(((cxc) obj).h, r0);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj7 = this.a;
                ltg ltgVar5 = egf.a;
                return !((llw) obj7).containsKey(((Map.Entry) obj).getKey());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return !jdg.Z(((cxc) obj).h, this.a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return !((llw) this.a).containsKey(((Map.Entry) obj).getKey());
            case 15:
                return ((eyq) this.a).d.a((String) obj) == -1;
            default:
                try {
                    return jxx.f((ZipEntry) this.a).startsWith((String) obj);
                } catch (IOException unused) {
                    return false;
                }
        }
    }
}

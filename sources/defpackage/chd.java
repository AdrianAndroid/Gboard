package defpackage;

import android.content.res.Resources;
import android.view.animation.Interpolator;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.Collection$EL;
import j$.util.Objects;
import j$.util.function.Function;
import j$.util.stream.Stream;
import java.io.File;
import java.util.Locale;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: chd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class chd implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ chd(cdx cdxVar, int i) {
        this.b = i;
        this.a = cdxVar;
    }

    public /* synthetic */ chd(che cheVar, int i) {
        this.b = i;
        this.a = cheVar;
    }

    public /* synthetic */ chd(cmy cmyVar, int i) {
        this.b = i;
        this.a = cmyVar;
    }

    public /* synthetic */ chd(cny cnyVar, int i) {
        this.b = i;
        this.a = cnyVar;
    }

    public /* synthetic */ chd(SoftKeyboardView softKeyboardView, int i) {
        this.b = i;
        this.a = softKeyboardView;
    }

    public /* synthetic */ chd(eal ealVar, int i) {
        this.b = i;
        this.a = ealVar;
    }

    public /* synthetic */ chd(fiq fiqVar, int i) {
        this.b = i;
        this.a = fiqVar;
    }

    public /* synthetic */ chd(fit fitVar, int i) {
        this.b = i;
        this.a = fitVar;
    }

    public /* synthetic */ chd(fiu fiuVar, int i) {
        this.b = i;
        this.a = fiuVar;
    }

    public /* synthetic */ chd(jan janVar, int i) {
        this.b = i;
        this.a = janVar;
    }

    public /* synthetic */ chd(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ chd(jls jlsVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = i;
        this.a = jlsVar;
    }

    public /* synthetic */ chd(llw llwVar, int i) {
        this.b = i;
        this.a = llwVar;
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return ((che) this.a).a(obj);
            case 1:
                return ((cdx) this.a).d((Locale) obj);
            case 2:
                return ((cmk) obj).a.toLowerCase(((cmy) this.a).c);
            case 3:
                return new bsx((cny) this.a, (cjo) obj, 8);
            case 4:
                Object obj2 = this.a;
                Interpolator interpolator = cny.a;
                return cri.c(((SoftKeyboardView) obj2).getContext(), (cqp) obj);
            case 5:
                ((dun) obj).f(((fit) this.a).a);
                return nez.a;
            case 6:
                dun dunVar = (dun) obj;
                bko bkoVar = ((fiu) this.a).a;
                if (bkoVar == null) {
                    bkoVar = bko.i;
                }
                dunVar.k(bkoVar);
                return fiv.a;
            case 7:
                dun dunVar2 = (dun) obj;
                fgu fguVar = ((fiq) this.a).a;
                if (fguVar == null) {
                    fguVar = fgu.e;
                }
                dunVar2.g(dzg.h(fguVar));
                return nez.a;
            case 8:
                return Collection$EL.stream(((eal) this.a).b((String) obj));
            case 9:
                Object obj3 = this.a;
                cxc cxcVar = (cxc) obj;
                ltg ltgVar = egf.a;
                efx efxVar = (efx) ((llw) obj3).get(cxcVar.h.toLowerCase(Locale.US));
                return efxVar != null ? efxVar.e() : cxcVar;
            case 10:
                cxc cxcVar2 = (cxc) obj;
                efx efxVar2 = (efx) ((llw) this.a).get(cxcVar2.h.toLowerCase(Locale.US));
                return efxVar2 != null ? efxVar2.e() : cxcVar2;
            case 11:
                return Boolean.valueOf(((jan) this.a).e((File) obj));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                File file = (File) obj;
                String str = (String) this.a;
                if (file.getName().endsWith(str)) {
                    return Stream.CC.of(file);
                }
                return Collection$EL.stream(exa.a(file, str));
            default:
                return ((Resources) ((jls) this.a).b).getString(((Integer) obj).intValue());
        }
    }

    @Override // j$.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo40andThen(Function function) {
        switch (this.b) {
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
            default:
                return Objects.requireNonNull(function);
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
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
            default:
                return Objects.requireNonNull(function);
        }
    }
}

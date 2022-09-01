package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.Collection$EL;
import j$.util.Objects;
import j$.util.function.Function;
import java.util.List;

/* compiled from: PG */
/* renamed from: cig  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cig implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cig(cih cihVar, List list, int i) {
        this.c = i;
        this.a = cihVar;
        this.b = list;
    }

    public /* synthetic */ cig(cil cilVar, mse mseVar, int i) {
        this.c = i;
        this.a = cilVar;
        this.b = mseVar;
    }

    public /* synthetic */ cig(cio cioVar, mse mseVar, int i) {
        this.c = i;
        this.a = cioVar;
        this.b = mseVar;
    }

    public /* synthetic */ cig(ciq ciqVar, String str, int i) {
        this.c = i;
        this.a = ciqVar;
        this.b = str;
    }

    public /* synthetic */ cig(ciq ciqVar, mse mseVar, int i) {
        this.c = i;
        this.a = ciqVar;
        this.b = mseVar;
    }

    public /* synthetic */ cig(llp llpVar, List list, int i) {
        this.c = i;
        this.a = llpVar;
        this.b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.List, java.lang.Object] */
    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        Uri uri;
        switch (this.c) {
            case 0:
                return ((cih) this.a).b(this.b, (mse) obj);
            case 1:
                return Collection$EL.stream(((cih) this.a).d(this.b, (mse) obj));
            case 2:
                cil cilVar = (cil) this.a;
                return eju.j(cilVar.a, cilVar.b, (mse) this.b, (cqp) obj);
            case 3:
                return ((cio) this.a).h((mse) this.b, (cqp) obj);
            case 4:
                Object obj2 = this.a;
                Object obj3 = this.b;
                czs czsVar = (czs) obj;
                ciq ciqVar = (ciq) obj2;
                Context context = ciqVar.b;
                cke ckeVar = ciqVar.c;
                Uri a = czsVar.a();
                cqo t = cqp.t();
                t.g("dynamic_art_".concat(czn.b.h(czsVar.a, Integer.valueOf(czsVar.c), Integer.valueOf(czsVar.d), czn.b.f(czsVar.b), Float.valueOf(czsVar.f), Float.valueOf(czsVar.e))));
                t.f(czsVar.d);
                t.n(czsVar.c);
                t.f = czn.a.f(czsVar.b);
                t.j(iil.a);
                t.e(mbr.DYNAMIC_ART_STICKER);
                t.h(czsVar.a());
                t.i(new Uri.Builder().scheme("gboard").authority("dynamic_art_authority").appendQueryParameter("animation", czsVar.a).appendQueryParameter("width", Integer.toString(czsVar.c)).appendQueryParameter("height", Integer.toString(czsVar.d)).appendQueryParameter("start_percent", Float.toString(czsVar.e)).appendQueryParameter("stop_percent", Float.toString(czsVar.f)).build());
                t.l("sticker");
                cqp a2 = t.a();
                int b = dds.b(context, ciqVar.e, ciqVar.f.y());
                if (b < 10 || b > 512) {
                    ((ltd) ((ltd) ciq.a.d()).k("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/DynamicArtSupplier", "newDynamicArtImageCandidateData", 361, "DynamicArtSupplier.java")).y("The calculate keyboard height is not in the range of 0 to 512. Setting it to height: %d, width: %d", czsVar.d, czsVar.c);
                    uri = a;
                } else {
                    czr czrVar = new czr(czsVar);
                    czrVar.g(b);
                    czrVar.c(b);
                    uri = czrVar.a().a();
                }
                kqg p = cjo.p();
                p.i((mse) obj3);
                p.l(a2);
                p.k(a);
                p.j(hjq.a(context).g(uri).a(hju.a).a(ckeVar));
                return lfb.g(p.h());
            case 5:
                return Collection$EL.stream(((ciq) this.a).b((mse) obj, (String) this.b));
            case 6:
                ciq ciqVar2 = (ciq) this.a;
                llp b2 = ciqVar2.b((mse) obj, (String) this.b);
                return b2.isEmpty() ? ldu.a : lfb.g((cjo) eju.k(ciqVar2.d, b2));
            default:
                return cjy.b((llp) this.a, this.b, (cka) obj);
        }
    }

    @Override // j$.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo40andThen(Function function) {
        switch (this.c) {
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
            default:
                return Objects.requireNonNull(function);
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.c) {
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
            default:
                return Objects.requireNonNull(function);
        }
    }
}

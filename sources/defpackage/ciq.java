package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Collection$EL;
import j$.util.Optional;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* renamed from: ciq  reason: default package */
/* loaded from: classes.dex */
public final class ciq implements cka {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/DynamicArtSupplier");
    public final Context b;
    public final cke c;
    public final Random d;
    private final czj g;
    private final oiy h;
    private String i;
    private String k;
    private final idk m;
    private llp j = llp.q();
    private lfb l = ldu.a;
    public final ice[] e = {ice.HEADER};
    public final hso f = new hso();

    public ciq(Context context, cke ckeVar, czj czjVar, Random random, oiy oiyVar, idk idkVar) {
        this.b = context;
        this.c = ckeVar;
        this.g = czjVar;
        this.d = random;
        this.h = oiyVar;
        this.m = idkVar;
    }

    private final lfb d(String str, llp llpVar) {
        return lfb.f((cjo) Collection$EL.stream(llpVar).map(new cig(this, str, 6)).filter(ccj.k).map(byw.n).findFirst().orElse(null));
    }

    private static lfb h(llp llpVar) {
        llp llpVar2 = (llp) Collection$EL.stream(llpVar).filter(ccj.g).collect(ljr.a);
        if (llpVar2.size() == 1) {
            return lfb.g((mse) llpVar2.get(0));
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/DynamicArtSupplier", "getDynamicTxtCandidate", 312, "DynamicArtSupplier.java")).u("The %d of dynamic txt query candidates, the number is not correct", llpVar2.size());
        return ldu.a;
    }

    private final llp i(mse mseVar, llp llpVar) {
        return (llp) Collection$EL.stream(llpVar).map(new cig(this, mseVar, 4)).filter(ccj.k).map(byw.n).collect(ljr.a);
    }

    private static llp j(llp llpVar) {
        return (llp) Collection$EL.stream(llpVar).filter(fgy.m(byw.m)).collect(ljr.a);
    }

    private final llp k(String str, llp llpVar) {
        return (llp) Collection$EL.stream(llpVar).flatMap(new cig(this, str, 5)).filter(fgy.m(byw.l)).collect(ljr.a);
    }

    private final boolean l(llp llpVar) {
        int size = llpVar.size();
        int i = 0;
        while (i < size) {
            mse mseVar = (mse) llpVar.get(i);
            czj czjVar = this.g;
            int b = msc.b(mseVar.c);
            if (b == 0) {
                b = 1;
            }
            lmz c = czjVar.c(b, (mseVar.b & 64) != 0 ? mseVar.o : mseVar.d);
            i++;
            if (c != null && !c.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cka
    public final lfb a(List list, llp llpVar) {
        String str;
        lfb h = h(llpVar);
        if (!h.e()) {
            return ldu.a;
        }
        if ((((mse) h.a()).b & 64) == 0) {
            str = ((mse) h.a()).d;
        } else {
            str = ((mse) h.a()).o;
        }
        if (TextUtils.equals(str, this.k)) {
            return this.l;
        }
        this.k = str;
        lfb d = d(str, (llp) Collection$EL.stream(llpVar).filter(ccj.l).collect(ljr.a));
        if (d.e()) {
            this.l = d;
            return d;
        }
        lfb d2 = d(str, (llp) Collection$EL.stream(llpVar).filter(ccj.m).collect(ljr.a));
        this.l = d2;
        return d2;
    }

    public final llp b(mse mseVar, String str) {
        czj czjVar = this.g;
        int b = msc.b(mseVar.c);
        if (b == 0) {
            b = 1;
        }
        return i(mseVar, czjVar.b(str, czjVar.c(b, (mseVar.b & 64) != 0 ? mseVar.o : mseVar.d), this.d));
    }

    @Override // defpackage.cka
    public final llp c(List list, llp llpVar) {
        String str;
        llp b;
        lfb h = h(llpVar);
        if (!h.e()) {
            return llp.q();
        }
        if ((((mse) h.a()).b & 64) == 0) {
            str = ((mse) h.a()).d;
        } else {
            str = ((mse) h.a()).o;
        }
        if (TextUtils.equals(str, this.i)) {
            return this.j;
        }
        if (((Boolean) czu.f.c()).booleanValue() && !czj.b.a().e()) {
            czt.b(this.b).d(false);
        }
        this.i = str;
        Optional findFirst = Collection$EL.stream(((ckb) cit.J.j()).a).filter(ccj.f).findFirst();
        int i = findFirst.isPresent() ? ((ckd) findFirst.get()).d : 0;
        llp k = k(str, (llp) Collection$EL.stream(llpVar).filter(ccj.h).collect(ljr.a));
        if (k.size() >= i) {
            llp j = j(k);
            this.j = j;
            return j;
        }
        llk e = llp.e();
        e.j(k);
        llp llpVar2 = (llp) Collection$EL.stream(llpVar).filter(ccj.i).collect(ljr.a);
        e.j(k(str, llpVar2));
        llp g = e.g();
        if (((lrl) g).c >= i) {
            llp j2 = j(g);
            this.j = j2;
            return j2;
        }
        llp llpVar3 = (llp) Collection$EL.stream(llpVar).filter(ccj.j).collect(ljr.a);
        e.j(k(str, llpVar3));
        llp g2 = e.g();
        if (!g2.isEmpty()) {
            llp j3 = j(g2);
            this.j = j3;
            return j3;
        }
        int intValue = ((Long) cit.L.c()).intValue();
        mse mseVar = (mse) h.a();
        czj czjVar = this.g;
        Random random = this.d;
        czo czoVar = (czo) czjVar.c.get();
        if (czoVar == null) {
            ((ltd) ((ltd) czj.a.d()).k("com/google/android/apps/inputmethod/libs/expression/tenoranimation/DynamicArtAnimationCache", "getDynamicArtParamsFromGenericTemplates", 148, "DynamicArtAnimationCache.java")).t("Dynamic art information is null");
            b = llp.q();
        } else {
            b = czjVar.b(str, czoVar.d, random);
        }
        llp i2 = i(mseVar, b);
        llp j4 = j(i2.subList(0, Math.min(i2.size(), intValue)));
        this.j = j4;
        if (j4.isEmpty()) {
            boolean isEmpty = llpVar3.isEmpty();
            boolean isEmpty2 = llpVar2.isEmpty();
            ieh.j().e(ctd.EXPRESSION_MOMENT_DYNAMIC_ART_ABSENT_REASON, Integer.valueOf((isEmpty ? 1 : l(llpVar3) ? 4 : 2) | (isEmpty2 ? 8 : l(llpVar2) ? 32 : 16)));
        }
        return this.j;
    }

    @Override // defpackage.cka
    public final ckc e() {
        return ckc.DYNAMIC_ART;
    }

    @Override // defpackage.cka
    public final boolean f(mse mseVar) {
        int b = msc.b(mseVar.c);
        if (b == 0) {
            b = 1;
        }
        return b == 18 || b == 31 || b == 26 || b == 33;
    }

    @Override // defpackage.cka
    public final boolean g(List list) {
        if (!ijf.i(hhc.a)) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/DynamicArtSupplier", "isCandidateSupported", 481, "DynamicArtSupplier.java")).t("The dynamic art feature module is not ready.");
            this.m.e(ctf.DYNAMIC_ART_STICKER_STATUS, csz.FEATURE_SPLIT_MODULE_IS_NOT_READY);
            return false;
        }
        this.m.e(ctf.DYNAMIC_ART_STICKER_STATUS, csz.FEATURE_SPLIT_MODULE_IS_READY);
        if (!((cix) this.h).b().booleanValue()) {
            this.m.e(ctf.DYNAMIC_ART_STICKER_STATUS, csz.DYNAMIC_ART_IS_NOT_ENABLED);
            return false;
        } else if (((Boolean) czu.f.c()).booleanValue() || this.g.a().e()) {
            if (!jbc.g("image/png", list)) {
                this.m.e(ctf.DYNAMIC_ART_STICKER_STATUS, csz.EDITOR_MIME_TYPE_IS_NOT_PNG);
                return false;
            }
            this.m.e(ctf.DYNAMIC_ART_STICKER_STATUS, csz.SUPPORTED);
            return true;
        } else {
            this.m.e(ctf.DYNAMIC_ART_STICKER_STATUS, csz.DYNAMIC_ART_INFORMATION_IS_NOT_PRESENT);
            return false;
        }
    }
}

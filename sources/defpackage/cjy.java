package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import j$.util.Collection$EL;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: cjy  reason: default package */
/* loaded from: classes.dex */
public final class cjy implements cjb {
    public static final /* synthetic */ int b = 0;
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/ImageCandidateSupplier");
    private static final lmz d;
    private final Context f;
    private final hso g;
    private final oiy h;
    private final oiy i;
    private final oiy j;
    private final cil k;
    private final cka l;
    private final llp m;
    private final cke n;
    private final iqe e = iqe.a(cit.x);
    public final iqh a = iqh.a(cit.b);

    static {
        lmx h = lmz.h(4);
        h.d("image/gif");
        h.d("image/png");
        h.d("image/jpeg");
        h.d("image/webp");
        d = h.g();
    }

    public cjy(Context context, hso hsoVar, cil cilVar, ciq ciqVar, cka ckaVar, cka ckaVar2, cka ckaVar3, cka ckaVar4, cka ckaVar5, oiy oiyVar, oiy oiyVar2, oiy oiyVar3, cke ckeVar) {
        this.f = context;
        this.g = hsoVar;
        this.h = oiyVar;
        this.i = oiyVar2;
        this.j = oiyVar3;
        this.k = cilVar;
        this.l = ckaVar;
        this.m = llp.w(ckaVar4, cilVar, ciqVar, ckaVar, ckaVar5, ckaVar3, ckaVar2);
        this.n = ckeVar;
    }

    public static lfb b(llp llpVar, List list, cka ckaVar) {
        if (!ckaVar.g(list)) {
            return ldu.a;
        }
        Stream stream = Collection$EL.stream(llpVar);
        Objects.requireNonNull(ckaVar);
        return ckaVar.a(list, (llp) stream.filter(new cjx(ckaVar, 1)).collect(ljr.a));
    }

    public static String c(mse mseVar) {
        return (mseVar.b & 64) != 0 ? mseVar.o : mseVar.d;
    }

    @Override // defpackage.cjb
    public final /* bridge */ /* synthetic */ cja a(EditorInfo editorInfo, llp llpVar) {
        lfb f;
        llp llpVar2;
        int i;
        if (((csd) this.h).c().aj(R.string.f161060_resource_name_obfuscated_res_0x7f14068a) && ham.z(this.e, editorInfo)) {
            List n = ham.n(editorInfo);
            if (!n.isEmpty()) {
                lsz it = d.iterator();
                while (it.hasNext()) {
                    if (jbc.g((String) it.next(), n)) {
                        int y = this.g.y();
                        if (this.g.isFullscreenMode()) {
                            return null;
                        }
                        if ((jam.r(this.f) && !gzq.e(this.f)) || y == 3 || y == 2) {
                            return null;
                        }
                        if (!((cix) this.j).b().booleanValue()) {
                            if (!((cix) this.i).b().booleanValue() || !this.a.j(String.valueOf(ckc.BITMOJI.i))) {
                                f = lfb.f((cjo) Stream.CC.of(this.l).filter(new cjx(this, 3)).map(new cig(llpVar, n, 7)).filter(ccj.p).map(byw.p).findFirst().orElse(null));
                            } else {
                                f = b(llpVar, n, this.k);
                            }
                        } else if (lre.ah(llpVar, bzg.f)) {
                            ckb ckbVar = (ckb) cit.J.j();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            llp llpVar3 = this.m;
                            int i2 = ((lrl) llpVar3).c;
                            for (int i3 = 0; i3 < i2; i3++) {
                                cka ckaVar = (cka) llpVar3.get(i3);
                                llp q = llp.q();
                                if (ckaVar.g(n)) {
                                    Stream stream = Collection$EL.stream(llpVar);
                                    Objects.requireNonNull(ckaVar);
                                    llp llpVar4 = (llp) stream.filter(new cjx(ckaVar, 1)).collect(ljr.a);
                                    Stream stream2 = Collection$EL.stream(ckaVar.c(n, llpVar4));
                                    ckc e = ckaVar.e();
                                    Iterator it2 = ckbVar.a.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            i = 50;
                                            break;
                                        }
                                        ckd ckdVar = (ckd) it2.next();
                                        ckc b2 = ckc.b(ckdVar.b);
                                        if (b2 == null) {
                                            b2 = ckc.UNKNOWN;
                                        }
                                        if (b2 == e) {
                                            i = ckdVar.d;
                                            break;
                                        }
                                    }
                                    llp llpVar5 = (llp) stream2.limit(i).collect(ljr.a);
                                    if (!llpVar4.isEmpty() && llpVar5.isEmpty()) {
                                        ieh.j().e(ctd.EXPRESSION_MOMENT_SUPPLIER_RESULT_ABSENT, Integer.valueOf(ckaVar.e().i));
                                    }
                                    q = llpVar5;
                                } else {
                                    ieh.j().e(ctd.EXPRESSION_MOMENT_SUPPLIER_NOT_SUPPORT, Integer.valueOf(ckaVar.e().i));
                                }
                                linkedHashMap.put(ckaVar.e(), q);
                            }
                            llp llpVar6 = (llp) Collection$EL.stream(llpVar).filter(ccj.n).collect(ljr.a);
                            if (llpVar6.size() == 1) {
                                ckc ckcVar = ckc.DYNAMIC_ART;
                                llp llpVar7 = (llp) linkedHashMap.get(ckcVar);
                                ckc e2 = this.l.e();
                                llp llpVar8 = (llp) linkedHashMap.get(e2);
                                if (llpVar8 == null) {
                                    llpVar2 = llp.q();
                                } else {
                                    llpVar2 = (llp) Collection$EL.stream(llpVar8).filter(new cjx(llpVar6, 0)).collect(ljr.a);
                                }
                                if (llpVar7 != null && !llpVar7.isEmpty() && !llpVar2.isEmpty()) {
                                    long longValue = ((Long) cit.K.c()).longValue();
                                    if (longValue == 1) {
                                        linkedHashMap.put(ckcVar, llp.q());
                                    } else if (longValue == 0 && llpVar8 != null) {
                                        linkedHashMap.put(e2, (llp) Collection$EL.stream(llpVar8).filter(new cjx(llpVar2, 2)).collect(ljr.a));
                                    }
                                }
                            } else if (!llpVar6.isEmpty()) {
                                ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/ImageCandidateSupplier", "getSupplierToImageCandidateMap", 386, "ImageCandidateSupplier.java")).t("More than one dynamic art text candidates are generated ");
                            }
                            ArrayList arrayList = new ArrayList();
                            int i4 = 0;
                            for (ckd ckdVar2 : ckbVar.a) {
                                ckc b3 = ckc.b(ckdVar2.b);
                                if (b3 == null) {
                                    b3 = ckc.UNKNOWN;
                                }
                                int i5 = ckdVar2.c;
                                llp llpVar9 = (llp) linkedHashMap.remove(b3);
                                if (llpVar9 != null && !llpVar9.isEmpty()) {
                                    int min = Math.min(i5, llpVar9.size());
                                    arrayList.addAll(i4, llpVar9.subList(0, min));
                                    i4 += min;
                                    arrayList.addAll(llpVar9.subList(min, llpVar9.size()));
                                }
                            }
                            for (ckc ckcVar2 : linkedHashMap.keySet()) {
                                llp llpVar10 = (llp) linkedHashMap.get(ckcVar2);
                                if (llpVar10 != null && !llpVar10.isEmpty()) {
                                    arrayList.addAll(llpVar10);
                                }
                            }
                            llp llpVar11 = (llp) Collection$EL.stream(arrayList).filter(fgy.m(byw.o)).collect(ljr.a);
                            if (llpVar11.isEmpty()) {
                                ieh.j().e(ctd.EXPRESSION_MOMENT_RESULT_ABSENT, new Object[0]);
                                f = ldu.a;
                            } else {
                                cjo cjoVar = (cjo) llpVar11.get(0);
                                if (cjoVar.d().m() == mbr.DYNAMIC_ART_STICKER) {
                                    ats a = hjq.a(this.f).h(Integer.valueOf((int) R.drawable.f47060_resource_name_obfuscated_res_0x7f0801b0)).a(hju.a).a(this.n);
                                    Optional findFirst = Collection$EL.stream(llpVar11).filter(ccj.o).findFirst();
                                    if (findFirst.isPresent()) {
                                        cjoVar.c().d(hjq.a(this.f).g(((cjo) findFirst.get()).d().d()).a(hju.a).a(this.n).d(a));
                                    } else {
                                        cjoVar.c().d(a);
                                    }
                                }
                                kqg j = cjoVar.j();
                                j.a = lfb.f(llpVar11);
                                j.m(true);
                                f = lfb.g(j.h());
                            }
                        } else {
                            f = ldu.a;
                        }
                        return (cjo) f.d();
                    }
                }
            }
            String str = editorInfo.packageName;
            return null;
        }
        return null;
    }

    @Override // defpackage.cjb, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
        this.a.close();
    }
}

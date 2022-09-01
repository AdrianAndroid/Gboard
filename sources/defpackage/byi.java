package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.apps.inputmethod.libs.expression.candidatesupplier.MultipleImageCandidatePopupView;
import com.google.android.apps.inputmethod.libs.expression.header.ConstraintHeaderViewImpl;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* renamed from: byi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class byi implements leq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ byi(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ byi(RecyclerView recyclerView, int i) {
        this.b = i;
        this.a = recyclerView;
    }

    public /* synthetic */ byi(byy byyVar, int i) {
        this.b = i;
        this.a = byyVar;
    }

    public /* synthetic */ byi(cdb cdbVar, int i) {
        this.b = i;
        this.a = cdbVar;
    }

    public /* synthetic */ byi(ceh cehVar, int i) {
        this.b = i;
        this.a = cehVar;
    }

    public /* synthetic */ byi(ceq ceqVar, int i) {
        this.b = i;
        this.a = ceqVar;
    }

    public /* synthetic */ byi(coc cocVar, int i) {
        this.b = i;
        this.a = cocVar;
    }

    public /* synthetic */ byi(ConstraintHeaderViewImpl constraintHeaderViewImpl, int i) {
        this.b = i;
        this.a = constraintHeaderViewImpl;
    }

    public /* synthetic */ byi(cqp cqpVar, int i) {
        this.b = i;
        this.a = cqpVar;
    }

    public /* synthetic */ byi(cru cruVar, int i) {
        this.b = i;
        this.a = cruVar;
    }

    public /* synthetic */ byi(hja hjaVar, int i) {
        this.b = i;
        this.a = hjaVar;
    }

    public /* synthetic */ byi(Set set, int i) {
        this.b = i;
        this.a = set;
    }

    public /* synthetic */ byi(leq leqVar, int i) {
        this.b = i;
        this.a = leqVar;
    }

    public /* synthetic */ byi(lmz lmzVar, int i) {
        this.b = i;
        this.a = lmzVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [leq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, hja] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.leq
    public final Object a(Object obj) {
        boolean z = true;
        switch (this.b) {
            case 0:
                ?? r0 = this.a;
                HashSet hashSet = new HashSet();
                for (llp llpVar : (List) obj) {
                    int size = llpVar.size();
                    for (int i = 0; i < size; i++) {
                        hashSet.add(((hds) llpVar.get(i)).a);
                    }
                }
                HashSet hashSet2 = new HashSet();
                for (String str : r0) {
                    if (hashSet.contains(str)) {
                        hashSet2.add(str);
                    }
                }
                return hashSet2;
            case 1:
                ?? r02 = this.a;
                HashSet hashSet3 = new HashSet();
                for (llp llpVar2 : (List) obj) {
                    int size2 = llpVar2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        hashSet3.add(((hds) llpVar2.get(i2)).a);
                    }
                }
                HashSet hashSet4 = new HashSet();
                for (String str2 : r02) {
                    if (hashSet3.contains(str2)) {
                        hashSet4.add(str2);
                    }
                }
                return hashSet4;
            case 2:
                Boolean bool = (Boolean) obj;
                cdb cdbVar = (cdb) this.a;
                ccx ccxVar = cdbVar.b;
                boolean booleanValue = bool.booleanValue();
                ccxVar.d.set(booleanValue);
                if (booleanValue) {
                    ccxVar.c.g.addAndGet(ccxVar.e.getAndSet(0L));
                    ccxVar.c.h.addAndGet(ccxVar.f.getAndSet(0L));
                    for (Map.Entry entry : ccxVar.g.entrySet()) {
                        for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                            ccxVar.c.a((String) entry.getKey(), (jav) entry2.getKey(), (ghi) entry2.getValue());
                        }
                    }
                    ccxVar.g.clear();
                }
                if (!bool.booleanValue()) {
                    return false;
                }
                return Boolean.valueOf(cdbVar.c());
            case 3:
                byy byyVar = (byy) obj;
                ffb.m(((ceh) this.a).a, byyVar, "delight");
                return byyVar;
            case 4:
                byy byyVar2 = (byy) obj;
                ffb.m(((ceh) this.a).a, byyVar2, "bundled_delight");
                return byyVar2;
            case 5:
                byy byyVar3 = (byy) obj;
                ffb.m(((ceh) this.a).a, byyVar3, "delight_overrides");
                return byyVar3;
            case 6:
                ((ceq) this.a).e = (byy) obj;
                return null;
            case 7:
                return cri.c((Context) this.a, (cqp) obj);
            case 8:
                ?? r03 = this.a;
                View view = (View) obj;
                int i3 = MultipleImageCandidatePopupView.e;
                osr K = chc.K();
                K.e = view;
                K.b = bou.s;
                K.c = new cnm((leq) r03, view, 1);
                K.d = new dxs((byte[]) null);
                return K.v();
            case 9:
                return lmz.p(lvw.j(lmz.p((llp) obj), this.a));
            case 10:
                lsf k = lvw.k(this.a, (lmz) obj);
                lmx lmxVar = new lmx();
                lrx lrxVar = (lrx) k;
                lmxVar.j(lrxVar.a);
                lmxVar.j(lrxVar.b);
                return lmxVar.g();
            case 11:
                return ((byy) this.a).f((String) obj);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((hiz) obj).b(iht.class, new coa((hja) this.a, 1), mjl.a);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj2 = this.a;
                cjo cjoVar = (cjo) obj;
                Interpolator interpolator = cny.a;
                String string = ((Context) obj2).getString(R.string.f154050_resource_name_obfuscated_res_0x7f14033a, cjoVar.n());
                cqo h = cjoVar.d().h();
                h.f = string;
                return h.a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                coc cocVar = (coc) this.a;
                cob a = cob.a(llp.o(((cyg) obj).a), cocVar.e, System.currentTimeMillis());
                File d = coc.d(cocVar.c, cocVar.e);
                nfh t = cyd.d.t();
                String languageTag = a.b.toLanguageTag();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                cyd cydVar = (cyd) t.b;
                languageTag.getClass();
                cydVar.b = languageTag;
                cydVar.c = a.c;
                llp llpVar3 = a.a;
                nga ngaVar = cydVar.a;
                if (!ngaVar.c()) {
                    cydVar.a = nfm.H(ngaVar);
                }
                ndt.cs(llpVar3, cydVar.a);
                if (!jan.b.l(d, (cyd) t.cz())) {
                    jan.b.e(d);
                    ((ltd) ((ltd) coc.a.c()).k("com/google/android/apps/inputmethod/libs/expression/gif/GifCategoryManager$CategoryData", "saveToFile", 264, "GifCategoryManager.java")).w("Failed to cache tenor category data to %s", d.getAbsolutePath());
                }
                return a;
            case 15:
                return Integer.valueOf(((ConstraintHeaderViewImpl) this.a).h(((Integer) obj).intValue()));
            case 16:
                ConstraintHeaderViewImpl constraintHeaderViewImpl = (ConstraintHeaderViewImpl) this.a;
                int intValue = (((Integer) obj).intValue() - constraintHeaderViewImpl.o) - constraintHeaderViewImpl.p;
                if (constraintHeaderViewImpl.w()) {
                    intValue = (intValue - constraintHeaderViewImpl.findViewById(R.id.f59400_resource_name_obfuscated_res_0x7f0b04ef).getWidth()) - constraintHeaderViewImpl.r;
                }
                return Integer.valueOf(intValue);
            case 17:
                return ((RecyclerView) this.a).gA(((Integer) obj).intValue());
            case 18:
                File file = (File) obj;
                return this.a;
            case 19:
                final cru cruVar = (cru) this.a;
                crv crvVar = (crv) iin.h((iij) obj, new ihr() { // from class: crs
                    @Override // defpackage.ihr
                    public final ihs a(iij iijVar) {
                        lfb g;
                        cru cruVar2 = cru.this;
                        llk e = llp.e();
                        String str3 = new String(iijVar.e.D());
                        if (str3.startsWith(")]}'")) {
                            str3 = str3.substring(4);
                        }
                        JSONArray jSONArray = new JSONArray(new JSONObject(str3).getJSONObject("ischj").getString("results"));
                        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i4);
                            Uri parse = Uri.parse(jSONObject.getString("ou"));
                            if (!iin.d(parse)) {
                                g = ldu.a;
                            } else {
                                Uri parse2 = Uri.parse(jSONObject.getString("tu"));
                                String str4 = null;
                                if (true != iin.d(parse2)) {
                                    parse2 = null;
                                }
                                cqo t2 = cqp.t();
                                t2.n(jSONObject.getInt("ow"));
                                t2.f(jSONObject.getInt("oh"));
                                t2.a = parse2;
                                t2.h(parse);
                                t2.b = jSONObject.getString("ru");
                                t2.c = jSONObject.getString("rh");
                                t2.g(jSONObject.getString("id"));
                                t2.l("gif");
                                t2.e(mbr.IMAGE_SEARCH_GIF);
                                t2.j(iil.l);
                                if (jSONObject.has("pu")) {
                                    t2.d = Uri.parse(jSONObject.getString("pu"));
                                }
                                if (jSONObject.has("os")) {
                                    str4 = jSONObject.getString("os");
                                }
                                if (str4 != null && str4.endsWith("MB")) {
                                    try {
                                        double parseFloat = Float.parseFloat(str4.substring(0, str4.length() - 2));
                                        gvu gvuVar = gvu.BYTES;
                                        gvu gvuVar2 = gvu.MEBIBYTES;
                                        double d2 = gvuVar.h;
                                        Double.isNaN(d2);
                                        double d3 = d2 * 1048576.0d;
                                        double d4 = gvuVar2.h;
                                        Double.isNaN(d4);
                                        if (parseFloat > d3 / d4) {
                                            g = ldu.a;
                                        }
                                    } catch (NumberFormatException e2) {
                                        ((ltd) ((ltd) ((ltd) crt.a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/expression/imagesearch/ImageSearchFetcher", "exceedSizeLimit", 177, "ImageSearchFetcher.java")).w("Error with parsing size string: %s", str4);
                                    }
                                }
                                g = lfb.g(t2.a());
                            }
                            if (g.e()) {
                                e.h((cqp) g.a());
                            }
                        }
                        kgo b = crv.b();
                        b.d(iijVar);
                        b.e(cruVar2.c);
                        b.f(e.g());
                        b.g(jSONArray.length());
                        return b.c();
                    }
                }, new byi(cruVar, 20));
                if (iin.i(crvVar)) {
                    if (!iin.i(crvVar) || crvVar.b <= 0) {
                        z = false;
                    }
                    return hjd.a(crvVar, z);
                }
                throw new iht(crvVar);
            default:
                Object obj3 = this.a;
                kgo b = crv.b();
                b.d((iij) obj);
                b.e(((cru) obj3).c);
                return b.c();
        }
    }
}

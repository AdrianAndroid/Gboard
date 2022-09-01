package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IBitmojiExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IGifKeyboardExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IStickerExtension;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.apps.inputmethod.libs.search.contentsuggestion.ContentSuggestionKeyboard;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonKeyboardTablet;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonRecyclerView;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardTablet;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.sticker.StickerFavoritePacksReorderActivity;
import com.google.android.inputmethod.latin.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dzk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dzk implements his {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dzk(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ dzk(ContentSuggestionKeyboard contentSuggestionKeyboard, int i) {
        this.b = i;
        this.a = contentSuggestionKeyboard;
    }

    public /* synthetic */ dzk(EmoticonKeyboardTablet emoticonKeyboardTablet, int i) {
        this.b = i;
        this.a = emoticonKeyboardTablet;
    }

    public /* synthetic */ dzk(GifKeyboardTablet gifKeyboardTablet, int i) {
        this.b = i;
        this.a = gifKeyboardTablet;
    }

    public /* synthetic */ dzk(StickerFavoritePacksReorderActivity stickerFavoritePacksReorderActivity, int i) {
        this.b = i;
        this.a = stickerFavoritePacksReorderActivity;
    }

    public /* synthetic */ dzk(dzl dzlVar, int i) {
        this.b = i;
        this.a = dzlVar;
    }

    public /* synthetic */ dzk(eaz eazVar, int i) {
        this.b = i;
        this.a = eazVar;
    }

    public /* synthetic */ dzk(egm egmVar, int i) {
        this.b = i;
        this.a = egmVar;
    }

    public /* synthetic */ dzk(egp egpVar, int i) {
        this.b = i;
        this.a = egpVar;
    }

    public /* synthetic */ dzk(ehi ehiVar, int i) {
        this.b = i;
        this.a = ehiVar;
    }

    public /* synthetic */ dzk(ehp ehpVar, int i) {
        this.b = i;
        this.a = ehpVar;
    }

    /* JADX WARN: Type inference failed for: r2v26, types: [hga, hsz] */
    @Override // defpackage.his
    public final void a(Object obj, Object obj2) {
        int i;
        View x;
        int i2;
        switch (this.b) {
            case 0:
                ((dzl) this.a).f(((dzq) obj).a(), ((Integer) obj2).intValue());
                return;
            case 1:
                dzq dzqVar = (dzq) obj;
                Integer num = (Integer) obj2;
                dzl.e((Context) this.a);
                return;
            case 2:
                ((dzl) this.a).f(((dzq) obj).d(), ((Integer) obj2).intValue());
                return;
            case 3:
                ((ContentSuggestionKeyboard) this.a).H(((dzq) obj).d(), ((Integer) obj2).intValue());
                return;
            case 4:
                dzq dzqVar2 = (dzq) obj;
                Integer num2 = (Integer) obj2;
                ((ContentSuggestionKeyboard) this.a).A();
                return;
            case 5:
                ((ContentSuggestionKeyboard) this.a).H(((dzq) obj).a(), ((Integer) obj2).intValue());
                return;
            case 6:
                Object obj3 = this.a;
                ibz ibzVar = (ibz) obj2;
                if (((hsy) obj) == null) {
                    return;
                }
                eaz eazVar = (eaz) obj3;
                if (ibzVar != ibz.a(eazVar.ac())) {
                    return;
                }
                eazVar.m = true;
                dbn dbnVar = (dbn) obj3;
                if (!dbnVar.h) {
                    return;
                }
                ((dyu) obj3).ah();
                dbnVar.z().z(hfd.d(new iay(-10104, null, new icz(ibzVar.l, dip.j(lfd.d(eazVar.j), hfl.INTERNAL)))));
                return;
            case 7:
                Object obj4 = this.a;
                ebd ebdVar = (ebd) obj;
                int intValue = ((Integer) obj2).intValue();
                if (intValue != -1) {
                    EmoticonKeyboardTablet emoticonKeyboardTablet = (EmoticonKeyboardTablet) obj4;
                    if (intValue != emoticonKeyboardTablet.i) {
                        BindingRecyclerView bindingRecyclerView = emoticonKeyboardTablet.h;
                        if (bindingRecyclerView != null) {
                            cuj a = bindingRecyclerView.a();
                            if (a != null) {
                                a.D(emoticonKeyboardTablet.i, false);
                                a.D(intValue, true);
                            }
                            BindingRecyclerView bindingRecyclerView2 = emoticonKeyboardTablet.h;
                            if (bindingRecyclerView2 != null) {
                                bindingRecyclerView2.ae(intValue);
                            }
                        }
                        emoticonKeyboardTablet.i = intValue;
                        EmoticonRecyclerView emoticonRecyclerView = emoticonKeyboardTablet.g;
                        if (emoticonRecyclerView != null) {
                            emoticonKeyboardTablet.A(emoticonRecyclerView, emoticonKeyboardTablet.t(intValue));
                        }
                    }
                }
                EmoticonKeyboardTablet emoticonKeyboardTablet2 = (EmoticonKeyboardTablet) obj4;
                int i3 = emoticonKeyboardTablet2.i;
                String t = emoticonKeyboardTablet2.t(i3);
                emoticonKeyboardTablet2.e.j("pref_key_emoticon_last_category_opened", t);
                idk idkVar = emoticonKeyboardTablet2.d;
                ctd ctdVar = ctd.CATEGORY_SWITCH;
                Object[] objArr = new Object[1];
                nfh t2 = mbc.p.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbc mbcVar = (mbc) t2.b;
                mbcVar.b = 5;
                mbcVar.a |= 1;
                mbc mbcVar2 = (mbc) t2.b;
                mbcVar2.c = 1;
                mbcVar2.a |= 2;
                nfh t3 = mbb.g.t();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                mbb mbbVar = (mbb) t3.b;
                int i4 = mbbVar.a | 1;
                mbbVar.a = i4;
                mbbVar.b = t;
                mbbVar.c = 2;
                int i5 = 2 | i4;
                mbbVar.a = i5;
                mbbVar.a = 4 | i5;
                mbbVar.d = i3;
                mba mbaVar = emoticonKeyboardTablet2.H(t) ? mba.RECENTS : mba.UNKNOWN;
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                mbb mbbVar2 = (mbb) t3.b;
                mbbVar2.e = mbaVar.e;
                mbbVar2.a |= 8;
                mbb mbbVar3 = (mbb) t3.cz();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbc mbcVar3 = (mbc) t2.b;
                mbbVar3.getClass();
                mbcVar3.e = mbbVar3;
                mbcVar3.a |= 8;
                objArr[0] = t2.cz();
                idkVar.e(ctdVar, objArr);
                return;
            case 8:
                Object obj5 = this.a;
                edw edwVar = (edw) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GifKeyboardTablet gifKeyboardTablet = (GifKeyboardTablet) obj5;
                BindingRecyclerView bindingRecyclerView3 = gifKeyboardTablet.l;
                cuj a2 = bindingRecyclerView3 != null ? bindingRecyclerView3.a() : null;
                if (a2 != null && (i = gifKeyboardTablet.m) != -1) {
                    a2.D(i, false);
                    gifKeyboardTablet.m = -1;
                }
                edp edpVar = edp.NO_NETWORK;
                if (edwVar.b() - 1 != 2) {
                    ((AbstractSearchResultKeyboard) obj5).o = "";
                    gifKeyboardTablet.m = intValue2;
                    gifKeyboardTablet.R(intValue2 - 1, 6);
                    return;
                }
                gifKeyboardTablet.v.z(hfd.d(new iay(-10102, null, IGifKeyboardExtension.class)));
                return;
            case 9:
                Object obj6 = this.a;
                cqp cqpVar = (cqp) obj;
                int intValue3 = ((Integer) obj2).intValue();
                cww.c(cqpVar);
                ((egm) obj6).l(cqpVar, intValue3);
                return;
            case 10:
                ((egm) this.a).l(((cww) obj).a(), ((Integer) obj2).intValue());
                return;
            case 11:
                Object obj7 = this.a;
                efx efxVar = (efx) obj;
                int intValue4 = ((Integer) obj2).intValue();
                egp egpVar = (egp) obj7;
                int i6 = egpVar.l;
                if (i6 != -1) {
                    egpVar.n.D(i6, false);
                    egpVar.l = -1;
                }
                if (efxVar.b() - 1 != 2) {
                    egpVar.n.D(intValue4, true);
                    egpVar.j = "";
                    egpVar.c.d();
                    egpVar.b.B(intValue4, true, 3);
                    egpVar.l = intValue4;
                    return;
                }
                egpVar.f.z(hfd.d(new iay(-10102, null, IBitmojiExtension.class)));
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj8 = this.a;
                cqp cqpVar2 = (cqp) obj;
                int intValue5 = ((Integer) obj2).intValue();
                cww.c(cqpVar2);
                ((egp) obj8).l(cqpVar2, intValue5);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((egp) this.a).l(((cww) obj).a(), ((Integer) obj2).intValue());
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ehi) this.a).k((ehj) obj, ((Integer) obj2).intValue());
                return;
            case 15:
                Object obj9 = this.a;
                cqp cqpVar3 = (cqp) obj;
                int intValue6 = ((Integer) obj2).intValue();
                cww.c(cqpVar3);
                ((ehp) obj9).q(cqpVar3, intValue6);
                return;
            case 16:
                Object obj10 = this.a;
                cww cwwVar = (cww) obj;
                int intValue7 = ((Integer) obj2).intValue();
                ehp ehpVar = (ehp) obj10;
                int i7 = ehpVar.g.k;
                if (i7 != -1 && ((Boolean) ehy.r.c()).booleanValue()) {
                    ehj j = ehpVar.g.j(i7);
                    if (j.a() == 7 && (x = ehpVar.c.x(Integer.valueOf(ehi.g(i7)))) != null) {
                        ehpVar.g(j.b(), true);
                        cuj a3 = ehp.c(x).a();
                        if (a3 != null) {
                            a3.C(0, ejj.b);
                        }
                        ehpVar.j.e(ctf.FEATURED_PACK_INTERACTION, cth.ADDED_THROUGH_SHARE_FROM_CATEGORY);
                    }
                }
                ehpVar.q(cwwVar.a(), intValue7);
                return;
            case 17:
                egu eguVar = (egu) obj;
                ehp ehpVar2 = (ehp) this.a;
                ehpVar2.q = ((Integer) obj2).intValue();
                egt egtVar = egt.REGULAR_STICKER_PACK;
                eho ehoVar = eho.NONE;
                int ordinal = eguVar.b().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        eguVar.d();
                        ehpVar2.j.e(ctd.BITMOJI_PROMO_GET_CLICKED, new Object[0]);
                        efz.b(ehpVar2.b);
                        return;
                    }
                    ehpVar2.j.e(ctf.FEATURED_PACK_INTERACTION, cth.PACK_DETAIL_OPENED_FROM_BROWSE);
                }
                cxc e = eguVar.e();
                int indexOf = ehpVar2.o.d.indexOf(e);
                if (indexOf == -1) {
                    ((ltd) ((ltd) ehp.a.c()).k("com/google/android/apps/inputmethod/libs/search/sticker/PagerController", "onClickBrowseItem", 832, "PagerController.java")).w("Failed to open pack details for %s", e.b);
                    int indexOf2 = ehpVar2.o.e.indexOf(e);
                    if (indexOf2 == -1) {
                        throw new IllegalStateException("Cannot handle clicked browse pack".concat(String.valueOf(e.b)));
                    }
                    ehpVar2.m(ehpVar2.o, indexOf2 + 3);
                    return;
                }
                ehi ehiVar = ehpVar2.g;
                ega egaVar = new ega(ehpVar2, 11);
                ehiVar.n(1);
                if (!ehiVar.e.b.equals(ehi.d)) {
                    ehiVar.e.g(ehi.d);
                    View view = ehiVar.h;
                    if (view != null) {
                        view.setOnClickListener(new edc(egaVar, 4));
                        ehiVar.e.k(cov.a().h());
                    } else {
                        cou couVar = ehiVar.e;
                        emv a4 = cov.a();
                        osr a5 = coq.a();
                        a5.u(col.IMAGE_RESOURCE);
                        a5.e = cok.a(-20000);
                        czp a6 = com.a();
                        a6.i(R.drawable.f50010_resource_name_obfuscated_res_0x7f080323);
                        a6.h(R.string.f167160_resource_name_obfuscated_res_0x7f14092c);
                        a6.c = 2;
                        a5.c = a6.f();
                        a4.d = a5.t();
                        couVar.k(a4.h());
                    }
                }
                ehiVar.g.B();
                ehiVar.k = -1;
                ehiVar.i = egaVar;
                ehiVar.j = eie.b;
                ehpVar2.j(eho.PACK_DETAILS);
                ehpVar2.c.B(indexOf, true, 3);
                ehpVar2.p(indexOf, 3);
                return;
            case 18:
                Object obj11 = this.a;
                egu eguVar2 = (egu) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (eguVar2.b() == egt.FEATURED_STICKER_PACK) {
                    ehp ehpVar3 = (ehp) obj11;
                    i2 = ehpVar3.o.k;
                    if (booleanValue) {
                        ehpVar3.j.e(ctf.FEATURED_PACK_INTERACTION, cth.ADDED_FROM_BROWSE);
                    }
                } else {
                    i2 = 1;
                }
                ehp ehpVar4 = (ehp) obj11;
                ehpVar4.u.h(eguVar2.e(), booleanValue);
                ehpVar4.h(eguVar2.e().b, booleanValue);
                idk idkVar2 = ehpVar4.j;
                ctd ctdVar2 = ctd.FAVORITING;
                Object[] objArr2 = new Object[1];
                nfh t4 = mbc.p.t();
                if (t4.c) {
                    t4.cD();
                    t4.c = false;
                }
                mbc mbcVar4 = (mbc) t4.b;
                mbcVar4.b = 3;
                mbcVar4.a |= 1;
                mbc mbcVar5 = (mbc) t4.b;
                mbcVar5.c = 1;
                mbcVar5.a |= 2;
                nfh t5 = mbe.d.t();
                int i8 = true != booleanValue ? 3 : 2;
                if (t5.c) {
                    t5.cD();
                    t5.c = false;
                }
                mbe mbeVar = (mbe) t5.b;
                mbeVar.c = i8 - 1;
                mbeVar.a = 2 | mbeVar.a;
                String str = eguVar2.e().b;
                if (t5.c) {
                    t5.cD();
                    t5.c = false;
                }
                mbe mbeVar2 = (mbe) t5.b;
                str.getClass();
                mbeVar2.a |= 1;
                mbeVar2.b = str;
                mbe mbeVar3 = (mbe) t5.cz();
                if (t4.c) {
                    t4.cD();
                    t4.c = false;
                }
                mbc mbcVar6 = (mbc) t4.b;
                mbeVar3.getClass();
                mbcVar6.i = mbeVar3;
                int i9 = mbcVar6.a | 512;
                mbcVar6.a = i9;
                int i10 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                mbcVar6.l = i10;
                mbcVar6.a = i9 | 4096;
                objArr2[0] = t4.cz();
                idkVar2.e(ctdVar2, objArr2);
                ehpVar4.o = ehpVar4.o.f(ehpVar4.u);
                ehpVar4.g.m(ehpVar4.o, 1);
                ehpVar4.t = true;
                return;
            case 19:
                Object obj12 = this.a;
                ehj ehjVar = (ehj) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (ehjVar.a() != 5) {
                    ((ehp) obj12).i();
                }
                egt egtVar2 = egt.REGULAR_STICKER_PACK;
                eho ehoVar2 = eho.NONE;
                int a7 = ehjVar.a() - 1;
                if (a7 != 0) {
                    if (a7 == 1) {
                        ehp ehpVar5 = (ehp) obj12;
                        ehpVar5.j(eho.BROWSE_PACKS);
                        ehpVar5.o = ehpVar5.o.b();
                        ehpVar5.o = ehpVar5.o.c(ehpVar5.h);
                        ehpVar5.c.B(ehi.g(1), true, 3);
                        ehpVar5.j.e(ctd.STICKER_REVAMP_BROWSE_CLICKED, new Object[0]);
                    } else if (a7 == 2) {
                        ehp ehpVar6 = (ehp) obj12;
                        ehpVar6.j(eho.MY_PACKS);
                        ehpVar6.c.B(ehi.g(2), true, 3);
                    } else if (a7 == 3) {
                        ehp ehpVar7 = (ehp) obj12;
                        Context context = ehpVar7.b;
                        EditorInfo l = ehpVar7.f.l();
                        Intent intent = new Intent(context, StickerFavoritePacksReorderActivity.class);
                        if (context.getApplicationContext() instanceof knl) {
                            knn knnVar = (knn) ((knl) context.getApplicationContext()).b();
                            if (knnVar.h == null) {
                                knnVar.h = new kfl((char[]) null);
                            }
                        }
                        intent.putExtra("EDITOR_INFO_EXTRA", l);
                        intent.addFlags(8421376);
                        dax.a(context, intent);
                        ehpVar7.j.e(ctd.STICKER_SETTING_ICON_CLICKED, new Object[0]);
                    } else if (a7 == 4) {
                        ehp ehpVar8 = (ehp) obj12;
                        ehpVar8.k.z(hfd.d(new iay(-10059, null, llw.n("extension_interface", IStickerExtension.class, "activation_source", hfl.INTERNAL, "query", ehpVar8.r))));
                    } else if (a7 != 6) {
                        throw new IllegalStateException("No stickerPromo headeritem should be created in sticker revamp peer keyboard.");
                    }
                    ((ehp) obj12).o(ehjVar, intValue8, 3);
                    return;
                }
                ehp ehpVar9 = (ehp) obj12;
                ehpVar9.j(eho.MY_PACKS);
                ehpVar9.c.B(ehi.g(intValue8), true, 3);
                ((ehp) obj12).o(ehjVar, intValue8, 3);
                return;
            default:
                Object obj13 = this.a;
                int intValue9 = ((Integer) obj).intValue();
                int intValue10 = ((Integer) obj2).intValue();
                StickerFavoritePacksReorderActivity stickerFavoritePacksReorderActivity = (StickerFavoritePacksReorderActivity) obj13;
                cxc cxcVar = (cxc) stickerFavoritePacksReorderActivity.k.z(cxc.class, intValue9);
                ehf ehfVar = stickerFavoritePacksReorderActivity.l;
                cst cstVar = (cst) ehfVar.a.a();
                if (cstVar == null || cstVar.b() != 1) {
                    throw new IllegalStateException("Fail to fetch favorite pack list.");
                }
                ehfVar.a.h(cog.f(ehfVar.c.g((llp) cstVar.d(), intValue9, intValue10)));
                ieh j2 = ieh.j();
                ctd ctdVar3 = ctd.FAVORITING;
                Object[] objArr3 = new Object[1];
                nfh t6 = mbc.p.t();
                if (t6.c) {
                    t6.cD();
                    t6.c = false;
                }
                mbc mbcVar7 = (mbc) t6.b;
                mbcVar7.b = 3;
                mbcVar7.a |= 1;
                mbc mbcVar8 = (mbc) t6.b;
                mbcVar8.c = 7;
                mbcVar8.a |= 2;
                nfh t7 = mbe.d.t();
                int i11 = intValue9 > intValue10 ? 4 : 5;
                if (t7.c) {
                    t7.cD();
                    t7.c = false;
                }
                mbe mbeVar4 = (mbe) t7.b;
                mbeVar4.c = i11 - 1;
                int i12 = mbeVar4.a | 2;
                mbeVar4.a = i12;
                String str2 = cxcVar.b;
                str2.getClass();
                mbeVar4.a = i12 | 1;
                mbeVar4.b = str2;
                mbe mbeVar5 = (mbe) t7.cz();
                if (t6.c) {
                    t6.cD();
                    t6.c = false;
                }
                mbc mbcVar9 = (mbc) t6.b;
                mbeVar5.getClass();
                mbcVar9.i = mbeVar5;
                mbcVar9.a |= 512;
                objArr3[0] = t6.cz();
                j2.e(ctdVar3, objArr3);
                return;
        }
    }
}

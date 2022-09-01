package defpackage;

import android.view.View;
import com.google.android.apps.inputmethod.libs.expression.extension.IStickerExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IUniversalMediaExtension;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardTablet;

/* compiled from: PG */
/* renamed from: eim  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eim implements his {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eim(UniversalMediaKeyboardTablet universalMediaKeyboardTablet, int i) {
        this.b = i;
        this.a = universalMediaKeyboardTablet;
    }

    public /* synthetic */ eim(eis eisVar, int i) {
        this.b = i;
        this.a = eisVar;
    }

    public /* synthetic */ eim(hfp hfpVar, int i) {
        this.b = i;
        this.a = hfpVar;
    }

    @Override // defpackage.his
    public final void a(Object obj, Object obj2) {
        int i;
        int i2;
        ehj i3;
        View x;
        int i4;
        switch (this.b) {
            case 0:
                Object obj3 = this.a;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                eis eisVar = (eis) obj3;
                cxc cxcVar = (cxc) eisVar.n.e.get(intValue);
                eisVar.x.g(eisVar.n.e, intValue, intValue2);
                eisVar.n = eisVar.n.f(eisVar.x);
                eisVar.s();
                ieh j = ieh.j();
                ctd ctdVar = ctd.FAVORITING;
                Object[] objArr = new Object[1];
                nfh t = mbc.p.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar = (mbc) t.b;
                mbcVar.b = 3;
                mbcVar.a |= 1;
                mbc mbcVar2 = (mbc) t.b;
                mbcVar2.c = 7;
                mbcVar2.a |= 2;
                nfh t2 = mbe.d.t();
                int i5 = intValue > intValue2 ? 4 : 5;
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mbe mbeVar = (mbe) t2.b;
                mbeVar.c = i5 - 1;
                int i6 = mbeVar.a | 2;
                mbeVar.a = i6;
                String str = cxcVar.b;
                str.getClass();
                mbeVar.a = i6 | 1;
                mbeVar.b = str;
                mbe mbeVar2 = (mbe) t2.cz();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mbc mbcVar3 = (mbc) t.b;
                mbeVar2.getClass();
                mbcVar3.i = mbeVar2;
                mbcVar3.a |= 512;
                objArr[0] = t.cz();
                j.e(ctdVar, objArr);
                return;
            case 1:
                Object obj4 = this.a;
                ehj ehjVar = (ehj) obj;
                int intValue3 = ((Integer) obj2).intValue();
                eis eisVar2 = (eis) obj4;
                cuj a = eisVar2.v.a();
                if (a != null && (i2 = eisVar2.p) != -1) {
                    a.D(i2, false);
                    eisVar2.p = -1;
                }
                if (ehjVar.a() != 5) {
                    eisVar2.m();
                    if (eisVar2.t.get()) {
                        cuj a2 = eisVar2.v.a();
                        if (a2 != null) {
                            a2.K(efq.b(""));
                            a2.D(0, false);
                        }
                        eisVar2.t.set(false);
                    }
                    if (a != null) {
                        a.D(intValue3, true);
                        eisVar2.p = intValue3;
                    }
                }
                egt egtVar = egt.REGULAR_STICKER_PACK;
                eir eirVar = eir.NONE;
                int a3 = ehjVar.a() - 1;
                if (a3 != 0) {
                    if (a3 == 1) {
                        eisVar2.n(eir.BROWSE_PACKS);
                        eisVar2.n = eisVar2.n.b();
                        eisVar2.n = eisVar2.n.c(eisVar2.g);
                        eisVar2.c.B(ehi.g(1), true, 3);
                        eisVar2.i.e(ctd.STICKER_REVAMP_BROWSE_CLICKED, new Object[0]);
                    } else if (a3 == 2) {
                        eisVar2.n(eir.MY_PACKS);
                        eisVar2.r(eisVar2.n, intValue3, false, false);
                        i = 3;
                        eisVar2.c.B(ehi.g(2), true, 3);
                        eisVar2.t(ehjVar, intValue3, i);
                        return;
                    } else if (a3 == 3) {
                        eisVar2.n(eir.REORDER);
                        eisVar2.c.B(eisVar2.n.e.size() + 3, true, 3);
                        eisVar2.i.e(ctd.STICKER_SETTING_ICON_CLICKED, new Object[0]);
                    } else if (a3 == 4) {
                        eisVar2.j.z(hfd.d(new iay(-10059, null, llw.n("extension_interface", IStickerExtension.class, "activation_source", hfl.INTERNAL, "query", eisVar2.r))));
                    } else if (a3 != 6) {
                        throw new IllegalStateException("No stickerPromo headeritem should be created in sticker revamp peer keyboard.");
                    }
                    i = 3;
                    eisVar2.t(ehjVar, intValue3, i);
                    return;
                }
                eisVar2.n(eir.MY_PACKS);
                eisVar2.r(eisVar2.n, intValue3, false, false);
                i = 3;
                eisVar2.c.B(ehi.g(intValue3), true, 3);
                eisVar2.t(ehjVar, intValue3, i);
                return;
            case 2:
                Object obj5 = this.a;
                cqp cqpVar = (cqp) obj;
                int intValue4 = ((Integer) obj2).intValue();
                cww.c(cqpVar);
                ((eis) obj5).v(cqpVar, intValue4);
                return;
            case 3:
                Object obj6 = this.a;
                cww cwwVar = (cww) obj;
                int intValue5 = ((Integer) obj2).intValue();
                eis eisVar3 = (eis) obj6;
                int i7 = eisVar3.p;
                if (i7 != -1 && ((Boolean) ehy.r.c()).booleanValue() && (i3 = eisVar3.i(i7)) != null && i3.a() == 7 && (x = eisVar3.c.x(Integer.valueOf(ehi.g(i7)))) != null) {
                    eisVar3.k(i3.b(), true);
                    cuj a4 = eis.h(x).a();
                    if (a4 != null) {
                        a4.C(0, ejj.b);
                    }
                    eisVar3.i.e(ctf.FEATURED_PACK_INTERACTION, cth.ADDED_THROUGH_SHARE_FROM_CATEGORY);
                }
                eisVar3.v(cwwVar.a(), intValue5);
                return;
            case 4:
                egu eguVar = (egu) obj;
                eis eisVar4 = (eis) this.a;
                eisVar4.q = ((Integer) obj2).intValue();
                egt egtVar2 = egt.REGULAR_STICKER_PACK;
                eir eirVar2 = eir.NONE;
                int ordinal = eguVar.b().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        eguVar.d();
                        eisVar4.i.e(ctd.BITMOJI_PROMO_GET_CLICKED, new Object[0]);
                        efz.b(eisVar4.b);
                        return;
                    }
                    eisVar4.i.e(ctf.FEATURED_PACK_INTERACTION, cth.PACK_DETAIL_OPENED_FROM_BROWSE);
                }
                cxc e = eguVar.e();
                int indexOf = eisVar4.n.d.indexOf(e);
                if (indexOf == -1) {
                    ((ltd) ((ltd) eis.a.c()).k("com/google/android/apps/inputmethod/libs/search/sticker/TabletPagerController", "onClickBrowseItem", 996, "TabletPagerController.java")).w("Failed to open pack details for %s", e.b);
                    int indexOf2 = eisVar4.n.e.indexOf(e);
                    if (indexOf2 == -1) {
                        throw new IllegalStateException("Cannot handle clicked browse pack".concat(String.valueOf(e.b)));
                    }
                    eisVar4.q(eisVar4.n, indexOf2 + 3);
                    return;
                }
                eisVar4.n(eir.PACK_DETAILS);
                eisVar4.c.B(indexOf, true, 3);
                eisVar4.u(indexOf, 3);
                return;
            case 5:
                Object obj7 = this.a;
                egu eguVar2 = (egu) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (eguVar2.b() == egt.FEATURED_STICKER_PACK) {
                    eis eisVar5 = (eis) obj7;
                    i4 = eisVar5.n.k;
                    if (booleanValue) {
                        eisVar5.i.e(ctf.FEATURED_PACK_INTERACTION, cth.ADDED_FROM_BROWSE);
                    }
                } else {
                    i4 = 1;
                }
                eis eisVar6 = (eis) obj7;
                eisVar6.x.h(eguVar2.e(), booleanValue);
                eisVar6.l(eguVar2.e().b, booleanValue);
                idk idkVar = eisVar6.i;
                ctd ctdVar2 = ctd.FAVORITING;
                Object[] objArr2 = new Object[1];
                nfh t3 = mbc.p.t();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                mbc mbcVar4 = (mbc) t3.b;
                mbcVar4.b = 3;
                mbcVar4.a |= 1;
                mbc mbcVar5 = (mbc) t3.b;
                mbcVar5.c = 1;
                mbcVar5.a |= 2;
                nfh t4 = mbe.d.t();
                int i8 = true != booleanValue ? 3 : 2;
                if (t4.c) {
                    t4.cD();
                    t4.c = false;
                }
                mbe mbeVar3 = (mbe) t4.b;
                mbeVar3.c = i8 - 1;
                mbeVar3.a = 2 | mbeVar3.a;
                String str2 = eguVar2.e().b;
                if (t4.c) {
                    t4.cD();
                    t4.c = false;
                }
                mbe mbeVar4 = (mbe) t4.b;
                str2.getClass();
                mbeVar4.a |= 1;
                mbeVar4.b = str2;
                mbe mbeVar5 = (mbe) t4.cz();
                if (t3.c) {
                    t3.cD();
                    t3.c = false;
                }
                mbc mbcVar6 = (mbc) t3.b;
                mbeVar5.getClass();
                mbcVar6.i = mbeVar5;
                int i9 = mbcVar6.a | 512;
                mbcVar6.a = i9;
                int i10 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                mbcVar6.l = i10;
                mbcVar6.a = i9 | 4096;
                objArr2[0] = t3.cz();
                idkVar.e(ctdVar2, objArr2);
                eisVar6.n = eisVar6.n.f(eisVar6.x);
                eisVar6.s();
                eisVar6.u = true;
                return;
            case 6:
                Object obj8 = this.a;
                ejv ejvVar = (ejv) obj;
                int intValue6 = ((Integer) obj2).intValue();
                UniversalMediaKeyboardTablet universalMediaKeyboardTablet = (UniversalMediaKeyboardTablet) obj8;
                BindingRecyclerView bindingRecyclerView = universalMediaKeyboardTablet.m;
                cuj a5 = bindingRecyclerView != null ? bindingRecyclerView.a() : null;
                edp edpVar = edp.NO_NETWORK;
                ekg ekgVar = ekg.LOADING;
                int b = ejvVar.b() - 1;
                if (b == 1) {
                    universalMediaKeyboardTablet.v.z(hfd.d(new iay(-10102, null, IUniversalMediaExtension.class)));
                    return;
                } else if (b != 2) {
                    int i11 = universalMediaKeyboardTablet.n;
                    if (i11 != -1 && a5 != null) {
                        a5.D(i11, false);
                        a5.D(intValue6, true);
                    }
                    universalMediaKeyboardTablet.n = intValue6;
                    universalMediaKeyboardTablet.P(ejvVar.a());
                    universalMediaKeyboardTablet.L();
                    return;
                } else {
                    int i12 = universalMediaKeyboardTablet.n;
                    if (i12 != -1 && a5 != null) {
                        a5.D(i12, false);
                        a5.D(1, true);
                    }
                    universalMediaKeyboardTablet.n = 1;
                    ((AbstractSearchResultKeyboard) obj8).o = null;
                    universalMediaKeyboardTablet.N();
                    universalMediaKeyboardTablet.L();
                    return;
                }
            case 7:
                hfx hfxVar = (hfx) obj2;
                hfp hfpVar = (hfp) this.a;
                hfw a6 = hfpVar.a((Class) obj);
                if (a6 == null) {
                    return;
                }
                a6.B();
                ifw ifwVar = a6.g;
                if (ifwVar != hfxVar) {
                    if (ifwVar != null) {
                        ((ltd) ((ltd) hfw.a.d()).k("com/google/android/libraries/inputmethod/extension/ExtensionWrapper", "onModuleCreated", 124, "ExtensionWrapper.java")).w("%s is already initialized with a different instance", a6.f.getCanonicalName());
                    }
                    hfw.ai(a6.g, null);
                    hfw.ai(hfxVar, a6);
                    a6.g = hfxVar;
                }
                hfpVar.i(a6);
                return;
            default:
                Object obj9 = this.a;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                hfp hfpVar2 = (hfp) obj9;
                hfw a7 = hfpVar2.a((Class) obj);
                if (a7 == null) {
                    return;
                }
                hfpVar2.k(a7, booleanValue2);
                return;
        }
    }
}

package defpackage;

import com.google.android.apps.inputmethod.libs.expression.extension.IGifKeyboardExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IUniversalMediaExtension;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonRecyclerView;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.richsymbol.RichSymbolKeyboard;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.widget.CategoryViewPager;

/* compiled from: PG */
/* renamed from: edx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class edx implements cot {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ edx(EmoticonKeyboardM2 emoticonKeyboardM2, int i) {
        this.b = i;
        this.a = emoticonKeyboardM2;
    }

    public /* synthetic */ edx(GifKeyboardM2 gifKeyboardM2, int i) {
        this.b = i;
        this.a = gifKeyboardM2;
    }

    public /* synthetic */ edx(RichSymbolKeyboard richSymbolKeyboard, int i) {
        this.b = i;
        this.a = richSymbolKeyboard;
    }

    public /* synthetic */ edx(UniversalMediaKeyboardM2 universalMediaKeyboardM2, int i) {
        this.b = i;
        this.a = universalMediaKeyboardM2;
    }

    public /* synthetic */ edx(egf egfVar, int i) {
        this.b = i;
        this.a = egfVar;
    }

    public /* synthetic */ edx(ehi ehiVar, int i) {
        this.b = i;
        this.a = ehiVar;
    }

    @Override // defpackage.cot
    public final void a(cok cokVar, boolean z) {
        CategoryViewPager categoryViewPager;
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            int i2 = cokVar.a;
            switch (i2) {
                case -10004:
                    if (z) {
                        GifKeyboardM2 gifKeyboardM2 = (GifKeyboardM2) obj;
                        gifKeyboardM2.S(lre.X(gifKeyboardM2.j, new cjm(cokVar, 17)), 3);
                        return;
                    }
                    ((ltd) ((ltd) GifKeyboardM2.a.b()).k("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifKeyboardM2", "handleHeaderClick", 1011, "GifKeyboardM2.java")).t("handleHeaderClick() : Already selected category.");
                    return;
                case -10003:
                    ((GifKeyboardM2) obj).v.z(hfd.d(new iay(-10059, null, llw.n("extension_interface", IGifKeyboardExtension.class, "activation_source", hfl.INTERNAL, "query", ((AbstractSearchResultKeyboard) obj).U()))));
                    return;
                case -10002:
                    ((AbstractSearchResultKeyboard) obj).o = null;
                    GifKeyboardM2 gifKeyboardM22 = (GifKeyboardM2) obj;
                    gifKeyboardM22.T(gifKeyboardM22.t());
                    return;
                case -10001:
                    ((GifKeyboardM2) obj).v.z(hfd.d(new iay(-10102, null, IGifKeyboardExtension.class)));
                    return;
                default:
                    ((ltd) ((ltd) GifKeyboardM2.a.c()).k("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifKeyboardM2", "handleHeaderClick", 1015, "GifKeyboardM2.java")).u("handleHeaderClick() : Unknown event code %d.", i2);
                    return;
            }
        } else if (i == 1) {
            Object obj2 = this.a;
            if (cokVar.a != -10004) {
                ((ltd) ((ltd) EmoticonKeyboardM2.a.c()).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "handleHeaderClick", 779, "EmoticonKeyboardM2.java")).u("handleHeaderClick() : Invalid event code received: %d", cokVar.a);
            } else if (!z) {
                ((ltd) ((ltd) EmoticonKeyboardM2.a.b()).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "handleHeaderClick", 775, "EmoticonKeyboardM2.java")).w("handleHeaderClick() : User selected same category %s.", cokVar.b);
            } else {
                String str = cokVar.b;
                EmoticonKeyboardM2 emoticonKeyboardM2 = (EmoticonKeyboardM2) obj2;
                if (emoticonKeyboardM2.c) {
                    CategoryViewPager categoryViewPager2 = emoticonKeyboardM2.g;
                    if (categoryViewPager2 == null) {
                        return;
                    }
                    categoryViewPager2.B(emoticonKeyboardM2.m(str), true, 3);
                    return;
                }
                EmoticonRecyclerView emoticonRecyclerView = emoticonKeyboardM2.f;
                if (emoticonRecyclerView == null) {
                    return;
                }
                emoticonKeyboardM2.H(emoticonRecyclerView, str);
                cou couVar = emoticonKeyboardM2.h;
                if (couVar == null) {
                    return;
                }
                int i3 = couVar.f().c;
                emoticonKeyboardM2.K(i3, 3);
                boe boeVar = emoticonKeyboardM2.i;
                if (boeVar == null) {
                    return;
                }
                boeVar.l(i3);
            }
        } else if (i == 2) {
            Object obj3 = this.a;
            if (cokVar.a != -10004) {
                ((ltd) ((ltd) RichSymbolKeyboard.a.c()).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "handleHeaderClick", 599, "RichSymbolKeyboard.java")).u("handleHeaderClick() : Invalid event code received: %d", cokVar.a);
                return;
            }
            String str2 = cokVar.b;
            if (!z || (categoryViewPager = ((RichSymbolKeyboard) obj3).e) == null) {
                ((ltd) ((ltd) RichSymbolKeyboard.a.b()).k("com/google/android/apps/inputmethod/libs/search/richsymbol/RichSymbolKeyboard", "handleHeaderClick", 595, "RichSymbolKeyboard.java")).w("handleHeaderClick() : User selected same category %s.", cokVar.b);
            } else {
                categoryViewPager.B(RichSymbolKeyboard.l(str2), true, 3);
            }
        } else if (i != 3) {
            if (i == 4) {
                Object obj4 = this.a;
                int i4 = cokVar.a;
                if (i4 != -20000) {
                    switch (i4) {
                        case -10003:
                        case -10001:
                            ((ehi) obj4).k(efq.b(""), 0);
                            return;
                        case -10002:
                            ((ehi) obj4).j.run();
                            return;
                        default:
                            ((ltd) ((ltd) ehi.a.d()).k("com/google/android/apps/inputmethod/libs/search/sticker/HeaderController", "onHeaderElementClicked", 385, "HeaderController.java")).u("Header event unhandled %d", cokVar.a);
                            return;
                    }
                }
                ((ehi) obj4).i.run();
                return;
            }
            Object obj5 = this.a;
            int i5 = cokVar.a;
            switch (i5) {
                case -10003:
                    ((UniversalMediaKeyboardM2) obj5).v.z(hfd.d(new iay(-10059, null, llw.n("extension_interface", IUniversalMediaExtension.class, "activation_source", hfl.INTERNAL, "query", ((AbstractSearchResultKeyboard) obj5).U()))));
                    return;
                case -10002:
                    ((AbstractSearchResultKeyboard) obj5).o = null;
                    UniversalMediaKeyboardM2 universalMediaKeyboardM2 = (UniversalMediaKeyboardM2) obj5;
                    universalMediaKeyboardM2.L();
                    universalMediaKeyboardM2.N();
                    return;
                case -10001:
                    ((UniversalMediaKeyboardM2) obj5).v.z(hfd.d(new iay(-10102, null, IUniversalMediaExtension.class)));
                    return;
                default:
                    ((ltd) UniversalMediaKeyboardM2.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "onHeaderElementClicked", 1219, "UniversalMediaKeyboardM2.java")).u("No click handler for event code %d", i5);
                    return;
            }
        } else {
            Object obj6 = this.a;
            switch (cokVar.a) {
                case -10004:
                    if (!z) {
                        return;
                    }
                    egf egfVar = (egf) obj6;
                    int i6 = egfVar.e.f().c;
                    egfVar.f.b.B(i6, true, 3);
                    boe boeVar2 = egfVar.j;
                    if (boeVar2 == null) {
                        return;
                    }
                    boeVar2.l(i6);
                    return;
                case -10003:
                    egf egfVar2 = (egf) obj6;
                    egfVar2.d.z(hfd.d(new iay(-10059, null, llw.n("extension_interface", egf.b, "activation_source", hfl.INTERNAL, "query", egfVar2.h))));
                    return;
                case -10002:
                    egf egfVar3 = (egf) obj6;
                    egfVar3.d("");
                    cou couVar2 = egfVar3.e;
                    cpc a = cpd.a();
                    a.b = 3;
                    couVar2.g(a.a());
                    llp llpVar = egfVar3.i;
                    if (!llpVar.isEmpty()) {
                        egfVar3.f(llpVar);
                        return;
                    } else {
                        egfVar3.j();
                        return;
                    }
                case -10001:
                    ((egf) obj6).d.z(hfd.d(new iay(-10102, null, egf.b)));
                    return;
                default:
                    ((ltd) ((ltd) egf.a.d()).k("com/google/android/apps/inputmethod/libs/search/sticker/BitmojiKeyboardPeer", "onHeaderElementClicked", 640, "BitmojiKeyboardPeer.java")).u("Header event unhandled %d", cokVar.a);
                    return;
            }
        }
    }
}

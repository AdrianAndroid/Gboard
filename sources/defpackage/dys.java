package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.apps.inputmethod.libs.search.contentsuggestion.ContentSuggestionKeyboard;
import com.google.android.apps.inputmethod.libs.search.emoji.search.SearchKeyboardEmojiSpecializerM2;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonKeyboardTablet;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonRecyclerView;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifKeyboardTablet;
import com.google.android.apps.inputmethod.libs.search.gif.keyboard.GifSearchKeyboard;
import com.google.android.apps.inputmethod.libs.search.widget.CategoryViewPager;
import com.google.android.apps.inputmethod.libs.search.widget.VerticalScrollAnimatedImageSidebarHolderView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.Collection$EL;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dys  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dys implements hiu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dys(ContentSuggestionKeyboard contentSuggestionKeyboard, int i) {
        this.b = i;
        this.a = contentSuggestionKeyboard;
    }

    public /* synthetic */ dys(SearchKeyboardEmojiSpecializerM2 searchKeyboardEmojiSpecializerM2, int i) {
        this.b = i;
        this.a = searchKeyboardEmojiSpecializerM2;
    }

    public /* synthetic */ dys(EmoticonKeyboardM2 emoticonKeyboardM2, int i) {
        this.b = i;
        this.a = emoticonKeyboardM2;
    }

    public /* synthetic */ dys(EmoticonKeyboardTablet emoticonKeyboardTablet, int i) {
        this.b = i;
        this.a = emoticonKeyboardTablet;
    }

    public /* synthetic */ dys(GifKeyboardM2 gifKeyboardM2, int i) {
        this.b = i;
        this.a = gifKeyboardM2;
    }

    public /* synthetic */ dys(GifKeyboardTablet gifKeyboardTablet, int i) {
        this.b = i;
        this.a = gifKeyboardTablet;
    }

    public /* synthetic */ dys(GifSearchKeyboard gifSearchKeyboard, int i) {
        this.b = i;
        this.a = gifSearchKeyboard;
    }

    public /* synthetic */ dys(dwq dwqVar, int i) {
        this.b = i;
        this.a = dwqVar;
    }

    public /* synthetic */ dys(dyt dytVar, int i) {
        this.b = i;
        this.a = dytVar;
    }

    public /* synthetic */ dys(dyu dyuVar, int i) {
        this.b = i;
        this.a = dyuVar;
    }

    public /* synthetic */ dys(dzl dzlVar, int i) {
        this.b = i;
        this.a = dzlVar;
    }

    public /* synthetic */ dys(edq edqVar, int i) {
        this.b = i;
        this.a = edqVar;
    }

    public /* synthetic */ dys(egf egfVar, int i) {
        this.b = i;
        this.a = egfVar;
    }

    public /* synthetic */ dys(leq leqVar, int i) {
        this.b = i;
        this.a = leqVar;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [leq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [deq, java.lang.Object] */
    @Override // defpackage.hiu
    public final void a(Object obj) {
        SoftKeyboardView softKeyboardView;
        SoftKeyboardView softKeyboardView2;
        ViewGroup viewGroup;
        edo edoVar;
        boolean z = false;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                byy byyVar = (byy) obj;
                if (byyVar == null || byyVar.i()) {
                    return;
                }
                byy byyVar2 = (byy) ((dyt) obj2).h.getAndSet(byyVar);
                if (byyVar.equals(byyVar2)) {
                    return;
                }
                dyt.d = true;
                if (byyVar2 == null) {
                    return;
                }
                byyVar2.close();
                return;
            case 1:
                hkz hkzVar = (hkz) obj;
                ((dwq) this.a).a();
                return;
            case 2:
                llp llpVar = (llp) obj;
                dyu dyuVar = (dyu) this.a;
                hsy hsyVar = dyuVar.e;
                if (hsyVar == null) {
                    ((ltd) ((ltd) dyu.i.c()).k("com/google/android/apps/inputmethod/libs/search/AbstractSearchExtension", "onAutoCompletionResults", 319, "AbstractSearchExtension.java")).t("keyboard is null");
                    return;
                }
                List ad = dyu.ad(llpVar, 1);
                ad.addAll(dyuVar.af());
                hsyVar.r(ad, null, false);
                return;
            case 3:
                ?? r0 = this.a;
                Throwable th = (Throwable) obj;
                ((ltd) ((ltd) dzl.a.d()).k("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionConsumer", "lambda$fetchZeroStateResults$1", 211, "ContentSuggestionConsumer.java")).t("Failed to fetch zero state results");
                r0.a(null);
                return;
            case 4:
                Object obj3 = this.a;
                dzp dzpVar = (dzp) obj;
                if (!dzpVar.a.k().isEmpty()) {
                    ((dzl) obj3).c(dzpVar);
                    return;
                }
                dzl dzlVar = (dzl) obj3;
                dzlVar.j = hjq.a(dzlVar.c).g(dzpVar.a.s()).a(ebl.f(new dzs(dzlVar, dzpVar, 1))).q();
                return;
            case 5:
                dzl dzlVar2 = (dzl) this.a;
                dzlVar2.k.b(new dvc(dzlVar2, (Throwable) obj, 3));
                return;
            case 6:
                Object obj4 = this.a;
                eak eakVar = (eak) obj;
                if (eakVar.a()) {
                    ContentSuggestionKeyboard contentSuggestionKeyboard = (ContentSuggestionKeyboard) obj4;
                    contentSuggestionKeyboard.t();
                    contentSuggestionKeyboard.u();
                    return;
                }
                boolean booleanValue = ((Boolean) dzn.k.c()).booleanValue();
                llp llpVar2 = eakVar.a.isEmpty() ? eakVar.c : eakVar.a;
                llp llpVar3 = booleanValue ? llpVar2 : eakVar.b;
                if (booleanValue) {
                    llpVar2 = eakVar.b;
                }
                if (!llpVar3.isEmpty()) {
                    ContentSuggestionKeyboard contentSuggestionKeyboard2 = (ContentSuggestionKeyboard) obj4;
                    contentSuggestionKeyboard2.g.J((Collection) Collection$EL.stream(llpVar3).map(dwn.h).collect(ljr.a));
                    if (!llpVar2.isEmpty()) {
                        contentSuggestionKeyboard2.g.A(dzc.a);
                    }
                }
                ContentSuggestionKeyboard contentSuggestionKeyboard3 = (ContentSuggestionKeyboard) obj4;
                contentSuggestionKeyboard3.g.J((Collection) Collection$EL.stream(llpVar2).map(dwn.h).collect(ljr.a));
                contentSuggestionKeyboard3.g.A(dzd.a);
                return;
            case 7:
                Object obj5 = this.a;
                Throwable th2 = (Throwable) obj;
                ((ltd) ((ltd) ContentSuggestionKeyboard.a.d()).k("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionKeyboard", "lambda$changeUiState$7", 636, "ContentSuggestionKeyboard.java")).t("Failed to fetch zero state results");
                ContentSuggestionKeyboard contentSuggestionKeyboard4 = (ContentSuggestionKeyboard) obj5;
                contentSuggestionKeyboard4.t();
                contentSuggestionKeyboard4.u();
                return;
            case 8:
                Object obj6 = this.a;
                dzp dzpVar2 = (dzp) obj;
                if (!dzpVar2.a.k().isEmpty()) {
                    ((ContentSuggestionKeyboard) obj6).m(dzpVar2);
                    return;
                }
                ContentSuggestionKeyboard contentSuggestionKeyboard5 = (ContentSuggestionKeyboard) obj6;
                contentSuggestionKeyboard5.i = hjq.a(contentSuggestionKeyboard5.u).g(dzpVar2.a.s()).a(ebl.f(new dzs(contentSuggestionKeyboard5, dzpVar2, 0))).q();
                return;
            case 9:
                ContentSuggestionKeyboard contentSuggestionKeyboard6 = (ContentSuggestionKeyboard) this.a;
                contentSuggestionKeyboard6.f.b(new dvc(contentSuggestionKeyboard6, (Throwable) obj, 6));
                return;
            case 10:
                ((SearchKeyboardEmojiSpecializerM2) this.a).N((llp) obj);
                return;
            case 11:
                Object obj7 = this.a;
                ((ltd) ((ltd) ((ltd) SearchKeyboardEmojiSpecializerM2.a.d()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/libs/search/emoji/search/SearchKeyboardEmojiSpecializerM2", "lambda$showRecentlyPickedEmojis$4", (char) 293, "SearchKeyboardEmojiSpecializerM2.java")).t("Failed to fetch recent emojis");
                ((SearchKeyboardEmojiSpecializerM2) obj7).N(llp.q());
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ?? r02 = this.a;
                EmoticonKeyboardM2 emoticonKeyboardM2 = (EmoticonKeyboardM2) r02;
                int l = emoticonKeyboardM2.l((llp) obj);
                cou couVar = emoticonKeyboardM2.h;
                if (couVar != null) {
                    cpc a = cpd.a();
                    a.b = 3;
                    couVar.g(a.a());
                    emv a2 = cov.a();
                    osr a3 = coq.a();
                    a3.u(col.IMAGE_RESOURCE);
                    czp a4 = com.a();
                    a4.i(R.drawable.f49970_resource_name_obfuscated_res_0x7f08031f);
                    a4.h(R.string.f159050_resource_name_obfuscated_res_0x7f14059c);
                    a4.c = 1;
                    a3.c = a4.f();
                    a3.e = cok.b(emoticonKeyboardM2.u(0));
                    a2.i(a3.t());
                    int i = 1;
                    while (true) {
                        llp llpVar4 = EmoticonKeyboardM2.b;
                        if (i < ((lrl) llpVar4).c) {
                            String string = emoticonKeyboardM2.u.getString(((Integer) llpVar4.get(i)).intValue());
                            String lowerCase = string.toLowerCase(Locale.ROOT);
                            osr a5 = coq.a();
                            a5.u(col.TEXT);
                            con a6 = coo.a();
                            a6.d(string);
                            a6.b(lowerCase);
                            a5.b = a6.a();
                            a5.e = cok.b(emoticonKeyboardM2.u(i));
                            a2.i(a5.t());
                            i++;
                        } else {
                            a2.j(cox.b(l));
                            couVar.k(a2.h());
                        }
                    }
                } else {
                    ((ltd) EmoticonKeyboardM2.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardM2", "lambda$onActivate$1", 369, "EmoticonKeyboardM2.java")).t("Couldn't display header elements because controller was null.");
                }
                CategoryViewPager categoryViewPager = emoticonKeyboardM2.g;
                if (categoryViewPager != null) {
                    categoryViewPager.k(new ebh(emoticonKeyboardM2.u, r02));
                    categoryViewPager.z(new edy(emoticonKeyboardM2, 1));
                    categoryViewPager.C(l);
                    return;
                }
                EmoticonRecyclerView emoticonRecyclerView = emoticonKeyboardM2.f;
                if (emoticonRecyclerView == null || (softKeyboardView = emoticonKeyboardM2.e) == null) {
                    return;
                }
                emoticonKeyboardM2.w(emoticonRecyclerView, softKeyboardView);
                emoticonKeyboardM2.H(emoticonKeyboardM2.f, emoticonKeyboardM2.u(l));
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                EmoticonKeyboardTablet emoticonKeyboardTablet = (EmoticonKeyboardTablet) this.a;
                int l2 = emoticonKeyboardTablet.l((llp) obj);
                emoticonKeyboardTablet.i = l2;
                if (emoticonKeyboardTablet.h != null) {
                    llk e = llp.e();
                    String string2 = emoticonKeyboardTablet.u.getString(((Integer) EmoticonKeyboardTablet.b.get(0)).intValue());
                    string2.getClass();
                    e.h(new ebb(string2));
                    int i2 = 1;
                    while (true) {
                        llp llpVar5 = EmoticonKeyboardTablet.b;
                        if (i2 < ((lrl) llpVar5).c) {
                            String string3 = emoticonKeyboardTablet.u.getString(((Integer) llpVar5.get(i2)).intValue());
                            string3.getClass();
                            e.h(new eba(string3));
                            i2++;
                        } else {
                            llp g = e.g();
                            BindingRecyclerView bindingRecyclerView = emoticonKeyboardTablet.h;
                            if (bindingRecyclerView != null) {
                                bindingRecyclerView.ab(new GridLayoutManager(1, 1));
                                Context context = emoticonKeyboardTablet.u;
                                lls h = llw.h();
                                cjq cjqVar = new cjq(emoticonKeyboardTablet.u, new dzk(emoticonKeyboardTablet, 7), 8);
                                gmi i3 = cnx.i();
                                i3.o();
                                i3.c = dzr.m;
                                i3.n(R.layout.f133600_resource_name_obfuscated_res_0x7f0e0038, cjqVar);
                                i3.n(R.layout.f133640_resource_name_obfuscated_res_0x7f0e003c, cjqVar);
                                h.a(ebd.class, i3.m());
                                bindingRecyclerView.aa(cnx.f(h, context, null, null));
                                cuj a7 = emoticonKeyboardTablet.h.a();
                                if (a7 != null) {
                                    a7.G(g);
                                    a7.D(l2, true);
                                }
                            }
                            BindingRecyclerView bindingRecyclerView2 = emoticonKeyboardTablet.h;
                            if (bindingRecyclerView2 != null) {
                                bindingRecyclerView2.ae(l2);
                            }
                        }
                    }
                } else {
                    ((ltd) EmoticonKeyboardTablet.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "lambda$onActivate$0", 329, "EmoticonKeyboardTablet.java")).t("Couldn't display header elements because controller was null.");
                }
                EmoticonRecyclerView emoticonRecyclerView2 = emoticonKeyboardTablet.g;
                if (emoticonRecyclerView2 == null || (softKeyboardView2 = emoticonKeyboardTablet.f) == null) {
                    return;
                }
                emoticonKeyboardTablet.u(emoticonRecyclerView2, softKeyboardView2);
                emoticonKeyboardTablet.A(emoticonKeyboardTablet.g, emoticonKeyboardTablet.t(l2));
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                llp llpVar6 = (llp) obj;
                edq edqVar = (edq) this.a;
                edqVar.b = null;
                VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = edqVar.d;
                if (verticalScrollAnimatedImageSidebarHolderView != null && edqVar.h(verticalScrollAnimatedImageSidebarHolderView)) {
                    z = true;
                }
                if (llpVar6.isEmpty()) {
                    if (z) {
                        edqVar.f();
                        return;
                    } else {
                        edqVar.g(new NoSuchElementException());
                        return;
                    }
                }
                ((ltd) ((ltd) edq.a.b()).k("com/google/android/apps/inputmethod/libs/search/gif/GifInfiniteScrollFetcher", "onData", 156, "GifInfiniteScrollFetcher.java")).u("Fetched %d images", llpVar6.size());
                VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView2 = edqVar.d;
                if (verticalScrollAnimatedImageSidebarHolderView2 != null && (viewGroup = edqVar.e) != null && (edoVar = edqVar.c) != null) {
                    edoVar.c(verticalScrollAnimatedImageSidebarHolderView2, viewGroup, llpVar6);
                }
                if (llpVar6.size() > 5 || !z) {
                    return;
                }
                edqVar.f();
                return;
            case 15:
                ((edq) this.a).g((Throwable) obj);
                return;
            case 16:
                GifKeyboardM2 gifKeyboardM2 = (GifKeyboardM2) this.a;
                gifKeyboardM2.j = (llp) obj;
                if (gifKeyboardM2.f != null) {
                    gifKeyboardM2.T(gifKeyboardM2.t());
                    return;
                } else {
                    ((ltd) GifKeyboardM2.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifKeyboardM2", "lambda$onActivate$2", 307, "GifKeyboardM2.java")).t("Couldn't display header elements because controller was null.");
                    return;
                }
            case 17:
                GifKeyboardTablet gifKeyboardTablet = (GifKeyboardTablet) this.a;
                gifKeyboardTablet.i = (llp) obj;
                gifKeyboardTablet.R(gifKeyboardTablet.l(), 2);
                return;
            case 18:
                ((GifSearchKeyboard) this.a).Q((llp) obj);
                return;
            case 19:
                Object obj8 = this.a;
                ((ltd) ((ltd) ((ltd) GifSearchKeyboard.a.c()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/libs/search/gif/keyboard/GifSearchKeyboard", "lambda$fetchTrendingSearchTerm$1", (char) 225, "GifSearchKeyboard.java")).t("Error getting Tenor trending search terms.");
                ((GifSearchKeyboard) obj8).Q(llp.q());
                return;
            default:
                Object obj9 = this.a;
                llp llpVar7 = (llp) obj;
                if (llpVar7.isEmpty()) {
                    return;
                }
                egf egfVar = (egf) obj9;
                egfVar.g.e(ctf.BITMOJI_CONTEXTUAL_PACKS, csx.CONTEXTUAL_BITMOJI_CATEGORY_SUGGESTED);
                int size = llpVar7.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (((cxc) llpVar7.get(i4)).g.size() < ((Long) cwz.e.c()).intValue()) {
                        egfVar.g.e(ctf.BITMOJI_CONTEXTUAL_PACKS, csx.CONTEXTUAL_BITMOJI_CATEGORY_DROPPED_FEW_RESULTS);
                    }
                }
                return;
        }
    }
}

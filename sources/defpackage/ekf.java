package defpackage;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardTablet;
import com.google.android.apps.inputmethod.libs.search.widget.VerticalScrollAnimatedImageSidebarHolderView;

/* compiled from: PG */
/* renamed from: ekf  reason: default package */
/* loaded from: classes.dex */
public final class ekf implements edo {
    final /* synthetic */ AbstractSearchResultKeyboard a;
    private final /* synthetic */ int b;

    public ekf(UniversalMediaKeyboardM2 universalMediaKeyboardM2, int i) {
        this.b = i;
        this.a = universalMediaKeyboardM2;
    }

    public ekf(UniversalMediaKeyboardTablet universalMediaKeyboardTablet, int i) {
        this.b = i;
        this.a = universalMediaKeyboardTablet;
    }

    @Override // defpackage.edo
    public final void b(VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView, ViewGroup viewGroup) {
        if (this.b == 0) {
            ((UniversalMediaKeyboardTablet) this.a).l = SystemClock.elapsedRealtime();
            if (!verticalScrollAnimatedImageSidebarHolderView.aJ()) {
                return;
            }
            idk idkVar = ((UniversalMediaKeyboardTablet) this.a).e;
            ctd ctdVar = ctd.UNIVERSAL_MEDIA_MORE_GIFS_REQUESTED;
            AbstractSearchResultKeyboard abstractSearchResultKeyboard = this.a;
            idkVar.e(ctdVar, ((UniversalMediaKeyboardTablet) abstractSearchResultKeyboard).h, abstractSearchResultKeyboard.U(), UniversalMediaKeyboardTablet.V(), ((UniversalMediaKeyboardTablet) this.a).u());
            return;
        }
        ((UniversalMediaKeyboardM2) this.a).l = SystemClock.elapsedRealtime();
        if (!verticalScrollAnimatedImageSidebarHolderView.aJ()) {
            return;
        }
        idk idkVar2 = ((UniversalMediaKeyboardM2) this.a).e;
        ctd ctdVar2 = ctd.UNIVERSAL_MEDIA_MORE_GIFS_REQUESTED;
        AbstractSearchResultKeyboard abstractSearchResultKeyboard2 = this.a;
        idkVar2.e(ctdVar2, ((UniversalMediaKeyboardM2) abstractSearchResultKeyboard2).h, abstractSearchResultKeyboard2.U(), UniversalMediaKeyboardM2.T(), ((UniversalMediaKeyboardM2) this.a).u());
    }

    @Override // defpackage.edo
    public final void c(VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView, ViewGroup viewGroup, llp llpVar) {
        if (this.b != 0) {
            ((ltd) ((ltd) UniversalMediaKeyboardM2.a.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2$2", "onResults", 269, "UniversalMediaKeyboardM2.java")).u("Gif fetcher succeeded with %d results", llpVar.size());
            AbstractSearchResultKeyboard abstractSearchResultKeyboard = this.a;
            if (!abstractSearchResultKeyboard.C) {
                ((ltd) ((ltd) UniversalMediaKeyboardM2.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2$2", "onResults", 271, "UniversalMediaKeyboardM2.java")).t("called on inactive keyboard");
                return;
            }
            ((UniversalMediaKeyboardM2) abstractSearchResultKeyboard).Q();
            UniversalMediaKeyboardM2 universalMediaKeyboardM2 = (UniversalMediaKeyboardM2) this.a;
            universalMediaKeyboardM2.i = false;
            ((ltd) ((ltd) UniversalMediaKeyboardM2.a.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "handleAppendGifsSuccess", 974, "UniversalMediaKeyboardM2.java")).u("handleAppendGifs(): Received %d GIFs", llpVar.size());
            VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView2 = universalMediaKeyboardM2.f;
            if (verticalScrollAnimatedImageSidebarHolderView2 != null) {
                verticalScrollAnimatedImageSidebarHolderView2.aE(llpVar);
                universalMediaKeyboardM2.R(universalMediaKeyboardM2.f.aJ() ? eka.GIF_DATA : eka.GIF_NO_RESULT_ERROR);
            }
            universalMediaKeyboardM2.S();
            return;
        }
        ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet$2", "onResults", 267, "UniversalMediaKeyboardTablet.java")).u("Gif fetcher succeeded with %d results", llpVar.size());
        AbstractSearchResultKeyboard abstractSearchResultKeyboard2 = this.a;
        if (!abstractSearchResultKeyboard2.C) {
            ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet$2", "onResults", 269, "UniversalMediaKeyboardTablet.java")).t("called on inactive keyboard");
            return;
        }
        ((UniversalMediaKeyboardTablet) abstractSearchResultKeyboard2).R();
        UniversalMediaKeyboardTablet universalMediaKeyboardTablet = (UniversalMediaKeyboardTablet) this.a;
        universalMediaKeyboardTablet.i = false;
        ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "handleAppendGifsSuccess", 975, "UniversalMediaKeyboardTablet.java")).u("handleAppendGifs(): Received %d GIFs", llpVar.size());
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView3 = universalMediaKeyboardTablet.f;
        if (verticalScrollAnimatedImageSidebarHolderView3 != null) {
            verticalScrollAnimatedImageSidebarHolderView3.aE(llpVar);
            universalMediaKeyboardTablet.S(universalMediaKeyboardTablet.f.aJ() ? ekg.GIF_DATA : ekg.GIF_NO_RESULT_ERROR);
        }
        universalMediaKeyboardTablet.T();
    }

    @Override // defpackage.edo
    public final void a(VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView, ViewGroup viewGroup, edp edpVar) {
        if (this.b != 0) {
            ((ltd) ((ltd) UniversalMediaKeyboardM2.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2$2", "onError", 284, "UniversalMediaKeyboardM2.java")).w("Gif fetcher failed with error: %s", edpVar);
            AbstractSearchResultKeyboard abstractSearchResultKeyboard = this.a;
            if (!abstractSearchResultKeyboard.C) {
                ((ltd) ((ltd) UniversalMediaKeyboardM2.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2$2", "onError", 286, "UniversalMediaKeyboardM2.java")).t("GifDelegate#onError(): called on inactive keyboard");
                return;
            }
            ((UniversalMediaKeyboardM2) abstractSearchResultKeyboard).Q();
            UniversalMediaKeyboardM2 universalMediaKeyboardM2 = (UniversalMediaKeyboardM2) this.a;
            universalMediaKeyboardM2.i = false;
            VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView2 = universalMediaKeyboardM2.f;
            if (verticalScrollAnimatedImageSidebarHolderView2 == null || !verticalScrollAnimatedImageSidebarHolderView2.aJ()) {
                edp edpVar2 = edp.NO_NETWORK;
                eka ekaVar = eka.LOADING;
                int ordinal = edpVar.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    ((ltd) ((ltd) UniversalMediaKeyboardM2.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "handleAppendGifsError", 997, "UniversalMediaKeyboardM2.java")).t("handleAppendGifs(): The HTTP connection failed");
                    universalMediaKeyboardM2.R(eka.GIF_CONNECTION_ERROR);
                } else if (ordinal == 3) {
                    ((ltd) ((ltd) UniversalMediaKeyboardM2.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "handleAppendGifsError", 991, "UniversalMediaKeyboardM2.java")).t("handleAppendGifs(): No GIF results were found");
                    universalMediaKeyboardM2.R(eka.GIF_NO_RESULT_ERROR);
                }
                universalMediaKeyboardM2.S();
                return;
            }
            ((ltd) ((ltd) UniversalMediaKeyboardM2.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "handleAppendGifsError", 985, "UniversalMediaKeyboardM2.java")).u("handleAppendGifsError(): Ignored error %d since images exist", edpVar.ordinal());
            return;
        }
        ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet$2", "onError", 282, "UniversalMediaKeyboardTablet.java")).w("Gif fetcher failed with error: %s", edpVar);
        AbstractSearchResultKeyboard abstractSearchResultKeyboard2 = this.a;
        if (!abstractSearchResultKeyboard2.C) {
            ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet$2", "onError", 284, "UniversalMediaKeyboardTablet.java")).t("GifDelegate#onError(): called on inactive keyboard");
            return;
        }
        ((UniversalMediaKeyboardTablet) abstractSearchResultKeyboard2).R();
        UniversalMediaKeyboardTablet universalMediaKeyboardTablet = (UniversalMediaKeyboardTablet) this.a;
        universalMediaKeyboardTablet.i = false;
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView3 = universalMediaKeyboardTablet.f;
        if (verticalScrollAnimatedImageSidebarHolderView3 == null || !verticalScrollAnimatedImageSidebarHolderView3.aJ()) {
            edp edpVar3 = edp.NO_NETWORK;
            ekg ekgVar = ekg.LOADING;
            int ordinal2 = edpVar.ordinal();
            if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
                ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "handleAppendGifsError", 998, "UniversalMediaKeyboardTablet.java")).t("handleAppendGifs(): The HTTP connection failed");
                universalMediaKeyboardTablet.S(ekg.GIF_CONNECTION_ERROR);
            } else if (ordinal2 == 3) {
                ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "handleAppendGifsError", 992, "UniversalMediaKeyboardTablet.java")).t("handleAppendGifs(): No GIF results were found");
                universalMediaKeyboardTablet.S(ekg.GIF_NO_RESULT_ERROR);
            }
            universalMediaKeyboardTablet.T();
            return;
        }
        ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "handleAppendGifsError", 986, "UniversalMediaKeyboardTablet.java")).u("handleAppendGifsError(): Ignored error %d since images exist", edpVar.ordinal());
    }
}

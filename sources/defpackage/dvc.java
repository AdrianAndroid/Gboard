package defpackage;

import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.apps.inputmethod.libs.proactivesuggestion.ProactiveSuggestionsClippableHolderView;
import com.google.android.apps.inputmethod.libs.search.contentsuggestion.ContentSuggestionKeyboard;
import com.google.android.apps.inputmethod.libs.search.emoji.search.SearchKeyboardEmojiSpecializerM2;
import com.google.android.inputmethod.latin.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dvc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dvc implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dvc(ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView, llp llpVar, int i) {
        this.c = i;
        this.a = proactiveSuggestionsClippableHolderView;
        this.b = llpVar;
    }

    public /* synthetic */ dvc(ContentSuggestionKeyboard contentSuggestionKeyboard, Throwable th, int i) {
        this.c = i;
        this.a = contentSuggestionKeyboard;
        this.b = th;
    }

    public /* synthetic */ dvc(SearchKeyboardEmojiSpecializerM2 searchKeyboardEmojiSpecializerM2, Editable editable, int i) {
        this.c = i;
        this.b = searchKeyboardEmojiSpecializerM2;
        this.a = editable;
    }

    public /* synthetic */ dvc(SearchKeyboardEmojiSpecializerM2 searchKeyboardEmojiSpecializerM2, String str, int i) {
        this.c = i;
        this.a = searchKeyboardEmojiSpecializerM2;
        this.b = str;
    }

    public /* synthetic */ dvc(dvf dvfVar, fii fiiVar, int i) {
        this.c = i;
        this.a = dvfVar;
        this.b = fiiVar;
    }

    public /* synthetic */ dvc(dvf dvfVar, Runnable runnable, int i) {
        this.c = i;
        this.a = dvfVar;
        this.b = runnable;
    }

    public /* synthetic */ dvc(dzl dzlVar, Throwable th, int i) {
        this.c = i;
        this.a = dzlVar;
        this.b = th;
    }

    public /* synthetic */ dvc(dzs dzsVar, axd axdVar, int i) {
        this.c = i;
        this.b = dzsVar;
        this.a = axdVar;
    }

    public /* synthetic */ dvc(dzs dzsVar, axd axdVar, int i, byte[] bArr) {
        this.c = i;
        this.b = dzsVar;
        this.a = axdVar;
    }

    public /* synthetic */ dvc(dzs dzsVar, dzp dzpVar, int i) {
        this.c = i;
        this.b = dzsVar;
        this.a = dzpVar;
    }

    public /* synthetic */ dvc(dzs dzsVar, dzp dzpVar, int i, byte[] bArr) {
        this.c = i;
        this.a = dzsVar;
        this.b = dzpVar;
    }

    public /* synthetic */ dvc(eau eauVar, Runnable runnable, int i) {
        this.c = i;
        this.a = eauVar;
        this.b = runnable;
    }

    public /* synthetic */ dvc(egf egfVar, String str, int i) {
        this.c = i;
        this.a = egfVar;
        this.b = str;
    }

    public /* synthetic */ dvc(egj egjVar, String str, int i) {
        this.c = i;
        this.a = egjVar;
        this.b = str;
    }

    public /* synthetic */ dvc(ehp ehpVar, BindingRecyclerView bindingRecyclerView, int i) {
        this.c = i;
        this.b = ehpVar;
        this.a = bindingRecyclerView;
    }

    public /* synthetic */ dvc(eie eieVar, String str, int i) {
        this.c = i;
        this.a = eieVar;
        this.b = str;
    }

    public /* synthetic */ dvc(eij eijVar, String str, int i) {
        this.c = i;
        this.a = eijVar;
        this.b = str;
    }

    public /* synthetic */ dvc(eis eisVar, BindingRecyclerView bindingRecyclerView, int i) {
        this.c = i;
        this.b = eisVar;
        this.a = bindingRecyclerView;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                Object obj = this.a;
                ?? r1 = this.b;
                if (!((dvf) obj).g.get()) {
                    r1.run();
                    return;
                } else {
                    ((ltd) ((ltd) dvf.b.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/OrationRequestObserver", "lambda$runDeferredUiIfOrationStillActive$7", 270, "OrationRequestObserver.java")).t("Dropping update for invalidated oration.");
                    return;
                }
            case 1:
                Object obj2 = this.a;
                fii fiiVar = (fii) this.b;
                ((dvf) obj2).d.h((fiiVar.a == 3 ? (fhb) fiiVar.b : fhb.b).a);
                return;
            case 2:
                Object obj3 = this.a;
                ?? r12 = this.b;
                int size = r12.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    i = Math.max(i, ((View) r12.get(i2)).getHeight());
                }
                ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView = (ProactiveSuggestionsClippableHolderView) obj3;
                LinearLayout linearLayout = proactiveSuggestionsClippableHolderView.f;
                if (linearLayout == null || proactiveSuggestionsClippableHolderView.g == null || proactiveSuggestionsClippableHolderView.h == null || proactiveSuggestionsClippableHolderView.i == null) {
                    return;
                }
                if (i == 0 || linearLayout.getWidth() <= proactiveSuggestionsClippableHolderView.g.getWidth()) {
                    proactiveSuggestionsClippableHolderView.g();
                    return;
                }
                proactiveSuggestionsClippableHolderView.g.setOnScrollChangeListener(proactiveSuggestionsClippableHolderView.j);
                int dimensionPixelSize = proactiveSuggestionsClippableHolderView.getContext().getResources().getDimensionPixelSize(R.dimen.f41530_resource_name_obfuscated_res_0x7f0705f3);
                if (proactiveSuggestionsClippableHolderView.g.getHeight() < i) {
                    dimensionPixelSize = 0;
                }
                proactiveSuggestionsClippableHolderView.i.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
                proactiveSuggestionsClippableHolderView.h.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
                ProactiveSuggestionsClippableHolderView.i(proactiveSuggestionsClippableHolderView.h, proactiveSuggestionsClippableHolderView.i, proactiveSuggestionsClippableHolderView.g.getScrollX(), proactiveSuggestionsClippableHolderView.g.getWidth(), proactiveSuggestionsClippableHolderView.f.getWidth());
                return;
            case 3:
                ((dzl) this.a).d((Throwable) this.b);
                return;
            case 4:
                ((dzl) ((dzs) this.a).a).c((dzp) this.b);
                return;
            case 5:
                ((dzl) ((dzs) this.b).a).d((Throwable) this.a);
                return;
            case 6:
                ((ContentSuggestionKeyboard) this.a).w((Throwable) this.b);
                return;
            case 7:
                ((ContentSuggestionKeyboard) ((dzs) this.b).b).m((dzp) this.a);
                return;
            case 8:
                ((ContentSuggestionKeyboard) ((dzs) this.b).b).w((Throwable) this.a);
                return;
            case 9:
                Object obj4 = this.b;
                ?? r2 = this.a;
                if (TextUtils.isEmpty(r2)) {
                    SearchKeyboardEmojiSpecializerM2 searchKeyboardEmojiSpecializerM2 = (SearchKeyboardEmojiSpecializerM2) obj4;
                    searchKeyboardEmojiSpecializerM2.Q();
                    SearchKeyboardEmojiSpecializerM2.P(searchKeyboardEmojiSpecializerM2.f, 8);
                } else {
                    SearchKeyboardEmojiSpecializerM2 searchKeyboardEmojiSpecializerM22 = (SearchKeyboardEmojiSpecializerM2) obj4;
                    SearchKeyboardEmojiSpecializerM2.P(searchKeyboardEmojiSpecializerM22.f, 0);
                    String str = searchKeyboardEmojiSpecializerM22.b;
                    if (str != null) {
                        searchKeyboardEmojiSpecializerM22.L(str, r2.toString());
                        searchKeyboardEmojiSpecializerM22.b = null;
                    } else {
                        searchKeyboardEmojiSpecializerM22.L(r2.toString());
                    }
                }
                ((SearchKeyboardEmojiSpecializerM2) obj4).c = null;
                return;
            case 10:
                ((SearchKeyboardEmojiSpecializerM2) this.a).L((String) this.b);
                return;
            case 11:
                Object obj5 = this.a;
                ?? r13 = this.b;
                eau eauVar = (eau) obj5;
                eauVar.d.clear();
                r13.run();
                eauVar.g = new dbr(obj5, eauVar.c, eauVar.c());
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj6 = this.a;
                Object obj7 = this.b;
                egf egfVar = (egf) obj6;
                egfVar.k(3);
                egfVar.e((String) obj7);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj8 = this.a;
                Object obj9 = this.b;
                egf egfVar2 = (egf) obj8;
                egfVar2.k(3);
                egfVar2.e((String) obj9);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj10 = this.a;
                Object obj11 = this.b;
                egj egjVar = (egj) obj10;
                egjVar.j(3);
                egjVar.e((String) obj11);
                return;
            case 15:
                Object obj12 = this.a;
                Object obj13 = this.b;
                egj egjVar2 = (egj) obj12;
                egjVar2.j(3);
                egjVar2.e((String) obj13);
                return;
            case 16:
                ((RecyclerView) this.a).aC(((ehp) this.b).i);
                return;
            case 17:
                ((eie) this.a).e((String) this.b);
                return;
            case 18:
                ((eij) this.a).e((String) this.b);
                return;
            case 19:
                ((eij) this.a).b((String) this.b);
                return;
            default:
                ((RecyclerView) this.a).aC(((eis) this.b).h);
                return;
        }
    }
}

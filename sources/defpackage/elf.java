package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard;
import com.google.android.apps.inputmethod.libs.search.widget.SearchCandidateListHolderView;

/* compiled from: PG */
/* renamed from: elf  reason: default package */
/* loaded from: classes.dex */
public final class elf implements View.OnLongClickListener {
    final /* synthetic */ SearchCandidateListHolderView a;

    public elf(SearchCandidateListHolderView searchCandidateListHolderView) {
        this.a = searchCandidateListHolderView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int indexOf;
        SearchCandidateListHolderView searchCandidateListHolderView = this.a;
        if (searchCandidateListHolderView.e == null || (indexOf = searchCandidateListHolderView.b.indexOf(view)) < 0) {
            return false;
        }
        eep eepVar = (eep) this.a.e;
        if (eepVar.c == null || indexOf >= eepVar.b.size()) {
            ((ltd) eep.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/keyboard/SearchCandidateListController", "onRequestDeleteCandidate", 259, "SearchCandidateListController.java")).y("Tried to delete a candidate at position %d [size=%d]", indexOf, eepVar.b.size());
        } else {
            gsd gsdVar = eepVar.c;
            hln hlnVar = (hln) eepVar.b.get(indexOf);
            int j = efq.j(hlnVar.d);
            SearchKeyboard searchKeyboard = (SearchKeyboard) gsdVar.b;
            searchKeyboard.b.e(ctd.SEARCH_CANDIDATE_DELETE_REQUESTED, Integer.valueOf(searchKeyboard.l()), Integer.valueOf(j));
            if (j == 3) {
                SearchKeyboard searchKeyboard2 = (SearchKeyboard) gsdVar.b;
                if (searchKeyboard2.h != null) {
                    Object obj = gsdVar.a;
                    searchKeyboard2.c = new eet(searchKeyboard2, hlnVar);
                    searchKeyboard2.c.e();
                    guc.a.a((Context) obj, "DeleteSearchHistory");
                }
            }
        }
        return true;
    }
}

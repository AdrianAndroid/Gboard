package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hca  reason: default package */
/* loaded from: classes.dex */
public final class hca extends dz {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyScrollListener");
    private final hcg b;
    private int c = -1;

    public hca(hcg hcgVar) {
        this.b = hcgVar;
    }

    @Override // defpackage.dz
    public final void c(RecyclerView recyclerView, int i, int i2) {
        int L;
        if (!(recyclerView instanceof EmojiPickerBodyRecyclerView)) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyScrollListener", "onScrolled", 27, "EmojiPickerBodyScrollListener.java")).t("Scroll listener not attached to EmojiPickerBodyRecyclerView.");
            return;
        }
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = (EmojiPickerBodyRecyclerView) recyclerView;
        hbw hbwVar = (hbw) emojiPickerBodyRecyclerView.l;
        if (hbwVar == null) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyScrollListener", "onScrolled", 34, "EmojiPickerBodyScrollListener.java")).t("EmojiPickerBodyRecyclerView doesn't have an adapter.");
            return;
        }
        ly lyVar = emojiPickerBodyRecyclerView.m;
        if (!(lyVar instanceof GridLayoutManager)) {
            ((ltd) ((ltd) EmojiPickerBodyRecyclerView.S.c()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "findFirstCompletelyVisibleItemPosition", 162, "EmojiPickerBodyRecyclerView.java")).t("findFirstCompletelyVisibleItemPosition() : Cannot find layout manager.");
            L = -1;
        } else {
            L = ((GridLayoutManager) lyVar).L();
        }
        int i3 = this.c;
        if (i3 == L || L == -1) {
            return;
        }
        int x = i3 == -1 ? 0 : hbwVar.x(i3);
        int x2 = hbwVar.x(L);
        int i4 = emojiPickerBodyRecyclerView.T;
        this.b.l(L, L - hbwVar.z(x2));
        if ((x != x2 || x2 != i4) && (i != 0 || i2 != 0)) {
            this.b.H(x2, 5);
            emojiPickerBodyRecyclerView.T = x2;
        }
        this.c = L;
    }
}

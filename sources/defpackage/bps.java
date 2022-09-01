package defpackage;

import android.support.v7.widget.GridLayoutManager;
import com.google.android.apps.inputmethod.latin.keyboard.LatinSymbolsKeyboard;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;

/* compiled from: PG */
/* renamed from: bps  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bps implements hiu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bps(LatinSymbolsKeyboard latinSymbolsKeyboard, int i, int i2) {
        this.c = i2;
        this.b = latinSymbolsKeyboard;
        this.a = i;
    }

    public /* synthetic */ bps(hce hceVar, int i, int i2) {
        this.c = i2;
        this.b = hceVar;
        this.a = i;
    }

    @Override // defpackage.hiu
    public final void a(Object obj) {
        hdb hdbVar;
        int i;
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView;
        int N;
        int i2 = this.c;
        if (i2 == 0) {
            Object obj2 = this.b;
            int i3 = this.a;
            ((ltd) ((ltd) ((ltd) LatinSymbolsKeyboard.a.d()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/latin/keyboard/LatinSymbolsKeyboard", "lambda$maybeShowRecentEmojis$1", (char) 282, "LatinSymbolsKeyboard.java")).t("Failed to fetch recent emojis");
            LatinSymbolsKeyboard latinSymbolsKeyboard = (LatinSymbolsKeyboard) obj2;
            hen henVar = latinSymbolsKeyboard.e;
            if (henVar != null) {
                henVar.c(latinSymbolsKeyboard.u(llp.q(), i3));
            }
            if (!((Keyboard) obj2).C) {
                return;
            }
            latinSymbolsKeyboard.v();
        } else if (i2 == 1) {
            Object obj3 = this.b;
            int i4 = this.a;
            llp llpVar = (llp) obj;
            LatinSymbolsKeyboard latinSymbolsKeyboard2 = (LatinSymbolsKeyboard) obj3;
            hen henVar2 = latinSymbolsKeyboard2.e;
            if (henVar2 != null) {
                henVar2.c(latinSymbolsKeyboard2.u(llpVar, i4));
            }
            if (!((Keyboard) obj3).C) {
                return;
            }
            latinSymbolsKeyboard2.v();
        } else {
            Object obj4 = this.b;
            int i5 = this.a;
            llp llpVar2 = (llp) obj;
            hce hceVar = (hce) obj4;
            hbw hbwVar = hceVar.a.s;
            if (hbwVar == null) {
                return;
            }
            hbwVar.B(llpVar2);
            hci hciVar = hceVar.a;
            if (!hciVar.j || i5 != 0 || (i = (hdbVar = hciVar.s.g).d) < 0 || ((llp) hdbVar.b.get(i)).isEmpty()) {
                return;
            }
            hci hciVar2 = hceVar.a;
            if (hciVar2.b == null || (emojiPickerBodyRecyclerView = hciVar2.q) == null) {
                return;
            }
            ly lyVar = emojiPickerBodyRecyclerView.m;
            if (!(lyVar instanceof GridLayoutManager)) {
                ((ltd) ((ltd) EmojiPickerBodyRecyclerView.S.c()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "findLastCompletelyVisibleItemPosition", 176, "EmojiPickerBodyRecyclerView.java")).t("findLastCompletelyVisibleItemPosition() : Cannot find layout manager.");
                N = -1;
            } else {
                N = ((GridLayoutManager) lyVar).N();
            }
            int x = hceVar.a.s.x(N);
            hci hciVar3 = hceVar.a;
            if (hciVar3.i > x) {
                return;
            }
            hciVar3.b.m();
        }
    }
}

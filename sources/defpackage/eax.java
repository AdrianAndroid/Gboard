package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.search.emoji.standard.EmojiPickerTabletKeyboard;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* compiled from: PG */
/* renamed from: eax  reason: default package */
/* loaded from: classes.dex */
public final class eax implements mc {
    final /* synthetic */ EmojiPickerTabletKeyboard a;

    public eax(EmojiPickerTabletKeyboard emojiPickerTabletKeyboard) {
        this.a = emojiPickerTabletKeyboard;
    }

    @Override // defpackage.mc
    public final void h(boolean z) {
    }

    @Override // defpackage.mc
    public final boolean n(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            EmojiPickerTabletKeyboard emojiPickerTabletKeyboard = this.a;
            EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = emojiPickerTabletKeyboard.b;
            if (emojiPickerBodyRecyclerView != null) {
                emojiPickerBodyRecyclerView.setVisibility(0);
            }
            AppCompatTextView appCompatTextView = emojiPickerTabletKeyboard.c;
            if (appCompatTextView != null) {
                appCompatTextView.setText("");
            }
            emojiPickerTabletKeyboard.f = null;
            EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView2 = emojiPickerTabletKeyboard.d;
            if (emojiPickerBodyRecyclerView2 != null) {
                emojiPickerBodyRecyclerView2.setVisibility(8);
            }
            ViewGroup viewGroup = emojiPickerTabletKeyboard.e;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
        return false;
    }

    @Override // defpackage.mc
    public final void o(MotionEvent motionEvent) {
    }
}

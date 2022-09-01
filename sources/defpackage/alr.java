package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import com.google.android.libraries.inputmethod.emoji.widget.PageableEmojiListHolderView;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: alr  reason: default package */
/* loaded from: classes.dex */
public final class alr extends wj {
    public opu a;
    private final LinearLayoutManager b;

    public alr(LinearLayoutManager linearLayoutManager) {
        this.b = linearLayoutManager;
    }

    @Override // defpackage.wj
    public final void e(int i) {
    }

    @Override // defpackage.wj
    public final void f(int i, float f, int i2) {
        if (this.a == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.b.as(); i3++) {
            View aE = this.b.aE(i3);
            if (aE == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.b.as())));
            }
            int bo = LinearLayoutManager.bo(aE);
            PageableEmojiListHolderView pageableEmojiListHolderView = (PageableEmojiListHolderView) this.a.a;
            float width = ((bo - i) + f2) * (pageableEmojiListHolderView.getWidth() / pageableEmojiListHolderView.g);
            if (aad.f(pageableEmojiListHolderView.d) == 1) {
                aE.setTranslationX(width);
            } else {
                aE.setTranslationX(-width);
            }
        }
    }

    @Override // defpackage.wj
    public final void g(int i) {
    }
}

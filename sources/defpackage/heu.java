package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.inputmethod.emoji.widget.PageableEmojiListHolderView;
import java.util.List;

/* compiled from: PG */
/* renamed from: heu  reason: default package */
/* loaded from: classes.dex */
public final class heu extends ls {
    final /* synthetic */ PageableEmojiListHolderView d;

    public heu(PageableEmojiListHolderView pageableEmojiListHolderView) {
        this.d = pageableEmojiListHolderView;
    }

    @Override // defpackage.ls
    public final /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        PageableEmojiListHolderView pageableEmojiListHolderView = this.d;
        View inflate = pageableEmojiListHolderView.k.inflate(pageableEmojiListHolderView.c, (ViewGroup) pageableEmojiListHolderView.d, false);
        inflate.setLayoutDirection(this.d.getLayoutDirection());
        PageableEmojiListHolderView pageableEmojiListHolderView2 = this.d;
        if (pageableEmojiListHolderView2.g > 0) {
            inflate.setPaddingRelative(0, 0, pageableEmojiListHolderView2.getMeasuredWidth() / this.d.g, 0);
        }
        return new mo(inflate);
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.d.f;
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, int i) {
        View view = moVar.a;
        PageableEmojiListHolderView pageableEmojiListHolderView = this.d;
        heq heqVar = (heq) view;
        heqVar.f(pageableEmojiListHolderView.i);
        heqVar.h(pageableEmojiListHolderView.l);
        List list = pageableEmojiListHolderView.e;
        if (list != null) {
            heqVar.g(list.subList(pageableEmojiListHolderView.j * i, Math.min(list.size(), (i + 1) * pageableEmojiListHolderView.j)));
        } else {
            heqVar.g(null);
        }
    }
}

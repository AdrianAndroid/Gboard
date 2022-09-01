package defpackage;

import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hbz  reason: default package */
/* loaded from: classes.dex */
public final class hbz extends ku {
    final /* synthetic */ hbo c;
    final /* synthetic */ EmojiPickerBodyRecyclerView d;

    public hbz(EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView, hbo hboVar) {
        this.d = emojiPickerBodyRecyclerView;
        this.c = hboVar;
    }

    @Override // defpackage.ku
    public final int b(int i) {
        ls lsVar = this.d.l;
        if (lsVar == null) {
            return 1;
        }
        int he = lsVar.he(i);
        if (he != hbl.a && he != hcs.a && he != hde.a && he != hct.a) {
            return 1;
        }
        return this.c.a;
    }
}

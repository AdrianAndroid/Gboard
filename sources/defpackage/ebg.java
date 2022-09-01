package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonKeyboardM2;

/* compiled from: PG */
/* renamed from: ebg  reason: default package */
/* loaded from: classes.dex */
public final class ebg extends dz {
    final /* synthetic */ EmoticonKeyboardM2 a;

    public ebg(EmoticonKeyboardM2 emoticonKeyboardM2) {
        this.a = emoticonKeyboardM2;
    }

    @Override // defpackage.dz
    public final void c(RecyclerView recyclerView, int i, int i2) {
        cou couVar;
        EmoticonKeyboardM2 emoticonKeyboardM2 = this.a;
        if (!emoticonKeyboardM2.C || (couVar = emoticonKeyboardM2.h) == null) {
            return;
        }
        couVar.j(!cur.a(recyclerView.m));
    }
}

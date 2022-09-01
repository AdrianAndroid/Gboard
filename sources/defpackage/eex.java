package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.inputmethod.libs.search.richsymbol.RichSymbolKeyboard;

/* compiled from: PG */
/* renamed from: eex  reason: default package */
/* loaded from: classes.dex */
public final class eex extends dz {
    final /* synthetic */ RichSymbolKeyboard a;

    public eex(RichSymbolKeyboard richSymbolKeyboard) {
        this.a = richSymbolKeyboard;
    }

    @Override // defpackage.dz
    public final void c(RecyclerView recyclerView, int i, int i2) {
        cou couVar;
        RichSymbolKeyboard richSymbolKeyboard = this.a;
        if (!richSymbolKeyboard.C || (couVar = richSymbolKeyboard.f) == null) {
            return;
        }
        couVar.j(!cur.a(recyclerView.m));
    }
}

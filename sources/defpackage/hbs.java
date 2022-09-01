package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerLayoutManager;

/* compiled from: PG */
/* renamed from: hbs  reason: default package */
/* loaded from: classes.dex */
public final class hbs implements AutoCloseable {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController");
    public final Context b;
    public final hbf c;
    public final hcv d;
    public final RecyclerView e;
    public final hbq f;
    public final hbt g;
    public final hdj h;
    private final View.OnClickListener i;
    private final hej j;
    private final View.OnClickListener k;

    public hbs(hbf hbfVar, hdj hdjVar, hbq hbqVar, RecyclerView recyclerView, hbu hbuVar) {
        bwk bwkVar = new bwk(10);
        this.i = bwkVar;
        hcf hcfVar = new hcf(this, 1);
        this.j = hcfVar;
        fat fatVar = new fat(this, 10);
        this.k = fatVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(recyclerView.getContext(), (int) R.style.f191890_resource_name_obfuscated_res_0x7f150203);
        this.b = contextThemeWrapper;
        this.c = hbfVar;
        this.h = hdjVar;
        this.f = hbqVar;
        hcp hcpVar = new hcp(contextThemeWrapper, null);
        this.d = hcpVar;
        hcpVar.c = fatVar;
        hbt hbtVar = new hbt(hbuVar.b, hbuVar.a, hbfVar, hcfVar, contextThemeWrapper, bwkVar, hdn.instance.h);
        this.g = hbtVar;
        recyclerView.aa(hbtVar);
        EmojiPickerLayoutManager emojiPickerLayoutManager = new EmojiPickerLayoutManager(hbuVar.b);
        ((GridLayoutManager) emojiPickerLayoutManager).g = new hbp(this, hbuVar);
        recyclerView.ab(emojiPickerLayoutManager);
        recyclerView.Z(new hbr(this, recyclerView));
        this.e = recyclerView;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.a();
    }
}

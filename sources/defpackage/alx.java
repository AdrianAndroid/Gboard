package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: alx  reason: default package */
/* loaded from: classes.dex */
public final class alx implements ma {
    @Override // defpackage.ma
    public final void a(View view) {
        lz lzVar = (lz) view.getLayoutParams();
        if (lzVar.width == -1 && lzVar.height == -1) {
            return;
        }
        throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
    }

    @Override // defpackage.ma
    public final void b(View view) {
    }
}

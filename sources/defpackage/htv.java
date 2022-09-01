package defpackage;

import android.view.View;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;

/* compiled from: PG */
/* renamed from: htv  reason: default package */
/* loaded from: classes.dex */
public final class htv implements htx {
    final /* synthetic */ KeyboardViewHolder a;
    private Runnable b;

    public htv(KeyboardViewHolder keyboardViewHolder, ibz ibzVar, ice iceVar, View view, htw htwVar) {
        this.a = keyboardViewHolder;
        KeyboardViewHolder.e(ibzVar, iceVar, view, htwVar);
        Runnable b = keyboardViewHolder.b(ibzVar, iceVar, view, htwVar);
        this.b = b;
        kki.j(b);
    }

    @Override // defpackage.htx
    public final void a() {
        Runnable runnable = this.b;
        if (runnable != null) {
            kki.k(runnable);
            this.b.run();
            this.b = null;
        }
        this.a.b = null;
    }
}

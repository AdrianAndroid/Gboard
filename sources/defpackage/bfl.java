package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* compiled from: PG */
/* renamed from: bfl  reason: default package */
/* loaded from: classes.dex */
public final class bfl implements bfp {
    @Override // defpackage.bfp
    public final /* bridge */ /* synthetic */ boolean a(Object obj, bfo bfoVar) {
        Drawable drawable = (Drawable) obj;
        Drawable j = bfoVar.j();
        if (j == null) {
            j = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{j, drawable});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(300);
        bfoVar.k(transitionDrawable);
        return true;
    }
}

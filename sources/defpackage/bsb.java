package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: bsb  reason: default package */
/* loaded from: classes.dex */
final class bsb extends ajz {
    final /* synthetic */ ImageView b;
    final /* synthetic */ akf c;

    public bsb(ImageView imageView, akf akfVar) {
        this.b = imageView;
        this.c = akfVar;
    }

    @Override // defpackage.ajz
    public final void b(Drawable drawable) {
        this.b.setImageDrawable(this.c);
        this.c.start();
    }
}

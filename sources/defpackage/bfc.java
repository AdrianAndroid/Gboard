package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: bfc  reason: default package */
/* loaded from: classes.dex */
public final class bfc extends bfd {
    public bfc(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.bfd
    protected final /* bridge */ /* synthetic */ void i(Object obj) {
        ((ImageView) this.a).setImageDrawable((Drawable) obj);
    }
}

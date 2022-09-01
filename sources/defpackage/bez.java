package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: bez  reason: default package */
/* loaded from: classes.dex */
public final class bez extends bfd {
    public bez(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.bfd
    protected final /* bridge */ /* synthetic */ void i(Object obj) {
        ((ImageView) this.a).setImageBitmap((Bitmap) obj);
    }
}

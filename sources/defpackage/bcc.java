package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: bcc  reason: default package */
/* loaded from: classes.dex */
public final class bcc implements axh {
    private final /* synthetic */ int a;
    private final Object b;

    public bcc(Bitmap bitmap, int i) {
        this.a = i;
        this.b = bitmap;
    }

    public bcc(AnimatedImageDrawable animatedImageDrawable, int i) {
        this.a = i;
        this.b = animatedImageDrawable;
    }

    public bcc(byte[] bArr, int i) {
        this.a = i;
        this.b = (byte[]) ce.m(bArr);
    }

    @Override // defpackage.axh
    public final Class b() {
        int i = this.a;
        return i != 0 ? i != 1 ? Drawable.class : Bitmap.class : byte[].class;
    }

    @Override // defpackage.axh
    public final /* synthetic */ Object c() {
        int i = this.a;
        if (i != 0 && i == 1) {
            return this.b;
        }
        return this.b;
    }

    @Override // defpackage.axh
    public final void e() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return;
        }
        ((AnimatedImageDrawable) this.b).stop();
        ((AnimatedImageDrawable) this.b).clearAnimationCallbacks();
    }

    @Override // defpackage.axh
    public final int a() {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return bgj.a((Bitmap) this.b);
            }
            int intrinsicWidth = ((AnimatedImageDrawable) this.b).getIntrinsicWidth() * ((AnimatedImageDrawable) this.b).getIntrinsicHeight() * bgj.c(Bitmap.Config.ARGB_8888);
            return intrinsicWidth + intrinsicWidth;
        }
        return ((byte[]) this.b).length;
    }
}

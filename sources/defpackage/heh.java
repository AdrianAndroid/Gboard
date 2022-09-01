package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: heh  reason: default package */
/* loaded from: classes.dex */
public final class heh {
    public static final hhl a = hhq.a("emoji_view_bitmap_draw_static_layout", false);
    public final Executor d;
    public final axp e;
    public final float f;
    public final Canvas b = new Canvas();
    public final TextPaint c = new TextPaint();
    public final Rect g = new Rect();

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    public heh(axp axpVar, float f) {
        this.e = axpVar;
        this.f = f;
        if (hek.a == null && hek.a == null) {
            synchronized (hek.class) {
                if (hek.a == null) {
                    hek.a = new hek();
                }
            }
        }
        this.d = kcu.E(hek.a.b);
    }

    public static int b(int i, float f) {
        if (i != 0) {
            f = Math.min(i, f);
        }
        return (int) f;
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint) {
        d();
        double ceil = Math.ceil(StaticLayout.getDesiredWidth(charSequence, textPaint));
        d();
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, (int) ceil).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public static void d() {
        if (!Thread.currentThread().isInterrupted()) {
            return;
        }
        throw new InterruptedException();
    }

    public final float a(float f, float f2) {
        return Math.max(this.f, (float) Math.floor(f * f2));
    }
}

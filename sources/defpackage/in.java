package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: in  reason: default package */
/* loaded from: classes.dex */
public final class in extends SeekBar {
    private final io a;

    public in(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f16540_resource_name_obfuscated_res_0x7f040675);
        nr.d(this, getContext());
        io ioVar = new io(this);
        this.a = ioVar;
        ioVar.b(attributeSet, R.attr.f16540_resource_name_obfuscated_res_0x7f040675);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        io ioVar = this.a;
        Drawable drawable = ioVar.c;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(ioVar.b.getDrawableState())) {
            return;
        }
        ioVar.b.invalidateDrawable(drawable);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        io ioVar = this.a;
        if (ioVar.c != null) {
            int max = ioVar.b.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = ioVar.c.getIntrinsicWidth();
                int intrinsicHeight = ioVar.c.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight >> 1;
                }
                ioVar.c.setBounds(-i2, -i, i2, i);
                float width = ((ioVar.b.getWidth() - ioVar.b.getPaddingLeft()) - ioVar.b.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(ioVar.b.getPaddingLeft(), ioVar.b.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    ioVar.c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hq  reason: default package */
/* loaded from: classes.dex */
public final class hq extends AppCompatImageView implements ht {
    final /* synthetic */ hs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq(hs hsVar, Context context) {
        super(context, null, R.attr.f7630_resource_name_obfuscated_res_0x7f040231);
        this.a = hsVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        ez.d(this, getContentDescription());
        setOnTouchListener(new hp(this, this));
    }

    @Override // defpackage.ht
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ht
    public final boolean d() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.a.m();
        return true;
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            wf.e(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}

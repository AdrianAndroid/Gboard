package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private boolean a;
    private final isu b;
    private final ohq c;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        isu isuVar = this.b;
        if (isuVar != null) {
            isuVar.b();
        }
        ohq ohqVar = this.c;
        if (ohqVar != null) {
            ohqVar.i();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c.m() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        isu isuVar = this.b;
        if (isuVar != null) {
            isuVar.f();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        isu isuVar = this.b;
        if (isuVar != null) {
            isuVar.d(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ohq ohqVar = this.c;
        if (ohqVar != null) {
            ohqVar.i();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ohq ohqVar = this.c;
        if (ohqVar != null && drawable != null && !this.a) {
            ohqVar.k(drawable);
        }
        super.setImageDrawable(drawable);
        ohq ohqVar2 = this.c;
        if (ohqVar2 != null) {
            ohqVar2.i();
            if (this.a) {
                return;
            }
            this.c.h();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.a = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        ohq ohqVar = this.c;
        if (ohqVar != null) {
            ohqVar.l(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ohq ohqVar = this.c;
        if (ohqVar != null) {
            ohqVar.i();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        nt.a(context);
        this.a = false;
        nr.d(this, getContext());
        isu isuVar = new isu(this);
        this.b = isuVar;
        isuVar.c(attributeSet, i);
        ohq ohqVar = new ohq(this);
        this.c = ohqVar;
        ohqVar.j(attributeSet, i);
    }
}

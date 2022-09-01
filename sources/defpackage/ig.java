package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ig  reason: default package */
/* loaded from: classes.dex */
public class ig extends ImageButton {
    private boolean a;
    private final isu b;
    private final ohq c;

    public ig(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
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
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ohq ohqVar = this.c;
        if (ohqVar != null) {
            ohqVar.i();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
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
    public final void setImageResource(int i) {
        this.c.l(i);
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ohq ohqVar = this.c;
        if (ohqVar != null) {
            ohqVar.i();
        }
    }

    public ig(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f12690_resource_name_obfuscated_res_0x7f040496);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(Context context, AttributeSet attributeSet, int i) {
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

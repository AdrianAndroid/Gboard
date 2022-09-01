package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void c() {
        aim aimVar = this.k.e;
        if (aimVar != null) {
            aimVar.au(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, jn.d(context, R.attr.f10800_resource_name_obfuscated_res_0x7f0403b4, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.c, i, i2);
        String j = jn.j(obtainStyledAttributes, 9, 0);
        this.a = j;
        if (j == null) {
            this.a = this.q;
        }
        this.b = jn.j(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.d = jn.j(obtainStyledAttributes, 11, 3);
        this.e = jn.j(obtainStyledAttributes, 10, 4);
        this.f = jn.f(obtainStyledAttributes, 7, 5, 0);
        obtainStyledAttributes.recycle();
    }
}

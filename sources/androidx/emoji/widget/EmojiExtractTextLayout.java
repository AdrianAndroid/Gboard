package androidx.emoji.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiExtractTextLayout extends LinearLayout {
    public ExtractButtonCompat a;
    public ViewGroup b;
    public View.OnClickListener c;
    private EmojiExtractEditText d;
    private boolean e;

    public EmojiExtractTextLayout(Context context) {
        super(context);
        a(context, null, 0, 0);
    }

    private final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!this.e) {
            this.e = true;
            setOrientation(0);
            View inflate = LayoutInflater.from(context).inflate(R.layout.f135110_resource_name_obfuscated_res_0x7f0e00ea, (ViewGroup) this, true);
            this.b = (ViewGroup) inflate.findViewById(R.id.f56660_resource_name_obfuscated_res_0x7f0b029b);
            this.a = (ExtractButtonCompat) inflate.findViewById(R.id.f56670_resource_name_obfuscated_res_0x7f0b029c);
            this.d = (EmojiExtractEditText) inflate.findViewById(16908325);
            if (attributeSet == null) {
                return;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, adk.b, i, i2);
            aad.L(this, context, adk.b, attributeSet, obtainStyledAttributes, i, i2);
            ((aec) ((bek) this.d.a().a).a).b = obtainStyledAttributes.getInteger(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public EmojiExtractTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0, 0);
    }

    public EmojiExtractTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public EmojiExtractTextLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }
}

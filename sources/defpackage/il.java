package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: il  reason: default package */
/* loaded from: classes.dex */
public final class il extends RatingBar {
    private final ij a;

    public il(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f16290_resource_name_obfuscated_res_0x7f04064e);
        nr.d(this, getContext());
        ij ijVar = new ij(this);
        this.a = ijVar;
        ijVar.b(attributeSet, R.attr.f16290_resource_name_obfuscated_res_0x7f04064e);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.a.a;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}

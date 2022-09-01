package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* renamed from: esn  reason: default package */
/* loaded from: classes.dex */
public final class esn implements eqr {
    private final float a;
    private final /* synthetic */ int b;

    public esn(float f, int i) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.eqr
    public final /* synthetic */ ColorStateList a() {
        return null;
    }

    @Override // defpackage.eqr
    public final /* synthetic */ ColorStateList b() {
        return null;
    }

    @Override // defpackage.eqr
    public final /* synthetic */ Drawable c(Context context) {
        return null;
    }

    @Override // defpackage.eqr
    public final void d(View view) {
        if (this.b == 0) {
            if (!(view instanceof TextView)) {
                return;
            }
            ((TextView) view).setTextSize(0, this.a);
        } else if (view.getBackground() == null) {
        } else {
            if (view instanceof CardView) {
                ((CardView) view).d(this.a);
            } else if (view instanceof MaterialButton) {
                MaterialButton materialButton = (MaterialButton) view;
                materialButton.setElevation(this.a);
                if (this.a > 0.0f) {
                    return;
                }
                materialButton.setStateListAnimator(null);
            } else {
                view.setElevation(this.a);
            }
        }
    }
}

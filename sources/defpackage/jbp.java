package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: PG */
/* renamed from: jbp  reason: default package */
/* loaded from: classes.dex */
public final class jbp extends CharacterStyle implements UpdateAppearance {
    public static final lgb a = jdg.n(jgf.b);

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}

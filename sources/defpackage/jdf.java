package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* renamed from: jdf  reason: default package */
/* loaded from: classes.dex */
final class jdf extends ClickableSpan {
    final /* synthetic */ int a;
    final /* synthetic */ jdh b;

    public jdf(jdh jdhVar, int i) {
        this.b = jdhVar;
        this.a = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.a.a(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}

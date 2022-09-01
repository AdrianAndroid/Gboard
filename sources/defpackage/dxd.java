package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import j$.util.function.Consumer;

/* compiled from: PG */
/* renamed from: dxd  reason: default package */
/* loaded from: classes.dex */
final class dxd extends ClickableSpan {
    final /* synthetic */ Consumer a;

    public dxd(Consumer consumer) {
        this.a = consumer;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.accept(view.getContext());
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
    }
}

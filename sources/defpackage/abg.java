package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* renamed from: abg  reason: default package */
/* loaded from: classes.dex */
public final class abg extends ClickableSpan {
    private final int a;
    private final abj b;
    private final int c;

    public abg(int i, abj abjVar, int i2) {
        this.a = i;
        this.b = abjVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        abj abjVar = this.b;
        abjVar.b.performAction(this.c, bundle);
    }
}

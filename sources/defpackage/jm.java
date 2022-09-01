package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jm  reason: default package */
/* loaded from: classes.dex */
public final class jm extends jl {
    @Override // defpackage.jl, defpackage.jn
    public final void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.jn
    public final boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}

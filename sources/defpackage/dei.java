package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: PG */
/* renamed from: dei  reason: default package */
/* loaded from: classes.dex */
public final class dei extends View {
    final /* synthetic */ dej a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dei(dej dejVar, Context context) {
        super(context);
        this.a = dejVar;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.a.a.draw(canvas);
    }
}

package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* renamed from: cim  reason: default package */
/* loaded from: classes.dex */
final class cim extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view.getVisibility() == 0) {
            Path path = cin.a;
            float width = view.getWidth() / 2.0f;
            float height = view.getHeight() / 2.0f;
            Path path2 = cin.a;
            path2.reset();
            path2.moveTo(0.0f, 0.0f);
            path2.rLineTo(width, height);
            path2.rLineTo(width, -height);
            path2.lineTo(0.0f, 0.0f);
            path2.close();
            outline.setConvexPath(path2);
        }
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* compiled from: PG */
/* renamed from: cin  reason: default package */
/* loaded from: classes.dex */
public abstract class cin extends FrameLayout {
    public static final Path a = new Path();
    public static final ViewOutlineProvider b = new cim();

    public cin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract void a();
}

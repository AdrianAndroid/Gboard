package defpackage;

import android.graphics.Path;
import android.view.animation.PathInterpolator;

/* compiled from: PG */
/* renamed from: abt  reason: default package */
/* loaded from: classes.dex */
public final class abt {
    public static PathInterpolator a(Path path) {
        return new PathInterpolator(path);
    }

    static PathInterpolator b(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    public static PathInterpolator c(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }
}

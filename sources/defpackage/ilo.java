package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Point;

/* compiled from: PG */
/* renamed from: ilo  reason: default package */
/* loaded from: classes.dex */
public final class ilo {
    public static final double a = Math.tan(0.39269908169872414d);
    public static final double b = Math.tan(1.1780972450961724d);
    public final iln c;
    public final img d;

    public ilo(iln ilnVar, img imgVar) {
        this.c = ilnVar;
        this.d = imgVar;
    }

    public static int a(int i, int i2, int i3) {
        return Math.max(i, Math.min(i2, i3));
    }

    public final Point b(int i, int i2, Point point) {
        return new Point(Math.round(i - ((point.x + 0.5f) * this.c.b())), Math.round(i2 - ((point.y + 0.5f) * this.c.a())));
    }

    public final void c() {
        AnimatorSet animatorSet = this.d.c;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        img imgVar = this.d;
        AnimatorSet animatorSet2 = imgVar.c;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            imgVar.c.end();
        }
        imgVar.a();
    }
}

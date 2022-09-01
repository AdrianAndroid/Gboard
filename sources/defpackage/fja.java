package defpackage;

import android.animation.ValueAnimator;
import j$.time.Duration;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fja  reason: default package */
/* loaded from: classes.dex */
public final class fja {
    public final Duration a;
    public final Map b;
    public final Map c;
    public final okq d;
    public fjb e = fjb.HIDDEN;
    public float f;
    public float g;
    public ValueAnimator h;
    public ValueAnimator i;

    public fja(Duration duration, Map map, Map map2, okq okqVar) {
        oll.e(duration, "animationDuration");
        this.a = duration;
        this.b = map;
        this.c = map2;
        this.d = okqVar;
    }
}

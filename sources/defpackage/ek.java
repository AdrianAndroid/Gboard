package defpackage;

import android.graphics.drawable.Animatable;

/* compiled from: PG */
/* renamed from: ek  reason: default package */
/* loaded from: classes.dex */
final class ek extends ep {
    private final Animatable a;

    public ek(Animatable animatable) {
        this.a = animatable;
    }

    @Override // defpackage.ep
    public final void a() {
        this.a.start();
    }

    @Override // defpackage.ep
    public final void b() {
        this.a.stop();
    }
}

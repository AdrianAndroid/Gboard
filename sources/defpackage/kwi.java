package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kwi  reason: default package */
/* loaded from: classes.dex */
public final class kwi extends kwd {
    public static final /* synthetic */ int f = 0;
    private static final Property g = new kwh(Float.class);
    public final kvp b;
    public boolean d;
    public float e;
    private ObjectAnimator h;
    public int c = 1;
    public final afi a = new afi();

    public kwi(kwn kwnVar) {
        super(3);
        this.b = kwnVar;
    }

    @Override // defpackage.kwd
    public final void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.kwd
    public final void b(ajz ajzVar) {
    }

    @Override // defpackage.kwd
    public final void c() {
    }

    @Override // defpackage.kwd
    public final void d() {
        if (this.h == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, g, 0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(333L);
            this.h.setInterpolator(null);
            this.h.setRepeatCount(-1);
            this.h.addListener(new kwg(this));
        }
        this.d = true;
        this.c = 1;
        Arrays.fill(this.l, kxc.e(this.b.c[0], this.j.h));
        this.h.start();
    }

    @Override // defpackage.kwd
    public final void e() {
    }
}

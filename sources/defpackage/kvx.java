package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.AndroidRuntimeException;

/* compiled from: PG */
/* renamed from: kvx  reason: default package */
/* loaded from: classes.dex */
public final class kvx extends kwb {
    private static final ur l = new ur();
    public final kwc a;
    public float b;
    private final adj i;
    private boolean j = false;
    private final adi k;

    public kvx(Context context, kvp kvpVar, kwc kwcVar) {
        super(context, kvpVar);
        this.a = kwcVar;
        kwcVar.b = this;
        adj adjVar = new adj();
        this.i = adjVar;
        adjVar.b = 1.0d;
        adjVar.c = false;
        adjVar.d(50.0f);
        adi adiVar = new adi(this, l, null);
        this.k = adiVar;
        adiVar.g = adjVar;
        e(1.0f);
    }

    public final void a(float f) {
        this.b = f;
        invalidateSelf();
    }

    @Override // defpackage.kwb
    public final boolean b(boolean z, boolean z2, boolean z3) {
        boolean b = super.b(z, z2, z3);
        float g = kws.g(this.c.getContentResolver());
        if (g == 0.0f) {
            this.j = true;
        } else {
            this.j = false;
            this.i.d(50.0f / g);
        }
        return b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.a.f(canvas, getBounds(), c());
        this.a.e(canvas, this.g);
        this.a.d(canvas, this.g, 0.0f, this.b, kxc.e(this.d.c[0], this.h));
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.kwb, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.k.c();
        a(getLevel() / 10000.0f);
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        if (this.j) {
            this.k.c();
            a(i / 10000.0f);
        } else {
            adi adiVar = this.k;
            adiVar.b = this.b * 10000.0f;
            adiVar.c = true;
            float f = i;
            if (adiVar.e) {
                adiVar.h = f;
            } else {
                if (adiVar.g == null) {
                    adiVar.g = new adj(f);
                }
                adiVar.g.c(f);
                adj adjVar = adiVar.g;
                if (adjVar != null) {
                    double a = adjVar.a();
                    if (a > 3.4028234663852886E38d) {
                        throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                    }
                    if (a >= -3.4028234663852886E38d) {
                        double abs = Math.abs(adiVar.f * 0.75f);
                        adjVar.d = abs;
                        adjVar.e = abs * 62.5d;
                        if (ade.a().b()) {
                            if (!adiVar.e) {
                                adiVar.e = true;
                                if (!adiVar.c) {
                                    adiVar.b = ((kvx) adiVar.d).b * 10000.0f;
                                }
                                float f2 = adiVar.b;
                                if (f2 > Float.MAX_VALUE || f2 < -3.4028235E38f) {
                                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                                }
                                ade a2 = ade.a();
                                if (a2.b.size() == 0) {
                                    a2.h.n(a2.c);
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        a2.f = ValueAnimator.getDurationScale();
                                        if (a2.g == null) {
                                            a2.g = new add(a2);
                                        }
                                        final add addVar = a2.g;
                                        if (addVar.a == null) {
                                            addVar.a = new ValueAnimator.DurationScaleChangeListener() { // from class: adc
                                                public final void onChanged(float f3) {
                                                    ((ade) add.this.b).f = f3;
                                                }
                                            };
                                            ValueAnimator.registerDurationScaleChangeListener(addVar.a);
                                        }
                                    }
                                }
                                if (!a2.b.contains(adiVar)) {
                                    a2.b.add(adiVar);
                                }
                            }
                        } else {
                            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
                        }
                    } else {
                        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                    }
                } else {
                    throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
                }
            }
        }
        return true;
    }
}

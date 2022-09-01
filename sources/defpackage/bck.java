package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bck  reason: default package */
/* loaded from: classes.dex */
public final class bck extends Drawable implements Animatable, bcp {
    public final bcj a;
    public boolean b;
    private boolean c;
    private boolean d;
    private int f;
    private boolean h;
    private Paint i;
    private Rect j;
    private boolean e = true;
    private final int g = -1;

    public bck(bcj bcjVar) {
        ce.m(bcjVar);
        this.a = bcjVar;
    }

    private final Paint d() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    private final Rect e() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    private final void f() {
        ce.n(!this.b, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.a.a.a() == 1) {
            invalidateSelf();
        } else if (this.c) {
        } else {
            this.c = true;
            bcq bcqVar = this.a.a;
            if (bcqVar.f) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            }
            if (bcqVar.b.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            boolean isEmpty = bcqVar.b.isEmpty();
            bcqVar.b.add(this);
            if (isEmpty && !bcqVar.d) {
                bcqVar.d = true;
                bcqVar.f = false;
                bcqVar.b();
            }
            invalidateSelf();
        }
    }

    private final void g() {
        this.c = false;
        bcq bcqVar = this.a.a;
        bcqVar.b.remove(this);
        if (bcqVar.b.isEmpty()) {
            bcqVar.f();
        }
    }

    public final Bitmap a() {
        return this.a.a.h;
    }

    public final ByteBuffer b() {
        return ((auk) this.a.a.a).a.asReadOnlyBuffer();
    }

    @Override // defpackage.bcp
    public final void c() {
        bcq bcqVar;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        bco bcoVar = this.a.a.e;
        if ((bcoVar != null ? bcoVar.a : -1) == bcqVar.a() - 1) {
            this.f++;
        }
        if (this.g == -1 || this.f < 0) {
            return;
        }
        stop();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b) {
            return;
        }
        if (this.h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), e());
            this.h = false;
        }
        bcq bcqVar = this.a.a;
        bco bcoVar = bcqVar.e;
        canvas.drawBitmap(bcoVar != null ? bcoVar.b : bcqVar.h, (Rect) null, e(), d());
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        d().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        d().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        ce.n(!this.b, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.e = z;
        if (!z) {
            g();
        } else if (this.d) {
            f();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.d = true;
        this.f = 0;
        if (this.e) {
            f();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d = false;
        g();
    }
}

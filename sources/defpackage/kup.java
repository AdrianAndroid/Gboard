package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: kup  reason: default package */
/* loaded from: classes.dex */
public class kup {
    static final TimeInterpolator a = krt.c;
    public static final int b = R.attr.f15240_resource_name_obfuscated_res_0x7f0405b2;
    public static final int c = R.attr.f15400_resource_name_obfuscated_res_0x7f0405c2;
    public static final int d = R.attr.f15270_resource_name_obfuscated_res_0x7f0405b5;
    public static final int e = R.attr.f15380_resource_name_obfuscated_res_0x7f0405c0;
    static final int[] f = {16842919, 16842910};
    static final int[] g = {16843623, 16842908, 16842910};
    static final int[] h = {16842908, 16842910};
    static final int[] i = {16843623, 16842910};
    static final int[] j = {16842910};
    static final int[] k = new int[0];
    public final FloatingActionButton B;
    public ViewTreeObserver.OnPreDrawListener C;
    final opu D;
    private final jma I;
    public kxj l;
    public kxe m;
    public Drawable n;
    public ktz o;
    public Drawable p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public int u;
    public Animator v;
    public krw w;
    public krw x;
    public int z;
    public float y = 1.0f;
    public int A = 0;
    private final Rect E = new Rect();
    private final RectF F = new RectF();
    private final RectF G = new RectF();
    private final Matrix H = new Matrix();

    public kup(FloatingActionButton floatingActionButton, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.B = floatingActionButton;
        this.D = opuVar;
        jma jmaVar = new jma((byte[]) null);
        this.I = jmaVar;
        jmaVar.b(o(new kum(this)));
        jmaVar.b(o(new kul(this)));
        jmaVar.b(o(new kul(this)));
        jmaVar.b(o(new kul(this)));
        jmaVar.b(o(new kun(this)));
        jmaVar.b(o(new kuk(this)));
        floatingActionButton.getRotation();
    }

    private static final ValueAnimator o(kuo kuoVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(kuoVar);
        valueAnimator.addUpdateListener(kuoVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private static final void p(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new kuj());
    }

    public float a() {
        return this.r;
    }

    public final AnimatorSet b(krw krwVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.B, View.ALPHA, f2);
        krwVar.b("opacity").b(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B, View.SCALE_X, f3);
        krwVar.b("scale").b(ofFloat2);
        p(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.B, View.SCALE_Y, f3);
        krwVar.b("scale").b(ofFloat3);
        p(ofFloat3);
        arrayList.add(ofFloat3);
        d(f4, this.H);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.B, new kru(), new kuh(this), new Matrix(this.H));
        krwVar.b("iconScale").b(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        kxc.k(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f2, float f3, float f4, int i2, int i3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new kui(this, this.B.getAlpha(), f2, this.B.getScaleX(), f3, this.B.getScaleY(), this.y, f4, new Matrix(this.H)));
        arrayList.add(ofFloat);
        kxc.k(animatorSet, arrayList);
        Context context = this.B.getContext();
        int integer = this.B.getContext().getResources().getInteger(R.integer.f132170_resource_name_obfuscated_res_0x7f0c00af);
        TypedValue d2 = kws.d(context, i2);
        if (d2 != null && d2.type == 16) {
            integer = d2.data;
        }
        animatorSet.setDuration(integer);
        Context context2 = this.B.getContext();
        TimeInterpolator timeInterpolator = krt.b;
        TypedValue typedValue = new TypedValue();
        if (context2.getTheme().resolveAttribute(i3, typedValue, true)) {
            if (typedValue.type != 3) {
                throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            }
            String valueOf = String.valueOf(typedValue.string);
            if (kws.j(valueOf, "cubic-bezier") || kws.j(valueOf, "path")) {
                if (kws.j(valueOf, "cubic-bezier")) {
                    String[] split = kws.i(valueOf, "cubic-bezier").split(",");
                    int length = split.length;
                    if (length != 4) {
                        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + length);
                    }
                    timeInterpolator = abt.c(kws.h(split, 0), kws.h(split, 1), kws.h(split, 2), kws.h(split, 3));
                } else if (kws.j(valueOf, "path")) {
                    timeInterpolator = abt.a(kd.b(kws.i(valueOf, "path")));
                } else {
                    throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(valueOf)));
                }
            } else {
                timeInterpolator = AnimationUtils.loadInterpolator(context2, typedValue.resourceId);
            }
        }
        animatorSet.setInterpolator(timeInterpolator);
        return animatorSet;
    }

    public final void d(float f2, Matrix matrix) {
        Drawable drawable;
        matrix.reset();
        if (this.B.getDrawable() == null || this.z == 0) {
            return;
        }
        RectF rectF = this.F;
        RectF rectF2 = this.G;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f3 = this.z;
        rectF2.set(0.0f, 0.0f, f3, f3);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f4 = this.z / 2.0f;
        matrix.postScale(f2, f2, f4, f4);
    }

    public void e(Rect rect) {
        int b2 = this.q ? (this.u - this.B.b()) / 2 : 0;
        float a2 = a() + this.t;
        int max = Math.max(b2, (int) Math.ceil(a2));
        int max2 = Math.max(b2, (int) Math.ceil(a2 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public void f(float f2, float f3, float f4) {
        throw null;
    }

    public final void g(float f2) {
        this.y = f2;
        Matrix matrix = this.H;
        d(f2, matrix);
        this.B.setImageMatrix(matrix);
    }

    public final void h(kxj kxjVar) {
        this.l = kxjVar;
        kxe kxeVar = this.m;
        if (kxeVar != null) {
            kxeVar.ic(kxjVar);
        }
        ktz ktzVar = this.o;
        if (ktzVar != null) {
            ktzVar.h = kxjVar;
            ktzVar.invalidateSelf();
        }
    }

    public final void i() {
        g(this.y);
    }

    public final void j() {
        Rect rect = this.E;
        e(rect);
        nq.h(this.p, "Didn't initialize content background");
        if (l()) {
            this.D.d(new InsetDrawable(this.p, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.D.d(this.p);
        }
        opu opuVar = this.D;
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        ((FloatingActionButton) opuVar.a).c.set(i2, i3, i4, i5);
        FloatingActionButton floatingActionButton = (FloatingActionButton) opuVar.a;
        int i6 = floatingActionButton.a;
        floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    public final void k(float f2) {
        kxe kxeVar = this.m;
        if (kxeVar != null) {
            kxeVar.k(f2);
        }
    }

    public boolean l() {
        return true;
    }

    public final boolean m() {
        return aad.ah(this.B) && !this.B.isInEditMode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n() {
        return !this.q || this.B.b() >= this.u;
    }
}

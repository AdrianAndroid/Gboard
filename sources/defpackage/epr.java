package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: epr  reason: default package */
/* loaded from: classes.dex */
public final class epr implements epu {
    private static final ltg o = ltg.j("com/google/android/apps/inputmethod/libs/theme/builder/ThemeBuilderCroppingPage");
    private final View.OnClickListener A;
    public final ImageView a;
    public final eps b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public float h;
    public final int i;
    public final int j;
    public float k;
    public boolean l;
    public final ScaleGestureDetector m;
    public final GestureDetector n;
    private final View p;
    private final Context q;
    private final epw r;
    private final float s;
    private int t;
    private int u;
    private float v;
    private final View.OnTouchListener w;
    private final GestureDetector.SimpleOnGestureListener x;
    private final ScaleGestureDetector.OnScaleGestureListener y;
    private final View.OnLayoutChangeListener z;

    public epr(View view, Context context, eps epsVar, epw epwVar) {
        bph bphVar = new bph(this, 9);
        this.w = bphVar;
        epp eppVar = new epp(this);
        this.x = eppVar;
        epq epqVar = new epq(this);
        this.y = epqVar;
        dkr dkrVar = new dkr(this, 6);
        this.z = dkrVar;
        edc edcVar = new edc(this, 17);
        this.A = edcVar;
        this.p = view;
        this.q = context;
        this.b = epsVar;
        this.r = epwVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.f129660_resource_name_obfuscated_res_0x7f0b2185);
        this.a = imageView;
        float integer = context.getResources().getInteger(R.integer.f131850_resource_name_obfuscated_res_0x7f0c007f) / 100.0f;
        this.s = integer;
        this.t = view.getWidth();
        this.u = view.getHeight();
        Bitmap e = epwVar.e();
        imageView.setImageBitmap(e);
        this.i = e.getWidth();
        this.j = e.getHeight();
        this.n = new GestureDetector(view.getContext(), eppVar);
        this.m = new ScaleGestureDetector(view.getContext(), epqVar);
        view.setOnTouchListener(bphVar);
        view.addOnLayoutChangeListener(dkrVar);
        view.findViewById(R.id.f129670_resource_name_obfuscated_res_0x7f0b2186).setOnClickListener(edcVar);
        View findViewById = view.findViewById(R.id.f129680_resource_name_obfuscated_res_0x7f0b2187);
        int f = gvv.f(context);
        int f2 = dds.f(context, dds.a);
        int i = findViewById.getContext().getResources().getDisplayMetrics().widthPixels;
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.width = (int) (i * integer);
        layoutParams.height = (int) ((layoutParams.width / f) * f2);
        findViewById.setLayoutParams(layoutParams);
        c();
    }

    public static float b(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    @Override // defpackage.epu
    public final void a() {
    }

    public final void c() {
        if (this.p.getWidth() == 0 || this.p.getHeight() == 0) {
            return;
        }
        if (this.t == this.p.getWidth() && this.u == this.p.getHeight()) {
            return;
        }
        this.t = this.p.getWidth();
        this.u = this.p.getHeight();
        int f = gvv.f(this.q);
        int f2 = dds.f(this.q, dds.a);
        int i = this.t;
        float f3 = i * this.s;
        int i2 = this.u / 2;
        int i3 = ((int) ((f2 / f) * f3)) / 2;
        int i4 = i2 - i3;
        this.c = i4;
        int i5 = i2 + i3;
        this.f = i5;
        int i6 = i / 2;
        int i7 = ((int) f3) / 2;
        int i8 = i6 - i7;
        this.d = i8;
        int i9 = i6 + i7;
        this.e = i9;
        this.v = Math.max((i9 - i8) / this.i, (i5 - i4) / this.j);
        float f4 = this.r.f;
        g(f4 > 0.0f ? f4 * this.s : Math.min(this.t / this.i, this.u / this.j));
        epw epwVar = this.r;
        float f5 = epwVar.g;
        int i10 = this.i;
        float f6 = epwVar.h;
        int i11 = this.j;
        int i12 = this.t;
        float f7 = this.k;
        f((i12 / 2.0f) - ((f5 - (i10 / 2.0f)) * f7), (this.u / 2.0f) - ((f6 - (i11 / 2.0f)) * f7));
        e();
        this.p.invalidate();
    }

    public final void d() {
        int i = this.d;
        float f = this.k;
        float f2 = this.g / f;
        float f3 = this.i / 2.0f;
        int i2 = (int) (((i / f) - f2) + f3);
        int i3 = (int) (((this.e / f) - f2) + f3);
        int i4 = this.c;
        float f4 = this.h / f;
        float f5 = this.j / 2.0f;
        int i5 = (int) (((i4 / f) - f4) + f5);
        int i6 = (int) (((this.f / f) - f4) + f5);
        epw epwVar = this.r;
        epwVar.f = f / this.s;
        epwVar.g((i2 + i3) / 2, (i5 + i6) / 2);
        Rect rect = new Rect(i2, 0, i3, i6);
        Rect rect2 = new Rect(i2, i5, i3, i6);
        Rect rect3 = new Rect(this.d, this.c, this.e, this.f);
        if (rect.width() < Math.min(128, rect3.width()) || rect.height() < Math.min(128, rect3.height())) {
            try {
                int max = Math.max(0, (int) (this.h - ((this.j * this.k) / 2.0f)));
                int a = eqf.a(this.e - this.d, this.f - this.c, 128, 128);
                epw epwVar2 = this.r;
                Bitmap createBitmap = Bitmap.createBitmap(this.a.getWidth() / a, this.a.getHeight() / a, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float f6 = 1.0f / a;
                canvas.scale(f6, f6);
                this.a.draw(canvas);
                Rect rect4 = new Rect(this.d / a, max / a, this.e / a, this.f / a);
                Rect rect5 = new Rect(this.d / a, this.c / a, this.e / a, this.f / a);
                epwVar2.c = createBitmap;
                epwVar2.a.set(rect4);
                epw.f(epwVar2.a, createBitmap.getWidth(), createBitmap.getHeight());
                epwVar2.b.set(rect5);
                epw.f(epwVar2.b, createBitmap.getWidth(), createBitmap.getHeight());
                return;
            } catch (OutOfMemoryError e) {
                ((ltd) ((ltd) ((ltd) o.c()).i(e)).k("com/google/android/apps/inputmethod/libs/theme/builder/ThemeBuilderCroppingPage", "updateCroppingRectOfTheme", (char) 413, "ThemeBuilderCroppingPage.java")).t("Error on createBackGroundBitmap");
                this.r.h(rect, rect2);
                return;
            }
        }
        this.r.h(rect, rect2);
    }

    public final void e() {
        Matrix matrix = new Matrix();
        matrix.setTranslate(this.g - (this.i / 2.0f), this.h - (this.j / 2.0f));
        float f = this.k;
        matrix.postScale(f, f, this.g, this.h);
        this.a.setImageMatrix(matrix);
        this.a.invalidate();
    }

    public final void f(float f, float f2) {
        int i = this.i;
        float f3 = this.k;
        int i2 = this.j;
        float f4 = (i * f3) / 2.0f;
        this.g = b(f, this.e - f4, this.d + f4);
        float f5 = (i2 * f3) / 2.0f;
        this.h = b(f2, this.f - f5, this.c + f5);
    }

    public final void g(float f) {
        this.k = Math.max(this.v, f);
    }
}

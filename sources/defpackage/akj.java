package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* renamed from: akj  reason: default package */
/* loaded from: classes.dex */
final class akj extends akl {
    public int[] a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    Paint.Cap h;
    Paint.Join i;
    float j;
    knf k;
    knf l;

    public akj() {
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
    }

    @Override // defpackage.wg
    public final boolean c() {
        return this.l.e() || this.k.e();
    }

    @Override // defpackage.wg
    public final boolean d(int[] iArr) {
        return this.k.f(iArr) | this.l.f(iArr);
    }

    float getFillAlpha() {
        return this.d;
    }

    int getFillColor() {
        return this.l.a;
    }

    float getStrokeAlpha() {
        return this.c;
    }

    int getStrokeColor() {
        return this.k.a;
    }

    float getStrokeWidth() {
        return this.b;
    }

    float getTrimPathEnd() {
        return this.f;
    }

    float getTrimPathOffset() {
        return this.g;
    }

    float getTrimPathStart() {
        return this.e;
    }

    void setFillAlpha(float f) {
        this.d = f;
    }

    void setFillColor(int i) {
        this.l.a = i;
    }

    void setStrokeAlpha(float f) {
        this.c = f;
    }

    void setStrokeColor(int i) {
        this.k.a = i;
    }

    void setStrokeWidth(float f) {
        this.b = f;
    }

    void setTrimPathEnd(float f) {
        this.f = f;
    }

    void setTrimPathOffset(float f) {
        this.g = f;
    }

    void setTrimPathStart(float f) {
        this.e = f;
    }

    public akj(akj akjVar) {
        super(akjVar);
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
        int[] iArr = akjVar.a;
        this.a = null;
        this.k = akjVar.k;
        this.b = akjVar.b;
        this.c = akjVar.c;
        this.l = akjVar.l;
        this.o = akjVar.o;
        this.d = akjVar.d;
        this.e = akjVar.e;
        this.f = akjVar.f;
        this.g = akjVar.g;
        this.h = akjVar.h;
        this.i = akjVar.i;
        this.j = akjVar.j;
    }
}

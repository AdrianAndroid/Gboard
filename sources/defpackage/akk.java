package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akk  reason: default package */
/* loaded from: classes.dex */
public final class akk extends wg {
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public akk() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }

    @Override // defpackage.wg
    public final boolean c() {
        for (int i = 0; i < this.b.size(); i++) {
            if (((wg) this.b.get(i)).c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wg
    public final boolean d(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.b.size(); i++) {
            z |= ((wg) this.b.get(i)).d(iArr);
        }
        return z;
    }

    public final void e() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            e();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            e();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            e();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            e();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            e();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            e();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            e();
        }
    }

    public akk(akk akkVar, qo qoVar) {
        akl akiVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.c = akkVar.c;
        this.d = akkVar.d;
        this.e = akkVar.e;
        this.f = akkVar.f;
        this.g = akkVar.g;
        this.h = akkVar.h;
        this.i = akkVar.i;
        int[] iArr = akkVar.l;
        this.l = null;
        String str = akkVar.m;
        this.m = str;
        int i = akkVar.k;
        this.k = 0;
        if (str != null) {
            qoVar.put(str, this);
        }
        matrix.set(akkVar.j);
        ArrayList arrayList = akkVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof akk) {
                this.b.add(new akk((akk) obj, qoVar));
            } else {
                if (obj instanceof akj) {
                    akiVar = new akj((akj) obj);
                } else if (obj instanceof aki) {
                    akiVar = new aki((aki) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(akiVar);
                Object obj2 = akiVar.n;
                if (obj2 != null) {
                    qoVar.put(obj2, akiVar);
                }
            }
        }
    }
}

package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: aou  reason: default package */
/* loaded from: classes.dex */
public final class aou {
    public aoh a;
    public aoh b;
    public aoh c;
    public aoh d;
    public aoh e;
    public final aoj f;
    public final aoj g;
    public final aoh h;
    public final aoh i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;

    public aou(apn apnVar) {
        aph aphVar = apnVar.a;
        this.a = aphVar == null ? null : aphVar.a();
        apo apoVar = apnVar.b;
        this.b = apoVar == null ? null : apoVar.a();
        apj apjVar = apnVar.c;
        this.c = apjVar == null ? null : apjVar.a();
        ape apeVar = apnVar.d;
        this.d = apeVar == null ? null : apeVar.a();
        ape apeVar2 = apnVar.f;
        aoj aojVar = (aoj) (apeVar2 == null ? null : apeVar2.a());
        this.f = aojVar;
        if (aojVar != null) {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        ape apeVar3 = apnVar.g;
        this.g = (aoj) (apeVar3 == null ? null : apeVar3.a());
        apg apgVar = apnVar.e;
        if (apgVar != null) {
            this.e = apgVar.a();
        }
        ape apeVar4 = apnVar.h;
        if (apeVar4 != null) {
            this.h = apeVar4.a();
        } else {
            this.h = null;
        }
        ape apeVar5 = apnVar.i;
        if (apeVar5 != null) {
            this.i = apeVar5.a();
        } else {
            this.i = null;
        }
    }

    private final void f() {
        for (int i = 0; i < 9; i++) {
            this.n[i] = 0.0f;
        }
    }

    public final Matrix a() {
        float k;
        this.j.reset();
        aoh aohVar = this.b;
        if (aohVar != null) {
            PointF pointF = (PointF) aohVar.e();
            if (pointF.x != 0.0f || pointF.y != 0.0f) {
                this.j.preTranslate(pointF.x, pointF.y);
            }
        }
        aoh aohVar2 = this.d;
        if (aohVar2 != null) {
            if (aohVar2 instanceof aov) {
                k = ((Float) aohVar2.e()).floatValue();
            } else {
                k = ((aoj) aohVar2).k();
            }
            if (k != 0.0f) {
                this.j.preRotate(k);
            }
        }
        if (this.f != null) {
            aoj aojVar = this.g;
            float cos = aojVar == null ? 0.0f : (float) Math.cos(Math.toRadians((-aojVar.k()) + 90.0f));
            aoj aojVar2 = this.g;
            float sin = aojVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-aojVar2.k()) + 90.0f));
            double tan = Math.tan(Math.toRadians(this.f.k()));
            f();
            float[] fArr = this.n;
            fArr[0] = cos;
            fArr[1] = sin;
            float f = -sin;
            fArr[3] = f;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.k.setValues(fArr);
            f();
            float[] fArr2 = this.n;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.l.setValues(fArr2);
            f();
            float[] fArr3 = this.n;
            fArr3[0] = cos;
            fArr3[1] = f;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.m.setValues(fArr3);
            this.l.preConcat(this.k);
            this.m.preConcat(this.l);
            this.j.preConcat(this.m);
        }
        aoh aohVar3 = this.c;
        if (aohVar3 != null) {
            ask askVar = (ask) aohVar3.e();
            float f2 = askVar.a;
            if (f2 != 1.0f || askVar.b != 1.0f) {
                this.j.preScale(f2, askVar.b);
            }
        }
        aoh aohVar4 = this.a;
        if (aohVar4 != null) {
            PointF pointF2 = (PointF) aohVar4.e();
            if (pointF2.x != 0.0f || pointF2.y != 0.0f) {
                this.j.preTranslate(-pointF2.x, -pointF2.y);
            }
        }
        return this.j;
    }

    public final void c(aqf aqfVar) {
        aqfVar.h(this.e);
        aqfVar.h(this.h);
        aqfVar.h(this.i);
        aqfVar.h(this.a);
        aqfVar.h(this.b);
        aqfVar.h(this.c);
        aqfVar.h(this.d);
        aqfVar.h(this.f);
        aqfVar.h(this.g);
    }

    public final void d(aoc aocVar) {
        aoh aohVar = this.e;
        if (aohVar != null) {
            aohVar.g(aocVar);
        }
        aoh aohVar2 = this.h;
        if (aohVar2 != null) {
            aohVar2.g(aocVar);
        }
        aoh aohVar3 = this.i;
        if (aohVar3 != null) {
            aohVar3.g(aocVar);
        }
        aoh aohVar4 = this.a;
        if (aohVar4 != null) {
            aohVar4.g(aocVar);
        }
        aoh aohVar5 = this.b;
        if (aohVar5 != null) {
            aohVar5.g(aocVar);
        }
        aoh aohVar6 = this.c;
        if (aohVar6 != null) {
            aohVar6.g(aocVar);
        }
        aoh aohVar7 = this.d;
        if (aohVar7 != null) {
            aohVar7.g(aocVar);
        }
        aoj aojVar = this.f;
        if (aojVar != null) {
            aojVar.g(aocVar);
        }
        aoj aojVar2 = this.g;
        if (aojVar2 != null) {
            aojVar2.g(aocVar);
        }
    }

    public final boolean e(Object obj, asj asjVar) {
        aoh aohVar;
        aoh aohVar2;
        if (obj == and.e) {
            aoh aohVar3 = this.a;
            if (aohVar3 != null) {
                aohVar3.d = asjVar;
                return true;
            }
            new PointF();
            this.a = new aov(asjVar, null);
            return true;
        } else if (obj == and.f) {
            aoh aohVar4 = this.b;
            if (aohVar4 != null) {
                aohVar4.d = asjVar;
                return true;
            }
            new PointF();
            this.b = new aov(asjVar, null);
            return true;
        } else {
            if (obj == and.g) {
                aoh aohVar5 = this.b;
                if (aohVar5 instanceof aos) {
                    aos aosVar = (aos) aohVar5;
                    asj asjVar2 = aosVar.e;
                    aosVar.e = asjVar;
                    return true;
                }
            }
            if (obj == and.h) {
                aoh aohVar6 = this.b;
                if (aohVar6 instanceof aos) {
                    aos aosVar2 = (aos) aohVar6;
                    asj asjVar3 = aosVar2.f;
                    aosVar2.f = asjVar;
                    return true;
                }
            }
            if (obj == and.m) {
                aoh aohVar7 = this.c;
                if (aohVar7 == null) {
                    this.c = new aov(asjVar, null);
                    return true;
                }
                aohVar7.d = asjVar;
                return true;
            } else if (obj == and.n) {
                aoh aohVar8 = this.d;
                if (aohVar8 == null) {
                    this.d = new aov(asjVar, null);
                    return true;
                }
                aohVar8.d = asjVar;
                return true;
            } else {
                if (obj == and.c) {
                    aohVar = this.e;
                    if (aohVar == null) {
                        this.e = new aov(asjVar, null);
                        return true;
                    }
                } else if ((obj == and.A && (aohVar2 = this.h) != null) || ((obj == and.B && (aohVar2 = this.i) != null) || (obj == and.o && (aohVar2 = this.f) != null))) {
                    aohVar2.d = asjVar;
                    return true;
                } else if (obj != and.p || (aohVar = this.g) == null) {
                    return false;
                }
                aohVar.d = asjVar;
                return true;
            }
        }
    }

    public final Matrix b(float f) {
        aoh aohVar = this.b;
        PointF pointF = null;
        PointF pointF2 = aohVar == null ? null : (PointF) aohVar.e();
        aoh aohVar2 = this.c;
        ask askVar = aohVar2 == null ? null : (ask) aohVar2.e();
        this.j.reset();
        if (pointF2 != null) {
            this.j.preTranslate(pointF2.x * f, pointF2.y * f);
        }
        if (askVar != null) {
            double d = f;
            this.j.preScale((float) Math.pow(askVar.a, d), (float) Math.pow(askVar.b, d));
        }
        aoh aohVar3 = this.d;
        if (aohVar3 != null) {
            float floatValue = ((Float) aohVar3.e()).floatValue();
            aoh aohVar4 = this.a;
            if (aohVar4 != null) {
                pointF = (PointF) aohVar4.e();
            }
            Matrix matrix = this.j;
            float f2 = floatValue * f;
            float f3 = 0.0f;
            float f4 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f3 = pointF.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.j;
    }
}

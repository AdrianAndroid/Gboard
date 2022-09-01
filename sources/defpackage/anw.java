package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* renamed from: anw  reason: default package */
/* loaded from: classes.dex */
public final class anw implements anv, aoc, ant {
    private final String b;
    private final amy c;
    private final boolean d;
    private final aoh e;
    private final aoh f;
    private final aoh g;
    private final aoh h;
    private final aoh i;
    private final aoh j;
    private final aoh k;
    private boolean l;
    private final int m;
    private final Path a = new Path();
    private final aqr n = new aqr((short[]) null);

    public anw(amy amyVar, aqf aqfVar, apv apvVar) {
        this.c = amyVar;
        this.b = apvVar.a;
        int i = apvVar.j;
        this.m = i;
        this.d = apvVar.i;
        aoh a = apvVar.b.a();
        this.e = a;
        aoh a2 = apvVar.c.a();
        this.f = a2;
        aoh a3 = apvVar.d.a();
        this.g = a3;
        aoh a4 = apvVar.f.a();
        this.i = a4;
        aoh a5 = apvVar.h.a();
        this.k = a5;
        if (i == 1) {
            this.h = apvVar.e.a();
            this.j = apvVar.g.a();
        } else {
            this.h = null;
            this.j = null;
        }
        aqfVar.h(a);
        aqfVar.h(a2);
        aqfVar.h(a3);
        aqfVar.h(a4);
        aqfVar.h(a5);
        if (i == 1) {
            aqfVar.h(this.h);
            aqfVar.h(this.j);
        }
        a.g(this);
        a2.g(this);
        a3.g(this);
        a4.g(this);
        a5.g(this);
        if (i == 1) {
            this.h.g(this);
            this.j.g(this);
        }
    }

    @Override // defpackage.apa
    public final void a(Object obj, asj asjVar) {
        aoh aohVar;
        aoh aohVar2;
        aoh aohVar3;
        if (obj == and.u) {
            aohVar = this.e;
        } else if (obj == and.v) {
            aohVar = this.g;
        } else if (obj == and.l) {
            aohVar = this.f;
        } else if (obj == and.w && (aohVar3 = this.h) != null) {
            aohVar3.d = asjVar;
            return;
        } else if (obj == and.x) {
            aohVar = this.i;
        } else if (obj == and.y && (aohVar2 = this.j) != null) {
            aohVar2.d = asjVar;
            return;
        } else if (obj != and.z) {
            return;
        } else {
            aohVar = this.k;
        }
        aohVar.d = asjVar;
    }

    @Override // defpackage.aoc
    public final void d() {
        this.l = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.apa
    public final void e(aoz aozVar, int i, List list, aoz aozVar2) {
        asc.h(aozVar, i, list, aozVar2, this);
    }

    @Override // defpackage.anl
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            anl anlVar = (anl) list.get(i);
            if (anlVar instanceof aob) {
                aob aobVar = (aob) anlVar;
                if (aobVar.e == 1) {
                    this.n.k(aobVar);
                    aobVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.anl
    public final String g() {
        return this.b;
    }

    @Override // defpackage.anv
    public final Path i() {
        float f;
        float f2;
        float f3;
        double d;
        float f4;
        boolean z;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        double d2;
        float f13;
        float f14;
        double d3;
        double d4;
        double d5;
        if (this.l) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.l = true;
            return this.a;
        }
        int i = this.m;
        if (i == 0) {
            throw null;
        }
        float f15 = 0.0f;
        if (i == 1) {
            float floatValue = ((Float) this.e.e()).floatValue();
            double floatValue2 = ((Float) this.g.e()).floatValue();
            Double.isNaN(floatValue2);
            double radians = Math.toRadians(floatValue2 - 90.0d);
            double d6 = floatValue;
            Double.isNaN(d6);
            float f16 = (float) (6.283185307179586d / d6);
            float f17 = f16 / 2.0f;
            float f18 = floatValue - ((int) floatValue);
            if (f18 != 0.0f) {
                double d7 = (1.0f - f18) * f17;
                Double.isNaN(d7);
                radians += d7;
            }
            float floatValue3 = ((Float) this.i.e()).floatValue();
            float floatValue4 = ((Float) this.h.e()).floatValue();
            aoh aohVar = this.j;
            float floatValue5 = aohVar != null ? ((Float) aohVar.e()).floatValue() / 100.0f : 0.0f;
            float floatValue6 = ((Float) this.k.e()).floatValue() / 100.0f;
            if (f18 != 0.0f) {
                float f19 = ((floatValue3 - floatValue4) * f18) + floatValue4;
                double d8 = f19;
                double cos = Math.cos(radians);
                Double.isNaN(d8);
                float f20 = (float) (d8 * cos);
                double sin = Math.sin(radians);
                Double.isNaN(d8);
                f2 = (float) (d8 * sin);
                this.a.moveTo(f20, f2);
                double d9 = (f16 * f18) / 2.0f;
                Double.isNaN(d9);
                d = radians + d9;
                f4 = f19;
                f = f20;
                f3 = f17;
            } else {
                double d10 = floatValue3;
                double cos2 = Math.cos(radians);
                Double.isNaN(d10);
                f = (float) (cos2 * d10);
                double sin2 = Math.sin(radians);
                Double.isNaN(d10);
                f2 = (float) (d10 * sin2);
                this.a.moveTo(f, f2);
                f3 = f17;
                double d11 = f3;
                Double.isNaN(d11);
                d = radians + d11;
                f4 = 0.0f;
            }
            double ceil = Math.ceil(d6);
            double d12 = ceil + ceil;
            float f21 = f3;
            float f22 = f2;
            float f23 = f;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                double d13 = i2;
                if (d13 >= d12) {
                    break;
                }
                float f24 = floatValue3;
                if (true != z2) {
                    z = z2;
                    f5 = floatValue4;
                } else {
                    z = z2;
                    f5 = f24;
                }
                float f25 = (f4 == 0.0f || d13 != d12 + (-2.0d)) ? f21 : (f16 * f18) / 2.0f;
                if (f4 == 0.0f || d13 != d12 - 1.0d) {
                    f6 = f16;
                    f7 = f25;
                    f8 = f4;
                    f9 = f5;
                } else {
                    f6 = f16;
                    f7 = f25;
                    f9 = f4;
                    f8 = f9;
                }
                double d14 = f9;
                double cos3 = Math.cos(d);
                Double.isNaN(d14);
                float f26 = (float) (d14 * cos3);
                double sin3 = Math.sin(d);
                Double.isNaN(d14);
                float f27 = (float) (d14 * sin3);
                if (floatValue5 != 0.0f || floatValue6 != 0.0f) {
                    float f28 = f22;
                    f10 = floatValue6;
                    f11 = floatValue5;
                    float f29 = f23;
                    f12 = floatValue4;
                    double atan2 = (float) (Math.atan2(f28, f29) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    d2 = d;
                    f13 = f27;
                    double atan22 = (float) (Math.atan2(f27, f26) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    float f30 = true != z ? f10 : f11;
                    float f31 = true != z ? f11 : f10;
                    float f32 = (true != z ? f24 : f12) * f30 * 0.47829f;
                    float f33 = cos4 * f32;
                    float f34 = f32 * sin4;
                    float f35 = f5 * f31 * 0.47829f;
                    float f36 = cos5 * f35;
                    float f37 = f35 * sin5;
                    if (f18 != 0.0f) {
                        if (i2 == 0) {
                            f33 *= f18;
                            f34 *= f18;
                        } else if (d13 == d12 - 1.0d) {
                            f36 *= f18;
                            f37 *= f18;
                        }
                    }
                    this.a.cubicTo(f29 - f33, f28 - f34, f26 + f36, f13 + f37, f26, f13);
                    f14 = f7;
                } else {
                    this.a.lineTo(f26, f27);
                    d2 = d;
                    f10 = floatValue6;
                    f12 = floatValue4;
                    f11 = floatValue5;
                    f14 = f7;
                    f13 = f27;
                }
                double d15 = f14;
                Double.isNaN(d15);
                d = d2 + d15;
                z2 = !z;
                i2++;
                floatValue6 = f10;
                floatValue4 = f12;
                floatValue3 = f24;
                f4 = f8;
                f23 = f26;
                f22 = f13;
                f16 = f6;
                floatValue5 = f11;
            }
            PointF pointF = (PointF) this.f.e();
            this.a.offset(pointF.x, pointF.y);
            this.a.close();
        } else {
            double floor = Math.floor(((Float) this.e.e()).floatValue());
            double floatValue7 = ((Float) this.g.e()).floatValue();
            Double.isNaN(floatValue7);
            double radians2 = Math.toRadians(floatValue7 - 90.0d);
            double d16 = (int) floor;
            float floatValue8 = ((Float) this.k.e()).floatValue() / 100.0f;
            float floatValue9 = ((Float) this.i.e()).floatValue();
            double d17 = floatValue9;
            double cos6 = Math.cos(radians2);
            Double.isNaN(d17);
            float f38 = (float) (d17 * cos6);
            double sin6 = Math.sin(radians2);
            Double.isNaN(d17);
            float f39 = (float) (d17 * sin6);
            this.a.moveTo(f38, f39);
            Double.isNaN(d16);
            double d18 = (float) (6.283185307179586d / d16);
            Double.isNaN(d18);
            double d19 = radians2 + d18;
            double ceil2 = Math.ceil(d16);
            float f40 = f39;
            float f41 = f38;
            int i3 = 0;
            while (i3 < ceil2) {
                double cos7 = Math.cos(d19);
                Double.isNaN(d17);
                float f42 = (float) (cos7 * d17);
                double sin7 = Math.sin(d19);
                Double.isNaN(d17);
                float f43 = (float) (sin7 * d17);
                if (floatValue8 != f15) {
                    d5 = d17;
                    double atan23 = (float) (Math.atan2(f40, f41) - 1.5707963267948966d);
                    d4 = ceil2;
                    d3 = d19;
                    double atan24 = (float) (Math.atan2(f43, f42) - 1.5707963267948966d);
                    float f44 = floatValue9 * floatValue8 * 0.25f;
                    this.a.cubicTo(f41 - (((float) Math.cos(atan23)) * f44), f40 - (((float) Math.sin(atan23)) * f44), f42 + (((float) Math.cos(atan24)) * f44), f43 + (f44 * ((float) Math.sin(atan24))), f42, f43);
                } else {
                    d3 = d19;
                    d4 = ceil2;
                    d5 = d17;
                    this.a.lineTo(f42, f43);
                }
                Double.isNaN(d18);
                d19 = d3 + d18;
                i3++;
                f41 = f42;
                f40 = f43;
                d17 = d5;
                ceil2 = d4;
                f15 = 0.0f;
            }
            PointF pointF2 = (PointF) this.f.e();
            this.a.offset(pointF2.x, pointF2.y);
            this.a.close();
        }
        this.a.close();
        this.n.l(this.a);
        this.l = true;
        return this.a;
    }
}

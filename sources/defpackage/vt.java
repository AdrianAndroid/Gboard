package defpackage;

import android.graphics.Path;
import android.util.Log;

/* compiled from: PG */
/* renamed from: vt  reason: default package */
/* loaded from: classes2.dex */
public final class vt {
    public char a;
    public final float[] b;

    public vt(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }

    public vt(vt vtVar) {
        this.a = vtVar.a;
        float[] fArr = vtVar.b;
        this.b = kd.f(fArr, fArr.length);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(vt[] vtVarArr, Path path) {
        int i;
        int i2;
        float[] fArr;
        char c;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        vt[] vtVarArr2 = vtVarArr;
        float[] fArr2 = new float[6];
        char c2 = 'm';
        char c3 = 0;
        char c4 = 'm';
        int i4 = 0;
        while (i4 < vtVarArr2.length) {
            vt vtVar = vtVarArr2[i4];
            char c5 = vtVar.a;
            float[] fArr3 = vtVar.b;
            float f13 = fArr2[c3];
            float f14 = fArr2[1];
            float f15 = fArr2[2];
            float f16 = fArr2[3];
            float f17 = fArr2[4];
            float f18 = fArr2[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                    i = 2;
                    break;
            }
            float f19 = f17;
            float f20 = f18;
            float f21 = f13;
            float f22 = f14;
            int i5 = 0;
            while (i5 < fArr3.length) {
                if (c5 != 'A') {
                    if (c5 == 'C') {
                        i2 = i5;
                        fArr = fArr3;
                        c = c5;
                        i3 = i4;
                        int i6 = i2 + 2;
                        int i7 = i2 + 3;
                        int i8 = i2 + 4;
                        int i9 = i2 + 5;
                        path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i6], fArr[i7], fArr[i8], fArr[i9]);
                        f21 = fArr[i8];
                        f22 = fArr[i9];
                        f15 = fArr[i6];
                        f16 = fArr[i7];
                    } else if (c5 == 'H') {
                        i2 = i5;
                        fArr = fArr3;
                        c = c5;
                        i3 = i4;
                        path.lineTo(fArr[i2], f22);
                        f21 = fArr[i2];
                    } else if (c5 == 'Q') {
                        i2 = i5;
                        fArr = fArr3;
                        c = c5;
                        i3 = i4;
                        int i10 = i2 + 1;
                        int i11 = i2 + 2;
                        int i12 = i2 + 3;
                        path.quadTo(fArr[i2], fArr[i10], fArr[i11], fArr[i12]);
                        float f23 = fArr[i2];
                        float f24 = fArr[i10];
                        f21 = fArr[i11];
                        f22 = fArr[i12];
                        f15 = f23;
                        f16 = f24;
                    } else if (c5 == 'V') {
                        i2 = i5;
                        fArr = fArr3;
                        c = c5;
                        i3 = i4;
                        path.lineTo(f21, fArr[i2]);
                        f22 = fArr[i2];
                    } else if (c5 != 'a') {
                        if (c5 != 'c') {
                            if (c5 == 'h') {
                                i2 = i5;
                                path.rLineTo(fArr3[i2], 0.0f);
                                f21 += fArr3[i2];
                            } else if (c5 == 'q') {
                                i2 = i5;
                                f = f22;
                                float f25 = f21;
                                int i13 = i2 + 1;
                                int i14 = i2 + 2;
                                int i15 = i2 + 3;
                                path.rQuadTo(fArr3[i2], fArr3[i13], fArr3[i14], fArr3[i15]);
                                f2 = f25 + fArr3[i2];
                                f3 = f + fArr3[i13];
                                f4 = f25 + fArr3[i14];
                                f5 = fArr3[i15];
                            } else if (c5 == 'v') {
                                i2 = i5;
                                path.rLineTo(0.0f, fArr3[i2]);
                                f22 += fArr3[i2];
                            } else if (c5 == 'L') {
                                i2 = i5;
                                int i16 = i2 + 1;
                                path.lineTo(fArr3[i2], fArr3[i16]);
                                f21 = fArr3[i2];
                                f22 = fArr3[i16];
                            } else if (c5 == 'M') {
                                i2 = i5;
                                f21 = fArr3[i2];
                                f22 = fArr3[i2 + 1];
                                if (i2 > 0) {
                                    path.lineTo(f21, f22);
                                } else {
                                    path.moveTo(f21, f22);
                                    f20 = f22;
                                    f19 = f21;
                                }
                            } else if (c5 == 'S') {
                                i2 = i5;
                                float f26 = f22;
                                float f27 = f21;
                                if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                    f7 = (f26 + f26) - f16;
                                    f8 = (f27 + f27) - f15;
                                } else {
                                    f8 = f27;
                                    f7 = f26;
                                }
                                int i17 = i2 + 1;
                                int i18 = i2 + 2;
                                int i19 = i2 + 3;
                                path.cubicTo(f8, f7, fArr3[i2], fArr3[i17], fArr3[i18], fArr3[i19]);
                                float f28 = fArr3[i2];
                                float f29 = fArr3[i17];
                                f21 = fArr3[i18];
                                f22 = fArr3[i19];
                                f16 = f29;
                                f15 = f28;
                            } else if (c5 == 'T') {
                                i2 = i5;
                                float f30 = f22;
                                float f31 = f21;
                                if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                    f2 = (f31 + f31) - f15;
                                    f3 = (f30 + f30) - f16;
                                } else {
                                    f2 = f31;
                                    f3 = f30;
                                }
                                int i20 = i2 + 1;
                                path.quadTo(f2, f3, fArr3[i2], fArr3[i20]);
                                f4 = fArr3[i2];
                                f6 = fArr3[i20];
                                f16 = f3;
                                f15 = f2;
                                fArr = fArr3;
                                c = c5;
                                i3 = i4;
                                f21 = f4;
                                f22 = f6;
                            } else if (c5 == 'l') {
                                i2 = i5;
                                int i21 = i2 + 1;
                                path.rLineTo(fArr3[i2], fArr3[i21]);
                                f21 += fArr3[i2];
                                f22 += fArr3[i21];
                            } else if (c5 == c2) {
                                i2 = i5;
                                float f32 = fArr3[i2];
                                f21 += f32;
                                float f33 = fArr3[i2 + 1];
                                f22 += f33;
                                if (i2 > 0) {
                                    path.rLineTo(f32, f33);
                                } else {
                                    path.rMoveTo(f32, f33);
                                    f20 = f22;
                                    f19 = f21;
                                }
                            } else if (c5 == 's') {
                                if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                    f9 = f22 - f16;
                                    f10 = f21 - f15;
                                } else {
                                    f10 = 0.0f;
                                    f9 = 0.0f;
                                }
                                int i22 = i5 + 1;
                                int i23 = i5 + 2;
                                int i24 = i5 + 3;
                                i2 = i5;
                                f = f22;
                                float f34 = f21;
                                path.rCubicTo(f10, f9, fArr3[i5], fArr3[i22], fArr3[i23], fArr3[i24]);
                                f2 = f34 + fArr3[i2];
                                f3 = f + fArr3[i22];
                                f4 = f34 + fArr3[i23];
                                f5 = fArr3[i24];
                            } else if (c5 != 't') {
                                i2 = i5;
                            } else {
                                if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                    f11 = f21 - f15;
                                    f12 = f22 - f16;
                                } else {
                                    f12 = 0.0f;
                                    f11 = 0.0f;
                                }
                                int i25 = i5 + 1;
                                path.rQuadTo(f11, f12, fArr3[i5], fArr3[i25]);
                                float f35 = f11 + f21;
                                float f36 = f12 + f22;
                                f21 += fArr3[i5];
                                f22 += fArr3[i25];
                                f16 = f36;
                                i2 = i5;
                                fArr = fArr3;
                                c = c5;
                                i3 = i4;
                                f15 = f35;
                            }
                            fArr = fArr3;
                            c = c5;
                            i3 = i4;
                        } else {
                            i2 = i5;
                            f = f22;
                            float f37 = f21;
                            int i26 = i2 + 2;
                            int i27 = i2 + 3;
                            int i28 = i2 + 4;
                            int i29 = i2 + 5;
                            path.rCubicTo(fArr3[i2], fArr3[i2 + 1], fArr3[i26], fArr3[i27], fArr3[i28], fArr3[i29]);
                            f2 = f37 + fArr3[i26];
                            f3 = f + fArr3[i27];
                            f4 = f37 + fArr3[i28];
                            f5 = fArr3[i29];
                        }
                        f6 = f5 + f;
                        f16 = f3;
                        f15 = f2;
                        fArr = fArr3;
                        c = c5;
                        i3 = i4;
                        f21 = f4;
                        f22 = f6;
                    } else {
                        i2 = i5;
                        float f38 = f22;
                        float f39 = f21;
                        int i30 = i2 + 5;
                        int i31 = i2 + 6;
                        fArr = fArr3;
                        c = c5;
                        i3 = i4;
                        b(path, f39, f38, fArr3[i30] + f39, fArr3[i31] + f38, fArr3[i2], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3] != 0.0f, fArr3[i2 + 4] != 0.0f);
                        f21 = f39 + fArr[i30];
                        f22 = f38 + fArr[i31];
                    }
                    i5 = i2 + i;
                    c4 = c;
                    c5 = c4;
                    fArr3 = fArr;
                    i4 = i3;
                    c2 = 'm';
                } else {
                    i2 = i5;
                    fArr = fArr3;
                    c = c5;
                    i3 = i4;
                    int i32 = i2 + 5;
                    int i33 = i2 + 6;
                    b(path, f21, f22, fArr[i32], fArr[i33], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f, fArr[i2 + 4] != 0.0f);
                    f21 = fArr[i32];
                    f22 = fArr[i33];
                }
                f16 = f22;
                f15 = f21;
                i5 = i2 + i;
                c4 = c;
                c5 = c4;
                fArr3 = fArr;
                i4 = i3;
                c2 = 'm';
            }
            int i34 = i4;
            fArr2[0] = f21;
            fArr2[1] = f22;
            fArr2[2] = f15;
            fArr2[3] = f16;
            fArr2[4] = f19;
            fArr2[5] = f20;
            i4 = i34 + 1;
            c4 = vtVarArr[i34].a;
            c2 = 'm';
            c3 = 0;
            vtVarArr2 = vtVarArr;
        }
    }

    private static void b(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = f5;
        Double.isNaN(d3);
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = ((d3 * cos) + (d4 * sin)) / d5;
        double d7 = d3;
        double d8 = f6;
        double d9 = -f;
        Double.isNaN(d9);
        Double.isNaN(d4);
        Double.isNaN(d8);
        double d10 = ((d9 * sin) + (d4 * cos)) / d8;
        double d11 = d4;
        double d12 = f4;
        double d13 = f3;
        Double.isNaN(d13);
        Double.isNaN(d12);
        Double.isNaN(d5);
        double d14 = ((d13 * cos) + (d12 * sin)) / d5;
        double d15 = -f3;
        Double.isNaN(d15);
        Double.isNaN(d12);
        Double.isNaN(d8);
        double d16 = ((d15 * sin) + (d12 * cos)) / d8;
        double d17 = d6 - d14;
        double d18 = d10 - d16;
        double d19 = (d6 + d14) / 2.0d;
        double d20 = (d10 + d16) / 2.0d;
        double d21 = (d17 * d17) + (d18 * d18);
        if (d21 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d21);
            float sqrt = (float) (Math.sqrt(d21) / 1.99999d);
            b(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d22);
        double d23 = d17 * sqrt2;
        double d24 = sqrt2 * d18;
        if (z == z2) {
            d = d19 - d24;
            d2 = d20 + d23;
        } else {
            d = d19 + d24;
            d2 = d20 - d23;
        }
        double atan2 = Math.atan2(d10 - d2, d6 - d);
        double atan22 = Math.atan2(d16 - d2, d14 - d) - atan2;
        int i = 0;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 += atan22 > 0.0d ? -6.283185307179586d : 6.283185307179586d;
        }
        Double.isNaN(d5);
        double d25 = d * d5;
        Double.isNaN(d8);
        double d26 = d2 * d8;
        double d27 = (d25 * cos) - (d26 * sin);
        double d28 = (d25 * sin) + (d26 * cos);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        Double.isNaN(d5);
        double d29 = -d5;
        double d30 = d29 * cos2;
        Double.isNaN(d8);
        double d31 = d8 * sin2;
        double d32 = (d30 * sin3) - (d31 * cos3);
        double d33 = d29 * sin2;
        Double.isNaN(d8);
        double d34 = d8 * cos2;
        double d35 = (sin3 * d33) + (cos3 * d34);
        double d36 = ceil;
        Double.isNaN(d36);
        double d37 = atan22 / d36;
        double d38 = atan2;
        while (i < ceil) {
            double d39 = d38 + d37;
            double sin4 = Math.sin(d39);
            double cos4 = Math.cos(d39);
            Double.isNaN(d5);
            double d40 = d37;
            double d41 = (d27 + ((d5 * cos2) * cos4)) - (d31 * sin4);
            Double.isNaN(d5);
            int i2 = ceil;
            double d42 = d28 + (d5 * sin2 * cos4) + (d34 * sin4);
            double d43 = (d30 * sin4) - (d31 * cos4);
            double d44 = (sin4 * d33) + (cos4 * d34);
            double d45 = d39 - d38;
            double tan = Math.tan(d45 / 2.0d);
            double sin5 = (Math.sin(d45) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) (d7 + (d32 * sin5)), (float) (d11 + (d35 * sin5)), (float) (d41 - (sin5 * d43)), (float) (d42 - (sin5 * d44)), (float) d41, (float) d42);
            i++;
            d27 = d27;
            d33 = d33;
            d7 = d41;
            d11 = d42;
            d38 = d39;
            d35 = d44;
            d32 = d43;
            d5 = d5;
            ceil = i2;
            d37 = d40;
        }
    }
}

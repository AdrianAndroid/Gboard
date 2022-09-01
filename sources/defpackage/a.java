package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: a  reason: default package */
/* loaded from: classes.dex */
public final class a extends ViewGroup.MarginLayoutParams {
    public float A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public float X;
    public l Y;
    public int a;
    public int b;
    public float c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public String y;
    int z;

    public a() {
        super(-2, -2);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.5f;
        this.x = 0.5f;
        this.y = null;
        this.z = 1;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = true;
        this.O = true;
        this.P = false;
        this.Q = false;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = 0.5f;
        this.Y = new l();
    }

    public final void a() {
        this.Q = false;
        this.N = true;
        this.O = true;
        if (this.width == 0 || this.width == -1) {
            this.N = false;
        }
        if (this.height == 0 || this.height == -1) {
            this.O = false;
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.Q = true;
        this.N = true;
        this.O = true;
        if (!(this.Y instanceof n)) {
            this.Y = new n();
        }
        ((n) this.Y).A(this.M);
    }

    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i) {
        super.resolveLayoutDirection(i);
        this.T = -1;
        this.U = -1;
        this.R = -1;
        this.S = -1;
        this.V = this.q;
        this.W = this.s;
        this.X = this.w;
        if (getLayoutDirection() == 1) {
            int i2 = this.m;
            if (i2 != -1) {
                this.T = i2;
            } else {
                int i3 = this.n;
                if (i3 != -1) {
                    this.U = i3;
                }
            }
            int i4 = this.o;
            if (i4 != -1) {
                this.S = i4;
            }
            int i5 = this.p;
            if (i5 != -1) {
                this.R = i5;
            }
            int i6 = this.u;
            if (i6 != -1) {
                this.W = i6;
            }
            int i7 = this.v;
            if (i7 != -1) {
                this.V = i7;
            }
            this.X = 1.0f - this.w;
        } else {
            int i8 = this.m;
            if (i8 != -1) {
                this.S = i8;
            }
            int i9 = this.n;
            if (i9 != -1) {
                this.R = i9;
            }
            int i10 = this.o;
            if (i10 != -1) {
                this.T = i10;
            }
            int i11 = this.p;
            if (i11 != -1) {
                this.U = i11;
            }
            int i12 = this.u;
            if (i12 != -1) {
                this.V = i12;
            }
            int i13 = this.v;
            if (i13 != -1) {
                this.W = i13;
            }
        }
        if (this.o == -1 && this.p == -1) {
            int i14 = this.f;
            if (i14 != -1) {
                this.T = i14;
            } else {
                int i15 = this.g;
                if (i15 != -1) {
                    this.U = i15;
                }
            }
        }
        if (this.n == -1 && this.m == -1) {
            int i16 = this.d;
            if (i16 != -1) {
                this.R = i16;
                return;
            }
            int i17 = this.e;
            if (i17 == -1) {
                return;
            }
            this.S = i17;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.5f;
        this.x = 0.5f;
        this.y = null;
        this.z = 1;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = true;
        this.O = true;
        this.P = false;
        this.Q = false;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = 0.5f;
        this.Y = new l();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 84) {
                int resourceId = obtainStyledAttributes.getResourceId(84, this.d);
                this.d = resourceId;
                if (resourceId == -1) {
                    this.d = obtainStyledAttributes.getInt(84, -1);
                }
            } else if (index == 85) {
                int resourceId2 = obtainStyledAttributes.getResourceId(85, this.e);
                this.e = resourceId2;
                if (resourceId2 == -1) {
                    this.e = obtainStyledAttributes.getInt(85, -1);
                }
            } else if (index == 87) {
                int resourceId3 = obtainStyledAttributes.getResourceId(87, this.f);
                this.f = resourceId3;
                if (resourceId3 == -1) {
                    this.f = obtainStyledAttributes.getInt(87, -1);
                }
            } else if (index == 88) {
                int resourceId4 = obtainStyledAttributes.getResourceId(88, this.g);
                this.g = resourceId4;
                if (resourceId4 == -1) {
                    this.g = obtainStyledAttributes.getInt(88, -1);
                }
            } else if (index == 94) {
                int resourceId5 = obtainStyledAttributes.getResourceId(94, this.h);
                this.h = resourceId5;
                if (resourceId5 == -1) {
                    this.h = obtainStyledAttributes.getInt(94, -1);
                }
            } else if (index == 93) {
                int resourceId6 = obtainStyledAttributes.getResourceId(93, this.i);
                this.i = resourceId6;
                if (resourceId6 == -1) {
                    this.i = obtainStyledAttributes.getInt(93, -1);
                }
            } else if (index == 65) {
                int resourceId7 = obtainStyledAttributes.getResourceId(65, this.j);
                this.j = resourceId7;
                if (resourceId7 == -1) {
                    this.j = obtainStyledAttributes.getInt(65, -1);
                }
            } else if (index == 64) {
                int resourceId8 = obtainStyledAttributes.getResourceId(64, this.k);
                this.k = resourceId8;
                if (resourceId8 == -1) {
                    this.k = obtainStyledAttributes.getInt(64, -1);
                }
            } else if (index == 60) {
                int resourceId9 = obtainStyledAttributes.getResourceId(60, this.l);
                this.l = resourceId9;
                if (resourceId9 == -1) {
                    this.l = obtainStyledAttributes.getInt(60, -1);
                }
            } else if (index == 103) {
                this.K = obtainStyledAttributes.getDimensionPixelOffset(103, this.K);
            } else if (index == 104) {
                this.L = obtainStyledAttributes.getDimensionPixelOffset(104, this.L);
            } else if (index == 72) {
                this.a = obtainStyledAttributes.getDimensionPixelOffset(72, this.a);
            } else if (index == 73) {
                this.b = obtainStyledAttributes.getDimensionPixelOffset(73, this.b);
            } else if (index == 74) {
                this.c = obtainStyledAttributes.getFloat(74, this.c);
            } else if (index == 0) {
                this.M = obtainStyledAttributes.getInt(0, this.M);
            } else if (index == 89) {
                int resourceId10 = obtainStyledAttributes.getResourceId(89, this.m);
                this.m = resourceId10;
                if (resourceId10 == -1) {
                    this.m = obtainStyledAttributes.getInt(89, -1);
                }
            } else if (index == 90) {
                int resourceId11 = obtainStyledAttributes.getResourceId(90, this.n);
                this.n = resourceId11;
                if (resourceId11 == -1) {
                    this.n = obtainStyledAttributes.getInt(90, -1);
                }
            } else if (index == 71) {
                int resourceId12 = obtainStyledAttributes.getResourceId(71, this.o);
                this.o = resourceId12;
                if (resourceId12 == -1) {
                    this.o = obtainStyledAttributes.getInt(71, -1);
                }
            } else if (index == 70) {
                int resourceId13 = obtainStyledAttributes.getResourceId(70, this.p);
                this.p = resourceId13;
                if (resourceId13 == -1) {
                    this.p = obtainStyledAttributes.getInt(70, -1);
                }
            } else if (index == 108) {
                this.q = obtainStyledAttributes.getDimensionPixelSize(108, this.q);
            } else if (index == 111) {
                this.r = obtainStyledAttributes.getDimensionPixelSize(111, this.r);
            } else if (index == 109) {
                this.s = obtainStyledAttributes.getDimensionPixelSize(109, this.s);
            } else if (index == 106) {
                this.t = obtainStyledAttributes.getDimensionPixelSize(106, this.t);
            } else if (index == 110) {
                this.u = obtainStyledAttributes.getDimensionPixelSize(110, this.u);
            } else if (index == 107) {
                this.v = obtainStyledAttributes.getDimensionPixelSize(107, this.v);
            } else if (index == 80) {
                this.w = obtainStyledAttributes.getFloat(80, this.w);
            } else if (index == 95) {
                this.x = obtainStyledAttributes.getFloat(95, this.x);
            } else if (index == 69) {
                String string = obtainStyledAttributes.getString(69);
                this.y = string;
                this.z = -1;
                if (string != null) {
                    int length = string.length();
                    int indexOf = string.indexOf(44);
                    if (indexOf <= 0 || indexOf >= length - 1) {
                        i = 0;
                    } else {
                        String substring = this.y.substring(0, indexOf);
                        if (substring.equalsIgnoreCase("W")) {
                            this.z = 0;
                        } else if (substring.equalsIgnoreCase("H")) {
                            this.z = 1;
                        }
                        i = indexOf + 1;
                    }
                    int indexOf2 = this.y.indexOf(58);
                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                        String substring2 = this.y.substring(i);
                        if (substring2.length() > 0) {
                            Float.parseFloat(substring2);
                        }
                    } else {
                        String substring3 = this.y.substring(i, indexOf2);
                        String substring4 = this.y.substring(indexOf2 + 1);
                        if (substring3.length() > 0 && substring4.length() > 0) {
                            try {
                                float parseFloat = Float.parseFloat(substring3);
                                float parseFloat2 = Float.parseFloat(substring4);
                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                    if (this.z == 1) {
                                        Math.abs(parseFloat2 / parseFloat);
                                    } else {
                                        Math.abs(parseFloat / parseFloat2);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if (index == 82) {
                this.A = obtainStyledAttributes.getFloat(82, 0.0f);
            } else if (index == 97) {
                this.B = obtainStyledAttributes.getFloat(97, 0.0f);
            } else if (index == 81) {
                this.C = obtainStyledAttributes.getInt(81, 0);
            } else if (index == 96) {
                this.D = obtainStyledAttributes.getInt(96, 0);
            } else if (index == 99) {
                this.E = obtainStyledAttributes.getInt(99, 0);
            } else if (index == 76) {
                this.F = obtainStyledAttributes.getInt(76, 0);
            } else if (index == 101) {
                this.G = obtainStyledAttributes.getDimensionPixelSize(101, this.G);
            } else if (index == 100) {
                this.I = obtainStyledAttributes.getDimensionPixelSize(100, this.I);
            } else if (index == 78) {
                this.H = obtainStyledAttributes.getDimensionPixelSize(78, this.H);
            } else if (index == 77) {
                this.J = obtainStyledAttributes.getDimensionPixelSize(77, this.J);
            }
        }
        obtainStyledAttributes.recycle();
        a();
    }

    public a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.5f;
        this.x = 0.5f;
        this.y = null;
        this.z = 1;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = true;
        this.O = true;
        this.P = false;
        this.Q = false;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = 0.5f;
        this.Y = new l();
    }
}

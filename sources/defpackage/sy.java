package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: sy  reason: default package */
/* loaded from: classes2.dex */
public final class sy extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;
    public int a;
    public boolean aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public boolean ae;
    public boolean af;
    public boolean ag;
    public int ah;
    public int ai;
    public int aj;
    public int ak;
    public int al;
    public int am;
    public float an;
    public int ao;
    public int ap;
    public float aq;
    public rz ar;
    public boolean as;
    public int b;
    public float c;
    public boolean d;
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
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public sy() {
        super(-2, -2);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
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
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.aa = true;
        this.ab = true;
        this.ac = false;
        this.ad = false;
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = -1;
        this.ai = -1;
        this.aj = -1;
        this.ak = -1;
        this.al = Integer.MIN_VALUE;
        this.am = Integer.MIN_VALUE;
        this.an = 0.5f;
        this.ar = new rz();
        this.as = false;
    }

    public final void a() {
        this.ad = false;
        this.aa = true;
        this.ab = true;
        if (this.width == -2 && this.W) {
            this.aa = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        if (this.height == -2 && this.X) {
            this.ab = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (this.width == 0 || this.width == -1) {
            this.aa = false;
            if (this.width == 0 && this.L == 1) {
                this.width = -2;
                this.W = true;
            }
        }
        if (this.height == 0 || this.height == -1) {
            this.ab = false;
            if (this.height == 0 && this.M == 1) {
                this.height = -2;
                this.X = true;
            }
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.ad = true;
        this.aa = true;
        this.ab = true;
        if (!(this.ar instanceof sc)) {
            this.ar = new sc();
        }
        ((sc) this.ar).c(this.V);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy.resolveLayoutDirection(int):void");
    }

    public sy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
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
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.aa = true;
        this.ab = true;
        this.ac = false;
        this.ad = false;
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = -1;
        this.ai = -1;
        this.aj = -1;
        this.ak = -1;
        this.al = Integer.MIN_VALUE;
        this.am = Integer.MIN_VALUE;
        this.an = 0.5f;
        this.ar = new rz();
        this.as = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tl.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = sx.a.get(index);
            switch (i2) {
                case 1:
                    this.V = obtainStyledAttributes.getInt(index, this.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.p);
                    this.p = resourceId;
                    if (resourceId == -1) {
                        this.p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                    this.r = f;
                    if (f < 0.0f) {
                        this.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                    break;
                case 6:
                    this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                    break;
                case 7:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.e);
                    this.e = resourceId2;
                    if (resourceId2 == -1) {
                        this.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f);
                    this.f = resourceId3;
                    if (resourceId3 == -1) {
                        this.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.g);
                    this.g = resourceId4;
                    if (resourceId4 == -1) {
                        this.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.h);
                    this.h = resourceId5;
                    if (resourceId5 == -1) {
                        this.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.i);
                    this.i = resourceId6;
                    if (resourceId6 == -1) {
                        this.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId7;
                    if (resourceId7 == -1) {
                        this.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.k);
                    this.k = resourceId8;
                    if (resourceId8 == -1) {
                        this.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.l);
                    this.l = resourceId9;
                    if (resourceId9 == -1) {
                        this.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.m);
                    this.m = resourceId10;
                    if (resourceId10 == -1) {
                        this.m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.s);
                    this.s = resourceId11;
                    if (resourceId11 == -1) {
                        this.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.t);
                    this.t = resourceId12;
                    if (resourceId12 == -1) {
                        this.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.u);
                    this.u = resourceId13;
                    if (resourceId13 == -1) {
                        this.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.v);
                    this.v = resourceId14;
                    if (resourceId14 == -1) {
                        this.v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                    break;
                case 22:
                    this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                    break;
                case 23:
                    this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                    break;
                case 24:
                    this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                    break;
                case 25:
                    this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                    break;
                case 26:
                    this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                    break;
                case 27:
                    this.W = obtainStyledAttributes.getBoolean(index, this.W);
                    break;
                case 28:
                    this.X = obtainStyledAttributes.getBoolean(index, this.X);
                    break;
                case 29:
                    this.E = obtainStyledAttributes.getFloat(index, this.E);
                    break;
                case 30:
                    this.F = obtainStyledAttributes.getFloat(index, this.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    this.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    this.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                            this.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                            this.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                    this.L = 2;
                    break;
                case 36:
                    try {
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                            this.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                            this.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                    this.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            th.k(this, obtainStyledAttributes.getString(index));
                            continue;
                        case 45:
                            this.H = obtainStyledAttributes.getFloat(index, this.H);
                            continue;
                        case 46:
                            this.I = obtainStyledAttributes.getFloat(index, this.I);
                            continue;
                        case 47:
                            this.J = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 48:
                            this.K = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 49:
                            this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                            continue;
                        case 50:
                            this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                            continue;
                        case 51:
                            this.Y = obtainStyledAttributes.getString(index);
                            continue;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, this.n);
                            this.n = resourceId15;
                            if (resourceId15 == -1) {
                                this.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                continue;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, this.o);
                            this.o = resourceId16;
                            if (resourceId16 == -1) {
                                this.o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                continue;
                            }
                        case 54:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            continue;
                        case 55:
                            this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                            continue;
                        default:
                            switch (i2) {
                                case 64:
                                    th.j(this, obtainStyledAttributes, index, 0);
                                    continue;
                                case 65:
                                    th.j(this, obtainStyledAttributes, index, 1);
                                    continue;
                                case 66:
                                    this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                    continue;
                                case 67:
                                    this.d = obtainStyledAttributes.getBoolean(index, this.d);
                                    continue;
                                    continue;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        a();
    }

    public sy(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
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
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.aa = true;
        this.ab = true;
        this.ac = false;
        this.ad = false;
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = -1;
        this.ai = -1;
        this.aj = -1;
        this.ak = -1;
        this.al = Integer.MIN_VALUE;
        this.am = Integer.MIN_VALUE;
        this.an = 0.5f;
        this.ar = new rz();
        this.as = false;
    }
}

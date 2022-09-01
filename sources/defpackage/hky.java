package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: hky  reason: default package */
/* loaded from: classes.dex */
public final class hky {
    private boolean A;
    public hle a;
    public hle b;
    public View c;
    public hld d;
    public hla e;
    public hla f;
    public CharSequence g;
    public long h;
    public hiu i;
    public Runnable j;
    public hlb k;
    public short l;
    public int m;
    private String n;
    private int o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private long t;
    private boolean u;
    private CharSequence v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public final hlf a() {
        String str;
        int i;
        CharSequence charSequence;
        if (b() < 0) {
            throw new IllegalArgumentException("Tooltip displayDuration must be zero or positive.");
        }
        e();
        if ((this.l & 2048) != 0) {
            if (b() > 0) {
                e();
                if (b() < 0) {
                    throw new IllegalArgumentException("Tooltip displayDuration should be larger or equal to minDisplayDuration.");
                }
            }
            short s = this.l;
            if ((s & 1) != 0) {
                if (this.o == 0) {
                    throw new IllegalArgumentException("Tooltip tooltipViewResId should not be 0.");
                }
                if ((s & 64) == 0) {
                    throw new IllegalStateException("Property \"shouldHideKeyboardHeaderView\" has not been set");
                }
                if ((s & 128) != 0) {
                    if (this.u) {
                        if (d() != 1) {
                            int d = d();
                            throw new IllegalArgumentException("Type " + hqs.c(d) + ": touch to dismiss not supported for this type.");
                        } else if (!c()) {
                            throw new IllegalArgumentException("Tooltip displayExclusively should be true if touchToDismiss is true.");
                        }
                    }
                    if ((this.l & 1024) != 0) {
                        if (!this.x || c()) {
                            if (d() == 1) {
                                if (this.d == null) {
                                    throw new IllegalArgumentException("Type TOOLTIP: positionProvider should not be null.");
                                }
                            } else if (d() == 2) {
                                if (this.c == null) {
                                    if ((this.l & 4) != 0) {
                                        if (this.q == 0) {
                                            if (this.d != null) {
                                                throw new IllegalArgumentException("Type ONBOARDING_TOOLTIP: positionProvider should not be set.");
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Property \"anchorViewResId\" has not been set");
                                    }
                                }
                                throw new IllegalArgumentException("Type ONBOARDING_TOOLTIP: there should not be either anchorView or anchorViewResId.");
                            }
                            if (this.l != Short.MAX_VALUE || (str = this.n) == null || (i = this.m) == 0 || (charSequence = this.v) == null) {
                                StringBuilder sb = new StringBuilder();
                                if (this.n == null) {
                                    sb.append(" id");
                                }
                                if (this.m == 0) {
                                    sb.append(" tooltipType");
                                }
                                if ((1 & this.l) == 0) {
                                    sb.append(" tooltipViewResId");
                                }
                                if ((this.l & 2) == 0) {
                                    sb.append(" enableDynamicColor");
                                }
                                if ((this.l & 4) == 0) {
                                    sb.append(" anchorViewResId");
                                }
                                if ((this.l & 8) == 0) {
                                    sb.append(" displayAnimatorResId");
                                }
                                if ((this.l & 16) == 0) {
                                    sb.append(" dismissAnimatorResId");
                                }
                                if ((this.l & 32) == 0) {
                                    sb.append(" displayDuration");
                                }
                                if ((this.l & 64) == 0) {
                                    sb.append(" shouldHideKeyboardHeaderView");
                                }
                                if ((this.l & 128) == 0) {
                                    sb.append(" touchToDismiss");
                                }
                                if ((this.l & 256) == 0) {
                                    sb.append(" minDisplayDuration");
                                }
                                if (this.v == null) {
                                    sb.append(" contentDescription");
                                }
                                if ((this.l & 512) == 0) {
                                    sb.append(" displayExclusively");
                                }
                                if ((this.l & 1024) == 0) {
                                    sb.append(" displayAggressively");
                                }
                                if ((this.l & 2048) == 0) {
                                    sb.append(" maxWaitTimeMillis");
                                }
                                if ((this.l & 4096) == 0) {
                                    sb.append(" dismissOnFinishInputView");
                                }
                                if ((this.l & 8192) == 0) {
                                    sb.append(" dismissOnInputMethodEntryChanged");
                                }
                                if ((this.l & 16384) == 0) {
                                    sb.append(" supportBannerInLandscapeMode");
                                }
                                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                            }
                            return new hlf(str, i, this.o, this.p, this.a, this.b, this.c, this.q, this.d, this.r, this.e, this.s, this.f, this.t, this.u, charSequence, this.g, this.w, this.x, this.h, this.y, this.z, this.A, this.i, this.j, this.k);
                        }
                        throw new IllegalArgumentException("Tooltip displayExclusively should be true if displayAggressively is true.");
                    }
                    throw new IllegalStateException("Property \"displayAggressively\" has not been set");
                }
                throw new IllegalStateException("Property \"touchToDismiss\" has not been set");
            }
            throw new IllegalStateException("Property \"tooltipViewResId\" has not been set");
        }
        throw new IllegalStateException("Property \"maxWaitTimeMillis\" has not been set");
    }

    public final long b() {
        if ((this.l & 32) != 0) {
            return this.t;
        }
        throw new IllegalStateException("Property \"displayDuration\" has not been set");
    }

    public final boolean c() {
        if ((this.l & 512) != 0) {
            return this.w;
        }
        throw new IllegalStateException("Property \"displayExclusively\" has not been set");
    }

    public final int d() {
        int i = this.m;
        if (i != 0) {
            return i;
        }
        throw new IllegalStateException("Property \"tooltipType\" has not been set");
    }

    public final void e() {
        if ((this.l & 256) != 0) {
            return;
        }
        throw new IllegalStateException("Property \"minDisplayDuration\" has not been set");
    }

    public final void f(int i) {
        this.q = i;
        this.l = (short) (this.l | 4);
    }

    public final void g(CharSequence charSequence) {
        if (charSequence != null) {
            this.v = charSequence;
            return;
        }
        throw new NullPointerException("Null contentDescription");
    }

    public final void h(int i) {
        this.s = i;
        this.l = (short) (this.l | 16);
    }

    public final void i(boolean z) {
        this.y = z;
        this.l = (short) (this.l | 4096);
    }

    public final void j(boolean z) {
        this.z = z;
        this.l = (short) (this.l | 8192);
    }

    public final void k(boolean z) {
        this.x = z;
        this.l = (short) (this.l | 1024);
    }

    public final void l(int i) {
        this.r = i;
        this.l = (short) (this.l | 8);
    }

    public final void m(long j) {
        this.t = j;
        this.l = (short) (this.l | 32);
    }

    public final void n() {
        this.w = true;
        this.l = (short) (this.l | 512);
    }

    public final void o(boolean z) {
        this.p = z;
        this.l = (short) (this.l | 2);
    }

    public final void p(String str) {
        if (str != null) {
            this.n = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void q() {
        this.l = (short) (this.l | 256);
    }

    public final void r(boolean z) {
        this.A = z;
        this.l = (short) (this.l | 16384);
    }

    public final void s(int i) {
        this.o = i;
        this.l = (short) (this.l | 1);
    }

    public final void t(boolean z) {
        this.u = z;
        this.l = (short) (this.l | 128);
    }
}

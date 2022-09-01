package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* renamed from: ddt  reason: default package */
/* loaded from: classes.dex */
public final class ddt implements ddr, dev {
    protected dew a;
    public ibm b;
    private final ddq c;
    private View d;
    private View e;
    private boolean f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private hln k;

    public ddt(ddq ddqVar) {
        this.c = ddqVar;
    }

    private final void a(boolean z) {
        if (this.f != z) {
            this.f = z;
            View view = this.e;
            int i = 0;
            if (view != null) {
                view.setVisibility(true != z ? 8 : 0);
            }
            View view2 = this.d;
            if (view2 != null) {
                if (true == z) {
                    i = 4;
                }
                view2.setVisibility(i);
            }
            this.c.fp(1024L, z);
        }
    }

    private final void d(hln hlnVar, boolean z) {
        this.k = hlnVar;
        this.c.x(hlnVar, z);
    }

    @Override // defpackage.ddr
    public final void b(List list, hln hlnVar, boolean z) {
        boolean z2 = false;
        if (this.i) {
            this.a.n();
            this.i = false;
            this.c.fp(256L, false);
        }
        this.h = z;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.j -= list.size();
        a(true);
        this.a.l(list);
        if (hlnVar == null) {
            return;
        }
        if (this.a.F(hlnVar)) {
            d(hlnVar, false);
            z2 = true;
        } else {
            d(null, false);
        }
        this.c.fp(256L, z2);
    }

    @Override // defpackage.ddr
    public final void c(Context context, ibm ibmVar, iav iavVar) {
        this.b = ibmVar;
    }

    @Override // defpackage.ddr, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // defpackage.ddr
    public final void e() {
    }

    @Override // defpackage.ddr
    public final void f(long j, long j2) {
    }

    @Override // defpackage.ddr
    public final void g(View view, icf icfVar) {
        if (icfVar.b == ice.BODY) {
            this.d = view.findViewById(R.id.input_area);
            View findViewById = view.findViewById(R.id.f65900_resource_name_obfuscated_res_0x7f0b07a6);
            this.e = findViewById;
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            dew dewVar = (dew) view.findViewById(R.id.f96350_resource_name_obfuscated_res_0x7f0b141a);
            this.a = dewVar;
            this.g = dewVar.u();
            this.a.w(this.b.f);
            this.a.G(this);
        }
    }

    @Override // defpackage.det
    public final void gs(deu deuVar, int i) {
        this.c.fp(4096L, deuVar.H());
        this.c.fp(8192L, deuVar.I());
    }

    @Override // defpackage.ddr
    public final void h(icf icfVar) {
        if (icfVar.b == ice.BODY) {
            this.e = null;
            this.a = null;
            this.d = null;
        }
    }

    @Override // defpackage.ddr
    public final void j(boolean z) {
        this.h = z;
        this.j = 0;
        if (z) {
            this.i = true;
            r(this.g + 1);
            return;
        }
        dew dewVar = this.a;
        if (dewVar == null) {
            return;
        }
        dewVar.n();
        a(false);
        this.c.fp(256L, false);
    }

    @Override // defpackage.ddr
    public final boolean k(hfd hfdVar) {
        iay f;
        dew dewVar;
        if (hfdVar.k == this || hfdVar.a == iah.UP || (f = hfdVar.f()) == null) {
            return false;
        }
        int i = f.c;
        if (i == -10047) {
            Object obj = f.e;
            if ((obj instanceof hln) && (dewVar = this.a) != null) {
                return dewVar.F((hln) obj);
            }
            return false;
        } else if (i == 92) {
            if (!this.f) {
                return false;
            }
            this.a.K();
            return true;
        } else if (i == 93) {
            if (!this.f) {
                return false;
            }
            this.a.J();
            return true;
        } else {
            switch (i) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.a.b() == 0) {
                        return false;
                    }
                    if (f.c != 23) {
                        hln f2 = this.a.f(f);
                        if (f2 == null) {
                            return true;
                        }
                        d(f2, true);
                        return true;
                    }
                    hln hlnVar = this.k;
                    if (hlnVar == null) {
                        return false;
                    }
                    ddq ddqVar = this.c;
                    hfd d = hfd.d(new iay(-10002, null, hlnVar));
                    d.k = this;
                    ddqVar.t(d);
                    return true;
                default:
                    return false;
            }
        }
    }

    @Override // defpackage.ddr
    public final boolean l(ice iceVar) {
        throw null;
    }

    @Override // defpackage.ddr
    public final void n() {
    }

    @Override // defpackage.dev
    public final void r(int i) {
        if (!this.h || this.j > 0) {
            return;
        }
        this.j = i;
        this.c.w(i);
    }
}

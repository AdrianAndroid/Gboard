package defpackage;

import android.content.Context;
import android.service.textservice.SpellCheckerService;

/* compiled from: PG */
/* renamed from: emu  reason: default package */
/* loaded from: classes.dex */
public abstract class emu extends SpellCheckerService {
    public static final /* synthetic */ int g = 0;
    private ija a;
    public ems b;
    public emr c;
    public huk d;
    public emt e;
    public volatile boolean f;

    public void a() {
        throw null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (jai.b.b()) {
            if (this.f) {
                return;
            }
            a();
        } else if (this.a != null) {
        } else {
            ija c = ijf.c(new emq(this, 0), bsd.e, jai.a);
            this.a = c;
            c.d(gxo.a(9));
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        emt emtVar;
        ija ijaVar = this.a;
        if (ijaVar != null) {
            ijaVar.f();
        }
        if (this.f) {
            Context applicationContext = getApplicationContext();
            if (this.c != null) {
                gyk.i(applicationContext).u(this.c);
                this.c = null;
            }
            if (this.b != null) {
                ikj.C(applicationContext).u(this.b);
                this.b = null;
            }
            huk hukVar = this.d;
            if (hukVar != null && (emtVar = this.e) != null) {
                hukVar.h(emtVar);
                this.e = null;
                this.d = null;
            }
        }
        super.onDestroy();
    }
}

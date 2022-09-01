package defpackage;

import android.content.res.Configuration;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: irm  reason: default package */
/* loaded from: classes.dex */
public class irm implements ijj {
    private Configuration a;
    private String b;

    protected void a() {
    }

    protected void b(Configuration configuration, Configuration configuration2) {
    }

    protected void d(String str) {
    }

    @Override // defpackage.ijj
    /* renamed from: e */
    public final synchronized void fd(irn irnVar) {
        Configuration b = irnVar.b();
        String e = irnVar.e();
        Configuration configuration = this.a;
        if (configuration == null) {
            this.a = b;
            this.b = e;
            d(e);
            a();
            b(b, null);
            return;
        }
        if (!e.equals(this.b)) {
            this.b = e;
            d(e);
        }
        this.a = b;
        if (configuration == b) {
            return;
        }
        int diff = configuration.diff(b);
        if (diff == 0) {
            return;
        }
        if ((diff & 4) != 0) {
            a();
        }
        b(b, configuration);
    }

    public final void f(Executor executor) {
        ijl.b().h(this, irn.class, executor);
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }

    public final void g(Executor executor) {
        ijl.b().c(this, irn.class, executor);
    }

    public final void h() {
        ijl.b().d(this, irn.class);
    }
}

package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gei  reason: default package */
/* loaded from: classes.dex */
public final class gei implements geo {
    public final Object a = new Object();
    public Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public gei(Executor executor, geh gehVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = gehVar;
    }

    public gei(Executor executor, gej gejVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = gejVar;
    }

    public gei(Executor executor, gek gekVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = gekVar;
    }

    public gei(Executor executor, gel gelVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = gelVar;
    }

    @Override // defpackage.geo
    public final void a() {
        int i = this.d;
        if (i == 0) {
            synchronized (this.a) {
                this.b = null;
            }
        } else if (i == 1) {
            synchronized (this.a) {
                this.b = null;
            }
        } else if (i != 2) {
            synchronized (this.a) {
                this.b = null;
            }
        } else {
            synchronized (this.a) {
                this.b = null;
            }
        }
    }

    @Override // defpackage.geo
    public final void b(gen genVar) {
        int i = this.d;
        if (i == 0) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new fso(this, genVar, 13));
            }
        } else if (i == 1) {
            if (!((ger) genVar).c) {
                return;
            }
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new fqa(this, 7, (byte[]) null));
            }
        } else if (i != 2) {
            if (!genVar.e()) {
                return;
            }
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new fso(this, genVar, 15, (char[]) null));
            }
        } else if (genVar.e() || ((ger) genVar).c) {
        } else {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new fso(this, genVar, 14, (byte[]) null));
            }
        }
    }
}
